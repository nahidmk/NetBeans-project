
package has_map.hacker_rank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Has_mapHacker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of person = ");
        n = mk.nextInt();
        Map m = new HashMap();
        mk.nextLine();
        for(int i = 1;i<=n;i++)
        {
            String name;
            System.out.println("Enter the name : ");
            
            name = mk.nextLine();
            int number;
            System.out.println("Enter the number : ");
            number = mk.nextInt();
            mk.nextLine();
            m.put(name, number);
        }
        while(mk.hasNext())
        {
            String name;
            name = mk.nextLine();
            if(m.containsKey(name))
            {
                System.out.println(name+"="+m.get(name));
            }
            else
                System.out.println("Not found");
        }
    }
    
}
