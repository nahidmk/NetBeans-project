
package java_map.hacker_rank;

import java.util.Scanner;

public class Java_mapHacker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of person = ");
        n = mk.nextInt();
        String p_name[] = new String[n+1];
        int p_number[] = new int[n+1];
        mk.nextLine();
        for(int i = 1;i<=n;i++)
        {
            System.out.println(i+"---- Enter the name ");
            p_name[i] = mk.nextLine();
            System.out.println(i+"---Enter the number");
            p_number[i] = mk.nextInt();
            mk.nextLine();
            
        }
        System.out.println("Enter the name : ");
        while(mk.hasNext())
        {
            String te;
            te = mk.nextLine();
            int c = 0;
            for(int j = 1;j<=n;j++)
            {
                if(te.equals(p_name[j]))
                {
                    System.out.println(p_name[j]+"="+p_number[j]);
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println("not found");
            }
        }
        
    }
    
}
