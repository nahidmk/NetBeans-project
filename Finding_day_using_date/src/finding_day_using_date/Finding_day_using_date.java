
package finding_day_using_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Finding_day_using_date {
    public static String findday(int day, int month, int year)
    {

        String dateString = String.format("%d-%d-%d", day, month, year);
                Date date = null;
                try {
                     date = new SimpleDateFormat("d-M-yyyy").parse(dateString);
                }
                catch(ParseException ref){
                } 
                String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
                
                return dayOfWeek.toUpperCase();
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int day, month, year;
        System.out.print("Enter the day = ");
        day = mk.nextInt();
        System.out.print("Enter the month = ");
        month = mk.nextInt();
        System.out.print("Enter the year = ");
        year = mk.nextInt();
        String fday = findday(day,month,year);
        System.out.println(fday);
    }
    
}
