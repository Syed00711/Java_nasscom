package DateTimeExamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class LocalDateexamples {

	public static void main(String[] args) {
	/*	System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		LocalDate ld=LocalDate.of(1998, 05, 16);
		
		LocalDate ld1=LocalDate.of(2020, 11, 01);
		System.out.println(ld.plusDays(54).plusWeeks(12).minusYears(5));
System.out.println(ld.isBefore(ld1));
System.out.println(ld1.isLeapYear());

LocalTime lt =LocalTime.now();
System.out.println(lt=lt.of(01, 34, 54, 324123));
System.out.println(lt.plusHours(100).plusMinutes(1000).plusSeconds(100000));
	*/
	LocalDateTime ldt =LocalDateTime.now();
	
	System.out.println(ldt.plusMinutes(2000));
	//System.out.println(ZoneId.getAvailableZoneIds());
	LocalDateTime ldtA = LocalDateTime.now(ZoneId.of("Australia/Hobart"));
	System.out.println(ldtA);
	System.out.println(LocalDateTime.now(ZoneId.of("Europe/London")));
	System.out.println(LocalDateTime.now(ZoneId.of("America/Chicago")));
	
	System.out.println(ldt.toEpochSecond(ZoneOffset.UTC));
	System.out.println(ldtA.toEpochSecond(ZoneOffset.UTC));
	
	}

}
