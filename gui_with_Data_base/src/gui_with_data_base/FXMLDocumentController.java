/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
package gui_with_data_base;

import java.beans.Statement;
import static java.lang.Class.forName;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import java.sql.*;
//
///**
// *
// * @author DELL
// */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextArea t2;
    @FXML
    private TextField t1;
    @FXML
    private Button serch;
    @FXML
    private Label la;
    
    Connection con;
    Statement sta;
    ResultSet re;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection ("jdbc:mysql://localhost/manik","root","manik");
              sta  = (Statement) con.createStatement();
        }catch(Exception e)
        {
            la.setText(""+e);
        }
    }    

    @FXML
    private void serch(ActionEvent event) {
        Tooltip mk = new Tooltip();
         mk.setText("cleck here to serch"); 
         serch.setTooltip(mk);
         String id = t1.getText();
         String sql = "select name,address from mk where id = "+id;
         
        
  }
    
}


//import java.net.URL;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ResourceBundle;
//import javafx.application.Platform;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
//
///**
// *
// * @author Teachers
// */
//public class FXMLDocumentController implements Initializable 
//{
//    @FXML
//    private TextField tid;
//    @FXML
//    private Button bsearch;
//    @FXML
//    private TextArea tresult;
//    @FXML
//    private Label lstatus;
//    
//    Connection con;
//    Statement stm;
//    ResultSet rs; 
//    
//    @Override
//    public void initialize(URL url, ResourceBundle rb) 
//    {
//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/manik","root","manik");            
//            stm = con.createStatement();
//        }
//        catch(Exception e)
//        {
//            lstatus.setText(""+e);
//        }
//    }    
//
//    @FXML
//    private void searchOperation(ActionEvent event) 
//    {
//        String name = "";
//        String address = "";
//        String id = tid.getText();
//        String sql = "select name, address from student where id = "+id;
//    
//        try
//        {           
//            rs = stm.executeQuery(sql);
//            
//            while(rs.next())
//            {
//                name = rs.getString(1);
//                address = rs.getString(2);
//            }
//
//            tresult.setText("Name: "+name+"\nAddress: "+address);            
//        }
//        catch(Exception e)
//        {
//            lstatus.setText(""+e);
//        }
//    }
//
//}