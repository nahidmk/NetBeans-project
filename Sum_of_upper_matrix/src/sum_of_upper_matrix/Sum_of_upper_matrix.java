
package sum_of_upper_matrix;

import java.util.Scanner;

public class Sum_of_upper_matrix {
    public static void show()
    {
        int n = 7;
        for(int line = 1;line<=n;line++)
        {
            int c =1;
            for(int i = line;i<n;i++)
            {
                System.out.print(" ");
            }
            for(int i = 1;i<=line;i++)
            {
                System.out.print(c+" ");
                c = c*(line-i)/i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        show();
//      Scanner mk = new Scanner(System.in);
//      int row, col, sum = 0;
//      System.out.print("Give the row size = ");
//      row = mk.nextInt();
//      System.out.print("give the column = ");
//      col = mk.nextInt();
//      int arr[][] = new int[100][100];
//      System.out.println("give the array : ");
//      for(int i = 1;i<=row;i++)
//      {
//          for(int j = 1;j<=col;j++)
//          {
//              arr[i][j] = mk.nextInt();
//          }
//         
//      }
//      for(int i = 1;i<=row;i++)
//      {
//          for(int j = 1;j<=col;j++)
//          {
//              if(i<=j)
//              {
//                 sum+=arr[i][j]; 
//              }
//          }
//      }
//      System.out.println("the output = "+sum);
    }
    
}
