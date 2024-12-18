package DateTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExampleDuration {
  public static void main(String[] args) {

	LocalDateTime timeOne = LocalDateTime.now();
	LocalDateTime timeTwo = LocalDateTime.now().plusHours(3);
	Duration lapse = Duration.between(timeOne, timeTwo);
	System.out.println("Lapse: " + lapse);
	System.out.println("Plus lapse: " + lapse.plusHours(3));
  }
}
