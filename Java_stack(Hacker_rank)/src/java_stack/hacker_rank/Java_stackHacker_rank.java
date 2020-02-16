
package java_stack.hacker_rank;

import java.util.Scanner;

public class Java_stackHacker_rank {
    
    static boolean chack(String input)
{
   String a1 = "(",b1 = "{",c1 = "[",a2 = ")",b2 = "}",c2 = "]";
   int first1 = 0,second1 = 0,third1 = 0,first2 = 0,second2 = 0,third2 = 0;
   String arr[] = input.split("");
   int size = arr.length;
    if(a2.equals(arr[0])||b2.equals(arr[0])||c2.equals(arr[0])||a1.equals(arr[size-1])||b1.equals(arr[size-1])||c1.equals(arr[size-1]))
   {
      return false; 
   }
   else{
       for(int i = 0;i<=size-1;i++)
       {
           if(arr[i].equals(a1))
           {
              first1++; 
           }
           else if(arr[i].equals(b1))
           {
               second1++;
           }
           else if(arr[i].equals(c1))
           {
               third1++;
           }
           else if(arr[i].equals(a2))
           {
               first2++;
           }
           else if(arr[i].equals(b2))
           {
               second2++;
           }
           else if(arr[i].equals(c2))
           {
               third2++;
           }
       }
       if(first1==first2 && second1==second2 && third1==third2)
           {
               return true;
           }else
               return false;
   }
}
    public static void main(String[] args) {
        boolean input ;
        Scanner mk = new Scanner(System.in);
        while(mk.hasNext())
        {
           input = chack(mk.nextLine());
           if(input==true)
           {
                System.out.println("true");
           }
           else{
                System.out.println("false");
           }
        }
    }
    
}
