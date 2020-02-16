/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool_tips_oparation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label la;
    @FXML
    private TextField tn1;
    @FXML
    private TextField tn2;
    @FXML
    private TextField ts;
    @FXML
    private TextArea ta;
    @FXML
    private Tooltip to1;
    @FXML
    private Tooltip to2;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void open(ActionEvent event) {
        //ta.setToolTipText("cleek here for open a new window");
    }

    @FXML
    private void doshort(ActionEvent event) {
    }

    @FXML
    private void chack(ActionEvent event) {
      
    }

    @FXML
    private void fo(ActionEvent event) {
        SplitMenuButton m = new SplitMenuButton();
      m.setText("voule");
      m.getItems().addAll(new MenuItem("conconent"),new MenuItem("sentence"));
      //m.setOnAction(new EventHandler);
    }
    
}
