/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_base_with_login_system;

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
    private Pane pane1;
    @FXML
    private TextField p1t1;
    @FXML
    private TextField p1t2;
    @FXML
    private TextArea p1t3;
    @FXML
    private Label p1la;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pane1.setVisible(false);
        
    }    

    @FXML
    private void login(ActionEvent event) {
        pane1.setVisible(true);
    }

    @FXML
    private void cencel(ActionEvent event) {
        t1.setText("");
        t2.setText("");
    }

    @FXML
    private void p1Save(ActionEvent event) {
    }

    @FXML
    private void p1reset(ActionEvent event) {
        p1t1.setText("");
        p1t2.setText("");
        p1t3.setText("");
    }
    
}
