package calculatearea;

import java.util.Scanner;

public class Circle 
{
    Calculatearea obj = new Calculatearea();
    public void cir()
    {
         float a,b,c,d;
         d=(float) 3.1416;
         Scanner ms = new Scanner(System.in);
         System.out.print("enter the redis = ");
         a=ms.nextFloat();
         obj.setR(a);
         b=obj.getR();
         c=b*b*d;
          System.out.println("the circle = "+c);
         
         
    }
}
