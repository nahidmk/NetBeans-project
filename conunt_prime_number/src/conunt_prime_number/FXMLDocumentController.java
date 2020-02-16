/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conunt_prime_number;

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
 * @author Nahid MK
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label lable;
    @FXML
    private TextArea t1;
    
    private FileChooser cho;
    private Stage sta;
    private File file;
    private String  Filename = "";
    private String Filepath = "";
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cho = new FileChooser();
        sta = new Stage();
        
        
    }    

    @FXML
    private void open(ActionEvent event) {
        try{
        cho.setTitle("open new window");
        file = cho.showOpenDialog(sta);
        Filename = file.getName();
        Filepath = file.getPath();
        }
        catch(Exception e)
        {
            lable.setText(""+e);
        }
    }
    private String []o(String input)
    {
        String l[] = new String[4];
       int ss = 0;
       int sw = 0;
       int sc = 0;
       int sv = 0;
       for(int i = 0;i<input.length();i++)
       {
           if(input.charAt(i)=='.')
               ss++;
           if(input.charAt(i)==' ')
               sw++;
           if(input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='u')
               sv++;
           if(input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='U'||input.charAt(i)=='O'||input.charAt(i)=='I')
               sv++;
          sc=input.length()-ss-sw-sv;
       }
       sw++;
       
       l[0] = ""+ss;
       l[1] = ""+sw;
       l[2] = ""+sv;
       l[3] = ""+sc;
       return l;
    }

    @FXML
    private void cahck(ActionEvent event) {
        String text = "";
        String p[] = new String[4];
        if(Filename.length()>0)
        {
                try{
                FileReader mk = new FileReader(file);
                int i;
                while((i = mk.read())!= -1)
                {
                    text+=""+(char)i;
                }
               

            }catch(Exception e){
                lable.setText(""+e);
            }
                if(text.length()>0)
                {
                    String w = "word = ";
                    String s = "sentecse = ";
                    String c = "consonent = ";
                    String v = "voule = ";
                   p = o(text);
                   w+=p[1];
                   s+=p[0];
                   c+=p[3];
                   v+=p[2];
                   t1.setText(w+"\n"+s+"\n"+c+"\n"+v);
                     
                }
                else
                    lable.setText("file was empty");
                
        }
        else
            lable.setText("file not selected");
        
    }
    
}
