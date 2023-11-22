import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the unit description: ");
        String description = console.nextline();
        while (!description.equals(""))
        {
            System.out.println("Description should not be blank. Please enter the unit description: ");
        }
        unit.setUnitDescription(description);


    }
}
