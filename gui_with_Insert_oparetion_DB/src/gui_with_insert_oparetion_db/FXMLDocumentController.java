/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_with_insert_oparetion_db;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javax.swing.ButtonGroup;
/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private PasswordField t3;
    @FXML
    private Button save;
    @FXML
    private Button clear;
    @FXML
    private Label la;
    Connection con;
    Statement sta;
    ResultSet re;
    @FXML
    private ToggleGroup gender;
    private String text = "";
    @FXML
    private RadioButton gender2;
    @FXML
    private RadioButton gender1;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/manik","root","manik");
            sta = con.createStatement();
                    
                    } catch (Exception ex) {
            la.setText(""+ex);
        }
    }    

    @FXML
    private void save(ActionEvent event) {
        String id = t1.getText();
        String name = t2.getText();
        String password = t3.getText();
        //String gender = text;
        String sql = "insert into mk values("+id+",'"+name+"','"+password+"','"+text+"')";
        try
        {
            if(sta.executeUpdate(sql)>0)
                la.setText("oparation successfull");
            else
                la.setText("oparation failed.....!");
        }catch(Exception e)
        {
            la.setText(""+e);
        }
    }

    @FXML
    private void clear(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here to clear all text fild");
        clear.setTooltip(mk);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        la.setText("");
    }

    @FXML
    private void male(ActionEvent event) {
        text = "Male";
    }

    @FXML
    private void female(ActionEvent event) {
        text = "Female";
    }
    
}
