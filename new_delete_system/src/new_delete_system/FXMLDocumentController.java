/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_delete_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import java.sql.*;
/**
 *
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField t1;
    @FXML
    private Pane p1;
    @FXML
    private Label la;
    Connection con;
    ResultSet res;
    Statement sta;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p1.setVisible(false);
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/manik","root","manik");
            sta = con.createStatement();
       }catch(Exception e)
       {
           la.setText(""+e);
       }
        
    }    

    @FXML
    private void ok(ActionEvent event) {
        String te = t1.getText();
        String sql = "delete from mk where id = "+te;
        try
        {
            if(sta.executeUpdate(sql)>0)
            {
                la.setText("done...!");
            }
            else
            {
                la.setText("not done...!");
            }
            
        }catch(Exception e)
        {
            la.setText(""+e);
        }
        p1.setVisible(false);
       
    }

    @FXML
    private void delete(ActionEvent event) {
        p1.setVisible(true);
    }

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
        la.setText("");
    }
    
}
