
package javafxapplication3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    
    private String text1;
    private String text2;
    private String text3;
    private double c;
    private boolean q;
    private boolean p;
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
    }



    @FXML
    private void reset(ActionEvent event) {
        t1.setText("");
        t2.setText("");
        t3.setText("");
   }
//  public boolean verify(String input)
//    {
//        boolean isnumber = false;
//        if(input!=null&&!input.equals(""))
//        {
//            isnumber = true;
//            char cahre[] = input.toCharArray();
//            for(int d= 0;d<cahre.length;d++)
//            {
//                isnumber &=Character.isDigit(cahre[d]);
//                if(!isnumber)
//                    break;
//            }
//            
//        }
//       
//            return isnumber;
//   }

//  public boolean isInteger( String input )
//{
//   try
//   {
//      Integer.parseInt( input );
//      return true;
//   }
//   catch( Exception e )
//   {
//      return false;
//   }
//}
    public boolean number(String input)
    {
        int flag = 0;
        for(int i=0;i<input.length();i++)
        {
            switch (input.charAt(i))
            {
                case '0':
                    flag++;
                    break;
                case '1':
                    flag++;
                    break;
                case '2':
                    flag++;
                    break;
                case '3':
                    flag++;
                    break;
                case '4':
                    flag++;
                    break;
                case '5':
                    flag++;
                    break;
                case '6':
                    flag++;
                    break;
                case '7':
                    flag++;
                    break;
                case '8':
                    flag++;
                    break;
                case '9':
                    flag++;
                    break;
                case '.':
                    flag++;
                    break;
                default:
                    break;
                    
            }
        }
        if(flag>=1)
        {
            return true;
        }
        else
            return false;
    }
    @FXML
    private void alloparetio(ActionEvent event) 
    { 
        FXMLDocumentController mk = new FXMLDocumentController();
        int i,j;
         text3 = ((Button)event.getSource()).getText();
        text1 = t1.getText(); 
        
        p = mk.number(text1);
        System.out.println(p);
        double a = Integer.parseInt(text1);
//        {
//            if(text1.matches("[0-9]+"))
//            {
//              i = 1;  
//            }
//            else {
//                i = 2;
//            }
//        }
       
        text2 = t2.getText();
       
        q = mk.number(text2);
         System.out.println(q);
          double b = Integer . parseInt(text2);
//        {
//            if(text2.matches("[0-9]+"))
//            {
//              j = 1;  
//            }
//            else {
//                j = 2;
//            }
//        }
        
       
        
            
    
        //q=mk.verify();
        if(p==false&&q==false)
        {
           t3.setText("sorry"); 
        }
        else
            
        { 
                switch(text3)
            {
                case "add":
                    c=a+b;

                    break;
                case "sub":
                    c=a-b;

                    break;
                case "mul":
                    c=a*b;

                    break;
                case "dib":
                    c=a/b;

                    break;


            }
                t3.setText(""+c);
        }
        
        
    }
    
}
