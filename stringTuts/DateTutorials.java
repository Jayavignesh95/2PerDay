package stringTuts;

import java.util.Calendar;
import java.util.Date;

public class DateTutorials {
   public static void main(String[] args) {
	   Date MyDate=new Date();
	   Date newDate=new Date();
	   newDate.setDate(19);
	   
	   System.out.println(MyDate.toString());
	   System.out.println(MyDate.before(newDate));
	   Calendar newCal=Calendar.getInstance();
	   newCal.add(Calendar.DATE, 12);
	   System.out.println(newCal.getTime());
	   System.out.println(newCal.getTimeZone());
	   
}
	
}
