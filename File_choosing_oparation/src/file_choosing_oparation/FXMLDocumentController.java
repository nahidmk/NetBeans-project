/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_choosing_oparation;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextArea t1;
    private String Filename;
    private String Filepath;
    private FileChooser mk;
    private Stage ms;
    private File myFile;

    @FXML
    private Label la;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Filename = "";
        Filepath = "";
        mk = new FileChooser();
        ms = new Stage();
       
        //la = new Label();
    }    

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
    }

    @FXML
    private void open(ActionEvent event) {
        mk.setTitle("open the file");
        myFile = mk.showOpenDialog(ms);
        Filename = myFile.getName();
        Filepath = myFile.getPath();
    }
    private String []cha(String text)
    {
        int cv=0;
        int cw=0;
        int cs=0;
        int cc=0;
        
        for(int j = 0;j<text.length();j++)
        {
            if(text.charAt(j)==' ')
            {
                cw++;
            }
            if(text.charAt(j)=='.')
            {
                cs++;
            }
            if(text.charAt(j)=='a'||text.charAt(j)=='e'||text.charAt(j)=='o'||text.charAt(j)=='i'||text.charAt(j)=='u')
                   {
                       cv++;
                   }
            if(text.charAt(j)=='A'||text.charAt(j)=='E'||text.charAt(j)=='O'||text.charAt(j)=='I'||text.charAt(j)=='U')
                   {
                       cv++;
                   }
            cc=text.length()-(cv+cs+cw); 
        }
        cw++;
        String []l = new String[4];
        l[0] = ""+cw;
        l[1] = ""+cv;
        l[2] = ""+cc;
        l[3] = ""+cs;
        return l;
    }
    @FXML
    private void chack(ActionEvent event) {
        String text = "";
        String mg = "";
             String o[] = new String[4];
        if(Filename.length()>0)
        {
                try
            {
                FileReader ob = new FileReader(myFile);
                int i;
                while((i=ob.read())!=-1)
                {
                    text+=(""+(char)i);

                }

            }
            catch(Exception e)
            {
                la.setText("not foung....");
            }
                 if(text.length()>0)
                 {
                     String cv  = "vowel = ";
                     String cc  = "conconet = ";
                     String cw  = "word = ";
                     String cs  = "sentence = ";
                     o = cha(text);
                     cv+=o[0];
                     cc+=o[1];
                     cw+=o[2];
                     cs+=o[3];
                    mg = cv+"\n"+cc+"\n"+cw+"\n"+cs;
                    t1.setText(mg);
                     
                 } 
                 else
                     la.setText("file empty.....");
                 
        }
        else
            la.setText("no file selected....");
        
    }
    
}
