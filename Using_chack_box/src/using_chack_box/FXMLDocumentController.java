/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using_chack_box;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.*;
/**
 *
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextArea t1;
    
   String student = "";
   String single = "";
   String job = "";
   String not_stu = "";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void show(ActionEvent event) {
        String te = student+"\n"+single+"\n"+job+"\n"+not_stu;
        String t = "";
        try{
            FileOutputStream mk = new FileOutputStream("abc.txt");
            byte b[] = te.getBytes();
            mk.write(b);
            mk.close();
            FileInputStream ms = new FileInputStream("abc.txt");
            int i;
            while((i=ms.read())!=-1)
            {
                t+=""+(char)i;
            }
            t1.setText(t);
            ms.close();
            
        }catch(Exception e)
        {
            
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
    }

    @FXML
    private void student(ActionEvent event) {
        student = "Student";
    }

    @FXML
    private void single(ActionEvent event) {
        single = "Single";
        
    }

    @FXML
    private void job(ActionEvent event) {
        job = "Job less";
    }

    @FXML
    private void not_stu(ActionEvent event) {
        not_stu = "Not Student";
    }
    
}
