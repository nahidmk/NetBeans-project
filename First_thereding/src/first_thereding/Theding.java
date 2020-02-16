
package first_thereding;

public class Theding implements Runnable 
{
    String name = "";
    Thread T;
    private int str = 0;
   private int end  = 0;
   private int result = 0;
    
    public Theding(String name,int str,int end)
    {
        this.name = name;
        this.str = str;
        this.end = end;
        
        T = new Thread(this);
        T.start();
    }
    public void run()
    {
        for(int i = this.str;i<=this.end;i++)
        {
           int count = 0;
            for(int j = 1;j<=i;j++)
            {
                if(i%j==0)
                   count++;               
            }
            if(count==2)
            {              
                this.result++; 
            }
        }     
    }
    public int res()
    {
        return this. result;
    }
}
