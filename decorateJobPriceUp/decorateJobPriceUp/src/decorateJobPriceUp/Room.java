package decorateJobPriceUp;

public class Room {
	int area;
	int time;
	float unitPrice;
	
	public Room(int A, int T, float U)
	{
		this.area = A;
		this.time = T;
		this.unitPrice = U;
	}
	
	public float calculateCost(float hourlyRate)
	{
		float a = area * unitPrice;
		float b = time * hourlyRate;
		float totalCost = a + b;
		
		return totalCost;
	}
}
