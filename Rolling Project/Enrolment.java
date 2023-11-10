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
    private Unit unit;

    public Enrolment() {
        this.student = new Student();
        this.dateEnrolled = "2023-01-01";
        this.unit = new Unit();
    }

    public Enrolment(Student student, String dateEnrolled, Unit unit) {
        this.student = student;
        this.dateEnrolled = dateEnrolled;
        this.unit = unit;
    }
    
    public String display() {
        return String.format("%s %s %s", student.display(), dateEnrolled, unit.display());
    }

    public String getDate() {
        return dateEnrolled;
    }

    public Student getStudent() {
        return student;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setDate(String newDate) {
        this.dateEnrolled = newDate;
    }

    public void setStudent(Student newStudent) {
        this.student = newStudent;
    }

    public void setUnit(Unit newUnit) {
        this.unit = newUnit;
    }

}
