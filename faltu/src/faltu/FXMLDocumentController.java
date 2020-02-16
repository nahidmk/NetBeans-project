/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faltu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private TextField t2;
    @FXML
    private TextArea t3;
    private String text1;
    private String text2;
    private String text3;
    @FXML
    private TextField t1;
    private double c;
    
    private void handleButtonAction(ActionEvent event) 
    {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public boolean isnumber(String input)
    {
        int flag = 0;
        for(int i= 0;i<input.length();i++)
        {
            if(input.charAt(i)=='1') flag++;
           else if(input.charAt(i)=='2') flag++;
          else  if(input.charAt(i)=='3') flag++;
          else  if(input.charAt(i)=='4') flag++;
           else if(input.charAt(i)=='5') flag++;
           else if(input.charAt(i)=='6') flag++;
           else if(input.charAt(i)=='7') flag++;
           else if(input.charAt(i)=='8') flag++;
           else if(input.charAt(i)=='9') flag++;
           else if(input.charAt(i)=='0') flag++;
           else if(input.charAt(i)=='.') flag++;
            else {
                flag = 0;
                break;
            }
            
           
        }
        if(flag>=1)
            return true;
        else
            return false;
        
        
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
//    public boolean isnumber(String input)
//            {
//               int  count = 0;
//               if(input.matches("[0-9]+"))
//               {
//                   return true;
//               }
//               else 
//                   return false;
//            }
    @FXML
    private void alloparation(ActionEvent event) {
        
        text1= t1.getText();
       
       text2 = t2.getText();

       if(text1.length()==0||text2.length()==0||!isnumber(text1)||!isnumber(text2)||!point(text1)||!point(text2))
           
       {
           t3.setText("sorry");
       }
       else
       {
           double a  = Double.parseDouble(text1);
           double b = Double.parseDouble(text2);
         text3 = ((Button)event.getSource()).getText();
           switch(text3)
           {
               case "+":
                   c = a+b;
                   break;
               case "-":
                   c=a-b;
                   break;
               case"*":
                   c=a*b;
                   break;
               case "/":
                   c= a/b;
                   break;
           }
           t3.setText(""+c);
       }
     }
    

    @FXML
    private void Ac(ActionEvent event) {
               t1.setText("");
              t2.setText("");
              t3.setText("");
        
    }          
                
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            