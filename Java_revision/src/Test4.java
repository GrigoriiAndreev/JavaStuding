// Working with calendar

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test4 {

    public static void main(String[] args) {

        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
//        System.out.println(date1.getHours());
//        System.out.println(date1.getMinutes());
//        System.out.println(date2.getSeconds());
        System.out.println(date3);

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MILLISECOND));



    }

}
