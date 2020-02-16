/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charreadandweite;

import java.io.FileNotFoundException;
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
import javafx.scene.control.Tooltip;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button re;
    
   
    
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
@FXML
    private TextArea t1 ;
    @FXML
    private void resert(ActionEvent event) {
        final Tooltip mk = new Tooltip();
        mk.setText("cleck to reset");
        
          re.setTooltip(mk);  
     
        t1.setText("");
    }

    @FXML
    private void save(ActionEvent event) throws IOException {
        String text;
        String text3;
        String text2 = "";
                
        try {
        
         FileReader ms = new FileReader("abc.tex");
            int i;
            while((i=ms.read())!=-1)
            {
                text2 += ((char)i+"");
                //t1.setText((char)i+"");
            }
            ms.close();
        text=t1.getText();
        FileWriter mk = new FileWriter("abc.tex"); 
        text3 = text2 +"\n\r"+ text; 
        mk.write(text3);
        mk.close();
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }

    @FXML
    private void show(ActionEvent event) throws FileNotFoundException {
        try
        {
            FileReader ms = new FileReader("abc.tex");
            int i;
            String mk = "";
            while((i=ms.read())!=-1)
            {
                //System.out.print((char)i);
             mk += (""+(char)i);
            }
            t1.setText(mk);
            ms.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
