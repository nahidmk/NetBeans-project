
package calculate_year_from_day;

import java.util.Scanner;

public class Calculate_Year_from_day {
    public static int converter(int arr[],int n)
    {
        int temp[] = new int[100];
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
//            System.out.print( day+" "+month+" "+year+" <--the previous position = "+index[i]);
//            System.out.println();
        }
        
    }

    public static void main(String[] args) {
      int n;
      Scanner mk = new Scanner(System.in);
      n = mk.nextInt();
      int arr[] = new int[100];
      int temp[] = new int[100];
      
      for(int i = 1 ;i<=n;i++)
      {
          arr[i] = mk.nextInt();
      }
      temp = converter(arr,n);
    }
    
}
