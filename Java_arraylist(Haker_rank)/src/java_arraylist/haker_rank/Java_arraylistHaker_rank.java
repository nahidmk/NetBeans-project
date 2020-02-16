
package java_arraylist.haker_rank;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_arraylistHaker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
       int n;
       ArrayList<ArrayList> arr = new ArrayList<>();
       System.out.print("enter the number of array list = ");
       n = mk.nextInt();
       for(int i = 1;i<=n;i++)
       {
           int size;
           System.out.println("Enter the size of arraylist = ");
           size = mk.nextInt();
           ArrayList<Integer> inarr = new ArrayList<>();
           for(int j = 1;j<=size;j++)
           {
               inarr.add(mk.nextInt());
           }
           arr.add(inarr);
       }
       int quere;
        System.out.println("Enter the number of quere = ");
        quere = mk.nextInt();
        for(int i = 1;i<=quere;i++)
        {
            System.out.println("Enter the numbre of line = ");
            int x = mk.nextInt()-1;
            System.out.println("Enter the number of index = ");
            int y = mk.nextInt()-1;
            if(x<arr.size() && y<arr.get(x).size())
            {
                System.out.println("the value = "+arr.get(x).get(y));
            }else
                System.out.println("Error");
        }
    }
        
    
    
}
