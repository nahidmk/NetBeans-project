
package third_apps.bank_oparation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Third_appsBank_oparation extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/third_apps.bank_oparation/style");
        //stage.setOpacity(0.7);
        
        stage.setScene(scene);
        stage.setOnCloseRequest(close->{
            FXMLDocumentController mk = new FXMLDocumentController();
            try {
                mk.con.close();
                mk.res.close();
                mk.sta.close();
            } catch (Exception ex) {
                
            }
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
