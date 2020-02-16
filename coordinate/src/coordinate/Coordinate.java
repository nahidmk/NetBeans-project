
package coordinate;

import java.util.Scanner;

public class Coordinate {

    public void chack(int x, int y)
    {
        if(x==0&&y==0)
           System.out.println("main point");
        else if((x==0&&y>0)||(x==0&&y<0))
            System.out.println("y-axis");
        else if((y==0&&x>0)||(y==0&&x<0))
            System.out.println("x-axis");
        else if(x>0&&y<0)
            System.out.println("q4");
        else if(x>0&&y>0)
            System.out.println("q1");
        else if(x<0&&y<0)
            System.out.println("q3");
        else if(x<0&&y>0)
            System.out.println("q2");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Coordinate mk = new Coordinate();
        int x,y;
        Scanner ms = new Scanner(System.in);
         x = ms.nextInt();
         y=ms.nextInt();
         mk.chack(x, y);
    }
    
}
