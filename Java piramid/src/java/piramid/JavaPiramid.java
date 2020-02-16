
package java.piramid;

import java.util.Scanner;

public class JavaPiramid
{
    private int row=0;
     private int col=0;
    public String[][] Getarray (String x[][])
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                x[i][j]=" ";
            }
        }
        return x;
    }
    public String[][] work(String x[][])
    {
        for(int i=0;i<row;i++)
        {
            for(int j=col/2-i;j<col/2+i;j++)
            {
                x[i][j]="X";
            }
        }
        return x;
    }
    public void print(String x[][])
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(x[i][j]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
       
       int row,col,line;
       
       System.out.print("enter the row of array = ");
       Scanner ms =new Scanner(System.in);
       line=ms.nextInt();
       row=line;
       col=line*2-1;
       JavaPiramid mk = new JavaPiramid();
       mk.row=row;
       mk.col=col;
       String a[][]=new String[mk.row][mk.col];
       
               
       a=mk.Getarray(a);
               
       a=mk.work(a);
       mk.print(a);
       
    }
    
}
