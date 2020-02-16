package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 
{
    public int manik(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum;
    }
    public int manik(int a,int b,int c)
    {
        int sum;
        sum=a+b+c;
        return sum;
    }

    public static void main(String[] args)
    {
        JavaApplication7 mk = new JavaApplication7();
        int a,b,c,sum;
        Scanner ms = new Scanner(System.in);
        a=ms.nextInt();
        b=ms.nextInt();
        c=ms.nextInt();
        sum=mk.manik(a, b, c);
        System.out.println(sum);
        
    }
    
    
}
