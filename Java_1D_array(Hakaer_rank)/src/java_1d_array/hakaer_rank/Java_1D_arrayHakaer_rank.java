
package java_1d_array.hakaer_rank;
import java.util.*;
public class Java_1D_arrayHakaer_rank {

 public static boolean canWin(int jumpLength, int[] game,int currentPos,int lastJumpPos) 
 {
 
    boolean didWin=false;

    int range=currentPos;
    while(range<game.length-1 && game[1+range]==0)
    {
        range++;
    }
    if(range==game.length-1)
    {
        return true;
    }

    int lowRange=range;
    while(lowRange>lastJumpPos && game[lowRange-1]==0 && (lowRange+jumpLength)>range+1)
    {
        lowRange--;
    }
    currentPos=lowRange;
    for(int i=currentPos;i<=range;i++)
    {
        if((i+jumpLength)<game.length && game[i+jumpLength]==0 && jumpLength!=0)
        {
            didWin=canWin(jumpLength,game,i+jumpLength,i);
        }
        if(didWin || (i+jumpLength)>=game.length||(i+1)>=game.length)
        {
            didWin=true;
            break;
        }
    }
    return didWin;
 }
 
 
 
 public static void main(String[] args) 
 {
    Scanner mk = new Scanner(System.in);
     System.out.print("Enter the numbre of game = ");
    int q = mk.nextInt();
    for(int i = 1;i<=q;i++)
    {
        System.out.print("Enter the index = ");
        int n = mk.nextInt();
        System.out.print("Enter the leap = ");
        int leap = mk.nextInt();
        System.out.println("Enter the value of game : ");
        int[] game = new int[n+1];
        for (int j = 1; j <= n; j++) 
        {
            game[j] = mk.nextInt();
        }

        System.out.println( (canWin(leap, game,0,0)) ? "YES" : "NO" );
    }
 
 }
}
    

