package queu;
import java.util.Stack;
import java.util.Scanner;
public class Queu
{

    private  Stack<Integer>old;
    private  Stack<Integer>news;
    private  int top;
    private  int size;
    public Queu()
    {
        old= new Stack<>();
        news= new Stack<>();
        top=-1;
        size=-1;
        
    }
    public boolean enqueue(int element)
    {
       boolean ret = true;
       try 
       {
           news .push(element);
           
       }
       catch(Exception e)
       {
           ret = false;
           System.out.println("error");
       }
       return ret;
    }
    public int dequeue()
    {
        if(old.empty())
        {
            while(!news.empty())
            {
                top=news.peek();
                old.push(top);
                news.pop();
            }
        }
        if(!old.empty())
        {
            Integer i = old.peek();
            top=i;
            old.pop();
        }
        return top;
    }
    public boolean isImpty()
    {
        if(old.empty()&&news.empty())
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public int Size()
    {
        size = old.size()+news.size();
        return size;
    }
    public void display()
    {
        System.out.println("------queue------");
        int l = Size();
        if(l==0)
        {
            System.out.println("empty");
        }
        else
        {
            for(int i=l-1;i>=0;i--)
            {
               System.out.println(old.push(i));
            }
        }
    }
   
    public static void main(String[] args)
    {
        Queu q = new Queu();
        int n,p,l,o;
        Scanner mk= new Scanner(System.in);
        char m;
        do
        {
        System.out.println("1 for enque");
        System.out.println("2 for dequeue");
        System.out.println("3 for chaking empty");
        System.out.println("4 for looking size");
        System.out.println("5 for display");
        System.out.println("enter the option");
        p=mk.nextInt();
        switch(p)
        {
            case 1:
                System.out.print("enter the valeu for push = ");
                l=mk.nextInt();
                q.enqueue(l);
                break;
            case 2:
             
              System.out.println("the dequeqe value is = "+q.dequeue());
                
                break;
            case 3:
                System.out.println("the queue is = "+q.isImpty());
                break;
            case 4:
                System.out.println("the size of queue is = "+q.Size());
            case 5:
                q.display();
                break;
                
        }
        System.out.print("continue......? = ");
        m=mk.next().charAt(0);
        }while(m=='y');

    }
    
}
