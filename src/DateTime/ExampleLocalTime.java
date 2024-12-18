package DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExampleLocalTime {

  public static void main(String[] args) {

	LocalTime time = LocalTime.now();
	System.out.println(time);
	System.out.println("Hour: " + time.getHour()); //20
	System.out.println("Minute: " + time.getMinute()); //06
	System.out.println("Seconds: " + time.getSecond()); //08

	LocalTime customTime = LocalTime.of(6, 30, 59);
	System.out.println("Custom time: " + customTime);
	customTime = LocalTime.parse("06:30:59");
	System.out.println("Custom time: " + customTime);


	DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");
	System.out.println(df.format(time));

  }
}
