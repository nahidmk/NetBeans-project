
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    private String text1;
    private String text2;
    private String text3;
    @FXML
    private TextField t4;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    public int d(int n)
    {
        int sum = 0;
        int temp,a=0,s;
        temp=n;
        while(n>0)
        {
          s=n%10;
          n = n/10;
          sum+=s;
          
        }
        return sum;
        
    }
    public int z(int n)
    {
        if(n==0)
            return 1;
        else if(n<10&&n>0)
            return 0;
        else
            return (z(n/10)+z(n%10));
    }
    public boolean p(int n)
    {
       int temp,s;
       int a=0;
       temp=n;
       while(n>0)
       {
          s=n%10;
          a=(a*10)+s;
          n=n/10;
       }
       
       if(temp==a)
       {
           return true;
       }
       else return false;
    }


    @FXML
    private void chack(ActionEvent event) {
       text1 = t1.getText();
       if(text1.length()==0)
       {
           t2.setText("give input");
           t3.setText("give input");
           t4.setText("give input");
       }
       else
       {
            int c = Integer.parseInt(text1);
          
                if(p(c))
                {
                    t3.setText("pallindrom");
                }
                else 
                {
                    t3.setText("not pallindrom");
                }
           
       }
    }

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
    }

    @FXML
    private void sum(ActionEvent event) {
        text2 = t1.getText();
        if(text2.length()==0)
       {
           t2.setText("give input");
           t3.setText("give input");
           t4.setText("give input");
       }
       else
        {
           int a = Integer.parseInt(text2);
           int c = z(a);
           t2.setText(""+c);
        }    
    }

    @FXML
    private void additon(ActionEvent event) {
        text3 = t1.getText();
        if(text3.length()==0)
       {
           t2.setText("give input");
           t3.setText("give input");
           t4.setText("give input");
       }
        else{
            int a = Integer.parseInt(text3);
            t4.setText(""+d(a));
        }
        
    }
    
}
