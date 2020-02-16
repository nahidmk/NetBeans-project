
package file_choosing;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private Label la;
    @FXML
    private TextArea t1;
    
    private FileChooser choos;
    private Stage stage; 
    private File file;
    private String filename;
    private String filepath;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        choos = new FileChooser();
        stage = new Stage();
        filepath = "";
        filename = "";
    }    

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
        
    }

    @FXML
    private void open(ActionEvent event) {
        choos.setTitle("new document");
        file = choos.showOpenDialog(stage);
        filename= file.getName();
        filepath = file.getPath();
    }
    private String []cha(String input)
    {
        String l[] = new String[4];
        int c = 0;
        int v = 0;
        int w = 0;
        int s = 0;
        for(int i=0;i<input.length();i++){
        if(input.charAt(i)=='.')
            s++;
        if(input.charAt(i)==' ')
            w++;
        if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
            v++;
        if(input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U')   
            v++;
        c= input.length()-s-v-w;
            }
        w++;
        l[0]=""+v;
        l[1]=""+c;
        l[2]=""+s;
        l[3]=""+w;
        return l;
    }

    @FXML
    private void chack(ActionEvent event) {
        String t="";
        String o[] = new String[4];
        
        if(filename.length()>0)
        {
              try{
            FileReader ms = new FileReader(file);
            int i;
            while((i=ms.read())!=-1)
            {
                t+=""+(char)i;
            }
            ms.close();
            }catch(Exception e)
            {
                la.setText("file not found");
            }
            if(t.length()>0)
            {
                String m = "";
                String v = "voule = ";
                String c = "consonent = ";
                String s = "sentense = ";
                String w = "word = ";
                o = cha(t);
                v+=o[0];
                c+=o[1];
                s+=o[2];
                w+=o[3];
                m = v+"\n"+c+"\n"+s+"\n"+w;
                t1.setText(m);
            }  
            else 
                la.setText("file is empty");
        }
        else
            la.setText("file not selected");
        
    }
    
}
