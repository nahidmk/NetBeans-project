
package javaapplication9;

public class NewClass extends JavaApplication9
{
      String main = "physics";
      public static void main(String []args)
      {
          NewClass mk = new NewClass();
          System.out.println(mk.collegeName);
          System.out.println(mk.designation);
          System.out.println(mk.main);
          mk.does();
      }
}
