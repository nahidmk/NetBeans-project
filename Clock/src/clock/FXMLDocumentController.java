
package clock;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    int s;
    int m;
    int h;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void start(ActionEvent event) {
        
        s=0;m=0;h=0;
       Thread t = new Thread()
       {
           public void run()
           {
             for(;;)
              {
                try
                  {
                   Thread.sleep(1000);
                   if(s>58)
            {
                s=0;
                m++;                
                if(m>58)
                {
                    m=0;
                    s=0;
                    h++;
                    
                    if(h>22)
                    {
                        s=0;
                        m=0;h=0;
                    }
                }
                
            }
               else
               {
                   s++;
               }
                   t1.setText(""+h);
                   t2.setText(""+m);
                   t3.setText(""+s);
                   
                   
                  }catch(Exception e)
               {
                   
               }
                            
                            
                            

               }

            }
        };
       t.start();
      
            
//        while(o==0)
//        {
//            try{
//            Thread.sleep(1000);
//            //te = h+":"+m+":"+s; 
//            System.out.println(h+":"+m+":"+s);
//            }catch(Exception e)
//            {
//                
//            }
//           
//            if(s>58)
//            {
//                s=0;
//                m++;                
//                if(m>58)
//                {
//                    m=0;
//                    s=0;
//                    h++;
//                    
//                    if(h>22)
//                    {
//                        s=0;
//                        m=0;h=0;
//                    }
//                }
//                
//            }
//            else
//                s++;
//            
//        }  
        
        
            
    }


    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
    
}
