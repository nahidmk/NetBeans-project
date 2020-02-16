
package array_transfer_but_not_multiple_value;

import java.util.Scanner;

public class Array_Transfer_but_not_multiple_value {

    public static void main(String[] args) {
        int size;
        System.out.print("give the size = ");
        Scanner mk = new Scanner(System.in);
        size = mk.nextInt();
        int arr[] = new int[100];
        int copy_arr[] = new int[100];
        copy_arr[1] = 1;
        System.out.println("give the array : ");
        for(int i = 1;i<=size;i++)
        {
            arr[i] = mk.nextInt();
        }
        for(int i = 1;i<=size;i++)
        {
            int count = 0;
            for(int j = 1;j<=size;j++)
            {
                if(arr[i] == copy_arr[j])
                {
                   count++; 
                }
            }
            if(count<2)
            {
                copy_arr[i] = arr[i];
            }
            count = 0;
        }
        System.out.println("the output : ");
        for(int i = 1;i<=size;i++)
        {
            System.out.print(copy_arr[i]+" ");
        }
    }
    
}
