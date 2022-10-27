package datentime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DatennTimeApp {

	public static void main(String[] args) {
		 LocalDate date= LocalDate.now();
		 
		 System.out.println("the  Date is  "+ date);
		 
		 // Dates
		 System.out.println(date.minusDays(1));
		 System.out.println(date.plusDays(1));
		 System.out.println(date.getDayOfWeek());
		 System.out.println(date.getDayOfMonth());
		 System.out.println(date.getDayOfYear());
		 System.out.println(date.lengthOfYear());
		 System.out.println(date.lengthOfMonth());
		 System.out.println(date.isLeapYear());
		 
		 LocalDate date2= LocalDate.of(2022,10,27);
		 System.out.println("the  Date is  "+ date2);
		 
		 //Time
		 LocalTime currTime= LocalTime.now();
		 System.out.println(currTime);

	}

}
