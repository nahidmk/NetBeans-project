
package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
       Scanner mk = new Scanner(System.in);
       int n;
       ArrayList<ArrayList> arr = new ArrayList<>();
      
       n = mk.nextInt();
       for(int i = 1;i<=n;i++)
       {
           int size;
           
           size = mk.nextInt();
           ArrayList<Integer> inarr = new ArrayList<>();
           for(int j = 1;j<=size;j++)
           {
               inarr.add(mk.nextInt());
           }
           arr.add(inarr);
       }
       int quere;
        
        quere = mk.nextInt();
        for(int i = 1;i<=quere;i++)
        {
            
            int x = mk.nextInt()-1;
            
            int y = mk.nextInt()-1;
            if(x<arr.size() && y<arr.get(x).size())
            {
                System.out.println(arr.get(x).get(y));
            }else
                System.out.println("Error");
        }
    }
    
}
