
package selection_short;

import java.util.Scanner;

public class Selection_short {

    public static void main(String[] args) {
//        int a;
        Scanner mk = new Scanner(System.in);
//        a = mk.nextInt();
//        String temp;
//        String b[] = new String[a];
//        for(int i = 0;i<a;i++)
//        {
//            b[i] = mk.nextLine();
//        }
//        for(int i = 0;i<a;i++)
//        {
//            int po = i;
//            for(int j = i+1;j<a;j++)
//            {
//                if(b[po].compareTo(b[j])>0)
//                {
//                    po=j;
//                    
//                }
//                if(po!=i)
//                    {
//                       temp = b[po];
//                       b[po]=b[i];
//                       b[i] = temp;
//                    }
//                
//            }
//        }
//        for(int i = 0;i<a;i++)
//        {
//            System.out.println(b[i]);
//        }
            int size, temp;
            System.out.print("give the size = ");
            size = mk.nextInt();
            int arr[] = new int[size];
            
            for(int i = 0;i<size;i++)
            {
                System.out.print("give the value "+i+" = ");
                arr[i] = mk.nextInt();
            }
            for(int i = 0;i<size;i++)
            {
                int po = i;
                for(int j =i+1;j<size;j++)
                {
                    if(arr[po]>arr[j])
                    {
                        po = j;
                    }
                    if(po!=i)
                    {
                        temp = arr[po];
                        arr[po] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            System.out.println("the output is ");
            for(int i = 0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
    }
    
}
