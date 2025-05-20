package DateTime;

import java.time.LocalDate;
import java.time.Period;

public class ExamplePeriod {
  public static void main(String[] args) {

	//period between dateOne and dateTwo
	LocalDate dateOne = LocalDate.of(2022, 12, 17);
	LocalDate dateTwo = LocalDate.of(2024, 9, 11);

	Period period = Period.between(dateOne, dateTwo);
	System.out.println("Period between " + dateOne + dateTwo + " : " + period);
	System.out.printf("Difference between %s and %s: %d years, %d months, %d days", dateOne,
		dateTwo, period.getYears(), period.getMonths(), period.getDays());
  }
}
