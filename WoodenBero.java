
public class WoodenBero extends Bero{
	
	private String woodType;
	
	
	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}
    

	public String getWoodType() {
		return woodType;
	}


	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}


	public void calculatePrice() {
		
		if(this.woodType.toLowerCase().equals("ply wood"))
		{
			setPrice(15000);
		}
		else if(this.woodType.toLowerCase().equals("teak wood"))
		{
			setPrice(12000);
		}
		else if(this.woodType.toLowerCase().equals("engineered wood"))
		{
			setPrice(10000);
		}
		
	}

}
