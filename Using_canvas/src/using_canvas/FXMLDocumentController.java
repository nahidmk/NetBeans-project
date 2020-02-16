/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package using_canvas;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane p1;
    @FXML
    private Label la;
    @FXML
    private Canvas can;
    FileChooser co;
    Stage sta;
    File file;
    @FXML
    private TextField t1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       GraphicsContext g = can.getGraphicsContext2D();
       can.setOnMouseDragged(e ->{
           Double size = Double.parseDouble(t1.getText());
           Double x = e.getX() - size/2;
           Double y = e.getY() - size/2;
          // Double z = e.getZ()  - size/2;
          if(eraser.isSelected())
       });
    }    

    @FXML
    private void select(ActionEvent event) {
        
    }

    @FXML
    private void exit(ActionEvent event) {
        platform.exit();
    }
    
}
