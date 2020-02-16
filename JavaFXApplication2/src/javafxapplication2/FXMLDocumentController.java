/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField t1;
    
  private String text1;
  private String text2;
  private String text3;
  private String text4;
  private String text5;
  private String text6;
  private double c;
  private double d;
  private double f;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void digit(ActionEvent event) {
        text1 = ((Button)event.getSource()).getText();
        
        text2 = t1.getText();
        text3 = text2+text1;
        t1.setText(text3); 
    }

    @FXML
    private void oparation(ActionEvent event) {
        text4 = t1.getText();
        c = Double.parseDouble(text4);
        t1.setText("");
         text6 = ((Button)event.getSource()).getText();
        
    }

    @FXML
    private void equql(ActionEvent event) {
        text5= t1.getText();
        d=Double.parseDouble(text5);
       switch(text6)
       {
           case "+":
               f=c+d;
               break;
           case "-":
               f=c-d;
               break;
           case "*":
               f=c*d;
               break;
           case "/":
               f=c/d;
               break;
       }
       t1.setText(""+f);
        
        
    }

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
    }
    
}

