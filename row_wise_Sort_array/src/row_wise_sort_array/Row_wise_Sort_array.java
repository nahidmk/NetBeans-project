
package row_wise_sort_array;

import java.util.Scanner;

public class Row_wise_Sort_array {

    public static void main(String[] args) {
         int n,temp;
         Scanner mk = new Scanner(System.in);
         System.out.print("give the size = ");
         n = mk.nextInt();
         int arr[][] = new int[100][100];
         System.out.println("give the array : ");
         for(int i = 1;i<=n;i++)
         {
             for(int j = 1;j<=3;j++)
             {
                 arr[i][j] = mk.nextInt();
             }
         }
         for(int i = 1;i<=n;i++)
         {
             for(int j = 1;j<=3;j++)
             {
                 for(int k = 1;k<=3-j;k++)
                 {
                    if(arr[i][k]>arr[i][k+1])
                    {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][k+1];
                        arr[i][k+1] = temp;
                    }  
                 }
                   
             }
         }
         for(int i = 1;i<=n;i++)
         {
             System.out.print("case : ");
             for(int j = 1;j<=3;j++)
             {
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
         
    }
    
}
