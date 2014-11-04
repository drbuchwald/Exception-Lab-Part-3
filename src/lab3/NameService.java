package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_INDEX = 0;
    private static final int LAST_NAME_INDEX = 1;
    public static final int MAX_LENGTH = 2;
    public static final int ZERO = 0;
    public static final String SPLIT_VALUE = " ";
    public static final String ERROR_NAME_FORMAT = "Please enter your first AND last names with a space inbeween.";
    public static final String ERROR_NO_NAME_ENTERED = "Name cannot be null";
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * 
     * 
     * checks: fullname.length
     * check for space between first and last name
     * check if name is blank    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * 
     * 
     * checks: fullname.length
     * check for space between first and last name
     * check if name is blank
     */
    
    public String extractLastName(String fullName) throws CustomException {

        String lastName = "";
                
        if (fullName.length() > ZERO) {
            String[] nameParts = fullName.split(SPLIT_VALUE);
            if (nameParts.length == MAX_LENGTH) {
                lastName = nameParts[nameParts.length - LAST_NAME_INDEX];
            } else {
                throw new CustomException(ERROR_NAME_FORMAT);
            }
        } else {
            throw new CustomException(ERROR_NO_NAME_ENTERED);
        }
        
        return lastName;
    }
     
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     * 
     * 
     * 
     */
    public String extractFirstName(String fullName) throws CustomException {

        String firstName = "";
        if (fullName.length() > ZERO) {
            String[] nameParts = fullName.split(SPLIT_VALUE);
            if (nameParts.length == MAX_LENGTH) {
                firstName = nameParts[FIRST_NAME_INDEX];
            } else {
                throw new CustomException(ERROR_NAME_FORMAT);
            }
        } else {
            throw new CustomException(ERROR_NO_NAME_ENTERED);
        }
        return firstName;

    }
    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        
        return name.length();
    }
    
}
