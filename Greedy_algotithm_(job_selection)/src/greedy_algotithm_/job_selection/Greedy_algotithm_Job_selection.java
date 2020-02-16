
package greedy_algotithm_.job_selection;

import java.util.Scanner;

public class Greedy_algotithm_Job_selection {
    public static void sort(int arr[],int low,int mid, int high)
    {
        int i = low, j = mid+1,k=1;
        int temp[] = new int[100];
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
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
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(i=low,k=1;i<=high;i++,k++)
        {
            arr[i] = temp[k];
        }
    }
    
    public static void merge(int arr[],int low, int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            merge(arr,low,mid);
            merge(arr,mid+1,high);
            sort(arr,low,mid,high);
        }
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int size;
        System.out.print("give the size of object = ");
        size = mk.nextInt();
        int price[] = new int[100];
        int dadline[] = new int[100];
        String job_name[] = new String[100];
        System.out.println("give the job name : ");
        for(int i = 1;i<=size;i++)
        {
            job_name[i] = mk.nextLine();
        }
        System.out.println("give the price : ");
        for(int i = 1;i<=size;i++)
        {
            price[i] = mk.nextInt();
        }
        System.out.println("give the dadline : ");
        for(int i = 1;i<=size;i++)
        {
          dadline[i] = mk.nextInt();
        }
        merge(dadline,1,size);
        
    }
    
}
