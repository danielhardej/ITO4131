public class Unit {

    /**
     * Unit class for the Enrollment class.
     * 
     * @version 1.0
     * @author Daniel Hardej
     * Last updated: 2023-11-06
     * 
     */

    String unitCode;
    String unitDescription;
    int creditPoints;

    /**
     * Default constructor for objects of class Unit
     */
    public Unit()
    {
        this.unitCode = "";
        this.unitDescription = "";
        this.creditPoints = 0;
    }

    /**
     * Constructor for objects of class Unit
     * @param unitCode The unit code
     * @param unitDescription The unit description
     * @param creditPoints The credit points awarded upon successful completion of the unit
     */
    public Unit(String unitCode, String unitDescription, int creditPoints)
    {
        this.unitCode = unitCode;
        this.unitDescription = unitDescription;
        this.creditPoints = creditPoints;
    }

    /**
     * Display method to return the unit details
     * @return The unit details
     */
    public String display()
    {
        return String.format("%s %s %d", unitCode, unitDescription, creditPoints);
    }

    /**
     * 
     */
    public int getCreditPoints()
    {
        return creditPoints;
    }

    public String getUnitCode()
    {
        return unitCode;
    }

    public String getUnitDescription()
    {
        return unitDescription;
    }

    public void setCreditPoints(int creditPoints)
    {
        this.creditPoints = creditPoints;
    }

    public void setUnitCode(String unitCode)
    {
        this.unitCode = unitCode;
    }

    public void setUnitDescription(String unitDescription)
    {
        this.unitDescription = unitDescription;
    }

    /**
     * Method to return the unit details
     * @return The unit details as String
     */
    public String toString()
    {
        return "Unit code: " + unitCode + "\tUnit description: " + unitDescription + "\tCredit points: " + creditPoints;
    }

}
