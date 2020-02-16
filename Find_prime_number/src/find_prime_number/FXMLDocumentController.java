/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find_prime_number;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
     String n[] = new String[100];
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for(int i = 1;i<=100;i++)
        {
            int count = 0;
            for(int j = 1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                 for(int o = 0;o<100;o++)
                 {
                     n[o]+=i;
                 }
        }
        System.out.print(n[2]);
    }    

    @FXML
    private void show(ActionEvent event) {
        String text = t1.getText();
       
        int num = Integer.parseInt(text);
       
       t2.setText(""+n[num]);
    }

    @FXML
    private void clear(ActionEvent event) {
        t1.setText("");
        t2.setText("");
        
    }
    
}
