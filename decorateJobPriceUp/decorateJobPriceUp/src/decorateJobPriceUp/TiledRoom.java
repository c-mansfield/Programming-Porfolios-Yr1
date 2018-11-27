package decorateJobPriceUp;

public class TiledRoom extends Room {
	
	int grouting;
	
	public TiledRoom(int A, int T, float U, int G)
	{
		super(A, T, U);
		this.grouting = G;
	}
}
