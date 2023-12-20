/**
 * FileIO class
 * 
 * This class is used to read and write to files.
 * 
 * @version 1.0
 * @author Daniel Hardej
 * Last updated: 2023-11-22
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {
    
    private String FILE_NAME;

    public FileIO()
    {
        this.FILE_NAME = "students.txt";
    }

    public FileIO(String fileName)
    {
        this.FILE_NAME = fileName;
    }

    public String getFileName()
    {
        return this.FILE_NAME;
    }

    public int getNumLines(String fileName)
    {
        int numLines = 0;
        try {
            FileReader file = new FileReader(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
                numLines++;
            }
            file.close();
            fileScanner.close();
        }
        catch (FileNotFoundException e) {
            System.err.println(FILE_NAME + " not found: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Error in reading file: " + e.getMessage());
        }
        return numLines;
    } 

    public String readFile()
    {
        String fileContent = "";
        try {
            FileReader file = new FileReader(this.FILE_NAME);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                fileContent += fileScanner.nextLine() + "\n";
            }
            file.close();
            fileScanner.close();
        }
        catch (FileNotFoundException e) {
            System.err.println(FILE_NAME + " not found: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Error in reading file: " + e.getMessage());
        }
        return fileContent;
    }

    public ArrayList<Enrolment> readFile (String fileName)
    {
        ArrayList<Enrolment> enrolments = new ArrayList<>();
        try {
            FileReader file = new FileReader(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String[] lineContents = fileScanner.nextLine().split(",");
                String enrolmentDate = lineContents[0];
                String name = lineContents[1];
                String address = lineContents[2];
                String phoneNumber = lineContents[3];
                String email = lineContents[4];
                Student student = new Student(name, address, email, phoneNumber);
                String[] unitsInput = lineContents[5].split(";");
                int unitsInputLength = unitsInput.length;
                Unit[] units = new Unit[unitsInputLength];
                for (int i = 0; i < unitsInputLength; i++) {
                    String[] unitInput = unitsInput[i].split("-");
                    String unitCode = unitInput[0];
                    String unitDescription = unitInput[1];
                    int creditPoints = Integer.parseInt(unitInput[2]);
                    Unit unit = new Unit(unitCode, unitDescription, creditPoints);
                    units[i] = unit;
                }
                Enrolment enrolment = new Enrolment(student, enrolmentDate, units);
                enrolments.add(enrolment);
            }
            file.close();
            fileScanner.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("Error in reading file: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Error in reading file: " + e.getMessage());
        }
        return enrolments;
    }

    public void setFileName(String newFileName)
    {
        this.FILE_NAME = newFileName;
    }

    public void writeFile(String fileContents)
    {
        try {
            FileWriter fileWriter = new FileWriter(this.FILE_NAME);
            fileWriter.write(fileContents);
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error in writing file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error in writing file: " + e.getMessage());
        }
    }

    public void writeFile(String fileContents)
    {
        try
        {   
            PrintWriter writer = new PrintWriter(outputFile);
            try
            {
                // code to write string to file goes here
                writer.println(fileContents);
            }
            finally
            {
                try
                {
                    writer.close();
                }
                catch (Exception e)
                {
                    System.out.println("Error message 1");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error message 2");
        }
    }

    public static void main(String[] args)
    {
        FileIO fileIO = new FileIO();
        int numLines = fileIO.getNumLines("students.txt");
        System.out.println(numLines);
    }
}
