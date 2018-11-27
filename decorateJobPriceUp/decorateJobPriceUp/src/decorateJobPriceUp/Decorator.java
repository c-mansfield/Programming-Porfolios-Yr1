package decorateJobPriceUp;
import java.util.Scanner;

public class Decorator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter hourly rate: ");
		float hourlyRate = in.nextFloat();
		
		System.out.print("Enter room area: ");
		int area = in.nextInt();
		
		System.out.print("Enter room unit cost: ");
		float unitPrice = in.nextFloat();
		
		System.out.print("Enter decorating time: ");
		int time = in.nextInt();
		
		Room eachRoom = new Room(area, time, unitPrice);
		//float totalCost = eachRoom.calculateCost(hourlyRate);
		Job eachJob = new Job(hourlyRate, eachRoom);
		
		float totalCost = eachJob.calculateCost();
		
		System.out.println("The job will cost £" + totalCost);
	}

}
