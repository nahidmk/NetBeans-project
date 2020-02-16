
package string_sort;

import java.util.Scanner;

public class String_sort {

    public static void main(String[] args) {
        int a;
        Scanner mk = new Scanner(System.in);
        a = mk.nextInt();
        String b[] = new String[a];
        String temp = "";
        for(int i= 0; i<a;i++)
        {
            b[i] = mk.nextLine();
        }
        for(int i = 0;i<a;i++)
        {
            for(int j = 0;j<a-1;j++)
            {
                if(b[j].compareTo(b[j+1])>0);
                
                {
                    temp = b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
                
            }
        }
        System.out.println("output");
        for(int i = 0;i<a;i++)
        {
            System.out.println(b[i]);
        }
    }
    
}
