
package first_thereding;

public class First_thereding 
{

    
    public static void main(String[] args) {
        int r = 0,p = 0,q = 0;
        Theding os = new Theding("first = ",1,20);
       Theding ot = new Theding("second = ",21,40);
       Theding op = new Theding("Thard = ",41,50);

       System.out.println("the total value");
         int re = os.res()+ot.res()+op.res();
         System.out.println("total = " +re );
       try{
           Thread.sleep(50);
       }
       catch(Exception e)
       {
           
       }
     
       System.out.println("exit");

    }
    
}
