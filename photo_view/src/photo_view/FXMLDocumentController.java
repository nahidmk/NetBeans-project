/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photo_view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

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
   // private FileChooser cos;
//   private Stage sta;
//   private File file;
//    private String filename = "";
//    private String filepath = "";
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        cos = new FileChooser();
//        sta = new Stage();
        
    }    

    @FXML
    private void reset(ActionEvent event) {
        
         Image mk = new Image ("/khan/kh.jpg");
                image.setImage(mk);
    }

//    @FXML
//    private void open(ActionEvent event) {
////        cos.setTitle("welcome");
////        file = cos.showOpenDialog(sta);
////        filename = file.getName();
////        filepath = file.getPath();
////        if(filename.length()>0)
////        {
////            if(file.equals("bluetooth"))
////            {
////               
////            }
////            else
////                la.setText("sorry...");
////        }
////        else 
////            la.setText("file not founded...");
////    }
//    
//}
}