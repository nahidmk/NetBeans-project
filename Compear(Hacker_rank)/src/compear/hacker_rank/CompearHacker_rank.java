
package compear.hacker_rank;

import java.util.Arrays;
import java.util.Scanner;

public class CompearHacker_rank {

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int n;
        n = mk.nextInt();
        String name[] = new String [n+1];
        int score[] = new int[n+1];
        for(int i = 1;i<=n;i++)
        {
            name[i] = mk.next();
            score[i] = mk.nextInt();
        }
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n-1;j++ )
            {
                if(score[j]<score[j+1])
                {
                    int temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                    
                    String temp1 = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp1;
                }
                else if(score[j]==score[j+1])
                {
                    if(name[j].compareTo(name[j+1])>0)
                    {
                        String temp1 = name[j];
                        name[j] = name[j+1];
                        name[j+1] = temp1;
                        
                        int temp = score[j];
                        score[j] = score[j+1];
                        score[j+1] = temp;
                    }
                }
            }
        }
        for(int i = 1;i<=n;i++)
        {
            System.out.println(name[i]+" "+score[i]);
        }
        
    }
    
}
