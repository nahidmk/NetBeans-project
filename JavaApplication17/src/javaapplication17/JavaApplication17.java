
package javaapplication17;

import java.util.Scanner;


public class JavaApplication17 {
 
    public void con(int a)
    {
        int b = 0,c= 0,d = 0,f = 0;

            b = a/3600;
            c = a%3600;
            if(c>60)
            {
               d = c/60;
               f = c%60;
            }
            else
                f = c;
           System.out.println(b+" : "+d+" : "+f);
     
    }
    
    public static void main(String[] args) {
        JavaApplication17 mk = new JavaApplication17();
        int a;
        Scanner ms = new Scanner(System.in);
        a = ms.nextInt();
        mk.con(a);
    }
    
}
