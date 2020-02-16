
package link_list;

import java.util.LinkedList;
import java.util.Scanner;
public class Link_list {

    public static void main(String[] args) {
        
        LinkedList<Studen> link = new LinkedList();
        Scanner mk = new Scanner(System.in);
//        for(int i = 1;i<=5;i++)
//        {
//            link.add(mk.nextLine());
//        }

//        link.add("hanid");
//        link.add("jb");
//        link.add(0, "sH");
//        link.add(2,"raju");

       Studen s1 = new Studen(101,"nahid","bsc");
       Studen s2 = new Studen(102,"jb","bsc");
       Studen s3 = new Studen(103,"raju","bsc");
       link.add(s1);
       link.add(s2);
       link.add(s3);
       
       
       for(Studen s: link)
       {
           System.out.println(s.id+" "+s.name+" "+s.classname);
       }
//        System.out.print(link);
//        System.out.print("\nthe value = "+link.get(3));
//        System.out.print(link.size());
//        link.remove(2);
//        link.remove();
//        link.remove();
//        System.out.println(link);
    }
    
}
