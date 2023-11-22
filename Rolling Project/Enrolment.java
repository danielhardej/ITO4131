import java.util.ArrayList;

/**
 * Enrolment class for the University class.
 * 
 * @version 1.0
 * @author Daniel Hardej
 * Last updated: 2023-11-06
 */

public class Enrolment
{
    private Student student;
    private String dateEnrolled;
    private Unit[] units;

    public Enrolment()
    {
        this.student = new Student();
        this.dateEnrolled = "2023-01-01";
        this.units = new Unit[3];
    }

    public Enrolment(Student student, String dateEnrolled, Unit[] units)
    {
        this.student = student;
        this.dateEnrolled = dateEnrolled;
        this.units = units;
    }
    
    public String display()
    {
        String displayEnrolment = String.format("%s \nDate enrolled: %s", student.display(), dateEnrolled);
        displayEnrolment += "\n Units: ";
        for (Unit unit : units)
        {
            displayEnrolment += "\n" + unit.toString();
        }
        displayEnrolment += "\n";
        return displayEnrolment;
    }

    public String getDate()
    {
        return dateEnrolled;
    }

    public String getHighestCreditPoints()
    {
        int highestCreditPoints = 0;
        String highestCreditPointsUnit = "";
        for (Unit unit : units)
        {
            if (unit.getCreditPoints() > highestCreditPoints)
            {
                highestCreditPoints = unit.getCreditPoints();
                highestCreditPointsUnit = unit.getUnitCode();
            }
        }
        return highestCreditPointsUnit;
    }

    public Student getStudent()
    {
        return student;
    }
    public Unit getSpecificUnit(int index)
    {
        return units[index];
    }

    public Unit[] getUnits()
    {
        return units;
    }

    public int getUnitsSize()
    {
        return units.length;
    }

    public void moveHighCreditPoints()
    {
        // This method should reorder the elements in the units array so that all units with more than 6 credit points are moved to the beginning of the array.
        //Need to maintain the relative order of the other elements in the array
        // Must work with the same array object and not refer to a temporary array object.
        int highCreditPointsThreshold = 6;
        int highCreditPointsIndex = 0;
        for (int i = 0; i < units.length; i++)
        {
            if (units[i].getCreditPoints() > highCreditPointsThreshold)
            {
                Unit tempUnit = units[i];
                units[i] = units[highCreditPointsIndex];
                units[highCreditPointsIndex] = tempUnit;
                highCreditPointsIndex++;
            }
        }
    }

    
    public void setDate(String newDate)
    {
        this.dateEnrolled = newDate;
    }

    public void setSpecificUnit(int index, Unit newUnit)
    {
        this.units[index] = newUnit;
    }

    public void setStudent(Student newStudent)
    {
        this.student = newStudent;
    }

    public void setUnits(Unit[] newUnits)
    {
        this.units = newUnits;
    }

    public void setUnitsSize(int newSize)
    {
        this.units = new Unit[newSize];
    }

}
