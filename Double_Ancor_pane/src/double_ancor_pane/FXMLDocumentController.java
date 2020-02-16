
package double_ancor_pane;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import java.sql.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import java.io.*;
import java.math.*;
import java.applet.*;
import java.awt.*;
import java.lang.*;
import java.security.*;

public class FXMLDocumentController implements Initializable {
    
  
    @FXML
    private Pane p1;
    @FXML
    private TextField p1t1;
    @FXML
    private PasswordField p1t2;
    @FXML
    private Label p1la;
    @FXML
    private Pane p2;
    @FXML
    private TextField p2t1;
    @FXML
    private PasswordField p2t2;
    @FXML
    private Label p2la;
    Connection con;
    ResultSet res;
    Statement sta;
    @FXML
    private PasswordField p2t3;
    @FXML
    private Pane p3;
    @FXML
    private Pane p4;
    @FXML
    private Label p4la;
    @FXML
    private TextField p4t1;
    @FXML
    private TextField p4t2;
    @FXML
    private TextField p4t3;
    @FXML
    private TextField p4t4;
    @FXML
    private TextArea p4t5;
    @FXML
    private ToggleGroup gender;
    String ge = "";
    @FXML
    private Pane p5;
    @FXML
    private TextField p5t1;
    @FXML
    private Label p5la;
    @FXML
    private Pane p6;
    @FXML
    private Pane p7;
    @FXML
    private TextField p7t1;
    @FXML
    private TextArea p7t2;
    @FXML
    private Label p7la;
    @FXML
    private Pane p8;
    @FXML
    private TextField p8t1;
    @FXML
    private TextField p8t2;
    @FXML
    private TextArea p8t3;
    @FXML
    private Label p8la;
    @FXML
    private Pane p9;
    @FXML
    private TextField p8t4;
    @FXML
    private Label p9la;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        
        
    }    

    @FXML
    private void login(ActionEvent event) {
        String te = p1t1.getText();
        String te1 = p1t2.getText();
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mk","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            p1la.setText(""+e);
        }
        String sql = "select * from ms where user_name = '"+te+"'";
        String te2 = "";
        if(te.length()>0&&te1.length()>0)
        {
                try{
            res = sta.executeQuery(sql);
            while(res.next())
            {
              te2 = res.getString(2);
            }
            if(te1.equals(te2))
            {
                p3.setVisible(true);
                p1.setVisible(false);
                p2.setVisible(false);
            }
           else
                p1la.setText("sorry,,,chack User_name or password please");
            }catch(Exception e)
            {
                p1la.setText(""+e);
            }
        }
        else
            p1la.setText("give User_name and password please....!");
            
        
    }


    @FXML
    private void signup(ActionEvent event) {
        p2.setVisible(true);
        p1.setVisible(false);
    }

    @FXML
    private void save(ActionEvent event) {
        String te = p2t1.getText();
        String te1  = p2t2.getText();
        String te2 = p2t3.getText();
        String t3 = "";
        if(te.length()>0&&te1.length()>0&&te2.length()>0)
        {
                try{
             Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/mk","root","manik");
                sta = con.createStatement();
            }catch(Exception e)
            {
                p1la.setText(""+e);
            }
            String sql = "insert into ms values('"+te+"','"+te1+"')";
            String spl = " select *from ms where user_name = '"+te+"'";
            if(te1.equals(te2))
                
            {
                try
                {
                    res = sta.executeQuery(spl);
                           while(res.next())
                           {
                               t3 = res.getString(2);
                               
                           }
                           
                    if(t3.equals(te1))
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
                }catch(Exception e)
                {
                    p2la.setText(""+e);
                }
            }
            else
            p2la.setText("password not curret...!");
        }else
            p2la.setText("give me data please...!");
            
    }

    @FXML
    private void clene(ActionEvent event) {
        p1t1.setText("");
        p1t2.setText("");
        p1la.setText("");
    }

    @FXML
    private void p1clene(ActionEvent event) {
        p2t1.setText("");
        p2t2.setText("");
        p2t3.setText("");
        p2la.setText("");
    }

    @FXML
    private void exit(ActionEvent event) {
        p1.setVisible(true);
        p2.setVisible(false);
    }

    @FXML
    private void p3new(ActionEvent event) {
        p4.setVisible(true);
        p1.setVisible(false);
        p2.setVisible(false);p3.setVisible(false);
    }

    @FXML
    private void update(ActionEvent event) {
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
    private void delete(ActionEvent event) {
        p4.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p5.setVisible(true);
        p6.setVisible(false);
    }

    @FXML
    private void serch(ActionEvent event) {
        p4.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(true);
    }

    @FXML
    private void p3exit(ActionEvent event) {
       try{
            p1.setVisible(true);
        p3.setVisible(false);
        p2.setVisible(false);
        p4.setVisible(false);
       }catch(Exception e)
       {
           System.out.print(e);
       }
    }

    @FXML
    private void female(ActionEvent event) {
        ge = "Female";
    }

    @FXML
    private void male(ActionEvent event) {
        ge = "Male";
    }

    @FXML
    private void p4reset(ActionEvent event) {
        p4t1.setText("");
        p4t2.setText("");
        p4t3.setText("");
        p4t4.setText("");
        p4t5.setText("");
        p4la.setText("");
    }

    @FXML
    private void p4save(ActionEvent event) {
        String te = p4t1.getText();
        String te1 = p4t2.getText();
        String te2 = p4t3.getText();
        String te3 = p4t4.getText();
        String te4 = p4t5.getText();
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            p1la.setText(""+e);
        }
        String sql = "insert into student values('"+te+"','"+te1+"','"+te2+"','"+te3+"','"+te4+"','"+ge+"')";
        if(te.length()>0&&te1.length()>0&&te2.length()>0&&te3.length()>0&&te4.length()>0)
        {
                try
                {
                    if(sta.executeUpdate(sql)>0)
                    {
                        p4la.setText("done....");
                    }
                    else
                        p4la.setText("sorry");
                }catch(Exception e)
                {
                    p4la.setText(""+e);
                }
        }else
            p4la.setText("complete all text box....!");
    }

    @FXML
    private void p4exit(ActionEvent event) {
        p3.setVisible(true);
        p1.setVisible(false);
        p2.setVisible(false);
        p4.setVisible(false);
    }

    @FXML
    private void p5Exit(ActionEvent event) {
        p4.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p5.setVisible(false);
        p6.setVisible(false);
    }

    @FXML
    private void p5cencle(ActionEvent event) {
        p5t1.setText("");
        p5la.setText("");
    }

    @FXML
    private void p5delete(ActionEvent event) {
        String te = p5t1.getText();
        if(te.length()>0)
        {
            p4.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(true);
        }
        else
            p5la.setText("Give name here");
    }

    @FXML
    private void p6ok(ActionEvent event) {
       String te =  p5t1.getText();
       try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            p1la.setText(""+e);
        }
       String spl = "delete from student where name = '"+te+"'";
       try{
           if(sta.executeUpdate(spl)>0)
           {
               p6.setVisible(false);
               p5.setVisible(true);
               p5la.setText("done...");
           }
             else
               {
                    p6.setVisible(false);
               p5.setVisible(true);
               p5la.setText("sorry...");   
                 }
           
       }catch(Exception e)
       {
           p6.setVisible(false);
               p5.setVisible(true);
               p5la.setText(""+e);
       }
       
    }

    @FXML
    private void p6no(ActionEvent event) {
        p4.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p5.setVisible(true);
        p6.setVisible(false);
    }

    @FXML
    private void p7Exit(ActionEvent event) {
        p4.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
    }

    @FXML
    private void p7reset(ActionEvent event) {
        p7t1.setText("");
        p7t2.setText("");
        p7la.setText("");
    }

    @FXML
    private void p7serch(ActionEvent event) {
        String te = p7t1.getText();
        if(te.length()>0)
        {
                try
            {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            p1la.setText(""+e);
        }
        String sql = "select * from student where id = "+te;
        String te1 = "Name = ";
        String te2 = "Father's name = ";
        String te3 = "Address = ";
        String te4 = "Email = ";
        String te5 = "Gender = ";
        String t = "";
        try
        {
            res = sta.executeQuery(sql);
            while(res.next())
            {
                te1+= res.getString(2);
                te2 += res.getString(3);
                te3 += res.getString(4);
                te4 += res.getString(5);
                te5 += res.getString(6);
            }
                t = te1+"\n"+ te2+"\n"+te3+"\n"+te4+"\n"+te5;
                p7t2.setText(t);
             }catch(Exception e)
             {
                 p7la.setText(""+e);
             }
        }
        else
            p7la.setText("Give here ID please");
    }

    @FXML
    private void p8Exit(ActionEvent event) {
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
    private void p8reset(ActionEvent event) {
        p8t1.setText("");
        p8t2.setText("");
        p8t3.setText("");
        p8t4.setText("");
        p8la.setText("");
    }

    @FXML
    private void p8update(ActionEvent event) {
        String te = p8t1.getText();
        String te1 = p8t2.getText();
        String te3 = p8t3.getText();
        if(te.length()>0||te1.length()>0||te3.length()>0)
        {
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
        else
            p8la.setText("Give data please....");
    }

    @FXML
    private void p9no(ActionEvent event) {
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
    private void p9ok(ActionEvent event) {
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            p1la.setText(""+e);
        }
        String te = p8t1.getText();
        String te1 = p8t2.getText();
        String te3 = p8t3.getText();
        String na = p8t4.getText();
        String sql = "";
        if(na.length()>0)
            {

            if(te.length()>0&&te1.length()==0&&te3.length()==0)
            {
                 sql = "update student set id ="+te+" where name = '"+na+"'";
            }
            if(te.length()==0&&te1.length()>0&&te3.length()==0)
            {
                 sql = "update student set email = '"+te1+"'where name = '"+na+"'";
            }
            if(te.length()==0&&te1.length()==0&&te3.length()>0)
            {
                 sql = "update student set Address = '"+te3+"'where name = '"+na+"'";
            }
            if(te.length()>0&&te1.length()>0&&te3.length()==0)
            {
                 sql = "update student set id = "+te+",email = '"+te1+"'where name = '"+na+"'";
            }
            if(te.length()>0&&te1.length()==0&&te3.length()>0)
            {
                 sql = "update student set id = "+te+",Address = '"+te3+"'where name = '"+na+"'";
            }
            if(te.length()==0&&te1.length()>0&&te3.length()>0)
            {
                 sql = "update student set Email = '"+te1+",Address = '"+te3+"' where name = '"+na+"'";
            }
            if(te.length()>0&&te1.length()>0&&te3.length()>0)
            {
                 sql = "update student set id = "+te+",email = '"+te1+"',Address = '"+te3+"' where name = '"+na+"'";
            }

            try
            {
                if(sta.executeUpdate(sql)>0)
                {
                    p8.setVisible(true);
                    p9.setVisible(false);
                    p8la.setText("done...");  
                }
                else
                    p8.setVisible(true);
                    p9.setVisible(false);
                    p8la.setText("done..");
            }catch(Exception e)
            {
                p8.setVisible(true);
                p9.setVisible(false);
                p8la.setText(""+e);
            }
        }else
            p9la.setText("give name for Identity....!");
        
    }
    
}
