
package byteoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea t1;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dooparation(ActionEvent event) throws FileNotFoundException, IOException {
        String text = ((Button)event.getSource()).getText();
        String text1 = t1.getText();
        String text2 ="";
        String text3;
        if(text.equals("reset"))
        {
            t1.setText("");
        }
        else if (text.equals("save"))
        {
            try
            {
                FileInputStream ms = new FileInputStream("abc.tex");
                int i;
                while((i=ms.read())!=-1)
                {
                    text2+=((char)i);
                }
                text3 = text2+"\n"+text1;
                FileOutputStream mk = new FileOutputStream("abc.tex");
                byte b[] = text3.getBytes();
                mk.write(b);
                mk.close();
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
                    
            
        }
        else if(text.equals("show"))
        {
            try
            {
                FileInputStream mk = new FileInputStream("abc.tex");
                int i;
                while((i=mk.read())!=-1)
                {
                    text2+=((char)i);
                }
                t1.setText(text2+"");
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
        }
    }
    
}