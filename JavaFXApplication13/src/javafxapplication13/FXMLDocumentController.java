/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

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
    private String oldtext;
    private String newtext;
    private String oparation;
    private String number;
    private String text;
    private double a;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void digit(ActionEvent event) {
        number = ((Button)event.getSource()).getText();
        oldtext = t1.getText();
        newtext = oldtext+number;
        t1.setText(newtext);
        
    }

    @FXML
    private void oparation(ActionEvent event) {
       text = t1.getText();
       if(point(text))
       {
           a = Double.parseDouble(text);
       t1.setText("");
       oparation = ((Button)event.getSource()).getText();
       }
       else
           t1.setText("error....");
    }
public boolean point(String s)
    {
        int count = 0;
        for(int i= 0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
                {
                    count++;
                }
        }
        if(count>1)
        {
            return false;
        }
        else return true;
    }
    @FXML
    private void equal(ActionEvent event) {
        String k = t1.getText();
        if(point(k))
        {
                double b,c = 0;

            b = Double.parseDouble(k);
            switch(oparation)
            {
                case "+":
                    c=a+b;
                    break;
                case "-":
                    c=a-b;
                    break;
                case "*":
                    c=a*b;
                    break;
                case "/":
                    c=a/b;
                    break;
            }
            t1.setText(""+c);
        }
        else 
            t1.setText("error...");
    }

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
    }
    
}
