
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
private int size=0;
   public int s1[]= new int[size];
   // private int s2[]=new int [size];
    private int top=0;
    
    public void push(int n)
    {
        if(top==size-1)
        {
             System.out.print("over load");
        
        }
        else
        {
              s1[top]=n;
        System.out.print(n+" is push in stack");
        top++;
        }
    }
    public int pop()
    {
        int item;
        if(top<0)
        {
           System.out.print("empty...");
           return 0;
        }
        else 
        {
             item=s1[top];
          top--;
          return item;
        }
    }
      public void show()
      {
          for(int i=0;i<top;i++)
          {
              System.out.print(s1[i]+" ");
          }
      }

    public static void main(String[] args)
    {
        JavaApplication5 mk = new JavaApplication5();
       int top,size,option,n,j;
       char c;
       System.out.print("enter the value of size = ");
       Scanner ms = new Scanner(System.in);
       size= ms.nextInt();
       //int s1[]=new int [mk.size];
       mk.size=size;
       mk.top=-1;
       do
       {
           System.out.println("1 for push");
       System.out.println("2 for pop");
       System.out.println("3 for show");
       System.out.println("4 for exit");
       System.out.print("enter your option");
       option = ms.nextInt();
       switch(option)
       {
           case 1:
               System.out.print("enter the value for push");
               n=ms.nextInt();
               mk.push(n);
               break;
           case 2:
              j= mk.pop();
              System.out.print("the pop value is "+j);
              break;
           case 3:
               mk.show();
               break;
           default:
               System.out.print("sorry.....");
       }
       System.out.print("continue....?");
       c=ms.next().charAt(0);
       }while(c!='Y');
    }
    
}
