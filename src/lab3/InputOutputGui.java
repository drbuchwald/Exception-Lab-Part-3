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
        boolean isError = false;
        String lastName = "";
        do{
            isError = false;
            String fullName = JOptionPane.showInputDialog(FORMAT_ERROR_MESSAGGE);
        try {
            lastName = nameService.extractLastName(fullName);
            
            
        } catch (CustomException exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage());
            isError = true;
        }
}
        while(isError);
        lName += lastName;
        JOptionPane.showMessageDialog(null, lName);
    }

}

