import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;


public class TaskScheduled {

	public static void main(String[] args) {

		//tasks 

		ArrayList<String> tasks = new ArrayList<String>();
		tasks.add("OCA");
		tasks.add("OCP");
		tasks.add("JavaScript");
		tasks.add("SQL");

		System.out.println("There are " + tasks.size() + " tasks scheduled in this list. They are: ");

		for (String task: tasks) {
			System.out.println(task);
		}
		LocalDate today = LocalDate.now();
        LocalDate nextCDay = LocalDate.of(2017, Month.JULY, 19);

        //If your certification has occurred this year already, add 1 to the year.
        if (nextCDay.isBefore(today) || nextCDay.isEqual(today)) {
            nextCDay = nextCDay.plusYears(1);
        }

        Period p = Period.between(today, nextCDay);
        long p2 = ChronoUnit.DAYS.between(today, nextCDay);
        System.out.println("There are " + p.getMonths() + " months, and " +
                           p.getDays() + " days until your " + tasks.get(0) + " certification. (" +
                           p2 + " total)");

		
	}

}