
package java_subarray.hacker_rank;

import java.util.Scanner;

public class Java_subarrayHacker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        String a = mk.nextLine();
        int n = Integer.parseInt(a);
        int arr[] = new int[n];
        int sum = 0,flag = 0,count = 0;
        for(int i = 0;i<n;i++)
        {
            arr[i] = mk.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            for(int l = i;l<n;l++)
            {
                for(int j = count;j<=l;j++)
                {
                    sum += arr[j];
                }
                if(sum<0)
                {
                   flag++; 
                }
                sum=0;
            }
           count++;    
        }
        System.out.println(flag);
    }
    
}
