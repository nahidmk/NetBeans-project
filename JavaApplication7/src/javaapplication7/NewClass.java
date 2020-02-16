
package javaapplication7;

public class NewClass 
{
    public static void main(String[] args)
    {
        JavaApplication7 ms = new JavaApplication7 ();
        int a=3;int b=2;int c,d,sum;
        ms.setA(a);
        ms.setB(b);
        c=ms.getA();
        d=ms.getB();
        sum=c+d;
        System.out.println(sum);
    }
    
}
