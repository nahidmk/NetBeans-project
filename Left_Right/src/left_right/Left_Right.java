
package left_right;

import java.util.Scanner;

public class Left_Right {
//    
//    static int issort(int b[], int a)
//    {
//       staticif(a==0||a==1)
//       {
//           return 1;
//       }
//       else if(b[a-1]<b[a-2])
//       {
//           return 0;
//       }
//       else
//           return issort(b,a-1);
//           
//    }

    public static void main(String[] args) {
        
    
//        int a;
//        Scanner mk  = new Scanner(System.in);
//        System.out.println("give the array size");
//        a = mk.nextInt();
//        int temp = 0;
//        int b[] = new int[a];
//        System.out.println("give the values of array");
//        for(int i = 0;i<a;i++)
//        {
//            b[i] = mk.nextInt();
//        }
//        if(issort(b,a)!=0)
//        {
//            System.out.println("done");
//        }
//        else
//            System.out.println("not");
      
        String a;
        Scanner mk = new Scanner(System.in);
        a = mk.nextLine();
        char b[]= a.toCharArray();
        if(!(b[0]=='l'||b[0]=='L')){
            if(!(b[a.length()-1]=='R'||b[a.length()-1]=='r')){
        for(int i = 0;i<a.length();i++)
        {
            if(b[i]=='r'||b[i]=='R')
            {
                b[i]=b[i+1];
            }
            else if(b[i]=='L'||b[i]=='l')
            {
                b[i]=b[i-1];
            }
            else if(b[i]=='R'&&b[i+1]=='L')
            {
                
            }
        }
            String str = String.copyValueOf(b);
        
            System.out.println(str);
        
        
            }else
                System.out.println("'R' can not come last...");
        }else
            System.out.println("sorry...'L' is not come first ");
    }
    
}
