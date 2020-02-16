
package java_regex.hecker_rank;

import java.util.Scanner;

public class Java_RegexHecker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.println("Remember when you start the program, the you have to close the program statically");
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
                            int flag = 0,check = 0;
                            for(int j = 0;j<Ip.length;j++)
                            {
                               try
                               {
                                   flag = Integer.parseInt(Ip[j]);
                                   if(flag<=255)
                                   {
                                       check = 1;
                                   }else
                                   {
                                       System.out.println("false");
                                       check = 0;
                                       break;
                                   }
                               }catch(Exception e)
                               {
                                   System.out.println("false");
                                   break;
                               }
                            }
                            if(check==1)
                            {
                                System.out.println("true");
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
       
    
    

