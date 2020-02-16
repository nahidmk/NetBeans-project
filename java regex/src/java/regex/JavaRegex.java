
package java.regex;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
       while(mk.hasNext())
       {
           String ip = mk.nextLine();
           char IP[] = ip.toCharArray();
           int counter = 0;
           if(IP[0]!='.'&& IP[IP.length-1]!='.')
           {
               for(int i = 0;i<IP.length;i++)
               {
                   if(IP[i]=='.')
                   {
                       counter++;
                   }
               }
               if(counter==3)
               {
                  String Ip[] = ip.trim().split("[.]");
                  
                     if(Ip.length==4)
                        {
                            int flag = 0;
                            for(int j = 0;j<Ip.length;j++)
                            {
                               try
                               {
                                   flag = Integer.parseInt(Ip[j]);
                                   if(flag<=255)
                                   {
                                       System.out.println("true");
                                   }else
                                   {
                                       System.out.println("false");
                                       break;
                                   }
                               }catch(Exception e)
                               {
                                   System.out.println(" heloo false");
                                   break;
                               }
                            }
                        }
                        else
                          {
                             System.out.println("false");
                          }
               }else
               {
                   System.out.println("false");
               }
           }else
           {
               System.out.println("false");
          }
      }
    }
    
}
