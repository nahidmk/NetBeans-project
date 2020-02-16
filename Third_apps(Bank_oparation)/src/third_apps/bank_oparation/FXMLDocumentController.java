
package third_apps.bank_oparation;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane p1;
    @FXML
    private Label p1l1;
    @FXML
    private TextField p1t1;
    @FXML
    private PasswordField p1t2;
    @FXML
    private Pane p2;
    @FXML
    private Label p2l2;
    @FXML
    private TextField p2t1;
    @FXML
    private PasswordField p2t2;
    @FXML
    private PasswordField p2t3;
    @FXML
    private Pane p3;
     Connection con;
     ResultSet res;
     Statement sta;
    @FXML
    private Pane p5;
    @FXML
    private Pane p4;
    @FXML
    private Pane p6;
    @FXML
    private Pane p9;
    @FXML
    private Pane p8;
    @FXML
    private Pane p7;
    @FXML
    private TextArea p4t2;
    @FXML
    private Label p4l4;
    @FXML
    private TextField p4t1;
    @FXML
    private TextField p8t1;
    @FXML
    private TextField p8t2;
    @FXML
    private TextField p8t3;
    @FXML
    private TextField p8t4;
    @FXML
    private TextField p8t5;
    @FXML
    private TextField p8t6;
    @FXML
    private TextField p8t7;
    @FXML
    private TextField p9t1;
    @FXML
    private TextField p9t2;
    @FXML
    private TextField p9t3;
    @FXML
    private TextField p9t4;
    @FXML
    private TextField p9t5;
    @FXML
    private TextField p9t6;
    @FXML
    private TextField p9t7;
    @FXML
    private TextField p9t8;
    @FXML
    private TextField p9t9;
    @FXML
    private TextField p8t8;
    @FXML
    private Pane p10;
    @FXML
    private TextField p10t1;
    @FXML
    private Pane p11;
    @FXML
    private Pane p12;
    @FXML
    private TextField p12t1;
    @FXML
    private TextField p12t2;
    @FXML
    private TextField p12t3;
    @FXML
    private Pane p13;
    @FXML
    private TextField p13t1;
    @FXML
    private TextField p13t2;
    @FXML
    private TextField p13t3;
    @FXML
    private Pane p14;
    @FXML
    private TextField p14t1;
    @FXML
    private TextField p14t2;
    @FXML
    private TextField p14t3;
    @FXML
    private TextField p14t4;
    @FXML
    private Pane p15;
    @FXML
    private TextField p15t1;
    @FXML
    private TextField p15t2;
    @FXML
    private TextField p15t3;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/password","root","manik");
            sta = con.createStatement();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }  
       p1.setVisible(true);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(false);
       p12.setVisible(false);
       p13.setVisible(false);
       p14.setVisible(false);
       p15.setVisible(false);
       
    }    

    @FXML
    private void login(ActionEvent event) {
       
       
        String te;
        String te2;
        te = p1t1.getText();
        te2 = p1t2.getText();
        String sql = "select * from word where User_name = '"+te+"'";
            String text = "";
        if(te.length()>0&&te2.length()>0)
        {
            
            try
            {
               res = sta.executeQuery(sql);
               while(res.next())
               {
                   text = res.getString(2);
                   
               }
               if(te2.equals(text))
                {
                    p1.setVisible(false);
                    p2.setVisible(false);
                    p3.setVisible(true);
                }else
                    p1l1.setText("chack...user name and password...");
                       
            }catch(Exception e)
            {
               p1l1.setText(""+e); 
            }
            
        }else
            p1l1.setText("give User name and password");
    }

    @FXML
    private void p1reset(ActionEvent event) {
        p1t1.setText("");
        p1t2.setText("");
        p1l1.setText("");
    }

    @FXML
    private void signup(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
    }

    @FXML
    private void p2save(ActionEvent event) {
       
        String te = p2t1.getText();
        String te1 = p2t2.getText();
        String te2 = p2t3.getText();
        String te3 = "select*from word where User_name = '"+te+"'";
        String text = "";
         int a = JOptionPane.showConfirmDialog(null,"Do you want to Signup","Signup", JOptionPane.YES_NO_OPTION);
      if(a==0)
      {
        if(te.length()>0&&te1.length()>0&te2.length()>0)
        {
            if(te1.length()>5&&te2.length()>5){
           
           if(te1.equals(te2))
           {
                try{
                res = sta.executeQuery(te3);
                while(res.next())
                {
                    text = res.getString(2);
                }               
             }catch(Exception e)
              {
                p2l2.setText(""+e);                
              }
                if(text.equals(te1))
                {
                    p2l2.setText("this password already used");
                }else
               {
                   String sql = "Insert into word values('"+te+"','"+te1+"')";
              try
              {
                 if(sta.executeUpdate(sql)>0)
               {
                   p2l2.setText("done");
               }  
                 else
                     p2l2.setText("sorry");
              }catch(Exception e)
              {
                  p2l2.setText("this user name already used");
              }
               }
               
           }
           else
               p2l2.setText("plese correct your password");
            }else
                //p2l2.setText("give more then 5 charecter");
                JOptionPane.showConfirmDialog(null, "give more then 5 charecter");
            
        }else
            p2l2.setText("Complete all things....");
      }
    }

    @FXML
    private void p2reset(ActionEvent event) {
        p2t1.setText("");
        p2t2.setText("");
        p2t3.setText("");
        p2l2.setText("");
    }

    @FXML
    private void p2Exit(ActionEvent event) {
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }

    @FXML
    private void p3exit(ActionEvent event) {
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }

    @FXML
    private void p3chackprofile(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(true);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p3createaccount(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(true);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p3transaction(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(true);
        
    }

    @FXML
    private void p3aboutbank(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(true);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p3aboutaccount(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(true);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p3deleteaccout(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(true);
       
    }

    @FXML
    private void p5exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(true);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p4exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(true);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p6exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(true);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p9exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(true);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p8exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(true);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p7exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(true);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
    }

    @FXML
    private void p4serch(ActionEvent event) {
       
        String te = p4t1.getText();        
        String te1 = "Select*from Bank where Accout = '"+te+"'";
        String text = "Accout Type = ";
        String te2 = "Name = ";
        String te3 = "Father/Husband = ";
        String te4 = "Address = ";
        String te5 = "Nomini = ";
        String te6 = "Email = ";
        String te7 = "phone = ";
        String te8 = "NID = ";
        String te9 = "Deposite = ";
        String te10 = "Loan = ";
        String text1 = "Expairing Date = ";
        String text2 = "";
        String text3 = "Running Account";
        
       if(te.length()>0)
       {
            try
        {
           res = sta.executeQuery(te1);
           while(res.next())
           {
               text = res.getString(2);
               te2 += res.getString(3);
               te3 += res.getString(4);
               te4 += res.getString(5);
               te5 += res.getString(6);
               te6 += res.getString(7);
               te7 += res.getString(8);
               te8 += res.getString(9);
               te9 += res.getString(10);
               te10 += res.getString(11);
               text1 += res.getString(12);
           }
           if(text.equals(text3)){
           text2 = text+"\n"+te2+"\n"+te3+"\n"+te4+"\n"+te5+"\n"+te6+"\n"+te7+"\n"+te8+"\n"+te9+"\n"+te10;
           p4t2.setText(text2);
           }else{
               text2 = text+"\n"+te2+"\n"+te3+"\n"+te4+"\n"+te5+"\n"+te6+"\n"+te7+"\n"+te8+"\n"+te9+"\n"+te10+"\n"+text1;
                p4t2.setText(text2);}
        }catch(Exception e)
        {
            p4l4.setText(""+e);
        }
       }
       else
           JOptionPane.showConfirmDialog(null, "there is no Account number");
    }

    @FXML
    private void p6DepositeAccount(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(true);
    }

    @FXML
    private void p6runningAccount(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(true);
       p9.setVisible(false);
    }

    @FXML
    private void p4reset(ActionEvent event) {
        p4t1.setText("");
        p4t2.setText("");
    }

    @FXML
    private void p8save(ActionEvent event) {
        String text = "Running Account";
        String Acc = p8t8.getText();
        String te = p8t1.getText();
        String te1 = p8t2.getText();
        String te2 = p8t3.getText();
        String te3 = p8t4.getText();
        String te4 = p8t5.getText();
        String te5 = p8t6.getText();
        String te6 = p8t7.getText();
        String sql = "insert into bank values('"+Acc+"','"+text+"','"+te+"','" +te1+"','"+te2+"','"+te3+"','"+te4+"','"+te5+"','"+te6+"','"+0+"','"+0+"','"+0+"')";
        if(Acc.length()>0&&te.length()>0&&te1.length()>0&&te2.length()>0&&te3.length()>0&&te4.length()>0&&te5.length()>0&&te6.length()>0){
            try{
                if(sta.executeUpdate(sql)>0)
                {
                    JOptionPane.showConfirmDialog(null, "Done");
                }else
                    JOptionPane.showConfirmDialog(null, "Sorry");


            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
        }else
            JOptionPane.showConfirmDialog(null, "Give input");
        
    }

    @FXML
    private void p8reset(ActionEvent event) {
        p8t1.setText("");
        p8t2.setText("");
        p8t3.setText("");
        p8t4.setText("");
        p8t5.setText("");
        p8t6.setText("");
        p8t7.setText("");
        p8t8.setText("");
        
        
    }

    @FXML
    private void p9save(ActionEvent event) {
        String t = p9t9.getText();
        String text = "Deposite Account";
        String te = p9t1.getText();
        String te1 = p9t2.getText();
        String te2 = p9t3.getText();
        String te3 = p9t4.getText();
        String te4 = p9t5.getText();
        String te5 = p9t6.getText();
        String te6 = p9t7.getText();
        String te7 = p9t8.getText();
        String sql = "insert into bank values('"+t+"','"+text+"','"+te+"','" +te1+"','"+te2+"','"+te3+"','"+te4+"','"+te5+"','"+te6+"','"+0+"','"+0+"','"+te7+"')";
        if( t.length()>0&&te.length()>0&&te1.length()>0&&te2.length()>0&&te3.length()>0&&te4.length()>0&&te5.length()>0&&te6.length()>0&&te7.length()>0){
            try{
                if(sta.executeUpdate(sql)>0)
                {
                    JOptionPane.showConfirmDialog(null, "Done");
                }else
                    JOptionPane.showConfirmDialog(null, "Sorry");


            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
        }else
            JOptionPane.showConfirmDialog(null, "Give input");
    }
    
       
    

    @FXML
    private void p9reset(ActionEvent event) {
        p9t1.setText("");
        p9t2.setText("");
        p9t3.setText("");
        p9t4.setText("");
        p9t5.setText("");
        p9t6.setText("");
        p9t7.setText("");
        p9t8.setText("");
        p9t9.setText("");
    }  

    @FXML
    private void p10OK(ActionEvent event) {
        String te = p10t1.getText();
        if(te.length()>0){
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete", "worning",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==0){
        
        String sql = "delete from bank where accout = '"+te+"'";
        try{
            if(sta.executeUpdate(sql)>0)
            {
                JOptionPane.showConfirmDialog(null, "Done");
            }else
                JOptionPane.showConfirmDialog(null, "Sorry");
        }catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        }
        }else
            JOptionPane.showConfirmDialog(null, "give input");
    }

    @FXML
    private void P10reset(ActionEvent event) {
        p10t1.setText("");
    }

    @FXML
    private void p10exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
        
    }

    @FXML
    private void p11deposite(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(false);
       p12.setVisible(true);
    }

    @FXML
    private void p11Withdraw(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(false);
       p12.setVisible(false);
       p13.setVisible(true);
    }

    @FXML
    private void p11loan(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(false);
       p12.setVisible(false);
       p14.setVisible(true);
    }

    @FXML
    private void p11loanpayment(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(false);
       p12.setVisible(false);
       p15.setVisible(true);
    }

    @FXML
    private void p11Exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(true);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(false);
    }

    @FXML
    private void p12Save(ActionEvent event) {
        String te = p12t1.getText();
        String te1 = p12t2.getText();
        String te3 = "";
        String te4 = "";
        String time = "";
        String type = "";
        String type1 = "Running Account";
       int a  = Integer.parseInt(te1);
        String sql = "Select*from bank where accout = '"+te+"'";
        
        if(te.length()>0&&te1.length()>0)
        {
            try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    type = res.getString(2);
                    te3 = res.getString(10);
                    time = res.getString(12);
                }
                
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            if(type.equals(type1)){
            int b = Integer.parseInt(te3);
                int c = a+b;
                
                String spl = "update bank set deposite = '"+c+"' where accout = '"+te+"'";
                try{
                    if(sta.executeUpdate(spl)>0)
                    {
                        JOptionPane.showConfirmDialog(null, "done");
                    }else
                        JOptionPane.showConfirmDialog(null, "sorry");
                }catch(Exception e)
                {
                    JOptionPane.showConfirmDialog(null, e);
                }
                 try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    te4 = res.getString(10);
                }
                p12t3.setText(te4);
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            }else
            {
                int b = Integer.parseInt(te3);
                
                int d = Integer.parseInt(time);
                float f = (a*d)/10;
                float o = a+f;
                float c = b+o;
                String spl = "update bank set deposite = '"+c+"' where accout = '"+te+"'";
                try{
                    if(sta.executeUpdate(spl)>0)
                    {
                        JOptionPane.showConfirmDialog(null, "done");
                    }else
                        JOptionPane.showConfirmDialog(null, "sorry");
                }catch(Exception e)
                {
                    JOptionPane.showConfirmDialog(null, e);
                }
                 try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    te4 = res.getString(10);
                }
                p12t3.setText(te4);
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            }
        }else
            JOptionPane.showConfirmDialog(null, "give input");
       
        
    }

    @FXML
    private void p12reset(ActionEvent event) {
        p12t1.setText("");
        p12t2.setText("");
        p12t3.setText("");
    }

    @FXML
    private void p12exit(ActionEvent event) {
         p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(true);
       p12.setVisible(false);
    }

    @FXML
    private void p13ok(ActionEvent event) {
        String te = p13t1.getText();
        String te1 = p13t2.getText();
        String te3 = "";
        String te4 = "";
        String time = "";
        String type = "";
        String type1 = "Running Account";
       int a  = Integer.parseInt(te1);
        String sql = "Select*from bank where accout = '"+te+"'";
        
        
            
            try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    type = res.getString(2);
                    te3 = res.getString(10);
                    time = res.getString(12);
                }
                
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            
           int b = Integer.parseInt(te3);
           if(te.length()>0&&te1.length()>0)
        {
           if(b>1){
               if(b>a){
            if(type.equals(type1)){
                int nu = JOptionPane.showConfirmDialog(null, "do you want to withdraw your money","worning",JOptionPane.YES_NO_CANCEL_OPTION);
            if(nu==0){
            
                int c = b-a;
                
                String spl = "update bank set deposite = '"+c+"' where accout = "+te+"";
                try{
                    if(sta.executeUpdate(spl)>0)
                    {
                        JOptionPane.showConfirmDialog(null, "done");
                    }else
                        JOptionPane.showConfirmDialog(null, "sorry");
                }catch(Exception e)
                {
                    JOptionPane.showConfirmDialog(null, e);
                }
                 try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    te4 = res.getString(10);
                }
                p13t3.setText(te4);
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            }
            }
           
            else
            {
                int nu = JOptionPane.showConfirmDialog(null, "Manager make sure that this account is ended","worning",JOptionPane.YES_NO_CANCEL_OPTION);
            if(nu==0){
                 
                int c = b-a;
                
                
                String spl = "update bank set deposite = '"+c+"' where accout = "+te+"";
                try{
                    if(sta.executeUpdate(spl)>0)
                    {
                        JOptionPane.showConfirmDialog(null, "done");
                    }else
                        JOptionPane.showConfirmDialog(null, "sorry");
                }catch(Exception e)
                {
                    JOptionPane.showConfirmDialog(null, e);
                }
                 try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    te4 = res.getString(10);
                }
                p13t3.setText(te4);
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            }
            }
           }
               else
                   JOptionPane.showConfirmDialog(null, "your deposite is too much low");
           }
           else
               JOptionPane.showConfirmDialog(null, "You have no deposite");
        }else
            JOptionPane.showConfirmDialog(null, "give input");
    }

    @FXML
    private void p13reset(ActionEvent event) {
        p13t1.setText("");
        p13t2.setText("");
        p13t3.setText("");
    }

    @FXML
    private void p13exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(true);
       p12.setVisible(false);
       p13.setVisible(false);
    }

    @FXML
    private void p14ok(ActionEvent event) {
        String te = p14t1.getText();
        String te1 = p14t2.getText();
        String te3 = p14t3.getText();
        String te4 = "";
       int a  = Integer.parseInt(te1);
       int f = Integer.parseInt(te3);
        String sql = "Select*from bank where accout = '"+te+"'";
        
        if(te.length()>0&&te1.length()>0&&te3.length()>0)
        {
            try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                 
                    te4 = res.getString(11);
                    
                }
                
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            int b = Integer.parseInt(te4);
            if(b<1){
                int c = a*f/10;
                int o = a+c;
                
                String spl = "update bank set loan = '"+o+"' where accout = "+te+"";
                try{
                    if(sta.executeUpdate(spl)>0)
                    {
                        JOptionPane.showConfirmDialog(null, "done");
                    }else
                        JOptionPane.showConfirmDialog(null, "sorry");
                }catch(Exception e)
                {
                    JOptionPane.showConfirmDialog(null, e);
                }
                 try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    te4 = res.getString(11);
                }
                p14t4.setText(te4);
                
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            }
            else 
                JOptionPane.showConfirmDialog(null, "you have still lone in your account ");
        }
        else 
            JOptionPane.showConfirmDialog(null, "give input");
        
    }

    @FXML
    private void p14reset(ActionEvent event) {
        p14t1.setText("");
        p14t2.setText("");
        p14t3.setText("");
        p14t4.setText("");
    }

    @FXML
    private void p14exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(true);
       p12.setVisible(false);
       p13.setVisible(false);
       p14.setVisible(false);
        
    }

    @FXML
    private void p15ok(ActionEvent event) {
        String te = p15t1.getText();
        String te1= p15t2.getText();
        String loan = "";
        String sql = "select*from bank where accout = '"+te+"'";
        int amount = Integer.parseInt(te1);
        String loan2 = "";
        try
        {
            res = sta.executeQuery(sql);
             while(res.next())
             {
                 loan = res.getString(11);
             }
             
        }catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        int old = Integer.parseInt(loan);
        int c = old-amount;
        String spl = "update bank set loan = '"+c+"'where accout = "+te+"";
        if(te.length()>0&&te1.length()>0)
        {
            try{
            if(sta.executeUpdate(spl)>0)
            {
                JOptionPane.showConfirmDialog(null, "done");
            }else
                JOptionPane.showConfirmDialog(null, "sorry");
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            try{
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    loan2  = res.getString(11);
                }
                p15t3.setText(loan2);
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
        }else
            JOptionPane.showConfirmDialog(null, "Give input");
    }

    @FXML
    private void p15reset(ActionEvent event) {
        p15t1.setText("");
        p15t2.setText("");
        p15t3.setText("");
        
    }

    @FXML
    private void p15exit(ActionEvent event) {
        p1.setVisible(false);
       p2.setVisible(false);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       p6.setVisible(false);
       p7.setVisible(false);
       p8.setVisible(false);
       p9.setVisible(false);
       p10.setVisible(false);
       p11.setVisible(true);
       p12.setVisible(false);
       p13.setVisible(false);
       p14.setVisible(false);
       p15.setVisible(false);
    }
    
}
