
package javaapplication2;


public class JavaApplication2 
{
    private int abc;
    private int bcd;
    private int cef;

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    public int getBcd() {
        return bcd;
    }

    public void setBcd(int bcd) {
        this.bcd = bcd;
    }

    public int getCef() {
        return cef;
    }

    public void setCef(int cef) {
        this.cef = cef;
    }
    public JavaApplication2()
    {
        
    }

   public int add()
   {
      int s;
      s=abc+bcd+cef;
      return s;
      
   }
    
    
}
