import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClearButtonListener implements ActionListener {
    private StudentWindow gui;
    
    public ClearButtonListener(StudentWindow sw){
        gui = sw;
    }
    public void actionPerformed(ActionEvent e){
        gui.clearData();
    }
}