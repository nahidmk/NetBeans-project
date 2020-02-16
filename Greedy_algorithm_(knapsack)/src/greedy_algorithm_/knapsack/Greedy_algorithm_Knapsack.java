
package greedy_algorithm_.knapsack;

import java.util.Scanner;

public class Greedy_algorithm_Knapsack {
    
    public static void sort(double arr[],int low,int mid,int high)
    {
        int i = low,j=mid+1,k=1;
        double temp[] = new double[100];
        while(i<=mid&&j<=high)
        {
            if(arr[i]>arr[j])
            {
                temp[k] = arr[i];
                k++;
                i++;
            }else
            {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for( i = low,k=1;i<=high;i++,k++)
        {
           arr[i] = temp[k]; 
        }
    }
    
    
    public static void mearge( double arr[],int low,int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            mearge(arr,low,mid);
            mearge(arr,mid+1,high);
            sort(arr,low,mid,high);
        }
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
       int size,wet;
       double profit = 0;
       System.out.print("give the object size = ");
       size = mk.nextInt();
       int weigh[] = new int[100];
       double price[] = new double[100];
       double per_unit[] = new double[100];
       double temp[] = new double [100];
       int index[] = new int[100];
       System.out.println("give the weight : ");
       for(int i = 1;i<=size;i++)
       {
           weigh[i] = mk.nextInt();
       }
       System.out.println("give the price : ");
       for(int i = 1;i<=size;i++)
       {
           price[i] = mk.nextInt();
       }
       System.out.print("give the constant wetgh = ");
       wet = mk.nextInt();
       for(int i = 1;i<=size;i++)
       {
           per_unit[i] = price[i]/weigh[i];
          temp[i] = per_unit[i];
       }
//       for(int i =1;i<=size;i++)
//       {
//           System.out.print(temp[i]+" ");
//       }
       System.out.println();
       System.out.println("per unit");
       for(int i = 1;i<=size;i++)
       {
           System.out.print(per_unit[i]+" ");
       }
//       
         mearge(per_unit,1,size);
//       System.out.println();
//       System.out.println("merge sort");
//       for(int i =1;i<=size;i++)
//       {
//          System.out.print(per_unit[i]+" ");
//          System.out.println();
//       }
//       
       for(int i = 1;i<=size;i++)
       {
           for(int j = 1;j<=size;j++)
           {
               if(temp[i] == per_unit[j] )
               {
                   index[i] = j;
                   temp[i] = 0;
               }
           }
           
       }
//       for(int i =1;i<=size;i++)
//       {
//          System.out.print(index[i]+" ");
//       }
       int count = 0;
       for(int i = 1;i<=size;i++)
       {
           for(int j= 1;j<=size;j++)
           {
               if(index[i]==j)
               {
                   if(weigh[j]<=wet)
                    {
                        wet = wet-weigh[j];
                        profit = profit+price[j];
                    }else
                    {
                        profit = profit+wet*per_unit[i];
                        wet = 0;
                        count++;
                    }
               }
               if(count!=0)
               {
                   break;
               }
           }
          if(count!=0)
               {
                   break;
               } 
       }
       System.out.print("the best profit = "+profit);
       System.out.println();
    }
    
}
