package youDoIT;
import java.util.Scanner;
public class Paradiseinfo2 {

	public static void main(String[] args) 
	{
		double price;
		double discount;
		double savings;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		System.out.print("Enter discount rate as a whole number >> ");
		discount = keyboard.nextDouble();
		
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any servie on any service over" + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("Thats a savings of at least $" + savings);
		
		
		
	}
	public static double computeDiscountInfo(double pr, double dscnt)
	{
	double savings;
	
	savings = pr * dscnt / 100;
	
	return savings;
	
	}
	
}
