
public class Discount {
	
	public double calculateDiscount(Bero ob) {
		double price = ob.getPrice();
		double discount = 0;
		if(ob instanceof SteelBero )
		{
			discount = (price * 10) /100;
			return discount;
		}
		else if(ob instanceof WoodenBero )
		{
			discount = (price * 15) /100;
			return discount;
		}
		return 0;
		
	}
}
