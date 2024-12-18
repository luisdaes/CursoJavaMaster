package DateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ExampleLocalDateTime {
  public static void main(String[] args) {

	LocalDateTime now = LocalDateTime.now();
	System.out.println("Time: " + now);

	now = LocalDateTime.of(2024, Month.DECEMBER, 24, 20, 45, 53);
	System.out.println("Time customer: " + now);

	now = LocalDateTime.parse("2024-02-24T20:45:53");
	System.out.println("Current time: " + now);

	int day = now.getDayOfMonth();
	int month = now.getMonthValue();
	int year = now.getYear();
	int hour = now.getHour();
	int minute = now.getMinute();
	int second = now.getSecond();
	System.out.println("Times: " + day + ", " + month + ", " + year + ", " + hour + ", " + minute + ", " + second);

	String format = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	System.out.println("Format time: " + format);

	//Create a format time
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String formated = now.format(formatter);
	System.out.println("Time with format: " + formated);
  }
}
