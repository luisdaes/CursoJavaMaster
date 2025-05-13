package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskSection29 {
  public static void main(String[] args) {

    // Create a scanner to read the birthdate
    Scanner scanner = new Scanner(System.in);

    // Ask for the birthdate in the format YYYY-MM-DD
    System.out.println("Enter your birthdate (YYYY-MM-DD):");
    String birthdateInput = scanner.nextLine();

    // Define the date format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // Convert the string to LocalDate
    LocalDate birthdate = LocalDate.parse(birthdateInput, formatter);

    // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Calculate the difference between the two dates
    Period period = Period.between(birthdate, currentDate);

    // Display the age
    System.out.println("Age: " + period.getYears() + " years, " +
        period.getMonths() + " months and " +
        period.getDays() + " days.");

  }
}
