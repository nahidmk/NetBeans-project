
package quick_sort;

import java.util.Scanner;

public class Quick_sort {
    public static int  sort(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<=high-1;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    
    public static void divid(int arr[],int low, int high)
    {
        if(low<high)
        {
            int pivot = sort(arr,low,high);
            divid(arr,low,pivot-1);
            divid(arr,pivot+1,high);
        }
    }
    
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int size;
        System.out.print("give the size of array = ");
        size = mk.nextInt();
        int arr[] = new int[size+1];
        System.out.println("give the input : ");
        for(int i = 1;i<=size;i++)
        {
            arr[i] = mk.nextInt();
        }
        divid(arr,1,size);
        System.out.println("out put : ");
        for(int i = 1;i<=size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
