
package create_queue_usign_two_stack;

import java.util.Scanner;
import java.util.Stack;

public class Create_queue_usign_two_stack {
    
    public static void main(String[] args) {
       Scanner mk = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of stack = ");
        n = mk.nextInt();
        Stack<Integer> st = new Stack();
        Stack<Integer> st2 = new Stack();
        System.out.println("Enter the value : ");
        for(int i = 1;i<=n;i++)
        {
            st.push(mk.nextInt());
        }
        for(int i = 1;i<=n;i++)
        {
            st2.push(st.pop());
        }
        for(int i = 1;i<=n;i++)
        {
            System.out.println("the value : "+st2.pop());
        }
    }
    
}
