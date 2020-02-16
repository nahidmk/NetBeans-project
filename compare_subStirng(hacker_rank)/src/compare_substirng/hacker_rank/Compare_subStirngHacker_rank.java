
package compare_substirng.hacker_rank;

import java.util.Scanner;

/**
 *
 * @author Nahid MK
 */
public class Compare_subStirngHacker_rank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        String s = mk.next();
        int A = mk.nextInt();
        
        String current_string = s.substring(0,A);
        System.out.println("1st = "+current_string);
        String min = current_string;
        String max = current_string;
        for(int i = 0;i<s.length();i++)
        {
            current_string = current_string.substring(1,A)+s.charAt(i);
              System.out.println(i+" = "+current_string);

            if(max.compareTo(current_string)<0)
            {
                max = current_string;
                System.out.println(i+": max = "+max);
            }
            if(min.compareTo(current_string)>0)
            {
                min = current_string;
                System.out.println(i+": min = "+min);
            }
        }
        
        System.out.println(max);
        System.out.println(min);
    }
    
}
