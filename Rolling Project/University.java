import java.util.ArrayList;
import java.util.Scanner;

public class University
{
    private ArrayList<Enrolment> enrolments;
    private final String INPUT_FILE_NAME = "students.txt";
    private final String OUTPUT_FILE_NAME = "output.txt";

    public University()
    {
        this.enrolments = new ArrayList<Enrolment>();
    }

    public University(Enrolment enrolment)
    {
        this.enrolments = new ArrayList<Enrolment>();
        this.enrolments.add(enrolment);
    }

    public static void main(String[] args) {
        University university = new University();
        startProgram(university);
    }

    public void display()
    {
        for (int i = 0; i < enrolments.size(); i++)
        {
            System.out.println(enrolments.get(i).display());
        }
    }

    public void addEnrolment(Enrolment enrolment)
    {
        this.enrolments.add(enrolment);
    }

    public void addEnrolments(Enrolment[] enrolments)
    {
        for (int i = 0; i < enrolments.length; i++)
        {
            this.enrolments.add(enrolments[i]);
        }
    }

    public ArrayList<Enrolment> getEnrolments()
    {
        return enrolments;
    }

    public int getEnrolmentsSize()
    {
        return enrolments.size();
    }

    public Enrolment getSpecificEnrolment(int index)
    {
        return enrolments.get(index);
    }

