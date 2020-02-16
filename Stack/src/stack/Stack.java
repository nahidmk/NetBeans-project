
package stack;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Stack {
    private static Stack st;
    Stack()
    {
        st = new Stack();
    }

//    private int[] o;
//    private  int[] S;
//    private   int size;
//    private  int top;
//    private int count;
//    
//    public void push(int a)
//    {
//        if(top+1>size)
//        {
//            System.out.println("over flow");
//        }
//        else {
//            top++;
//            S[top]=a;
//            System.out.println("the push vale is = "+a);
//            
//        }
//    }
//    public int  pop()
//    {
//        if(top>=0)
//        {
//            int item;
//            item =S[top];
//            top--;
//            //System.out.println("the pop value is = "+item);
//            return item;
//            
//        }
//        else
//        {
//            //System.out.println("empty");
//            return 0;
//        }
//    }
//    public void po()
//    {
//        Stack on = new Stack();
//        int b;
//        System.out.print("the pop value is = ");
//        b=on.pop();
//    }
    /*public void enpush()
    {
        Stack obj = new Stack();
        if(count+1<size)
        {
          for(int i=0;i<=top;i++)
            {
                count ++;
                o[count]=obj.pop();
            }
          for(int j= 0;j<=count;j++)
          {
              System.out.println(o[j]);
          }
        }
        
    }
    public void enpop()
    {
        if(count>=0)
        {
            int item;
            item=o[count];
            count--;
            System.out.println("the pop value = "+ item);
        }
        else
        {
            System.out.println("empty");
        }
    }*/
//        public void desplay()
//        {
//            for(int i=0;i<=top;i++)
//            {
//                System.out.println(o[i]);
//            }
//        }
    
//    public static void main(String[] args) 
//    {
//        int n,p,l,o;
//        
//        char m;
//        Scanner mk = new Scanner(System.in);
//        System.out.print("the size of Stack = ");
//        n=mk.nextInt();
//        
//        Stack ms = new Stack();
//        ms.size=n;
//        ms.top=-1;
//        ms.count = -1;
//       int a[] = new int[ms.size];
//       ms.S=a;
//       int b[] = new int [100];
//       ms.o=b;
//        do
//        {
//        System.out.println("1 for push");
//        System.out.println("2 for pop");
//        System.out.println("3 for desplay");
//        System.out.println("enter the option");
//        p=mk.nextInt();
//        switch(p)
//        {
//            case 1:
//                System.out.print("enter the valeu for push = ");
//                l=mk.nextInt();
//                ms.push(l);
//                break;
//            case 2:
//                //ms.enpush();
//              ms.po();
//                
//                break;
//            case 3:
//                System.out.println("------now the position of stack---------");
//                ms.desplay();
//                break;
//        }
//        System.out.print("continue......? = ");
//        m=mk.next().charAt(0);
//        }while(m=='y');
//        
//    }

    /**
     *
     * @param st
     */
    public static void pus(Stack st)
    {
        for(int i = 1;i<=5;i++)
        {
            st.push(i);
        }
    }
    
   
    
}