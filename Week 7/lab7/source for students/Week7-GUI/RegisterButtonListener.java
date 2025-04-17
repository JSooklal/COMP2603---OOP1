import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RegisterButtonListener implements ActionListener{
    private StudentWindow gui;
    
    public RegisterButtonListener(StudentWindow sw){
        gui=sw;
    }
    public void actionPerformed(ActionEvent e){
        String fName = gui.getFirstName();
        String lName = gui.getLastName();
        String degree = gui.getProgramme();
        String status = gui.getStatus();
        
        gui.clearData();
        gui.setOutputText(
           "REGISTERED: " +fName+" " +lName+
           "\nDGREE OPTION: "+degree +
           "\nSTATUS:  " + status 
           );
    }
}
