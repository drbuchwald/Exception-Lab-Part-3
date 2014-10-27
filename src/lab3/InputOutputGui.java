package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;
    public static final String FORMAT_ERROR_MESSAGGE = "Please use the Format: (First Name, Last Name): ";
    public static String lName = "Your last name is: ";

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {

        String fullName = JOptionPane.showInputDialog(FORMAT_ERROR_MESSAGGE);
        try {
            String lastName = nameService.extractLastName(fullName);
            lName += lastName;
            JOptionPane.showMessageDialog(null, lName);
        } catch (CustomException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage());
        }

    }

}

