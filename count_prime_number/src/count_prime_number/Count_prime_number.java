
package count_prime_number;

public class Count_prime_number {

    
    public static void main(String[] args) {
      
       
        int re= 0;
        for(int i= 1;i<=100;i++)
        {
          int  count  = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
               
            }
             if(count == 2)
             {
                System.out.println(i);
                 re++;
             }
            
        }
        System.out.println(re);

    }
    
}
