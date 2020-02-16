
package manik;

import java.util.Scanner;

public class add 
{
   Manik mk = new Manik(); 
    public int m1()
    {
        int a,b,c,d,e,f,g,h,sum;
        Scanner ms = new Scanner(System.in);
        System.out.print("enter the value = ");
        a=ms.nextInt();
        mk.setA(a);
        e=mk.getA();
        System.out.print("enter the second value = ");
        b=ms.nextInt();
        mk.setB(b);
        f=mk.getB();
        System.out.print("enter the threed value = ");
        c=ms.nextInt();
        mk.setC(c);
        g=mk.getC();
        System.out.print("enter the fourth value = ");
        d=ms.nextInt();
        mk.setD(d);
        h=mk.getD();
        sum=e+f+g+h;
        return sum;
    }    
}

