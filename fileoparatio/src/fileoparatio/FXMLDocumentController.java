/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoparatio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import java.io.*;
import javafx.scene.control.MenuItem;
/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
 
    @FXML
    private TextArea t1;
    @FXML
    private MenuButton b1;
    
    private Tooltip t2;
    private String te = "";
    private String te1;
    private String te2;
    @FXML
    private MenuItem re;
    
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
            FileReader mk  = new FileReader("abc.tex");
            int i ;
            while((i=mk.read())!=-1)
            {
                te+=""+(char)i;
            }
            mk.close();
            te1 =t1.getText();
            te2 = te+"\n"+te1;
            FileWriter ms = new FileWriter("abc.tex");
            ms.write(te2);
            ms.close();
            
        }catch(Exception e)
        {
            
        }
        
    }

    @FXML
    private void show(ActionEvent event) {
        String l = "";
        try{
        FileReader o = new FileReader("abc.tex");
        int i;
        while((i=o.read())!=-1)
        {
           l+=""+(char)i ;
        }
        o.close();
        t1.setText(l);
          }catch(Exception e)
          {
              
          }
    }

    @FXML
    private void event(ActionEvent event) {
         final Tooltip k = new Tooltip();
        k.setText("cleck here to do 'show''save''reset'");
        b1.setTooltip(k);
    }
    
}
