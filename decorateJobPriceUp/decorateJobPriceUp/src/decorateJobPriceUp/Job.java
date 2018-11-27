package decorateJobPriceUp;

public class Job {
	float hourlyRate;
	Room theRoom;
	
	public Job(float H, Room R)
	{	
		this.hourlyRate = H;
		this.theRoom = R;
	}
	
	public float calculateCost()
	{
		float totalCost = theRoom.calculateCost(hourlyRate);
		return totalCost;
	}
}
