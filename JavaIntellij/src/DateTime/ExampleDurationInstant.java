package DateTime;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class ExampleDurationInstant {
  public static void main(String[] args) {

	Instant instant = Instant.now();
	try{
	  TimeUnit.SECONDS.sleep(3);
	}catch (InterruptedException e){
	  e.printStackTrace();
	}

	Instant instantTwo = Instant.now();

  }
}