    public void inputStudentDetails(Enrolment enrolment)
    {
        Input studentInput = new Input();
        Validation studentValidation = new Validation();
        String studentName = studentInput.acceptStringInput("Enter student name: ");
        while(!studentValidation.lengthWithinRange(studentName, 2, 50) && !studentValidation.isBlank(studentName))
        {
            System.out.println("Invalid input. Please enter a name between 1 and 50 characters.");
            studentName = studentInput.acceptStringInput("Enter student name: ");
        }
        String studentAddress = studentInput.acceptStringInput("Enter student address: ");
        while(!studentValidation.lengthWithinRange(studentAddress, 2, 50) && !studentValidation.isBlank(studentAddress))
        {
            System.out.println("Invalid input. Please enter a valid address.");
            studentAddress = studentInput.acceptStringInput("Enter student address: ");
        }
        String studentPhoneNumber = studentInput.acceptStringInput("Enter student phone number: ");
        while(!studentValidation.validatePhoneNumber(studentPhoneNumber))
        {
            System.out.println("Invalid input. Please enter a valid phone number.");
            studentPhoneNumber = studentInput.acceptStringInput("Enter student phone number: ");
        }
        String studentEmail = studentInput.acceptStringInput("Enter student email: ");
        while(!studentValidation.validateEmail(studentEmail))
        {
            System.out.println("Invalid input. Please enter a valid email.");
            studentEmail = studentInput.acceptStringInput("Enter student email: ");
        }
        try
        {
            Student student = new Student(studentName, studentAddress, studentEmail, studentPhoneNumber);
            enrolment.setStudent(student);
            System.out.println("Student successfully added: " + student.toString());
        }
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage() + ". Invalid inputs. Adding student with default values.");
            enrolment.setStudent(new Student());
        }
        
    }

    public void inputUnitDetails(Enrolment enrolment) {
        Input unitInput = new Input();
        Validation unitValidation = new Validation();
        try {
            int numUnits = unitInput.acceptIntegerInput("Enter number of units: ");
            while (!unitValidation.validateNumUnits(numUnits)) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                numUnits = unitInput.acceptIntegerInput("Enter number of units: ");
            }
            enrolment.setUnitsSize(numUnits);
            System.out.println("Confirmation: Number of units set to " + enrolment.getUnitsSize() + " units.");
            inputUnitDetailsOnce(numUnits, enrolment);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + " Using default number of units (3 units).");
        }
    }

    private void inputUnitDetailsOnce(int numUnits, Enrolment enrolment)
    {
        Input unitInput = new Input();
        Validation unitValidation = new Validation();
        for (int unitIdx=0; unitIdx < numUnits; unitIdx++)
        {
            System.out.println("Enter details for unit " + (unitIdx+1) + ": ");
            String unitCode = unitInput.acceptStringInput("Enter unit code: ");
            while(!unitValidation.validateUnitCode(unitCode))
            {
                System.out.println("Invalid input. Please enter a valid unit code.");
                unitCode = unitInput.acceptStringInput("Enter unit code: ");
            }
            String unitDescription = unitInput.acceptStringInput("Enter unit description: ");
            while(!unitValidation.lengthWithinRange(unitDescription, 2, 150))
            {
                System.out.println("Invalid input. Please enter a valid unit description.");
                unitDescription = unitInput.acceptStringInput("Enter unit description: ");
            }
            int unitCreditPoints = unitInput.acceptIntegerInput("Enter unit credit points: ");
            while(!unitValidation.validateCreditPoints(unitCreditPoints))
            {
                System.out.println("Invalid input. Please enter a valid value for unit credit points.");
                unitCreditPoints = unitInput.acceptIntegerInput("Enter unit credit points: ");
            }
            try
            {
                Unit unit = new Unit(unitCode, unitDescription, unitCreditPoints);
                enrolment.setSpecificUnit(unitIdx, unit);
                System.out.println("Unit successfully added: " + unit.toString());
            }
            catch (Exception e)
            {
                System.out.println("Error: " + e.getMessage() + ". Invalid inputs. Adding unit with default values.");
                enrolment.setSpecificUnit(unitIdx, new Unit());
            }
        }

    }

    public void readFile()
    {
        FileIO fileIO = new FileIO();
        String fileContents = fileIO.readFile();

        String[] fileLines = fileContents.split("\n");
        int numLines = fileLines.length;
        for (int i = 0; i < numLines; i++)
        {
            String[] lineContents = fileLines[i].split(",");
            String enrolmentDate = lineContents[0];
            String name = lineContents[1];
            String address = lineContents[2];
            String phoneNumber = lineContents[3];
            String email = lineContents[4];
            Student student = new Student(name, address, email, phoneNumber);
            String[] unitsInput = lineContents[5].split(";");
            int unitsInputLength = unitsInput.length;
            Unit[] units = new Unit[unitsInputLength];
            for (int j = 0; j < unitsInputLength; j++) {
                String[] unitInput = unitsInput[j].split("-");
                String unitCode = unitInput[0];
                String unitDescription = unitInput[1];
                int creditPoints = Integer.parseInt(unitInput[2]);
                Unit unit = new Unit(unitCode, unitDescription, creditPoints);
                units[j] = unit;
            }
            Enrolment enrolment = new Enrolment(student, enrolmentDate, units);
            enrolments.add(enrolment);
        }  
    }

    public ArrayList<Enrolment> readFile(String fileName)
    {
        FileIO fileIO = new FileIO(fileName);
        ArrayList<Enrolment> enrolments = fileIO.readFile(fileName);
        return enrolments;
    }

    public void removeEnrolment(int enrolmentIdx)
    {
        enrolments.remove(enrolmentIdx);
    }

    // public void removeEnrolment1(String name)
    // {
    //     int i = 0;
    //     while (i < enrolments.size())
    //     {
    //         Enrolment e = enrolments.get(i);
    //         Student s = e.getStudent();
    //         if (s.getName().equals(name))
    //             enrolments.remove(e);
    //         else
    //             System.out.println(e.display());
    //         i++;
    //     }
    // }

    // public void removeEnrolment2(String name)
    // {
    //     Iterator<Enrolment> it = numbers.iterator();
    //     while (it.hasNext())
    //     {
    //         Enrolment e = it.hasNext();
    //         Student s = e.getStudent();
    //         if (s.getName().equals(name))
    //             it.remove();
    //         else
    //             System.out.println(e.display());
    //     }
    // }

    // public void removeEnrolment3(String name)
    // {
    //     for (Enrolment e : enrolments)
    //     {
    //         Student s = e.getStudent();
    //         if (s.getName().equals(name))
    //             enrolment.remove(e);
    //         else
    //             System.out.println(e.display());
    //     }
    // }

    public void setEnrolments(ArrayList<Enrolment> enrolments)
    {
        this.enrolments = enrolments;
    }

    public void setSpecificEnrolment(int enrolmentIdx, Enrolment newEnrolment)
    {
        enrolments.set(enrolmentIdx, newEnrolment);
    }

    public static void startProgram(University university)
    {
        Scanner input = new Scanner(System.in);
        Validation validation = new Validation();

        System.out.println("Welcome to Monash University");
        System.out.println("Please select an option:");
        System.out.println("1. Enrol a new student");
        System.out.println("2. Exit the program");
        int userChoice = Integer.parseInt(input.nextLine());
        while (userChoice != 1 && userChoice != 2) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            userChoice = Integer.parseInt(input.nextLine());
        }
        while (userChoice != 2) {
            System.out.println("Would you like to read from file? (Y/N)");
            String readFromFile = input.nextLine();
            while (!readFromFile.equalsIgnoreCase("Y") && !readFromFile.equalsIgnoreCase("N")) {
                System.out.println("Invalid input. Please enter Y or N.");
                readFromFile = input.nextLine();
            }
            if (readFromFile.equalsIgnoreCase("Y")) {
                university.readFile();
                university.display();
            }
            System.out.println("Would you like to enrol another student manually? (Y/N)");
            String enrolAnotherStudent = input.nextLine();
            while (!enrolAnotherStudent.equalsIgnoreCase("Y") && !enrolAnotherStudent.equalsIgnoreCase("N")) {
                System.out.println("Invalid input. Please enter Y or N.");
                enrolAnotherStudent = input.nextLine();
            }
            if (enrolAnotherStudent.equalsIgnoreCase("N")) {
                System.out.println("Thank you for using the program.");
                System.exit(0);
            }
            Enrolment enrolment = new Enrolment();
            System.out.println("Enter the student's enrolment date: ");
            String dateEnrolled = input.nextLine();
            if (validation.validateDate(dateEnrolled)) {
                enrolment.setDate(dateEnrolled);
            }
            else {
                System.out.println("Invalid input. Using default date.");
            }
            System.out.println("Enter student details: ");
            university.inputStudentDetails(enrolment);
            System.out.println("Enter unit details: ");
            university.inputUnitDetails(enrolment);
            university.addEnrolment(enrolment);
            System.out.println("Confirming enrolment for: ");
            System.out.println(enrolment.display());
            System.out.println("Student added. Press 2 to exit, or press 1 to enrol another student.");
            userChoice = Integer.parseInt(input.nextLine());
            if (userChoice == 2) {
                university.writeFile();
                System.out.println("Thank you for using the program.");
                System.exit(0);
            }
        }
        if (userChoice == 2) {
            System.out.println("Thank you for using the program.");
            System.exit(0);
        }
    }

    public void writeFile()
    {
        try {
            FileIO fileIO = new FileIO(OUTPUT_FILE_NAME);
            String fileContent = "";
            for (int i = 0; i < enrolments.size(); i++)
            {
                Enrolment enrolment = enrolments.get(i);
                Student student = enrolment.getStudent();
                String studentDetails = String.join(",", enrolment.getDate(), student.getName(), student.getAddress(), student.getPhoneNumber(), student.getEmail());
                fileContent += studentDetails + ",";
                for (Unit unit : enrolment.getUnits())
                {
                    String unitDetails = String.join("-", unit.getUnitCode(), unit.getUnitDescription(), Integer.toString(unit.getCreditPoints()));
                    fileContent += unitDetails + ";";
                }
                fileContent += "\n";
            }
            fileIO.writeFile(fileContent);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
