
package cv;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    @FXML
    private TextField t4;
    @FXML
    private TextArea t5;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
    }

    @FXML
    private void show(ActionEvent event) {
        String te1;
        String te2;
        String te3;
        String te4;
        String te5;
        te1 = t1.getText();
        te2=t2.getText();
        te3 = t3.getText();
        te4 = t4.getText();
        te5 = "Name ="+te1+"\n"+"Address = "+te2+"\n"+"Qualification = "+te3+"\n"+"CGPA = "+te4;
        t5.setText(te5);
        
        
    }
    
}
