
package java_sort.hacker_rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class student
{
   private int id;
   private String name;
   private double cgpa;
    student(int id, String name, double cgpa)
    {
         this.id = id;
         this.name = name;
         this.cgpa = cgpa;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public double getcgpa()
    {
        return cgpa;
    }
}

//class sortbyID implements Comparator <student>
//{
//    @Override
//    public int compare(student a, student b)
//    {
//        return a.id - b.id;
//    }
//}
//
//class sortbyName implements Comparator <student>
//{
//    @Override
//    public int compare(student a, student b)
//    {
//        return a.name.compareTo(b.name);
//    }
//}
//class sortbyCgpa implements Comparator <student>
//{
//    @Override
//    public int compare(student a, student b)
//    {
//        if(a.getcgpa()>b.getcgpa())
//        {
//            return -1;
//        }else if(a.getcgpa>b.getcgpa)
//        {
//            return 1;
//        }else
//        {
//            if(a.getname.compareTo(b.getname)>0)
//            {
//                return 1;
//            }else if(a.name.compareTo(b.name)<0)
//            {
//                return -1;
//            }else
//            {
//                if(a.id>b.id)
//                {
//                    return 1;
//                }else
//                    return -1;
//            }
//        }
//    }
//}



public class Java_sortHacker_rank {

    public static void main(String[] args) {
       Scanner mk = new Scanner(System.in);
       
       int n;
       n = Integer.parseInt(mk.nextLine());
       ArrayList <student> list = new ArrayList<>();
       for(int i = 1;i<=n;i++)
       {
           int id = mk.nextInt();
           String name = mk.next();
           double cgpa = mk.nextFloat();
           
           student st = new student(id,name,cgpa);
           list.add(st);
           
            
       }
       Collections.sort(list, new Comparator<student>() {
              @Override
               public int compare(student a, student b) {
                    if(b.getcgpa()>a.getcgpa()){
                        return 1;
                    }else if(b.getcgpa()<a.getcgpa()){
                        return -1;
                    }
                    return a.getname().compareTo(b.getname());
                }
       });
       
       for(student st :list)
       {
           System.out.println(st.getname());
       }
    }
    
}
