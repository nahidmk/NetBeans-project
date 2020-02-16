
package mixgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
   

    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    @FXML
    private TextField t4;
    @FXML
    private TextField t5;
    @FXML
    private TextField t1;
    @FXML
    private Button p;
    @FXML
    private Button s;
    @FXML
    private Button z;
    @FXML
    private Button se;
    @FXML
    private Button re;
    @FXML
    private TextField t6;
    @FXML
    private Button la;
    @FXML
    private TextField t7;
    @FXML
    private TextField t8;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pallidrom(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here to chack pallindrom");
        p.setTooltip(mk);
        String text = t1.getText();
        if(text.length()==0)
        {
            t2.setText("give input");
        }
        else
        {
            int a = Integer.parseInt(text);
            int temp,s,r=0;
            temp=a;
            while(a>0)
            {
                s = a%10;
                r=r*10+s;
                a = a/10;
            }
            if(temp==r)
            {
                t2.setText("yes");
            }
            else
                t2.setText("no");
        }
    }

    @FXML
    private void sumofdigit(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here to chack sum of digit");
        s.setTooltip(mk);
        String text = t1.getText();
        if(text.length()==0)
        {
            t3.setText("give input");
        }
        else
        {
            int a = Integer.parseInt(text);
            int temp,s,r=0;
            temp=a;
            while(a>0)
            {
                s = a%10;
                
                a = a/10;
                r+=s;
            }
            t3.setText(""+r);
        }
    }
public int z(int a)
{
    if(a==0)return 1;
    if(a<10&&a>0)return 0;
    else
        return(z(a/10)+z(a%10));
}
    @FXML
    private void chackzero(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here to chack zero");
        z.setTooltip(mk);
        String text = t1.getText();
        if(text.length()==0)
        {
            t4.setText("give input");
        }
        else
        {
            int a = Integer.parseInt(text);
            t4.setText(""+z(a));
        }
    }
public int s(int a)
{
    if(a==0||a==1)
        return a;
    else
        return(s(a-1)+s(a-2));
}
    @FXML
    private void seres(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here to chack serese");
        se.setTooltip(mk);
        String text = t1.getText();
        String f="";
        if(text.length()==0)
        {
            t5.setText("give input");
        }
        else
        {
            int a = Integer.parseInt(text);
            for(int i =1;i<=a;i++)
            {
               f+=(s(i)+" ");
            } 
            t5.setText(f);
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here for reset");
        re.setTooltip(mk);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t8.setText("");
        t7.setText("");
    }

//    private void setPromptText(String enter_the_value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @FXML
    private void large(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here to chack large number");
        la.setTooltip(mk);
        String t = t1.getText();
        if(t.length()>0)
        {
                int k = Integer.parseInt(t);
            int la = 0,a,temp = 0;
            temp = k;
            while(k>0)
            {
              a = k%10;
              if(la<a)
              {
                  la = a;
              }
             k = k/10;
            }
            t6.setText(""+la);
        }
        else
            t6.setText("give input");
            
    }

    @FXML
    private void St_pa(ActionEvent event) {
        String te = t7.getText();
        String t= "";
        for(int i=te.length()-1;i>=0;i--)
        {
            t+= te.charAt(i);
        }
        if(te.equalsIgnoreCase(t))
            t8.setText("It's pallindrom");
        else
            t8.setText("It's not pallindrom");
    }
    
}
