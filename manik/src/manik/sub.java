
package manik;

public class sub
{
   
    public int mk(int a1,int b1)
    {
        int a;
        a=a1+b1;
        return a;
    }
    public int mk(int a,int b,int c)
    {
        int sum;
        sum=a-b-c;
        return sum;
    }
     public void sumi ()
    {
        int i,a=3,c;
        try
        {
            for(i=0;i<10;i++)
            {
              c=a/i;
              System.out.print(c);
            }
        }
        catch(Exception ex)
                {
                    System.out.println("hall....");
                }
        System.out.print("complete.....");
    }
    
      public static void main(String []args)
    {
        sub ms = new sub();
        add mk = new add();
       int c,k=3,ass;
       c=mk.m1();
       System.out.println("the result = "+c);
      ass=ms.mk(c,k);
      System.out.println("the onether valu = "+ass);
     ms.sumi();
       
    }
   
}
