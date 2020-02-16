
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double n;
       double p;
       double sum = 0;
       Scanner mk = new Scanner(System.in);
       System.out.print("ennter the number = ");
       n = mk.nextDouble();
       System.out.print("ennter the power = ");
       p = mk.nextDouble();
       while(p!=0)
       {
        sum+= Math.pow(n,p);
       p--;
       }
       System.out.print("total sum = "+sum);
    }
    
}