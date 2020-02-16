
package java_hasset.hacker_rank;

import java.util.HashSet;
import java.util.Scanner;

public class Java_HassetHacker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        HashSet  hs = new HashSet ();
        int count = 0;
        int n = Integer.parseInt(mk.nextLine()); 
        for(int i = 0;i < n;i++){
            if(hs.add(mk.nextLine())){
                count++;
            }
            System.out.println(count);
        }
    }
    
}
