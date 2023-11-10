import java.util.ArrayList;
import java.util.Scanner;

public class University
{
    private ArrayList<Enrolment> enrolments;

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
        Scanner input = new Scanner(System.in);
        Validation validation = new Validation();
        Enrolment enrolment = new Enrolment();
        University university = new University();
        System.out.println("Welcome to Monash University");
        System.out.println("Please select an option:");
        System.out.println("1. Enrol a new student");
        System.out.println("2. Exit the program");
        int userChoice = Integer.parseInt(input.nextLine());
        while (userChoice != 1 && userChoice != 2) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            userChoice = Integer.parseInt(input.nextLine());
        }
        if (userChoice == 1)
        {
            System.out.println("Enter the student's enrolment date in the format YYYY-MM-DD: ");
            String dateEnrolled = input.nextLine();
            if (validation.validateDate(dateEnrolled)) {
                enrolment.setDate(dateEnrolled);
            } else {
                System.out.println("Invalid input. Using default date.");
            }
            System.out.println("Enter student details: ");
            university.inputStudentDetails(enrolment);
            System.out.println("Enter unit details: ");
            university.inputUnitDetails(enrolment);
        }
        if (userChoice == 2)
        {
            System.out.println("Thank you for using the program.");
            System.exit(0);
        }

    }

    public void display()
    {
    }

    public void addEnrolment(Enrolment enrolment)
    {

    }

    public void addEnrolments(Enrolment[] enrolments)
    {

    }

    public Enrolment getEnrollment(int enrolmentIdx)
    {
        return enrolments.get(enrolmentIdx);
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
        try {
            Student student = new Student(studentName, studentAddress, studentEmail, studentPhoneNumber);
            enrolment.setStudent(student);
            System.out.println("Student successfully added: " + student.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + ". Invalid inputs. Adding student with default values.");
            enrolment.setStudent(new Student());
        }
        
    }

    public void inputUnitDetails(Enrolment enrolment)
    {
        Input unitInput = new Input();
        Validation unitValidation = new Validation();
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
        try {
            Unit unit = new Unit(unitCode, unitDescription, unitCreditPoints);
            enrolment.setUnit(unit);
            System.out.println("Unit successfully added: " + unit.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + ". Invalid inputs. Adding unit with default values.");
            enrolment.setUnit(new Unit());
        }
        
    }

    public void removeEnrolment(int enrolmentIdx)
    {

    }

    public void readFile()
    {

    }

    public void setEnrolment(Enrolment enrolment, int enrolmentIdx)
    {

    }

    public void setEnrolments(ArrayList<Enrolment> enrolments)
    {
        this.enrolments = enrolments;
    }

    public static void startProgram()
    {

    }

    public void writeFile()
    {

    }
}
