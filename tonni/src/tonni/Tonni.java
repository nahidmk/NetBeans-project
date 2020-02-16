
package tonni;

import java.util.Scanner;


public class Tonni {
    public static int sort(int year[], int month[], int low, int high)
    {
        int piv_y = year[high];
        int piv_m = month[high];
        int y = low-1;
        int m = low-1;
        for(int j = low;j<=high-1;j++)
        {
            if(year[j]<piv_y)
            {
                
                
                    y++;
                    int temp = year[j];
                    year[j] = year[y];
                    year[y] = temp;
                    
                    m++;
                    int temp1 = month[j];
                    month[j] = month[m];
                    month[m] = temp1;
                
            }
            if(year[j]==piv_y)
            {
                if(month[high]<piv_m)
                {
                    m++;
                    int temp1 = month[j];
                    month[j] = month[m];
                    month[m] = temp1;
                    
                    y++;
                    int temp = year[j];
                    year[j] = year[y];
                    year[y] = temp;
                }
            }
        }
         
        int temp = year[high];
        year[high] = year[y+1];
        year[y+1] = temp;
        
        int temp1 = month[high];
        month[high] = month[m+1];
        month[m+1] = temp1;
        
        return y+1;
        
    }
    public static void divid(int year[],int month[], int low, int high)
    {
       if(low<high)
       {
           int pic = sort(year,month,low,high);
           divid(year,month,low,pic-1);
           divid(year,month,pic+1,high);
       }
    }

    
    public static void main(String[] args) {
       Scanner mk = new Scanner(System.in);
       int size;
       System.out.print("Enter the object = ");
       size = mk.nextInt();
       int year[] = new int[size+1];
       int month[] = new int[size+1];
       System.out.println("Enter  the year : ");
       for(int i = 1;i<=size;i++)
       {
           year[i] = mk.nextInt();
       }
       System.out.println("Enter the month : ");
       for(int i = 1;i<=size;i++)
       {
          month[i] = mk.nextInt();
       }
       divid(year,month,1,size);
       
       System.out.println("the year : ");
       {
           for(int i = 1;i<=size;i++)
           {
               System.out.print(year[i]+" ");
           }
       }
       System.out.println("\nthe  month : ");
       {
           for(int i = 1;i<=size;i++)
           {
               System.out.print(month[i]+" ");
           }
       }
       System.out.println();
       String s;
       s = mk.nextLine();
       int n = s.length();
       
    }
    
}
