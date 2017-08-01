import java.util.*;
import java.util.ArrayList;
import java.time.*;


public class TaskSchedule {
      
        public static void main(String[] args){
			
            System.out.println("--- Tasks --- ");
			List<String> monthList = new ArrayList<>();
			monthList.add("Learning OCA");
			monthList.add("Learning OCP");
			monthList.add("Learning SQL");
			monthList.add("Learning Linux");
			monthList.add("Learning JavaScript");
			monthList.add("Learning Polymer");
			
			Object[] objectArray =  monthList.toArray();
			String[] stringArray =  monthList.toArray(new String[0]);
			
			String[] array = {};
			//List<String> monthList = Arrays.asList(array);
			
			String[] monthArr = new String[monthList.size()];
            monthArr = monthList.toArray(monthArr);
			
			System.out.println("--- Tasks scheduled --- ");	
			
			LocalDate today = LocalDate.now();
			System.out.println("Today's Local date : " + today);

			int year = today.getYear();
			int month = today.getMonthValue();
			int day = today.getDayOfMonth();
			System.out.println("Year:" + year + " Month:" + month +" day:"+ day);

    
			LocalDate taskScheduled = LocalDate.of(2017, 06, 23);
			System.out.println("Your task is scheduled for : " + taskScheduled);

		
			LocalDate date1 = LocalDate.of(2017, 06, 23);

            for(String s : monthArr)
               System.out.println(s);
				if (date1.equals(today)) {
				System.out.println("Today and date1 are the same date:" +
                today + date1);
			}

   
			MonthDay task = MonthDay.of(taskScheduled.getMonth(),taskScheduled.getDayOfMonth());
			MonthDay currentMonthDay = MonthDay.from(today);
			if (currentMonthDay.equals(task)) {
				System.out.println("Task completed !!");
			} else {
				System.out.println("Sorry, you need to reschedule the task");
			}

			
			
			

               
        }
}

