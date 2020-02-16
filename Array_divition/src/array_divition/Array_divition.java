
package array_divition;

import java.util.Scanner;

public class Array_divition {
     
    public void arr(int a)
    {
        int m[] = new int[100];
        int temp= 0, con = 0;
        m[con]=a;
        
        while(a!=0)
        {
            m[con+1] = a/2;
            a=a/2;
            con++;
            temp++;
        }
        for(int i = 0; i<temp;i++)
        {
            System.out.println("m["+i+"] = "+m[i]);
        }
    }

    public static void main(String[] args) {
        Array_divition mk = new Array_divition();
        int a;
        Scanner ms = new Scanner(System.in);
        a = ms.nextInt();
        mk.arr(a);
       
    }
    
}
