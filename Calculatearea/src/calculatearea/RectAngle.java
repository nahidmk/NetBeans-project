
package calculatearea;

import java.util.Scanner;

public class RectAngle
{
    Calculatearea mk = new Calculatearea ();
    public void rec()
    {
        float a,b,c,d,e;
        Scanner ms = new Scanner(System.in);
        System.out.print("enter the langth = ");
        a=ms.nextFloat();
        System.out.print("enter the wisth = ");
        b=ms.nextFloat();
        mk.setL(a);
        mk.setW(b);
        c=mk.getL();
        d=mk.getW();
       e=c*d;
       System.out.println("the rectangle = "+e);
       
        
    }
}
