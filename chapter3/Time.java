import java.time.*;
public class Time {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5,15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020-01-20 05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19 05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18 19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); //2020-01-18 19:14:30
		
		
	}
}