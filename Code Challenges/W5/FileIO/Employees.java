import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Employees {

    public static final String FILE_NAME = "employees.txt";
    
    public Employees() {
        // Default constructor
    }

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            Scanner inputScanner = new Scanner(System.in);
            Scanner fileScanner = new Scanner(fileReader);
            ArrayList<Employee> employees = new ArrayList<>();
            int employeeCount = 1;
            
            while (fileScanner.hasNextLine()) 
            {
                System.out.println("Employee " + employeeCount++ + ":");
                String[] lineContents = fileScanner.nextLine().split(",");
                String name = lineContents[0];
                int wage = Integer.parseInt(lineContents[1]);
                String skill = lineContents[2];
                
                employees.add(new Employee(name, wage, skill));
                System.out.println("\tName: " + employees.get(employees.size() - 1).getName());
                System.out.println("\tWage: " + employees.get(employees.size() - 1).getWage());
                System.out.println("\tSkill: " + employees.get(employees.size() - 1).getSkill());
                System.out.println("Press Q to quit or any other key to view next employee...");
                String userInput = inputScanner.nextLine();
                if (userInput.equals("q")) {
                    break;
                } else {
                    continue;
                }
            }
            System.out.println("End of file reached!");
            System.out.println("Employee array contents: ");
            for (Employee employee : employees) {
                employee.display();
            }
            fileScanner.close();
            inputScanner.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in reading file: " + e.getMessage());
        }
    }
}