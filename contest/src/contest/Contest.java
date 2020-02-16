
package contest;

import java.util.Scanner;

public class Contest {
   
    public static void main(String args[])
    {
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter your massage = ");
        String massage;
        massage = mk.nextLine();
        System.out.println("Enter your encription value = ");
        int d;
        d = mk.nextInt();
        int size = massage.length();
        int arr[] = new int[1000];
        char copy[] = massage.toCharArray();
        for(int i = 0;i<size;i++)
        {
            if(copy[i]==' ')
            {
                arr[i] = 32;
            }
            else if(copy[i]=='!')
            {
                arr[i] = 33;
            }
           else if(copy[i]=='"')
            {
                arr[i] = 34;
            }
           else if(copy[i]==',')
            {
                arr[i] = 44;
            }
           else if(copy[i]=='.')
            {
                arr[i] = 46;
            }
           else if(copy[i]!=' ')
            {
                arr[i] = (int)copy[i];
            }
        }
        for(int i= 0;i<size;i++)
        {
            int value = 0,a = 0;
            if(arr[i]!=32 && arr[i]!=33 && arr[i]!=34 && arr[i]!=44 && arr[i]!=46  )
            {
                value = arr[i] ;
                arr[i] +=d;               
                a = 90-arr[i];
                if(a<0 && value<=90)
                {
                    arr[i] = 65-(a);
                }
                else if(a<0&& value<=120)
                {
                    arr[i] = 97 -(a);
                }
                //89 121
                //if(arr[i]<)
            }
        }
        for(int i = 0;i<size;i++)
        {
            copy[i] = (char) arr[i];
        }
        String mass = String.copyValueOf(copy);
        System.out.println(mass);
    }  
}
