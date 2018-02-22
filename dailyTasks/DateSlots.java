package dailyTasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
class DateSlots
{
    public static void main(String[] args)
    {	
    	
    	String dateString3 = "14.30"; 
    	SimpleDateFormat sdf = new SimpleDateFormat("HH.mm");
    	try{
    	Date date3 = sdf.parse(dateString3);
    	SimpleDateFormat sdf2 = new SimpleDateFormat("hh.mm aa");
    	System.out.println("Given time in AM/PM: "+sdf2.format(date3));
    	}catch(ParseException e){
    		e.printStackTrace();
    	}
    	
    	String dateString4 = "21/12/2016 21.20"; 
    	SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH.mm");
    	try{
    	Date date4 = sdf3.parse(dateString4);
    	SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
    	System.out.println("Given date and time in AM/PM: "+sdf4.format(date4));
    	}catch(ParseException e){
    		e.printStackTrace();
    	}
    }
}