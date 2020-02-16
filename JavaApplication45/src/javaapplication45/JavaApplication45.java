
package javaapplication45;

import java.math.BigInteger;
import java.util.Scanner;
 import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class JavaApplication45 {

   public static void main(String []args){
      Scanner mk = new Scanner(System.in);
       
        
        try
        {
            int x,y,z;
        x = mk.nextInt();
        y = mk.nextInt();
           z = (int) Math.pow(x, y);
           System.out.println(z); 
        }catch(InputMismatchException e)
        {
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e+"");
        }
      
   }
}


    
