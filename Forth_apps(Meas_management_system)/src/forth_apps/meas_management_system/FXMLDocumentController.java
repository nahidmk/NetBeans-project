
package forth_apps.meas_management_system;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane p1;
    @FXML
    private Pane p3;
    @FXML
    private Pane p2;
    @FXML
    private TextField p2t1;
    @FXML
    private PasswordField p2t2;
     Connection con;
     ResultSet res;
     Statement sta;
    @FXML
    private TextField p3t1;
    @FXML
    private PasswordField p3t2;
    @FXML
    private PasswordField p3t3;
    @FXML
    private Pane p4;
    @FXML
    private Pane p5;
    @FXML
    private Pane p6;
    @FXML
    private Pane p7;
    @FXML
    private TextField p7t1;
    @FXML
    private TextField p7t2;
    @FXML
    private TextField p7t3;
    @FXML
    private TextField p7t4;
    @FXML
    private Pane p8;
    @FXML
    private TextField p8t1;
    @FXML
    private PasswordField p8t2;
    @FXML
    private Pane p9;
    @FXML
    private TextField p9t1;
    @FXML
    private TextField p9t2;
    @FXML
    private TextField p9t3;
    @FXML
    private Pane p10;
    @FXML
    private TextField p10t1;
    @FXML
    private TextField p10t2;
    @FXML
    private TextField p10t3;
    @FXML
    private TextField p10t4;
    @FXML
    private TextField p10t5;
    @FXML
    private DatePicker p10datepicker;
    @FXML
    private ImageView p10img;
    @FXML
    private Label p10la;
    Alert ar;
    File file = new File("");
    @FXML
    private Pane p11;
    @FXML
    private ImageView p11img;
    @FXML
    private TextField p11t1;
    @FXML
    private TextField p11t2;
    @FXML
    private TextField p11t3;
    @FXML
    private TextField p11t4;
    @FXML
    private TextField p11t5;
    @FXML
    private TextField p11t6;
    @FXML
    private Pane p12;
    @FXML
    private TextField p12t1;
    @FXML
    private Pane p13;
    @FXML
    private TextField p13t1;
    @FXML
    private TextField p13t2;
    @FXML
    private TextField p13t3;
    @FXML
    private TextField p13t4;
    @FXML
    private TextField p13t5;
    @FXML
    private DatePicker p13datepicker;
    @FXML
    private ImageView p13img;
    @FXML
    private Pane p14;
    @FXML
    private Pane p15;
    @FXML
    private TextField p15t1;
    @FXML
    private Pane p16;
    @FXML
    private TextField p16t1;
    @FXML
    private TextField p16t2;
    @FXML
    private TextField p16t3;
    @FXML
    private TextField p16t4;
    @FXML
    private TextField p16t5;
    @FXML
    private ImageView p16img;
    @FXML
    private TextField p16t6;
    @FXML
    private Pane p17;
    @FXML
    private RadioButton r1;
    @FXML
    private ToggleGroup group1;
    @FXML
    private RadioButton r11;
    @FXML
    private ToggleGroup group2;
    @FXML
    private RadioButton r111;
    @FXML
    private ToggleGroup group3;
    @FXML
    private RadioButton r2;
    @FXML
    private RadioButton r3;
    @FXML
    private RadioButton r4;
    @FXML
    private RadioButton r22;
    @FXML
    private RadioButton r222;
    @FXML
    private RadioButton r33;
    @FXML
    private RadioButton r333;
    @FXML
    private RadioButton r44;
    @FXML
    private RadioButton r444;
    @FXML
    private RadioButton r5;
    @FXML
    private RadioButton r55;
    @FXML
    private RadioButton r555;
    @FXML
    private TextField p17t1;
    @FXML
    private TextField p17t2;
    @FXML
    private TextField p17t3;
    String b_rating = "",l_rating = "",d_rating = "";
    @FXML
    private TextField p17t4;
    @FXML
    private DatePicker p17datepicker;
    @FXML
    private Pane p18;
    @FXML
    private TextField p18t1;
    @FXML
    private TextField p18t2;
    @FXML
    private TextField p18t3;
    private TextField p18t4;
    private DatePicker p18datepicker;
    @FXML
    private Pane p19;
    @FXML
    private TextField p19t1;
    @FXML
    private TextField p19t2;
    @FXML
    private TextField p19t3;
    @FXML
    private DatePicker p19datepicker;
    @FXML
    private Pane p20;
    @FXML
    private TextField p20t1;
    @FXML
    private TextField p20t2;
    @FXML
    private TextField p20t3;
    @FXML
    private TextField p20t5;
    @FXML
    private TextField p20t6;
    @FXML
    private TextField p20t4;
    @FXML
    private TextField p20t7;
    @FXML
    private TextField p20t8;
    @FXML
    private TextField p20t9;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ar = new Alert(Alert.AlertType.INFORMATION);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MMS","root","manik");
            sta = con.createStatement();
        }catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
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
        p16.setVisible(false);
        p17.setVisible(false);
        p18.setVisible(false);
        p19.setVisible(false);
        p20.setVisible(false);
        
    }    

    @FXML
    private void p1manager(ActionEvent event) {
        p2.setVisible(false);
        p1.setVisible(false);
        p3.setVisible(false);
        p8.setVisible(true);
    }

    @FXML
    private void p1member(ActionEvent event) {
        p2.setVisible(true);
        p1.setVisible(false);
        p3.setVisible(false);
    }

    @FXML
    private void p2exit(ActionEvent event) {
        p2.setVisible(false);
        p1.setVisible(true);
        p3.setVisible(false);
    }

    @FXML
    private void p2login(ActionEvent event) {
        
        String te;
        String te2;
        te = p2t1.getText();
        te2 = p2t2.getText();
        String sql = "select * from member_password where User_name = '"+te+"'";
            String text = "";
            String name = "joniyed";
        if(te.length()>0&&te2.length()>0)
        {
            
            try
            {
               res = sta.executeQuery(sql);
               while(res.next())
               {
                   text = res.getString(2);                  
               }
               if(te2.equals(text)&& !te.equals(name))
                {
                        p1.setVisible(false);
                        p2.setVisible(false);
                        p3.setVisible(false);
                        p4.setVisible(false);
                        p5.setVisible(true);
                    
                }else
                    JOptionPane.showConfirmDialog(null,"chack...user name and password...");
                       
            }catch(Exception e)
            {
               JOptionPane.showConfirmDialog(null,e); 
            }
            
        }else
            JOptionPane.showConfirmDialog(null,"give User name and password");
      }
    

    @FXML
    private void p2reset(ActionEvent event) {
        p2t1.setText("");
        p2t2.setText("");
    }

    @FXML
    private void p2signup(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
    }

    @FXML
    private void p3save(ActionEvent event) {
        String te = p3t1.getText();
        String te1 = p3t2.getText();
        String te2 = p3t3.getText();
        String te3 = "select * from member_password where User_name = '"+te+"'";
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
                JOptionPane.showConfirmDialog(null,e);                
              }
                if(text.equals(te1))
                {
                    JOptionPane.showConfirmDialog(null,"this password already used");
                }else
               {
                   String sql = "Insert into member_password values('"+te+"','"+te1+"')";
                    try
                    {
                       if(sta.executeUpdate(sql)>0)
                     {
                         JOptionPane.showConfirmDialog(null,"done");
                     }  
                       else
                           JOptionPane.showConfirmDialog(null,"sorry");
                    }catch(Exception e)
                    {
                        JOptionPane.showConfirmDialog(null,"this user name already used");
                    }
               }
               
           }
           else
               JOptionPane.showConfirmDialog(null,"plese correct your password");
            }else
                JOptionPane.showConfirmDialog(null, "give more then 5 charecter");
            
        }else
            JOptionPane.showConfirmDialog(null,"Complete all things....");
      }
    }

    @FXML
    private void p3reset(ActionEvent event) {
        p3t1.setText("");
        p3t2.setText("");
        p3t3.setText("");
    }

    @FXML
    private void p3exit(ActionEvent event) {
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
    }

    @FXML
    private void p4account(ActionEvent event) {
        p4.setVisible(false);
        p7.setVisible(true);
    }

    @FXML
    private void p4member(ActionEvent event) {
        p4.setVisible(false);
        p6.setVisible(true);
    }

    @FXML
    private void p4meal(ActionEvent event) {
        p4.setVisible(false);
        p18.setVisible(true);
       
    }

    @FXML
    private void p4dailyactivities(ActionEvent event) {
        p4.setVisible(false);
        p19.setVisible(true);
       
    }

    @FXML
    private void p4totalcalculation(ActionEvent event) {
        p4.setVisible(false);
        p20.setVisible(true);
    }

    @FXML
    private void p4exit(ActionEvent event) {
        p1.setVisible(true);
        p4.setVisible(false);
    }


    @FXML
    private void p6addmember(ActionEvent event) {
        p6.setVisible(false);
        p10.setVisible(true);
    }

    @FXML
    private void p6findmember(ActionEvent event) {
        p6.setVisible(false);
        p11.setVisible(true);
    }
    @FXML
    private void p6deletemember(ActionEvent event) {
        p6.setVisible(false);
        p12.setVisible(true);
    }

    @FXML
    private void p6exit(ActionEvent event) {
        p6.setVisible(false);
        p4.setVisible(true);
    }

    @FXML
    private void p7exit(ActionEvent event) {
        p7.setVisible(false);
        p4.setVisible(true);
    }

    @FXML
    private void p7save(ActionEvent event) {
        String te = p7t1.getText();
        String te2 = p7t2.getText();
        String text = "";
        String text2 = "";
        Double diposit,current_deposit,total_deposit;
        String sql = "select * from account where member_id = '"+te+"'";
        int a = JOptionPane.showConfirmDialog(null,"do you want to save","save", JOptionPane.YES_NO_OPTION);
      if(a==0)
      {
          if(te.length()>0 && te2.length()>0)
          {
              try
              {
                 res = sta.executeQuery(sql);
                 while(res.next())
                 {
                     text = res.getString(2);
                     text2 = res.getString(3);
                 }
              }catch(Exception e)
              {
                  JOptionPane.showConfirmDialog(null, e);
              }
             diposit = Double.parseDouble(text2);
              current_deposit = Double.parseDouble(te2);
              total_deposit = diposit+current_deposit;
             p7t3.setText(total_deposit+"");
             String sql2 = "select sum(total) from meal";
             String sql3 = "select sum(bazar_cost)from daily_activity";
             String sql4 = "select total from meal where member_id = '"+te+"'";
             double total_meal = 0;
             double meal_rate = 0;
             int total_cost = 0;double t_meal = 0;
            try
            {
                res = sta.executeQuery(sql2);
                while(res.next())
                {
                    t_meal = res.getDouble("sum(total)");
                }
            }catch(Exception e)
            {
                ar.setHeaderText("sql2"+e);
                ar.showAndWait();
            }
            try{
                res = sta.executeQuery(sql3);
                while(res.next())
                {
                    total_cost = res.getInt("sum(bazar_cost)");
                }
            }catch(Exception e){
                ar.setHeaderText("sql3"+e);
                ar.showAndWait();
            }
            try{
                res = sta.executeQuery(sql4);
                while(res.next())
                {
                    total_meal = res.getDouble("total");
                }
            }catch(Exception e){
                ar.setHeaderText("sql4"+e);
                ar.showAndWait();
            }
             meal_rate = total_cost/t_meal;
             double current_cost = meal_rate*total_meal;
             p7t4.setText(current_cost+""); 
             String sql5 = "update account set cost = "+current_cost+",member_deposite = "+total_deposit+"where member_id = '"+te+"'";
             try{
             if(sta.executeUpdate(sql5)>0)
             {
                 ar.setHeaderText("Done");
                ar.showAndWait();
             }
             else{
                 ar.setHeaderText("sorry");
                ar.showAndWait();
             }
           }catch(Exception e)
             {
                 ar.setHeaderText("sql5"+e);
                ar.showAndWait();
             }
          }else
              ar.setHeaderText("fill up the text Field");
                ar.showAndWait();
      }
        
    }

    @FXML
    private void p7reset(ActionEvent event) {
       p7t1.setText("");
       p7t2.setText("");
       p7t3.setText("");
       p7t4.setText("");
    }

    @FXML
    private void p8login(ActionEvent event) {
        String te = p8t1.getText();
        String te2 = p8t2.getText();
        String sql = "select * from member_password where user_name = '"+te+"'";
        String text = "";
        String name = "joniyed";
        String pass = "nahidmk";
        if(te.length()>0 && te2.length()>0)
        {
            try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    text = res.getString(2);
                }
                if(te2.equals(text)&& te.equals(name)&&text.equals(pass))
                {
                    p4.setVisible(true);
                    p8.setVisible(false);
                    p8t1.setText("");
                    p8t2.setText("");
                }
                else
                    JOptionPane.showConfirmDialog(null, "please check your user name and password");
                
            }
            catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
        }else
            JOptionPane.showConfirmDialog(null, "Enter the value currtly");
    }

    @FXML
    private void p8reset(ActionEvent event) {
        p8t1.setText("");
        p8t2.setText("");
    }

    @FXML
    private void p8exit(ActionEvent event) {
        p1.setVisible(true);
        p8.setVisible(false);
    }

    @FXML
    private void p5account(ActionEvent event) {
        p5.setVisible(false);
        p9.setVisible(true);
    }

    @FXML
    private void p5managerEvaluaton(ActionEvent event) {
        p5.setVisible(false);
        p17.setVisible(true);
    }

    @FXML
    private void p5manager(ActionEvent event) {
        p5.setVisible(false);
        p14.setVisible(true);
    }

    @FXML
    private void p5exit(ActionEvent event) {
        p5.setVisible(false);
        p1.setVisible(true);
    }

    @FXML
    private void p9show(ActionEvent event) {
        String te = p9t1.getText();
        String text = "";
        String text2 = "";
        String sql = "select * from account where member_id = '"+te+"'";
        if(te.length()>0)
        {
            try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    text = res.getString(2);
                    text2 = res.getString(3);
                }
            }catch(Exception e)
            {
                JOptionPane.showConfirmDialog(null, e);
            }
            p9t2.setText(text2);
            p9t3.setText(text);
        }else
        {
            JOptionPane.showConfirmDialog(null, "fill up the text Fild curretly");
        }
        
    }

    @FXML
    private void p9exit(ActionEvent event) {
        p9.setVisible(false);
        p5.setVisible(true);
    }

    @FXML
    private void p9reset(ActionEvent event) {
        p9t1.setText("");
        p9t2.setText("");
        p9t3.setText("");
    }

    @FXML
    private void p10select(ActionEvent event) {
        FileChooser cho = new FileChooser();
        Stage st = new Stage();
        String filename = "";
        
            cho.setTitle("MK window...");
            file = cho.showOpenDialog(st);
            if(file!=null)
            {
                try
                {
                    filename = file.toURI().toURL().toString();
                    Image img = new Image(filename);
                    p10img.setImage(img);
                }catch(Exception e)
                {
                  JOptionPane.showConfirmDialog(null, e);
                }
            }else
            {
                ar.setTitle("Information dialog");
                ar.setHeaderText("plese select a file");
                ar.showAndWait();
            }
        
    }

    @FXML
    private void p10save(ActionEvent event) {
        String te = p10t1.getText();
        String te2 = p10t2.getText();
        String te3 = p10t3.getText();
        String te4 = p10t4.getText();
        String te5 = p10t5.getText();
        
        String date= ""+p10datepicker.getValue();
        
     FileInputStream inputstream =null;
      PreparedStatement statement = null;
     
     int a = JOptionPane.showConfirmDialog(null, "do you want to save this", " Alert", JOptionPane.YES_NO_OPTION);
    if (a == 0) 
     {
        if(te.length()>0 && te2.length()>0 && te3.length()>0 && te4.length()>0 && te5.length()>0 && date.length()>0&&file!=null)
        {
            try
            {
               inputstream = new FileInputStream(file);
               statement = con.prepareStatement("insert into member(member_id,name,phone,email,address,Joining_date,picture)" + "Values(?,?,?,?,?,?,?)");
               statement.setString(1, te);
               statement.setString(2, te2);
               statement.setString(3, te3);
               statement.setString(4, te4);
               statement.setString(5, te5);
               statement.setString(6, date);
               statement.setBlob(7, inputstream);
               if(statement.executeUpdate()>0)
               {
                   ar.setHeaderText("done...");
                   ar.showAndWait();
               }
               else
               {
                   ar.setHeaderText("sorry...");
                   ar.showAndWait();
               }
               
            }catch(Exception e)
            {
                ar.setHeaderText(""+e);
                ar.showAndWait();
            }
        }else
        {
           ar.setHeaderText("please fill up the text fild..");
           ar.showAndWait();
        }

       }
    }

    @FXML
    private void p10reset(ActionEvent event) {
        p10t1.setText("");
        p10t2.setText("");
        p10t3.setText("");
        p10t4.setText("");
        p10t5.setText("");
        p10img.setImage(null);
        
        
    }

    @FXML
    private void p10exit(ActionEvent event) {
        p10.setVisible(false);
        p6.setVisible(true);
    }

    @FXML
    private void p11search(ActionEvent event) {
        String te = p11t1.getText();
        String te2 = "",te3= "",te4 = "",te5 = "",te6 = "";
        byte[] byteimg = null;
        String sql = "select * from member where member_id = '"+te+"'";
        if(te.length()>0)
        {
            try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    te2 = res.getString(2);
                    te3 = res.getString(3);
                    te4 = res.getString(4);
                    te5 = res.getString(5);
                    te6 = res.getString(6);
                    byteimg = res.getBytes(7);
                    
                }
            }catch(Exception e)
            {
              ar.setHeaderText(""+e);
              ar.showAndWait();
            }
            p11t2.setText(te2);
            p11t3.setText(te3);
            p11t4.setText(te4);
            p11t5.setText(te5);
            p11t6.setText(te6);
            InputStream stream = new ByteArrayInputStream(byteimg);
            Image img = new Image(stream);
             p11img.setImage(img);
        }else{
            ar.setHeaderText("give the member ID");
            ar.showAndWait();
        }
    }

    @FXML
    private void p11exit(ActionEvent event) {
        p11.setVisible(false);
        p6.setVisible(true);
    }

    @FXML
    private void p11reset(ActionEvent event) {
        p11t1.setText("");
        p11t2.setText("");
        p11t3.setText("");
        p11t4.setText("");
        p11t5.setText("");
        p11t6.setText("");
        p11img.setImage(null);
    }

    

    @FXML
    private void p12delet(ActionEvent event) {
        String te = p12t1.getText();
        String sql = "delete from member where member_id = '"+te+"'";
        String sql2 = "delete from meal where member_id = '"+te+"'";
        String sql3 = "delete from total_calculation where member_id = '"+te+"'";
        String sql4 = "delete from manager_evaluation where member_id = '"+te+"'";
        String sql5 = "delete from account where member_id = '"+te+"'";
        String sql6 = "delete from daily_activity where member_id = '"+te+"'";
        if(te.length()>0)
        {
            try
            {
                if(sta.executeUpdate(sql)>0 && sta.executeUpdate(sql2)>0&& sta.executeUpdate(sql3)>0&& sta.executeUpdate(sql4)>0&& sta.executeUpdate(sql5)>0&&sta.executeUpdate(sql6)>0)
                {
                    ar.setHeaderText("Done..");
                    ar.showAndWait();
                }else{
                    ar.setHeaderText("sorry");
                    ar.showAndWait();
                }
            }catch(Exception e)
            {
                ar.setHeaderText(e+"");
                ar.showAndWait();
            }
        }else
        {
            ar.setHeaderText("Enter the memmber ID");
            ar.showAndWait();
        }
        
    }

    @FXML
    private void p12exit(ActionEvent event) {
        p12.setVisible(false);
        p6.setVisible(true);
    }

    @FXML
    private void p12reset(ActionEvent event) {
        p12t1.setText("");
    }

    @FXML
    private void p13select(ActionEvent event) {
        FileChooser cho = new FileChooser();
        Stage stag = new Stage();
        File file = new File("");
        cho.setTitle("MK window..");
        file = cho.showOpenDialog(stag);
        String filename = "";
        if(file!=null)
        {
            try
            {
                filename = file.toURI().toURL().toString();
                Image img = new Image(filename);
                p13img.setImage(img);
            }catch(Exception e)
            {
                ar.setHeaderText(""+e);
                ar.showAndWait();
            }
        }
        else
        {
            ar.setHeaderText("select an Image..");
            ar.showAndWait();
        }
    }

    @FXML
    private void p13save(ActionEvent event) {
        String te = p13t1.getText();
        String te2 = p13t2.getText();
        String te3 = p13t3.getText();
        String te4 = p13t4.getText();
        String te5 = p13t5.getText();
        
        String date= ""+p13datepicker.getValue();
        
      FileInputStream inputstream =null;
      PreparedStatement statement = null;
     
     int a = JOptionPane.showConfirmDialog(null, "do you want to save this", " Alert", JOptionPane.YES_NO_OPTION);
     if (a == 0) 
     {
        if(te.length()>0 && te2.length()>0 && te3.length()>0 && te4.length()>0 && te5.length()>0 && date.length()>0&&file!=null)
        {
            try
            {
               inputstream = new FileInputStream(file);
               statement = con.prepareStatement("insert into Manager(Manager_id,m_name,phone,email,address,Joining_date,picture)" + "Values(?,?,?,?,?,?,?)");
               statement.setString(1, te);
               statement.setString(2, te2);
               statement.setString(3, te3);
               statement.setString(4, te4);
               statement.setString(5, te5);
               statement.setString(6, date);
               statement.setBlob(7, inputstream);
               if(statement.executeUpdate()>0)
               {
                   ar.setHeaderText("done...");
                   ar.showAndWait();
               }
               else
               {
                   ar.setHeaderText("sorry...");
                   ar.showAndWait();
               }
               
            }catch(Exception e)
            {
                ar.setHeaderText(""+e);
                ar.showAndWait();
            }
        }else
        {
           ar.setHeaderText("please fill up the text fild..");
           ar.showAndWait();
        }

       }
        
    }

    @FXML
    private void p13reset(ActionEvent event) {
        p13t1.setText("");
        p13t2.setText("");
        p13t3.setText("");
        p13t4.setText("");
        p13t5.setText("");
        p13img.setImage(null);
    }

    @FXML
    private void p13Exit(ActionEvent event) {
        p13.setVisible(false);
        p14.setVisible(true);
    }

    @FXML
    private void p14addmanager(ActionEvent event) {
        p14.setVisible(false);
        p13.setVisible(true);
    }

    @FXML
    private void p14detailsmanager(ActionEvent event) {
        p14.setVisible(false);
        p16.setVisible(true);
    }

    @FXML
    private void p14exit(ActionEvent event) {
        p14.setVisible(false);
        p5.setVisible(true);
    }

    @FXML
    private void p14deletemanager(ActionEvent event) {
        p14.setVisible(false);
        p15.setVisible(true);
    }

    @FXML
    private void p15delete(ActionEvent event) {
        String te = p15t1.getText();
        String sql6 = "delete from manager where manager_id = '"+te+"'";
        if(te.length()>0)
        {
            try
            {
                if(sta.executeUpdate(sql6)>0)
                {
                    ar.setHeaderText("Done..");
                    ar.showAndWait();
                }else{
                    ar.setHeaderText("sorry");
                    ar.showAndWait();
                }
            }catch(Exception e)
            {
                ar.setHeaderText(e+"");
                ar.showAndWait();
            }
        }else
        {
            ar.setHeaderText("Enter the memmber ID");
            ar.showAndWait();
        }
    }

    @FXML
    private void p15reset(ActionEvent event) {
        p15t1.setText("");
    }

    @FXML
    private void p15exit(ActionEvent event) {
        p15.setVisible(false);
        p14.setVisible(true);
    }

    @FXML
    private void p16exit(ActionEvent event) {
        p14.setVisible(true);
        p16.setVisible(false);
    }

    @FXML
    private void p16search(ActionEvent event) {
        String te = p16t1.getText();
        String te2 = "",te3= "",te4 = "",te5 = "",te6 = "";
        byte[] byteimg = null;
        String sql = "select * from manager where manager_id = '"+te+"'";
        if(te.length()>0)
        {
            try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    te2 = res.getString(2);
                    te3 = res.getString(3);
                    te4 = res.getString(4);
                    te5 = res.getString(5);
                    te6 = res.getString(6);
                    byteimg = res.getBytes(7);
                    
                }
            }catch(Exception e)
            {
              ar.setHeaderText(""+e);
              ar.showAndWait();
            }
            p16t2.setText(te2);
            p16t3.setText(te3);
            p16t4.setText(te4);
            p16t5.setText(te5);
            p16t6.setText(te6);
            InputStream stream = new ByteArrayInputStream(byteimg);
            Image img = new Image(stream);
             p16img.setImage(img);
        }else{
            ar.setHeaderText("give the member ID");
            ar.showAndWait();
        }
    }

    @FXML
    private void p16reset(ActionEvent event) {
        p16t1.setText("");
        p16t2.setText("");
        p16t3.setText("");
        p16t4.setText("");
        p16t5.setText("");
        p16t6.setText("");
        p16img.setImage(null);
    }

    @FXML
    private void p17exit(ActionEvent event) {
        p17.setVisible(false);
        p5.setVisible(true);
    }

    @FXML
    private void p17save(ActionEvent event) {
        String te = p17t4.getText();
        String te2 = ""+p17datepicker.getValue();
        int l_ra,b_ra,d_ra,total;
        if(b_rating.length()==0)
        {
            b_ra = 0;
        }else{
            b_ra = Integer.parseInt(b_rating);
        }
        
        if(l_rating.length()==0)
        {
            l_ra = 0;
        }else{
            l_ra = Integer.parseInt(l_rating);
        }
        
        if(d_rating.length()==0)
        {
            d_ra = 0;
        }else{
            d_ra = Integer.parseInt(d_rating);
        }
        total = l_ra+d_ra+b_ra;
        
        if(te.length()>0 && te2.length()>0)
        {
            String date = "";
            try
            {
                String sql2 = "select * from manager_evaluation where member_id = '"+te+"'";
                res = sta.executeQuery(sql2);
                while(res.next())
                {
                   date = res.getString(6);
                }
            }catch(Exception e)
            {
                ar.setHeaderText(""+e);
                ar.showAndWait();
            }
            if(!date.equals(te2))
            {
                if(b_rating.length()>0 || d_rating.length()>0 ||l_rating.length()>0 )
                {
                    String sql ="insert into manager_evaluation values('"+te+"',"+b_ra+","+l_ra+","+d_ra+","+total+",'"+te2+"')"; 
                    try
                    {
                       if(sta.executeUpdate(sql)>0)
                       {
                           ar.setHeaderText("Done..");
                           ar.showAndWait();
                       }else{
                           ar.setHeaderText("sorry..");
                           ar.showAndWait();
                       }
                    }catch(Exception e)
                    {
                        ar.setHeaderText(""+e);
                        ar.showAndWait();
                    }
                }else
                {
                    ar.setHeaderText("select any one..");
                    ar.showAndWait();
                }
            }else{
                ar.setHeaderText("you have already done your evaluation...");
                ar.showAndWait();
            }
        }else
        {
            ar.setHeaderText("Fill up the text fild..");
            ar.showAndWait();
        }
    }

    @FXML
    private void p17reset(ActionEvent event) {
        p17t1.setText("");
        p17t2.setText("");
        p17t3.setText("");
        p17t4.setText("");
    }

    @FXML
    private void p17group1(ActionEvent event) {
        if(r1.isSelected())
        {
            p17t1.setText(r1.getText());
            b_rating = r1.getText();
        }else if(r2.isSelected())
        {
            p17t1.setText(r2.getText());
            b_rating = r2.getText();
        }
        else if(r3.isSelected())
        {
            p17t1.setText(r3.getText());
            b_rating = r3.getText();
        }
        else if(r4.isSelected())
        {
            p17t1.setText(r4.getText());
            b_rating = r4.getText();
        }
        else if(r5.isSelected())
        {
            p17t1.setText(r5.getText());
            b_rating = r5.getText();
        }
    }

    @FXML
    private void p17group2(ActionEvent event) {
        if(r11.isSelected())
        {
            p17t2.setText(r11.getText());
            l_rating = r11.getText();
        }else if(r22.isSelected())
        {
            p17t2.setText(r22.getText());
            l_rating = r22.getText();
        }
        else if(r33.isSelected())
        {
            p17t2.setText(r33.getText());
            l_rating = r33.getText();
        }
        else if(r44.isSelected())
        {
            p17t2.setText(r44.getText());
            l_rating = r44.getText();
        }
        else if(r55.isSelected())
        {
            p17t2.setText(r55.getText());
            l_rating = r55.getText();
        }
    }

    @FXML
    private void p17group3(ActionEvent event) {
        if(r111.isSelected())
        {
            p17t3.setText(r111.getText());
            d_rating = r111.getText();
        }else if(r222.isSelected())
        {
            p17t3.setText(r222.getText());
            d_rating = r222.getText();
        }
        else if(r333.isSelected())
        {
            p17t3.setText(r333.getText());
            d_rating = r333.getText();
        }
        else if(r444.isSelected())
        {
            p17t3.setText(r444.getText());
            d_rating = r444.getText();
        }
        else if(r555.isSelected())
        {
            p17t3.setText(r555.getText());
            d_rating = r555.getText();
        }
    }

    @FXML
    private void p18exit(ActionEvent event) {
        p18.setVisible(false);
        p4.setVisible(true);
    }

    @FXML
    private void p18save(ActionEvent event) {
        String te = p18t1.getText();
        String day = p18t2.getText();
        String meal = p18t3.getText();
        double s_meal = Double.parseDouble(meal);
        double total_meal = 0;
        if(te.length()>0 && day.length()>0 && meal.length()>0){
            try
            {
                String sql2 = "select total from meal where member_id = '"+te+"'";
                res = sta.executeQuery(sql2);
                while(res.next())
                {
                   total_meal = res.getDouble("total");
                }
            }catch(Exception e)
            {
                ar.setHeaderText("sql2"+e);
                ar.showAndWait();
            }
           double curr_meal = total_meal+s_meal;
           String sql = "update meal set "+day+" = "+s_meal+", total = "+curr_meal+" where member_id = '"+te+"'";
           try{
               if(sta.executeUpdate(sql)>0)
               {
                   ar.setHeaderText("done...");
                   ar.showAndWait();
               }else{
                   ar.setHeaderText("sorry..");
                   ar.showAndWait();
               }
           }catch(Exception e){
               ar.setHeaderText("sql"+e);
               ar.showAndWait();
           }
        }else
        {
            ar.setHeaderText("Fill up the text fild..");
            ar.showAndWait();
        }

    }

    @FXML
    private void p18reset(ActionEvent event) {
        p18t1.setText("");
        p18t2.setText("");
        p18t3.setText("");
    }

    @FXML
    private void p19exit(ActionEvent event) {
        p19.setVisible(false);
        p4.setVisible(true);
    }

    @FXML
    private void p19save(ActionEvent event) {
        String te = p19t1.getText();
        String te2 = p19t2.getText();
        String te3 = p19t3.getText();
        String date = ""+p19datepicker.getValue();
        int cost = Integer.parseInt(te3);
        if(te.length()>0&&te2.length()>0&&te3.length()>0&&date.length()>0)
        {
           try{
               String sql = "insert into daily_activity values('"+te+"','"+te2+"',"+cost+",'"+date+"')";
               if(sta.executeUpdate(sql)>0)
               {
                   ar.setHeaderText("done");
                   ar.showAndWait();
               }else
               {
                   ar.setHeaderText("sorry");
                   ar.showAndWait();
               }
           } catch(Exception e){
               ar.setHeaderText(""+e);
               ar.showAndWait();
           }
        }else{
            ar.setHeaderText("fill up the text fild...");
            ar.showAndWait();
        }
    }

    @FXML
    private void p19reset(ActionEvent event) {
        p19t1.setText("");
        p19t2.setText("");
        p19t3.setText("");
    }

    @FXML
    private void p20exit(ActionEvent event) {
        p20.setVisible(false);
        p4.setVisible(true);
    }

    @FXML
    private void p20show(ActionEvent event) {
        String te = p20t1.getText();
        if(te.length()>0){
        String sql = "select member_deposite from account where member_id = '"+te+"'";
        String sql2 = "select sum(total) from meal";
             String sql3 = "select sum(bazar_cost)from daily_activity";
             String sql4 = "select total from meal where member_id = '"+te+"'";
             String sql5 = "select sum(member_deposite) from account";
             
             double total_meal = 0;
             double meal_rate = 0;
             int total_cost = 0;double t_meal = 0;
             double deposite = 0;
             double total_deposite = 0;
             try
            {
                res = sta.executeQuery(sql);
                while(res.next())
                {
                    deposite = res.getDouble("member_deposite");
                }
                p20t2.setText(""+deposite);
            }catch(Exception e)
            {
                ar.setHeaderText("sql"+e);
                ar.showAndWait();
            }
             
            try
            {
                res = sta.executeQuery(sql2);
                while(res.next())
                {
                    t_meal = res.getDouble("sum(total)");
                }
            }catch(Exception e)
            {
                ar.setHeaderText("sql2"+e);
                ar.showAndWait();
            }
            try{
                res = sta.executeQuery(sql3);
                while(res.next())
                {
                    total_cost = res.getInt("sum(bazar_cost)");
                }
                p20t9.setText(""+total_cost);
            }catch(Exception e){
                ar.setHeaderText("sql3"+e);
                ar.showAndWait();
            }
            try{
                res = sta.executeQuery(sql4);
                while(res.next())
                {
                    total_meal = res.getDouble("total");
                }
                p20t3.setText(""+total_meal);
            }catch(Exception e){
                ar.setHeaderText("sql4"+e);
                ar.showAndWait();
            }
             meal_rate = total_cost/t_meal;
             p20t7.setText(""+meal_rate);
             double cost = meal_rate*total_meal;
             p20t4.setText(cost+""); 
             try{
                 res = sta.executeQuery(sql5);
                 while(res.next())
                 {
                    total_deposite = res.getDouble("sum(member_deposite)");
                 }
                 p20t6.setText(""+total_deposite);
             }catch(Exception e){
                 ar.setHeaderText("sql5"+e);
                 ar.showAndWait();
             }
             double total_remaining =total_deposite - total_cost;
             p20t8.setText(""+total_remaining);
             double remaining = deposite - cost;
             p20t5.setText(""+remaining);
             String sql6 = "update total_calculation set total_meal = "+total_meal+",meal_rate = "+meal_rate+",pay_dept = "+remaining+",total_deposite = "+deposite+",toal_cost = "+cost+"where member_id = '"+te+"'";
             try{
                 if(sta.executeUpdate(sql6)>0)
                 {
                     ar.setHeaderText("done");
                     ar.showAndWait();
                 }else{
                     ar.setHeaderText("sorry");
                     ar.showAndWait();
                 }
             }catch(Exception e){
                 ar.setHeaderText("sql6"+e);
                 ar.showAndWait();
             }
        }else{
            
            ar.setHeaderText("Give the member id");
            ar.showAndWait();
        }
        
    }

    @FXML
    private void p20reset(ActionEvent event) {
        p20t1.setText("");
        p20t2.setText("");
        p20t3.setText("");
        p20t4.setText("");
        p20t5.setText("");
        p20t6.setText("");
        p20t7.setText("");
        p20t8.setText("");
        p20t9.setText("");
    }


    
    
}
