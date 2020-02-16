/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {

//    @FXML
//    private TextArea t1;
//    
//   private String text = "";
//   private String text1;
//   private String text3;
//      
//
//    @FXML
//    private void reset(ActionEvent event) {
//        t1.setText("");
//    }
//
//    @FXML
//    private void save(ActionEvent event) throws IOException {
//        try
//        {
//            FileReader mk = new FileReader("abc.tex");
//            int i;
//            while((i=mk.read())!=-1)
//            {
//               text+=(""+(char)i); 
//            }
//            mk.close();
//            text1 = t1.getText();
//            text3=text+"\n"+text1;
//            FileWriter ob = new FileWriter("abc.tex");
//            ob.write(text3);
//            ob.close();
//        }
//        catch(Exception e)
//        {
//            System.out.print(e);
//        }
//        
//    }
//
//    @FXML
//    private void show(ActionEvent event) throws FileNotFoundException{
//    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    @FXML
    private TextArea t1 ;
    @FXML
    private void resert(ActionEvent event) {
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
