
package data_base_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Data_base_system extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setOnCloseRequest(close ->{
            FXMLDocumentController mk = new FXMLDocumentController();
            try
            {
                mk.con.close();
                mk.res.close();
                mk.sta.close();
            }catch(Exception e)
            {
                System.out.print(e);
            }
        });
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
