
package quick_sort.type_2;

import java.util.Scanner;

public class Quick_sortType_2 {
    public static int sort(int arr[],int low,int high)
    {
        int pivot = arr[low];
        int start = high+1;
        for(int j = high;j>low;j--)
        {
            if(arr[j]>=pivot)
            {
                start--;
                int temp = arr[start];
                arr[start] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[start-1];
        arr[start-1] = arr[low];
        arr[low] = temp;
        return start-1;
    }
    
    public static void quick(int arr[], int low,int high)
    {
      if(low<high)
      {
          int pivot = sort(arr,low,high);
          quick(arr,low,pivot-1);
          quick(arr,pivot+1,high);
      }
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int size;
        System.out.print("give the size = ");
        size = mk.nextInt();
        int arr[] = new int[size+1];
        System.out.print("give the array : ");
        for(int i = 1;i<=size;i++)
        {
            arr[i] = mk.nextInt();
        }
        quick(arr,1,size);
        
        System.out.println("the sorted value : ");
        for(int i = 1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
