
package static_block;

import java.util.Scanner;

public class Static_block {
         static int a,b;
       static boolean flag = false;
    static{
        Scanner mk = new Scanner(System.in);
        
        a = mk.nextInt();
        b = mk.nextInt();
        if(a<=0 || b<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else
            flag = true;
    }
    public static void main(String[] args) {
       if(flag)
       {
           int s = a+b;
           System.out.print(s);
       }
    }
    
}
