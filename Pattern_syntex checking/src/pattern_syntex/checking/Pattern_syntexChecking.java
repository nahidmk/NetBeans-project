
package pattern_syntex.checking;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern_syntexChecking {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n;
        n = Integer.parseInt(mk.nextLine());
        for(int p = 0;p<n;p++)
        {
            String te = mk.nextLine();
            try{
            Pattern.compile(te);
                System.out.println("Valid");
            }catch(Exception e)
            {
                System.out.println("Invalid");
            }
        }
    }
    
}
