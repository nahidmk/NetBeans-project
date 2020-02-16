/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_choos_and_oparation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.io.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author DELL
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Label la;
    @FXML
    private TextArea t1;
    private FileChooser m;
    private Stage n;
   private File f;
    private String Filename;
    private String Filepath;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        m = new FileChooser();
        n = new Stage();
        Filename = " ";
        Filepath = " ";
    }    

    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
    }

    @FXML
    private void show(ActionEvent event) {
        String te = "";
        try
        {
            FileInputStream mk = new FileInputStream("abc.tex");
            int i;
            while((i=mk.read())!=-1)
            {
                te+=(""+(char)i);
            }
            mk.close();
            t1.setText(te+"");
        }
        catch(Exception e)
        {
            
        }
    }

    @FXML
    private void save(ActionEvent event) {
        String te = "";
        String te2 = t1.getText();
        String t3;
        try{
            FileInputStream o = new FileInputStream("abc.tex");
            int i;
            while((i=o.read())!=-1)
            {
                te+=""+(char)i;
            }
            o.close();
            t3 = te+"\n"+te2;
            
        FileOutputStream ms = new FileOutputStream("abc.tex");
        byte b[]  = t3.getBytes();
        ms.write(b);
        ms.close();
        
        }
        catch(Exception e)
        {
            
        }
    }

    @FXML
    private void open(ActionEvent event) {
        m.setTitle("new document");
        f = m.showOpenDialog(n);
        Filename = f.getName();
        Filepath = f.getPath();
        
        
                
    }
    private String []cha(String j)
    {
        int  cv = 0;
        int  cs = 0;
        int  cc = 0;
        int  cw = 0;
       
        for(int i= 0;i<j.length();i++)
        {
            if(j.charAt(i)=='.')
            {
               cs++; 
            }
          if(j.charAt(i)==' ')
            {
               cw++; 
            }  
            if(j.charAt(i)=='a'||j.charAt(i)=='o'||j.charAt(i)=='u'||j.charAt(i)=='i'||j.charAt(i)=='e')
            {
               cv++; 
            }
            if(j.charAt(i)=='A'||j.charAt(i)=='O'||j.charAt(i)=='U'||j.charAt(i)=='I'||j.charAt(i)=='E')
            {
               cv++; 
            }
            cc = (j.length())-cs-cw-cv;
            
            
        }
        cw++;
        String l[] = new String [4];
        l[0]=""+cw;
        l[1]=""+cs;
        l[2]=""+cc;
        l[3]=""+cv;
        return l;
        
        
    }

    @FXML
    private void chack(ActionEvent event) {
        String t = "";
        String msg = "";
        String o[]  = new String [4];
        if(Filename.length()>0)
        {
            try{
            FileReader mk = new FileReader(f);
            int i;
            while((i=mk.read())!=-1)
            {
               t+=""+(char)i; 
            }
            }catch(Exception e)
            {
              la.setText("no file found");  
            }
            if(t.length()>0)
            {
               o = cha(t);
               String v = "voule  = ";
               String c = "consonent = ";
               String w = "world = ";
               String s = "sentence =";
              w+=o[0];
              s+=o[1];
              c+=o[2];v+=o[3];
              msg = w+"\n"+s+"\n"+c+"\n"+v;
              t1.setText(msg);
            }
            else
                la.setText("file is empty");
        }
        
        else
            la.setText("no file selected.....!");
    }
    
}

 