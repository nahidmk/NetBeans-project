
package fivonikki_using_formula;

import java.util.Scanner;

public class Fivonikki_using_formula {
    public static int fivo(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        else
            return (fivo(n-1)+fivo(n-2));
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.print("Enter the position = ");
        int position = mk.nextInt();
        System.out.println("the result = "+fivo(position));
        
      
    }
    
}
