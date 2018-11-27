//Cole Mansfield
//17069311

package calanderCheck;


import java.util.Scanner;

public class calenderCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userMonth, userDay;
		int numDays = 0;
		
		System.out.println("Enter a month [1..12] : ");
		userMonth = sc.nextLine();
		int intUserMonth = Integer.parseInt(userMonth);
		
		System.out.println("Enter a day [1..31] : ");
		userDay = sc.nextLine();
		int intUserDay = Integer.parseInt(userDay);
		
		System.out.println("Is it a leap year?(y/n): ");
		char leapYear = sc.next().charAt(0);
		
		String userMonthOutputString = "";
		switch (intUserMonth) {
			case 1:
				userMonthOutputString = "January";
				break;
			case 2:
				userMonthOutputString = "February";
				break;
			case 3:
				userMonthOutputString = "March";
				break;
			case 4:
				userMonthOutputString = "April";
				break;
			case 5:
				userMonthOutputString = "May";
				break;
			case 6:
				userMonthOutputString = "June";
				break;
			case 7:
				userMonthOutputString = "July";
				break;
			case 8:
				userMonthOutputString = "August";
				break;
			case 9:	
				userMonthOutputString = "September";
				break;
			case 10:
				userMonthOutputString = "October";
				break;
			case 11:
				userMonthOutputString = "November";
				break;
			case 12:
				userMonthOutputString = "December";
				break;
		}
		
		if (leapYear == 'y') {
	
			switch (intUserMonth) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					numDays = 31;
					break;
				case 4: case 6: case 9: case 11:
					numDays = 30;
					break;
				case 2:
					numDays = 29;
					break;
					}
		} else if (leapYear == 'n') {
			
			switch (intUserMonth) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					numDays = 31;
					break;
				case 4: case 6: case 9: case 11:
					numDays = 30;
					break;
				case 2:
					numDays = 28;
					break;
					}
		}
		
		
		if (intUserDay <= numDays)
		{
			System.out.println(intUserDay + " is a valid day in " + userMonthOutputString);
		} else if (intUserDay > numDays)
		{
			System.out.println(intUserDay + " is not a valid day in " + userMonthOutputString);
		}
	}
}
