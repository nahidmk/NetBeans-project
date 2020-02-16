/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_base_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button nw;
    @FXML
    private Button up;
    @FXML
    private Button delete;
    @FXML
    private Button search;
    @FXML
    private Pane p1;
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private PasswordField t3;
    @FXML
    private ToggleGroup gender;
    @FXML
    private Button save;
    @FXML
    private Button clear;
    @FXML
    private Label lable;
    @FXML
    private Pane p2;
    @FXML
    private TextField pt1;
    @FXML
    private TextField pt2;
    @FXML
    private Pane p3;
    @FXML
    private TextField p2t1;
    @FXML
    private Pane p4;
    @FXML
    private TextField p3t1;
    @FXML
    private TextArea p3t2;
    Connection con;
    ResultSet res;
   Statement sta;
   private  String gender_text = "";
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/manik","root","manik");
            sta = con.createStatement();
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }    

    @FXML
    private void donew(ActionEvent event) {
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
    }

    @FXML
    private void update(ActionEvent event) {
       p2.setVisible(true); 
       p1.setVisible(false);
        
        p3.setVisible(false);
        p4.setVisible(false);
    }

    @FXML
    private void delete(ActionEvent event) {
         p3.setVisible(true);
         p1.setVisible(false);
        p2.setVisible(false);
       
        p4.setVisible(false);
    }

    @FXML
    private void search(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
    }

    @FXML
    private void male(ActionEvent event) {
        gender_text = "Male";
    }

    @FXML
    private void female(ActionEvent event) {
        gender_text = "Female";
    }

    @FXML
    private void save(ActionEvent event) {
        String id = t1.getText();
        String name = t2.getText();
        String password = t3.getText();
        String sql = "insert into mk values("+id+",'"+name+"','"+password+"','"+gender_text+"')";
        try
        {
            if (sta.executeUpdate(sql)>0)
            {
               System.out.print("successfull.....");
            }
            else
            {
                System.out.print("not successfull.....");
            }
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
    }

    @FXML
    private void clear(ActionEvent event) {
        t1.setText("");
        t2.setText("");
       t3.setText("");
    }

    @FXML
    private void doupdate(ActionEvent event) {
        String id = pt1.getText();
        String pass = pt2.getText();
        String msq = "update mk set Password ='"+pass+"'where id = "+id;
        try
        {
            if(sta.executeUpdate(msq)>0)
            {
                System.out.print("complete...");
            }
            else
                System.out.print("not complete");
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
    }

    @FXML
    private void doclear(ActionEvent event) {
        pt1.setText("");
        pt2.setText("");
        
    }

    @FXML
    private void cleard(ActionEvent event) {
        p3t1.setText("");
        p3t2.setText("");
    }

    @FXML
    private void doearch(ActionEvent event) {
        String id = p3t1.getText();
        String name = "";
        String password = "";
        String Gender = "";
        String msq = "select * from mk where id = "+id;
        try{
            res = sta.executeQuery(msq);
            while(res.next())
            {
                name = res.getString(2);
                password = res.getString(3);
                Gender = res.getString(4);
            }
            p3t2.setText("Name = "+name+"\nPassword = "+password+"\nGender = "+Gender);
        }catch(Exception e)
        {
            System.out.print(e);
        }
    }

    @FXML
    private void dodelete(ActionEvent event) {
        String id = p2t1.getText();
        String msq = "Delete from mk where id = "+id;
        try
        {
            if(sta.executeUpdate(msq)>0)
            {
                System.out.print("comlete");
            }
            else
                System.out.print("not completed");
                
        }catch(Exception ex)
        {
            System.out.print(ex);
        }
    }

    @FXML
    private void clear_for_delete(ActionEvent event) {
        p2t1.setText("");
    }
    
}
