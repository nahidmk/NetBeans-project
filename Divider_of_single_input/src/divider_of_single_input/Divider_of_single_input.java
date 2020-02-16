
package divider_of_single_input;

import java.util.Scanner;

public class Divider_of_single_input {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n;
        System.out.print("give the size = ");
        n = mk.nextInt();
        int arr[] = new int[100];
        for(int i = 1;i<=n;i++)
        {
            arr[i] = mk.nextInt();
        }
        for(int i = 1;i<=n;i++)
        {
            System.out.print(arr[i]+" = ");
            for(int j = 1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    System.out.print(j+", ");
                }
            }
            System.out.println();
        }
    }
    
}
