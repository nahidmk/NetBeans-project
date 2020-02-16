package dynamic_merge_short;

import java.util.Scanner;

public class Dynamic_merge_short {
    public static void merge(int arr[], int low, int mid, int high)
    {
        int i = low, j = mid+1, k=1;
        int temp[] = new int[100];
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;
                k++;
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
        for(i=low,k=1;i<=high;i++,k++)
        {
            arr[i] = temp[k];
        }
    }
    public static void divide(int arr[],int low, int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            divide(arr,low,mid);
            divide(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n;
        System.out.print("Give the size = ");
        n = mk.nextInt();
        int temp[][] = new int[100][100];
        int arr[] = new int[100];
        int copy_arr[] = new int[100];
        int index[] = new int[100];
        int help,sum;
        System.out.println("give the input : ");
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=3;j++)
            {
                help = 0;
                if(j==2){
                   help = mk.nextInt();
                   temp[i][j] = help*30;
                }
                else if(j==3)
                {
                    help = mk.nextInt();
                    temp[i][j] = help*365;
                }
                else
                temp[i][j] = mk.nextInt();
                
            }
        }
       for(int i = 1;i<=n;i++)
       {
            sum = 0;
           for(int j = 1;j<=3;j++)
           {
               arr[i] += temp[i][j];
               copy_arr[i] = arr[i];
           }      
       }
       
        divide(arr,1,n);
        
        System.out.println("the output");
       for(int i= 1;i<=n;i++)
        {
            int year = 0,mod = 0,day = 0,month = 0;
            if(arr[i]>365)
            {
                 year = arr[i]/365;
                 mod = arr[i]%365;
                if(mod>30)
                {
                    month = mod/30;
                    day = mod%30;
                }else
                {
                    day = mod;
                }
            }else
            {
                 month = arr[i]/30;
                 day = arr[i]%30;
            }
            for(int j = 1;j<=n;j++)
            {
                 if(arr[i]==copy_arr[j])
                {
                    index[i] = j;
                    System.out.print( day+" "+month+" "+year+" <--the previous position = "+index[i]);
                    copy_arr[j] = 0; 
                    System.out.println();
                }
            }        
        }
    }  
}
