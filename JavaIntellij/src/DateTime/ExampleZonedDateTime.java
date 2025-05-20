package DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {
  public static void main(String[] args) {

	LocalDateTime dateTime = LocalDateTime.now();
	ZoneId zoneId = ZoneId.of("America/Bogota");
	ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
	System.out.println("Zone DateTime Bogota: " + zonedDateTime);

	ZoneId zone = ZoneId.of("Europe/Madrid");
	ZonedDateTime zonedTime = zonedDateTime.withZoneSameInstant(zone);
	System.out.println("Zone DateTime Madrid: " + zonedTime);

	//Time equals
	ZonedDateTime TimeEquals = zonedTime.withZoneSameInstant(zone).plusHours(6);
	System.out.println("TimeEquals Zone DateTime: " + TimeEquals);


	//-------------------------------------------------//

	LocalDateTime Localtime = LocalDateTime.parse("2024-12-24T21:11:30");
	ZoneId timeZone = ZoneId.of("Europe/Paris");
	ZonedDateTime zoneTime = ZonedDateTime.of(Localtime, timeZone);
	System.out.println("Diferences time: " + zoneTime);
  }
}
