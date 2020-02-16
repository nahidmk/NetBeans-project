
package sum_of;

import java.util.Scanner;

public class Sum_of {

    public static void main(String[] args) {
       int row,col,i,j,sum=0,sum2=0;
       
       Scanner mk  = new Scanner(System.in);
       System.out.print("for row = ");
       row = mk.nextInt();
       System.out.print("for col = ");
       col = mk.nextInt();
       System.out.println("for array...");
       int a[][] = new int[row][col];
       for(i = 0;i<row;i++)
       {
           for(j=0;j<col;j++)
           {
               a[i][j]= mk.nextInt();
           }
       }

       for(i = 0;i<row;i++)
       {
           for(j=0;j<col;j++)
           {
               if(i==j)
               {
                   sum+=a[i][j];
               }
           }
       }
       System.out.println("the sum of = "+sum);
       for(i=0,j=col;i<row&j>0;i++,j--)
       {
          sum2+= a[i][j];
       }
       System.out.println("the sum of = "+sum2);
    }
    
}
