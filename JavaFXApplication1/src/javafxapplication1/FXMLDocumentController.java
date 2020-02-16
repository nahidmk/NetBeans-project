
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    private String t;
    private String r;
    private int a;
    private String p;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    

    @FXML
    private void doaction(ActionEvent event) {
        t = t1.getText();
        a= Integer.parseInt(t);
       
        r=((Button)event.getSource()).getText();
        
        if(r.equals("chack"))
        {
                if(a==1)
               {
                   t2.setText("not prime");
               }
               else
               {
                   for(int i=2;i<a;i++)
                   
                   { if(a%i==0)
                       {
                           t2.setText("it's not  prime");
                       break;
                       }
                       else 
                          t2.setText("it's prime");
                   }

               }
        }
        else if(r.equals("reset"))
        {
                t2.setText("");
                t1.setText("");
        }       
        
    }
    
}
