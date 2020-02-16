
package string_token.hacker_rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class String_tokenHacker_rank {


    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        String s;
        s = mk.nextLine();
        if(s.length()!=0){
        String []str = s.trim().split("[, ?.@'!;]+");
            System.out.println("hello = "+str.length);
        ArrayList<String>list = new ArrayList(Arrays.asList(str));
        System.out.println(list.size());
        for(String i : list)
        {
            System.out.println(i);
        }}
        else
            System.out.println(0);

    }
    
}
