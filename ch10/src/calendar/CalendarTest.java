package calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int thisYear = cal.get(Calendar.YEAR);

		System.out.println(thisYear);
	}

}
