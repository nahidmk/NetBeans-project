/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image_veiw_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private ImageView image;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void show(ActionEvent event) {
        Image mk = new Image("/image_veiw_2.con1/,student.jpg");
        image.setImage(mk);
        
    }
    
}
