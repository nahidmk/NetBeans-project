
package bobble_short;

import java.util.Scanner;

public class Bobble_short {
    static int issort(int b[], int a)
    {
       if(a==0||a==1)
       {
           return 1;
       }
       else if(b[a-1]<b[a-2])
       {
           return 0;
       }
       else
           return issort(b,a-1);
           
    }

    public static void main(String[] args) {
        
        int a;
        Scanner mk  = new Scanner(System.in);
        System.out.println("give the array size");
        a = mk.nextInt();
        int temp = 0;
        int b[] = new int[a];
        System.out.println("give the values of array");
        for(int i = 0;i<a;i++)
        {
            b[i] = mk.nextInt();
        }
        for(int i = 0;i<a;i++)
        {
            int count = 0;
            for(int j = 0;j<a-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                   temp = b[j];
                   b[j]=b[j+1];
                   b[j+1]=temp;
                   count++;
                }
            }
            System.out.println("step = "+(i+1));
            //if(issort(b,a)!=0)
            if(count==0)
            {
                break;
            }
        }
        for(int i = 0;i<a;i++)
        {
            System.out.println(b[i]);
        }
        
    }
    
}
