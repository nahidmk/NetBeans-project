
package second_apps;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import java.sql.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane p1;
    @FXML
    private Label p1la;
    @FXML
    private TextField p1t1;
    @FXML
    private PasswordField p1t2;
    @FXML
    private Label p2la;
    @FXML
    private TextField p2t1;
    @FXML
    private PasswordField p2t2;
    @FXML
    private PasswordField p2t3;
    @FXML
    private TextField p2t4;
    @FXML
    private Pane p3;
    @FXML
    private Pane p2;
    Connection con;
    Statement sta;
    ResultSet res;
   
    @FXML
    private TextField p3tn;
    @FXML
    private TextField p3tp;
    @FXML
    private TextField p3ta;
    @FXML
    private TextField p3te;
    @FXML
    private TextField p3tl;
    @FXML
    private TextField p3temi;
    @FXML
    private TextField p3tc;
    @FXML
    private TextField p3tr;
    @FXML
    private TextField p3tcc;
    @FXML
    private TextField p3tt;
    @FXML
    private TextField p3tte;
    @FXML
    private TextField p3tto;
    @FXML
    private Label p3la;
    @FXML
    private Pane p4;
    @FXML
    private TextArea p4t1;
     @FXML
    private TextField p3tnu;
    @FXML
    private TextField p3tc1;
    int t = 0;
    int  t1 = 0;
    int  t2 = 0;
    String t3 = "";
   String te1 = "";
    int  t4 = 0;
    String t5 = "";
    String t6 =  "";
    String t7 = "";
    String t8 = "";
    String t9 = "";
    String te= "";
    @FXML
    private ComboBox combox;
    @FXML
    private ComboBox combobox1;
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        combox.getItems().addAll("Farari","Lambergini","Rols Roys","porshi");
        combobox1.getItems().addAll("1000-1200","1500-2000","2000-3000");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/mk","root","manik");
            sta = con.createStatement();
            
        }catch(Exception e)
        {
            p1la.setText(""+e);
        }
       
    }    

    @FXML
    private void login(ActionEvent event) {
        String t = p1t1.getText();
        String t2 = p1t2.getText();
        String t3 = "";
        String sql = "select*from ms where User_name = '"+t+"'";
        
        if(t.length()>0&&t2.length()>0)
        {
            try
            {
               res = sta.executeQuery(sql);
               while(res.next())
               {
                   t3 = res.getString(2);
               }
               if(t3.equals(t2))
               {
                   p1.setVisible(false);
                   p2.setVisible(false);
                   p3.setVisible(true);
                   p4.setVisible(false);
                   
               }
               else
                   p1la.setText("chack your'User name'and'password'..");
            }catch(Exception e)
            {
                p1la.setText(""+e);
            }
        }
        else
            p1la.setText("give User name and password completly..");
    }

    @FXML
    private void p1reset(ActionEvent event) {
        p1t1.setText("");
        p1t2.setText("");
        p1la.setText("");
    }

    @FXML
    private void signup(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p4.setVisible(false);
    }

    @FXML
    private void p2exit(ActionEvent event) {
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }

    @FXML
    private void p2reset(ActionEvent event) {
        p2t1.setText("");
        p2t2.setText("");
        p2t3.setText("");
        p2la.setText("");
        p2t4.setText("");
    }

    @FXML
    private void p2save(ActionEvent event) {
        String t = p2t1.getText();
        String t1 = p2t2.getText();
        String t2 = p2t3.getText();
        
        String sql = "insert into ms values('"+t+"','"+t1+"')";
        String spl = " select *from ms where user_name = '"+t+"'";
      
        if(t.length()>0&&t1.length()>0&&t2.length()>0)
        {
           if(t1.equals(t2))
           {
             try
             {
                 
                    res = sta.executeQuery(spl);
                           while(res.next())
                           {
                               t3 = res.getString(2);
                               
                           }
                           
                if(t3.equals(t2))
                {
                    p2la.setText("already used");
                }
                else
                {
                         if(sta.executeUpdate(sql)>0)
                     {
                         p2la.setText("done,,");
                     }
                     else
                         p2la.setText("sorry..."); 
                         
                }

             }
             catch(Exception e)
             {
                 p2la.setText(""+e);
             }
            }
           else
               p2la.setText("password not curret..!");
        }
        else
        p2la.setText("Give information");
        
    }

    @FXML
    private void checkbos(ActionEvent event) {
        
        String t = p2t2.getText();
        p2t4.setText(t);
    }

    @FXML
    private void licence(ActionEvent event) {
        String n = "1500";
        t = Integer.parseInt(n);
        p3tl.setText(n);
        
    }

    @FXML
    private void emi(ActionEvent event) {
        String n= "1000";
        t1 = Integer.parseInt(n);
        p3temi.setText(n);
    }

    @FXML
    private void rode_lience(ActionEvent event) {
        String n = "10000"; 
        t2 = Integer.parseInt(n);
        p3tr.setText(n);
    }

    @FXML
    private void check_money(ActionEvent event) {
        String n= "5000";
        t4 = Integer.parseInt(n);
        p3tc.setText(n);
    }

    @FXML
    private void total(ActionEvent event) {
        int a = t+t1+t2+t4;
        int b ;
        int c= 0;
        int d = 0;
        String ab = p3tc1.getText();
        String cd = p3tcc.getText();
        
       
        if(ab.equals("farari")&&cd.equals("1000-1200"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 1000000;
        }
      else if(ab.equals("farari")&&cd.equals("1500-2000"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 1500000;
        }
      else  if(ab.equals("farari")&&cd.equals("2000-3000"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 20000000;
        }
      else  if(ab.equals("lambergini")&&cd.equals("1000-1200"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 25000000;
        }
       else if(ab.equals("lambergini")&&cd.equals("1500-2000"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 3000000;
        }
       else if(ab.equals("lambergini")&&cd.equals("2000-3000"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 35000000;
        }
      else if(ab.equals("Rols Roys")&&cd.equals("1000-1200"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 40000000;
        }
     else if(ab.equals("Rols Roys")&&cd.equals("1500-2000"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 4500000;
        }
      else if(ab.equals("Rols Roys")&&cd.equals("2000-3000"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 50000000;
        }
      else  if(ab.equals("porshi")&&cd.equals("1000-1200"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 6000000;
        }
       else  if(ab.equals("porshi")&&cd.equals("1500-2000"))
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 7000000;
        }
       else  if(ab.equals("porshi")&&cd.equals("2000-3000"));
        {
            System.out.println(ab);
            System.out.println(cd);
            b = 80000000;
        }
        
        c=b+a;
        p3tt.setText(""+c);
        d = (c*15)/100;
        p3tte.setText(""+d);
        int e = c+d;
        p3tto.setText(""+e);
        
        
    }

    @FXML
    private void p3reset(ActionEvent event) {
        p3tn.setText("");
        p3te.setText("");
        p3tnu.setText("");
        p3te.setText("");
        p3tp.setText("");
        p3tc.setText("");
        p3tr.setText("");
        p3tl.setText("");
        p3temi.setText("");
        p3tc1.setText("");
        p3tcc.setText("");
        p3tt.setText("");
        p3tto.setText("");
        p3tte.setText("");
        p3la.setText("");
    }

    @FXML
    private void Scrept(ActionEvent event) {
        p4.setVisible(true);
        p3.setVisible(false);
    }

    @FXML
    private void p3exit(ActionEvent event) {
         p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
    }

    @FXML
    private void p4exit(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);
    }

    @FXML
    private void p4reset(ActionEvent event) {
        p4t1.setText("");
    }

    @FXML
    private void car(ActionEvent event) {
        String a = (combox.getValue().toString());
        p3tc1.setText(a);
    }

    @FXML
    private void cc(ActionEvent event) {
        String b= (combobox1.getValue().toString());
        p3tcc.setText(b);
    }

    @FXML
    private void Show(ActionEvent event) {
        String mk = "";
        String mk1 = "Name              "+p3tn.getText();
        String mk2 = "Email             "+p3te.getText();
        String mk3 = "Number            "+p3tnu.getText();
        String mk4 = "            Thanks";
        String mk5 = "post code         "+p3tp.getText();
        String mk6 = "Check             "+p3tc.getText();
        String mk7 = "Rode Licence      "+p3tr.getText();
        String mk8 = "Licence           "+p3tl.getText();
        String mk9 = "EMI               "+p3temi.getText();
        String mk10 = "Car              "+p3tc1.getText();
        String mk11 = "CC               "+p3tcc.getText();
        String mk12 = "Total(with out teax)        "+p3tt.getText();
        String mk13 = "Total            "+p3tto.getText();
        String mk14 = "Total Teax       "+p3tte.getText();
        String mk15 = "=======================";
        String mk16 = "               Car Dillers";
        String mk17 = "=======================";
        mk = mk16+"\n"+mk15+"\n"+mk1+"\n"+mk2+"\n"+mk3+"\n"+mk5+"\n"+mk6+"\n"+mk7+"\n"+mk8+"\n"+mk9+"\n"+mk10+"\n"+mk11+"\n"+mk12+"\n"+mk13+"\n"+mk14+"\n"+mk15+"\n"+mk17+"\n"+mk4;
        p4t1.setText(mk);
    }
    
}
