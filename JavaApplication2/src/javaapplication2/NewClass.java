
package javaapplication2;

public class NewClass 
{
    public static void main(String [] args)
    {
        JavaApplication2 mk = new JavaApplication2 ();
        mk.setAbc(10);
        mk.setBcd(30);
        mk.setCef(20);
        int k;
        k=mk.add();
        System.out.println("the value of the sum = "+k);
    }
    
}
