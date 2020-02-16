/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_with_select_oparation_db;

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

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField t1;
    @FXML
    private TextArea t2;
    @FXML
    private Button sarch;
    @FXML
    private Label la;
    Connection con;
    Statement stm;
    ResultSet rs;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/manik","root","manik");
            stm = con.createStatement();
        } catch (Exception ex) {
            la.setText(""+ex);
        }
    }    

    @FXML
    private void sarch(ActionEvent event) {
        String id = t1.getText();
        String sql = "select name,address from mk where id = "+id;
        String name = "";
        String address = "";
        try {
            rs = stm.executeQuery(sql);
            while (rs.next())
            {
                name = rs.getString(1);
                address = rs.getString(2);
            }
            t2.setText("Name : "+name+"\nAddress"+address);
        }catch (Exception e)
        {
            la.setText(""+e);
        }
    }
    
}
