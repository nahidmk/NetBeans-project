
package adjacency_index_of_an_array;

import java.util.Scanner;

public class Adjacency_Index_of_an_array {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int row,col,pic;
        System.out.print("Enter the row = ");
        row = mk.nextInt();
        System.out.print("Enter the col = ");
        col = mk.nextInt();
        int arr[][] = new int[row+2][col+2];
        System.out.println("Enter the value of array : ");
        for(int i = 1;i<=row;i++)
        {
            for(int j = 1;j<=col;j++)
            {
                arr[i][j] = mk.nextInt();
            }
        }
        System.out.print("Enter the pic value = ");
        pic = mk.nextInt();
        for(int i = 0;i<=row+1;i++)
        {
            for(int j = 0;j<=col+1;j++)
            {
                if(arr[i][j]==pic)
                {
                    for(int k = j-1;k<=j+1;k++)
                    {
                        System.out.print(arr[i-1][k]+" ");
                    }
                    System.out.println("");
                    System.out.println(arr[i][j-1]+"   "+arr[i][j+1]);
                    for(int l = j-1;l<=j+1;l++)
                    {
                        System.out.print(arr[i+1][l]+" ");
                    }
                    System.out.println("\n");
                }
                
            }
        }
        
    }
}
