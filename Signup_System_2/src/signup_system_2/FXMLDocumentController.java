/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signup_system_2;

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
/**
 *
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextField t1;
    @FXML
    private PasswordField t2;
    @FXML
    private Label la;
    @FXML
    private Pane p1;
    @FXML
    private TextField p1t1;
    @FXML
    private PasswordField p1t2;
    @FXML
    private PasswordField p1t3;
    @FXML
    private Label p1la;
    
   Connection con;
   Statement sta;
   ResultSet res;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p1.setVisible(false);
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mk","root","manik");
            sta = con.createStatement();
        } catch (Exception e) {
        
           la.setText(""+e); 
        }  
        
    }    

    @FXML
    private void log(ActionEvent event) {
         String t = t1.getText();
        String te1 = t2.getText();
        String te2 = "";
        String t3 = "";
        String sql = "Select*from ms password where user_name ='"+t1+"'";
        int i;
        try{
            res = sta.executeQuery(sql);
            while(res.next())
            {
                te2 = res.getString(2);
                //t3= res.getString(2);
            }
            if(te2.equals(t3))
            {
                la.setText("done....");
            }
            else
            {
                la.setText("not d0ne...");
            }
        }catch(Exception e)
        {
            la.setText(""+e);
        }
    }

    @FXML
    private void sing(ActionEvent event) {
        p1.setVisible(true);
    }

    @FXML
    private void cenlse(ActionEvent event) {
         t1.setText("");
        t2.setText("");
        la.setText("");
    }

    @FXML
    private void save(ActionEvent event) {
         String t = p1t1.getText();
        String te1 = p1t2.getText();
        String te2 = p1t3.getText();
        if(te1.equals(te2))
        {
            try{
                String sql = "insert into ms values('"+t+"','"+te1+"')";
                if(sta.executeUpdate(sql)>0)
                {
                    p1la.setText("done....!");
                }
                else
                {
                    p1la.setText("not done....!");
                }
                
            }catch(Exception e)
            {
                p1la.setText(""+e);
            }
        }
        else
            p1la.setText("passweord is not curret");
    }

    @FXML
    private void reset(ActionEvent event) {
        p1t1.setText("");
        p1t2.setText("");
        p1t3.setText("");
        p1la.setText("");
    }

    @FXML
    private void exit(ActionEvent event) {
        p1.setVisible(false);
    }
    
}
