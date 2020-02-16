
package generics.hacker_rank;


public class GenericsHacker_rank {
   
    public static <inputType> void p(inputType a[])
    {
        for(int i= 0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
   
    public static void main(String[] args) {
       Integer arr[] = {1,2,3};
       String arr2[] = {"hello","world"};
       p(arr);
       p(arr2);
    }
    
}
