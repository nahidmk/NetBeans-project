
package contest_2;

import java.util.Scanner;

public class Contest_2 {
    public static int test(int num)
    {
        int count = 0,sum = 0;
        while(num > 0)
        {
           int rem = num % 2;
            sum = sum + rem;
            num = num / 2;
        }
       return sum; 
    }
 
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n;
        System.out.print("give the number = ");
        n = mk.nextInt();
        int arr[] = new int[n+2];
        int arr1[] = new int[n+1];
        for(int i = 1;i<=n+1;i++)
        {
            arr[i] = mk.nextInt();
        }
        
        for(int i = 1;i<=n;i++)
        {
           arr1[i] = test(arr[i]) ;
        }
        
        for(int i = 1;i<=n-1;i++)
        {
            for(int j = 1;j<=n-i;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    
                        int temp = arr1[j];
                        arr1[j] = arr1[j+1];
                        arr1[j+1] = temp;
                    
                        int temp1 = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp1;
                }
                if(arr1[j]==arr1[j+1])
                    {
                        if(arr[j]<arr[j+1])
                        {
                            int temp = arr1[j];
                            arr1[j] = arr1[j+1];
                            arr1[j+1] = temp;
                            
                            int temp1 = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp1;
                        }   
                    }  
            }
        }
        for(int i = 1;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
