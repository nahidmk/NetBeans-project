/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication23;

import java.io.File;
import java.io.FileInputStream;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Arrays;

public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView imageveiw;
    @FXML
    private Button select;
    private FileChooser cho;
    private Stage stag;
    private File file;
    private String filename = "";

    private Image image;
    ResultSet res;
    Connection con;
    Statement sta;

    @FXML
    private Label la;
    @FXML
    private TextField t1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cho = new FileChooser();
        stag = new Stage();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/password", "root", "manik");
            sta = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }

    }

    @FXML
    private void select(ActionEvent event) {
        Tooltip mk = new Tooltip();
        mk.setText("cleck here to select pictur");
        select.setTooltip(mk);

        int a = JOptionPane.showConfirmDialog(null, "do you want to select a picture", " Alert", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            cho.setTitle("open window");
            //cho.getExtensionFilters().addAll(new cho.ExtensionFilters("Image Files","*.bmp","*.png","*.jpg","*.gif"));
            file = cho.showOpenDialog(la.getScene().getWindow());
            if (file != null) {
                try {
                    filename = file.toURI().toURL().toString();
                    Image img = new Image(filename);
                    imageveiw.setImage(img);

                } catch (Exception e) {

                }
            } else {
                Alert ar = new Alert(Alert.AlertType.INFORMATION);
                ar.setTitle("Information dialog");
                ar.setHeaderText("plese select a file");
                ar.showAndWait();
            }

        }

    }

    @FXML
    private void insert(ActionEvent event) {
        PreparedStatement statement = null;
        FileInputStream inputstream = null;
        String te = t1.getText();
        if (te.length() > 0) {
            int a = Integer.parseInt(te);
            if (file != null) {
                try {
                    inputstream = new FileInputStream(file);
                    statement = con.prepareStatement("insert into picture(accout,Image)" + "Values(?,?)");
                    statement.setInt(1, a);
                    //statement.setBinaryStream(2, (InputStream)inputstream,(int) (file.length()));
                    statement.setBlob(2, inputstream);
                    if (statement.executeUpdate() > 0) {
                        la.setText("done");
                    } else {
                        la.setText("sorry");
                    }
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, e);
                }
            } else {
                JOptionPane.showConfirmDialog(null, "select a picture");
            }
        } else {
            JOptionPane.showConfirmDialog(null, "give input");
        }
    }

    @FXML
    private void update(ActionEvent event) {
    }

    @FXML
    private void delete(ActionEvent event) {
        String te = t1.getText();

        //byte[] b = null;
        String te1 = "select *from picture where accout = " + te;
        if (te.length() > 0) {
            try {
                res = sta.executeQuery(te1);
                while (res.next()) {         
                    byte[] imgBytes = res.getBytes("Image");
                    InputStream is = new ByteArrayInputStream(imgBytes);
                    Image img = new Image(is);
                    imageveiw.setImage(img);

                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        } else {
            JOptionPane.showConfirmDialog(null, "give input");
        }
    }

    @FXML
    private void select1(ActionEvent event) {
        
    }

}
