package stringTuts;

import java.util.Scanner;

public class TimetoMin {
	public static void main(String[] args) {
	    String input = "12:30";
	    String[] time = input.split("\\:");
	    int hour = Integer.parseInt(time[0]);
	    int minutes = Integer.parseInt(time[1]);
	    System.out.println("Your time is: " + hour + ":" + minutes);


	    int finalTime = (minutes + hour * 60);
	    System.out.println("your final time in minutes are :" + finalTime);
	}
}
