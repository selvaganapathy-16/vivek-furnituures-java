
public class SteelBero extends Bero {
	private int beroHeight;
	
	
	
	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight = beroHeight;
	}

	public int getBeroHeight() {
		return beroHeight;
	}

	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}

	public void calculatePrice() {
		
		if(this.beroHeight == 3)
		{
			setPrice(5000);
		}
		else if(this.beroHeight == 5)
		{
			setPrice(8000);
		}
		else if(this.beroHeight == 7)
		{
			setPrice(10000);
		}
		
	}

}
