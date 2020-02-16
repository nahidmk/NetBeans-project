
package javaapplication3;

public class JavaApplication3 {
 
    public void mk(int i,int j)
    {
        int m;
        m = i+j;
        System .out.println( "the sum of = "+m);
    }
    public void mk(int i,int j,int k)
    {
        int m = i+j+k;
        System.out.println("the sum of = "+m);
    }
    public static void main(String[] args) {
        JavaApplication3 l = new JavaApplication3();
        l.mk(3, 4);
        l.mk(3, 6, 9);
        
    }
    
}
