
package finding_current_date_and_time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Finding_current_date_and_time {

    public static void main(String[] args) {
       GregorianCalendar mk = new GregorianCalendar();
       int day,month,year;
       int second,minute,hour;
       day = mk.get(Calendar.DAY_OF_MONTH);
       month = mk.get(Calendar.MONDAY);
       year = mk.get(Calendar.YEAR);
       
       second = mk.get(Calendar.SECOND);
       minute = mk.get(Calendar.MINUTE);
       hour = mk.get(Calendar.HOUR);
        System.out.println(day+"/"+month+"/"+year);
        System.out.println(hour+":"+minute+":"+second);
    }
    
}
