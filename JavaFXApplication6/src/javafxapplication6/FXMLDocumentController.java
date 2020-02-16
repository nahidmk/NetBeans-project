/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;


import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Formatter;
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
    private String t2;
    private String oldtext;
    private String newtext;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void save(ActionEvent event)
    {
        try
         {
      t2 = t1.getText();
      oldtext = t1.getText();
      newtext = oldtext+t2;
      
      FileOutputStream mk = new FileOutputStream ("abc.tex");
      byte b[] = newtext.getBytes();
      
      
      mk.write(b);
      mk.close();
    }
        catch(Exception e)
        {
            System.out.print(e);
        }
                
    } 

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
    }

    @FXML
    private void show(ActionEvent event) {
        try
        {
            FileInputStream ms = new FileInputStream("abc.tex");
            int i ;
            while(( i = ms.read())!=-1)
            {
                System.out.print((char)i);
//                oldtext = ((byte)i);
                
            }
          //  t1.setText((char)oldtext+"");
            ms.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        
    }
    
}
