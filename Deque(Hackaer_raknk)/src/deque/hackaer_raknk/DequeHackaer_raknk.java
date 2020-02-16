
package deque.hackaer_raknk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeHackaer_raknk {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        Deque deque = new ArrayDeque<Integer>();
       int n = mk.nextInt();
       int m = mk.nextInt();
       int maxUnique = 0;
       for (int i = 0; i < n; i++) 
       {
            int num = mk.nextInt();
            if(i == 0){
                deque.add(num);  
                maxUnique++;
            }else{
                if(deque.size() == m){
                    deque.removeFirst();
                }
                if(!deque.contains(num) && maxUnique<m){
                    maxUnique++;
                }
                deque.addLast(num);
            }
       }
       System.out.println(""+maxUnique);
    
        
    }
    
}
