
package uva_problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Uva_problem {

    public static void main(String[] args) {
     Scanner mk = new Scanner(System.in);
     Queue <Integer> q = new LinkedList<>();
     int size;
     System.out.print("Enter the size of queue = ");
     size = mk.nextInt();
     System.out.print("push the value : ");
     for(int i = 1;i<=size;i++)
     {
         q.add(mk.nextInt());
         System.out.println("the inserter value = "+q);
     }
     System.out.println("The size = "+q.size());
     
     System.out.println("the head of the queue = "+q.peek());
     
     System.out.println("the pop value = "+q.remove());
     
     //System.out.println("The size = "+q.size());
    }
    
}
