
package anagrams.hacker_rank;

import java.util.Scanner;

public class AnagramsHacker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        String a = mk.next();
        String b = mk.next();
        a = a.toUpperCase();
        b = b.toUpperCase();
        char arrA[] = a.toCharArray();
        char arrB[] = b.toCharArray();
        int arr_A[] = new int[100];
        int arr_B[] = new int[100];
        if(a.length()==b.length())
        {
            for(int i = 0;i<arrA.length;i++)
            {
                arr_A[arrA[i]]++;
                System.out.println(arrA[i]+" arr_A = "+arr_A[arrA[i]] );
            }
            for(int i = 0;i<arrB.length;i++)
            {
                arr_B[arrB[i]]++;
                System.out.println(arrB[i]+" arr_B = "+arr_B[arrB[i]]);
            }
            int count = 0;
            for(int i = 0;i<arrA.length;i++)
            {
                if(arr_B[arrA[i]]!=arr_A[arrA[i]])
                {
                    count = 1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("Anagrams");
            }else
                System.out.println("Not Anagrams");
        }else
        {
            System.out.println("Not Anagrams");
        }
    }
    
}
