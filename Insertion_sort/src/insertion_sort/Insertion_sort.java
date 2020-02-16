
package insertion_sort;

import java.util.Scanner;

public class Insertion_sort {

    public static void main(String[] args) {
        int n,temp,x;
        System.out.print("give the size = ");
        Scanner mk = new Scanner(System.in);
        n =mk.nextInt();
        int arr[] = new int[100];
        System.out.println("give the size : ");
        for(int i = 1;i<=n;i++)
        {
            arr[i] = mk.nextInt();
        }
        for(int i = 1;i<n;i++)
        {
            x = arr[i];
            int j = i-1;
            while(arr[j]>x&&j>=0)
            {
                 arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
        for(int i = 1;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
