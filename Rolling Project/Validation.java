/**
 * Validation class for validating user input
 * 
 * @version 1.0
 * @author Daniel Hardej
 * Last updated: 2023-11-09
 */

public class Validation
{
    /**
     * Default constructor for objects of class Validation
     */
    public Validation()
    {
        
    }

    /**
     * Method to check if a string is blank
     * 
     * @param string The string to check
     */
    public boolean isBlank(String string)
    {
        return string.trim().equals("");
    }

    /**
     * Method to check if a string's length is within a range
     * 
     * @param string The string to check
     * @param min The minimum length of the string
     * @param max The maximum length of the string
     */
    public boolean lengthWithinRange(String string, int min, int max)
    {
        return string.trim().length() >= min && string.trim().length() <= max;
    }

    /**
     * Method to check if a string is a valid address postcode
     * 
     * @param addressPostcode The address postcode to check
     */
    public boolean validateAddressPostcode(String addressPostcode)
    {
        return addressPostcode.matches("[0-9]{4}");
    }

    /**
     * Method to check if a string is a valid address state
     * 
     * @param addressState The address state to check
     */
    public boolean validateAddressState(String addressState)
    {
        return addressState.matches("[A-Z]{2,3}");
    }

    /**
     * Method to check if an integer is a valid credit point value
     * 
     * @param creditPoints The credit points value to check
     */
    public boolean validateCreditPoints(int creditPoints)
    {
        return creditPoints >= 0 && creditPoints <= 25;
    }

    /**
     * Method to check if a string is a valid date
     * 
     * @param date The date to check
     */
    public boolean validateDate(String date)
    {
        return date.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}") || date.matches("[0-9]{1,2} [A-Z][a-z]{3} [0-9]{4}");
    }

    /**
     * Method to check if a string is a valid email address
     * 
     * @param email The email address to check
     */
    public boolean validateEmail(String email)
    {
        return email.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+");
    }

    public boolean validateNumUnits(int numUnits)
    {
        return numUnits >= 1 && numUnits <= 10;
    }

    /**
     * Method to check whether a phone number is a valid string
     * 
     * @param phone The phone number to check
     */
    public boolean validatePhoneNumber(String phone)
    {
        return phone.matches("[0-9]{10}");
    }

    /**
     * Method to check whether a string is a valid Monash unit code
     * 
     * @param unitCode The unit code to check
     */
    public boolean validateUnitCode(String unitCode)
    {
        return unitCode.matches("[A-Z]{3}[0-9]{4}");
    }

    /**
     * Method to check whether a string is a valid Monash unit description
     * 
     * @param unitDescription The unit description to check
     */
    public boolean validateUnitDescription(String unitDescription)
    {
        return unitDescription.matches("[a-zA-Z0-9 ]+") && (unitDescription.length() <= 150);
    }

    /**
     * Method to check whether a string is a valid Monash unit name
     * 
     * @param unitName The unit name to check
     */
    public boolean validateUnitName(String unitName)
    {
        return unitName.matches("[a-zA-Z0-9 ]+");
    }
}