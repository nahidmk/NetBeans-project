
package third_apps.banck_oparetion;


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
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane p1;
    @FXML
    private TextField p1t1;
    @FXML
    private TextField p1t2;
    @FXML
    private Label p1l1;
    @FXML
    private Pane p2;
    @FXML
    private Label p2l2;
    @FXML
    private TextField p2t1;
    @FXML
    private TextField p2t2;
    @FXML
    private TextField p2t3;
    Connection con;
    ResultSet res;
    Statement sta;
    @FXML
    private Pane p3;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
       
    }    

    @FXML
    private void login(ActionEvent event) {
        String te="";
        String te2="";
        te=p1t1.getText();
        te2=p1t2.getText();
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/mk","root","manik");
           sta=con.createStatement();
        }catch(Exception e)
        {
            p1l1.setText(""+e);
        }
        if(te.length()>0&&te2.length()>0)
        {
            String sql="select*from ms where User_name = '"+te+"'";
            String text = "";
            try
            {
               res = sta.executeQuery(sql);
               while(res.next())
               {
                   text = res.getString(2);
               }
               if(text.equals(te2))
               {
                  p1.setVisible(false);
                  p2.setVisible(false);
                  p3.setVisible(true); 
               }else
                   p1l1.setText("wrong user name or password");
            }catch(Exception e)
            {
                p1l1.setText(""+e);
            }
        }else
            p1l1.setText("give user name and password");
        
    }

    @FXML
    private void cencle(ActionEvent event) {
        p1t2.setText("");
        p1t1.setText("");
        p1l1.setText("");
    }

    @FXML
    private void signup(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(true);
        
    }

    @FXML
    private void p2save(ActionEvent event) {
        String te;
        String te1;
        String te2;
        te = p2t1.getText();
        te1 = p2t2.getText();
        te2 = p2t3.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mk","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            p2l2.setText(""+e);
        }
        if(te.length()>0&&te1.length()>0&&te2.length()>0)
        {
            if(te1.equals(te2))
            {
               String sql="insert into ms values('"+te+"','"+te1+"')";
               
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
                   p2l2.setText(""+e);
               }
                   
            }
            else
                p2l2.setText("plese correte your password");
        }
        else 
            p2l2.setText("give name and password for signup");
    }

    @FXML
    private void p2cencle(ActionEvent event) {
        p2t1.setText("");
        p2t2.setText("");
        p2t3.setText("");
        p2l2.setText("");
    }

    @FXML
    private void p2Exit(ActionEvent event) {
        p1.setVisible(true);
        p2.setVisible(false);
    }
    
}
