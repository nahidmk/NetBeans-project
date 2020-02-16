
package binary_search;

import java.util.Scanner;

public class Binary_search {
    public static int  binary(int arr[],int low,int high,int need)
    {
        if(low>high)
        {
            return 0;
        }
        //int mid = (low+high)/2;
        int mid = low+(((high-low)/(arr[high]-arr[low]))*(need-arr[low]));
        if(arr[mid]<need)
        {
           return binary(arr,mid+1,high,need);
        }
        else if(arr[mid]>need)
        {
           return binary(arr,low,mid-1,need);
        }
        else
            return 1;
    }

    public static void main(String[] args) {
       int size,need;
       Scanner mk = new Scanner(System.in);
       System.out.print("give the size = ");
       size = mk.nextInt();
       int arr[]  = new int[100];
       System.out.println("give the array : ");
       for(int i =1;i<=size;i++)
       {
           arr[i] = mk.nextInt();
       }
       System.out.print("give the needed element = ");
       need = mk.nextInt();
       int re =  binary(arr,1,size,need);
       if(re==0)
       {
           System.out.println("not found");
       }else
       {
           System.out.println("yes");
       }
       
    }
    
}
