
package shorting;

import java.util.Scanner;

public class Shorting
{
    public static int sort(int weight[], double price[],double per_unit[], int low, int high)
    {
        int piv_w = weight[high];
        double piv_p = price[high];
        double piv_pe = per_unit[high];
        int w = low-1;
        int p = low-1;
        int per = low-1;
        for(int j = low;j<=high-1;j++)
        {
            if(per_unit[j]>piv_pe)
            {
                per++;
                double temp = per_unit[per];
                per_unit[per] = per_unit[j];
                per_unit[j] = temp;
                
                p++;
                double temp1 = price[p];
                price[p] = price[j];
                price[j] = temp1;
                
                w++;
                int temp2 = weight[w];
                weight[w] = weight[piv_w];
                weight[piv_w] = temp2;
                
            }
                
        }
         
        double temp = per_unit[high];
        per_unit[high] = per_unit[per+1];
        per_unit[per+1] = temp;
        
        double temp1 = price[high];
        price[high] = price[p+1];
        price[p+1] = temp1;
        
        int temp2 = weight[high];
        weight[high] = weight[w+1];
        weight[w+1] = temp2;
        
        return per+1;
        
    }
    public static void divid(int weight[],double price[], double per_unit[], int low, int high)
    {
       if(low<high)
       {
           int pic = sort(weight,price,per_unit,low,high);
           divid(weight,price,per_unit,low,pic-1);
           divid(weight,price,per_unit,pic+1,high);
       }
    }
    public static void main(String []args)
    {
        Scanner mk = new Scanner(System.in);
       int size,wet,count = 0;
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
       divid(weigh,price,per_unit,1,size);
       
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
       
       for(int i = 1;i<=size;i++)
       {
                  for(int j = 1;j<=3;j++)
                  {
                     if(weigh[i]<=wet)
                     {
                         profit += price[i];
                         wet = wet-weigh[i];
                         System.out.println(index[i]+" no. item taken "+weigh[i]+" kg");
                     }else
                     {
                         count++;
                         break;
                     }
                  }
                  if(count!=0)
                  {
                      profit += per_unit[i]*wet;
                      System.out.println(index[i]+" no. item taken "+wet+"kg");
                      wet = 0;
                      break;
                  }
   
       }
       System.out.println("the maximum profit = "+profit);
    }
    
	
}

