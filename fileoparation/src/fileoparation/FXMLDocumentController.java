  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoparation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextArea t1;
    private String text;
    private String text2 = "";
    private String text3;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void reset(ActionEvent event) {
        
            t1.setText("");
         
    }

    @FXML
    private void save(ActionEvent event) {
        try
            {
                 FileReader mk = new FileReader("abc.tex");
                 int i;
                 while((i=mk.read())!=-1)
                 {
                     text2 +=(""+(char)i);
                 }
                 mk.close();
                 text3=t1.getText();
                 String text1 = text2+"\n"+text3;
                 FileWriter ns = new FileWriter("abc.tex");
                ns.write(text1);
                ns.close();
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
    }

    @FXML
    private void show(ActionEvent event) {
        try
        {
            String t= "";
            FileReader i = new FileReader("abc.tex");
            int j;
            while((j=i.read())!=-1)
            {
                t+=(""+(char)j);
            }
            t1.setText(t);
            i.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
               
    }
    
}