/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image_veiw;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ImageView image;
    @FXML
    private Label la;
    @FXML
    private Pane pan;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void show(ActionEvent event) {
        try
        {
            pan.getChildren().clear();
            Image mk = new Image("File:///D:/bluetooth/kh.jpg");
            javafx.scene.image.ImageView mf = new javafx.scene.image.ImageView(mk);
            mf.setFitWidth(300);
            mf.setFitWidth(300);
            pan.getChildren().add(mf);
            image.setImage(mk);
            
        }catch(Exception e)
        {
            la.setText(""+e);
        }
    }
    
}
