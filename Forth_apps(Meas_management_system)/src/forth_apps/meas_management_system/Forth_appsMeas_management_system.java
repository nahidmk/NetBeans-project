
package forth_apps.meas_management_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Forth_appsMeas_management_system extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setOnCloseRequest(close->{
            FXMLDocumentController mk = new FXMLDocumentController();
            try {
                mk.con.close();
                mk.res.close();
                mk.sta.close();
            } catch (Exception ex) {
                System.out.println("hello "+ex);
            }
        });
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
