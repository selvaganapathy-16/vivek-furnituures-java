import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter Phone Number");
		long phone = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter address");
		String address = sc.nextLine();
		System.out.println("Enter Bero Type");
		String btype = sc.nextLine();
		System.out.println("Enter Bero Colour");
		String bcolor = sc.next();
		
		CustomerDetails s = new CustomerDetails(name,phone,address);
		double discount =0;
		double price =0;
		Discount t = new Discount();
		Bero ob;
		if(btype.toLowerCase().equals("steel bero"))
		{
			System.out.println("Enter Bero Height");
			int h = sc.nextInt();
			ob = new SteelBero(btype,bcolor,h);
			ob.calculatePrice();
			price = ob.getPrice();
			discount = t.calculateDiscount(ob);
		}
		else if(btype.toLowerCase().equals("wooden bero"))
		{
			System.out.println("Enter Wood Type");
			sc.nextLine();
			String type = sc.nextLine();
			ob = new WoodenBero(btype,bcolor,type);			
			ob.calculatePrice();
			price = ob.getPrice();
			discount = t.calculateDiscount(ob);
		}
		double amount = price - discount;
		System.out.printf("Amount needs to be paid Rs.%.2f",amount);
	}

}





