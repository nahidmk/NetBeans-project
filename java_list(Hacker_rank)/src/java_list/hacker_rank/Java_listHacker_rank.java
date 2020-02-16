
package java_list.hacker_rank;

import java.util.LinkedList;
import java.util.Scanner;

public class Java_listHacker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter the size of the list = ");
        int n;
        LinkedList<Integer> list = new LinkedList<>();
        n = mk.nextInt();
        System.out.println("Enter the values : ");
        for(int i = 0;i<n;i++)
        {
            list.add(mk.nextInt());
        }
        System.out.print("Enter the number of queres = ");
        int q;
        q = mk.nextInt();
        for(int i = 1;i<=q;i++)
        {
            System.out.println("Enter the name of quere : ");
            String te,te1,te2;
            te1 = "Insert";
            te2 = "Delete";
            te = mk.next();
            if(te.equals(te1))
            {
                System.out.println("Enter the value of index : ");
                int index,value;
                index = mk.nextInt();
                System.out.println("Enter the value : ");
                value = mk.nextInt();
                list.add(index, value);
            }
            if(te.equals(te2))
            {
                int index;
                System.out.println("Enter the value of index : ");
                index = mk.nextInt();
                list.remove(index);
            }
        }
        for(int i:list)
        {
            System.out.print(i+" ");
        }
        
    }
    
}
