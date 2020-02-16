
package clock_without_gui;

import java.util.Scanner;

public class Clock_without_gui {

    public static void main(String[] args) {
       int s,m,h,o=0;
       Scanner mk = new Scanner(System.in);
       h=mk.nextInt();
       m=mk.nextInt();
       s=mk.nextInt();
        
        
        while(o==0)
        {
            try{
            Thread.sleep(1000);
            System.out.println(h+":"+m+":"+s);
            }catch(Exception e)
            {
                
            }
           
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
                s++;
            
        }  
    }
    
}
