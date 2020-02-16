
package login_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    private TextField t1;
    @FXML
    private PasswordField t2;
    @FXML
    private Pane p1;
    Connection con;
    ResultSet res;
    Statement sta;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       p1.setVisible(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mk","root","manik");
            sta = con.createStatement();
        } catch (Exception e) {
            System.out.print(e);
        }
       
    }    

    @FXML
    private void login(ActionEvent event) {
        String te = t1.getText();
        String te1  = t2.getText();
        String te2 = "";
        String te3 = "";
        String sql = "select * from ms where User_name = '"+te+"'";
        try{
            res = sta.executeQuery(sql);
            
            while(res.next())
            {
               
               te3 = res.getString(2);
            }
            if(te1.equalsIgnoreCase(te3))
            {
               p1.setVisible(true);
               
            }
            else
            {
                System.out.print("sorry");
            }
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        
    }

    @FXML
    private void cencle(ActionEvent event) {
        t1.setText("");
        t2.setText("");
    }
    
}
