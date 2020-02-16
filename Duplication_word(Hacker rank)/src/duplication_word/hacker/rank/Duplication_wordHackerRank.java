
package duplication_word.hacker.rank;

import java.util.Scanner;

public class Duplication_wordHackerRank {

    public static void main(String[] args) {
       Scanner mk = new Scanner(System.in);
        String nu;
       int n = Integer.parseInt(mk.nextLine());
       for(int p = 0;p<n;p++)
       {
           String te = mk.nextLine();
          String str[] = te.trim().split("[ ]");
          
          String temp[] = new String[str.length];
          int l = 0;
          for(int i = 0;i<str.length;i++)
          {
              int count = 0;
              for(int j = 0;j<str.length;j++)
              {
                  if(str[i].equals(temp[j]))
                  {
                      count++;
                      break;
                  }
              }
              if(count==0)
              {
                  
                  temp[l] = str[i];
                  l++;
              }
          }
          for(int i = 0;i<l;i++)
          {
              System.out.print(temp[i]+" ");
          }
           System.out.println("");
       }
    }
    
}
