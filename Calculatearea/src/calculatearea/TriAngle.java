
package calculatearea;

import java.util.Scanner;

public class TriAngle 
{
    Calculatearea mk = new Calculatearea ();
    public void tri()
    {
        float a,b,c,d,e,f,g;
        Scanner ms = new Scanner(System.in);
        System.out.print("enter the 1st langth = ");
        a=ms.nextFloat();
        System.out.print("enter the 2nd lemgth  = ");
        b=ms.nextFloat();
        System.out.print("enter the 3rd lemgth  = ");
        c=ms.nextFloat();
        mk.setA(a);
        mk.setB(b);
        mk.setC(c);
        d=mk.getA();
        e=mk.getB();
        f=mk.getC();
       g=(d+e+f)/2;
       System.out.println("the triAngle = "+g);
       
        
    }
}
