
package merge_short;

import java.util.Scanner;

public class Merge_short {
    public static void merge(int arr[], int low, int mid, int high)
    {
       int i = low, j = mid+1, k = 1;
       int temp[] = new int[100];
       while(i<=mid && j<=high)
       {
           if(arr[i]>arr[j])
           {
               temp[k] = arr[i];
               k++;
               i++;
           }
           else
           {
               temp[k] = arr[j];
               k++;
               j++;
           }
       }
       while(i<=mid)
       {
           temp[k] = arr[i];
           k++;
           i++;
       }
       while(j<=high)
       {
           temp[k] = arr[j];
           k++;
           j++;
       }
       for(i = low, k=1;i<=high;i++,k++)
       {
           arr[i]  = temp[k];
       }
       
    }
    public static void dibide(int arr[], int low, int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            dibide(arr,low,mid);
            dibide(arr,mid+1,high);
            merge(arr,low,mid,high);
            
        }
    }
    

    public static void main(String[] args) {
        Scanner mk  = new Scanner(System.in);
        int size,j = 1;
        System.out.print("Enter the size = ");
        size = mk.nextInt();
        int arr[] = new int[size+1];
        int temp[] = new int[size+1];
        int index[] = new int[100];
        System.out.println("Enter the value");
        for(int i=1;i<=size;i++)
        {
            arr[i] = mk.nextInt();
            temp[j] = arr[i];
            j++;
        }

        dibide(arr,1,size);
        
        for(int i = 1;i<=size;i++)
        {
            for(j = 1;j<=size;j++)
            {
                if(arr[i]==temp[j])
                {
                    index[i] = j;                   
                    temp[j] = 0;
                }
            }
        }

        System.out.println("the real outpur");
        for(int i =1;i<=size;i++)
        {
            
            System.out.println(arr[i]+" = index no: "+index[i]);
                    
        }
    }
    
}
