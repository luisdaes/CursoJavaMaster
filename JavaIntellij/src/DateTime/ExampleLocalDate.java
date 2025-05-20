package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class ExampleLocalDate {
  public static void main(String[] args) {

	LocalDate currentDate = LocalDate.now();
	System.out.println("Current date: " + currentDate );

	currentDate = LocalDate.of(2024, 12, 16);
	System.out.println(currentDate);

	currentDate = LocalDate.of(2024, Month.DECEMBER, 23);
	System.out.println(currentDate);

	currentDate = LocalDate.parse("2024-12-25");
	System.out.println(currentDate);

	LocalDate addDaysCurrentDate = LocalDate.now().plusDays(2);
	System.out.println(addDaysCurrentDate);

	LocalDate susMouthCurrentDate = LocalDate.now().minus(2, ChronoUnit.MONTHS);
	System.out.println(susMouthCurrentDate);

	DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
	System.out.println(dayOfWeek); //Wednesday

	DayOfWeek dayOfWeek2 = LocalDate.parse("1997-07-11").getDayOfWeek();
	System.out.println(dayOfWeek2); // Friday

	DayOfWeek dayOfWeek3 = LocalDate.parse("2024-11-22").getDayOfWeek();
	System.out.println(dayOfWeek3); //Friday

	boolean isLeapYear = currentDate.isLeapYear();
	System.out.println(isLeapYear);

	currentDate = LocalDate.now();
	System.out.println(currentDate.getDayOfWeek());
	System.out.println(currentDate.getDayOfMonth());
	System.out.println(currentDate.getMonth());
	System.out.println(currentDate.getMonthValue());
	DayOfWeek dayOfWeek1 = currentDate.getDayOfWeek();
	Month month = currentDate.getMonth();
	Year year = Year.of(currentDate.getYear());
	System.out.println("Day: " + dayOfWeek1.getValue() + " Month: " + month.getValue() + " Year: " + year.getValue());
	System.out.println(currentDate.getYear());
	System.out.println(currentDate.getDayOfYear());
	System.out.println(currentDate.getEra());

  }
}
