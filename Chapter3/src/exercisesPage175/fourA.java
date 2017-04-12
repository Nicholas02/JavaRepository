package exercisesPage175;

public class fourA {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		int one = 99;
		int two = 14;
		displayTwiceTheNumber(one);
		displayTwiceTheNumber(two);
		displayNumberPlusFive(one);
		displayNumberPlusFive(two);
		displayNumberSquared(one, two);
		
	}
	public static void displayTwiceTheNumber(int n)
	{
	int factor = 2;
	System.out.println(n + " times " + factor + " is " + (n * factor));
	
	
	}
	public static void displayNumberPlusFive(int n)
	{
	int factor = 5;
		System.out.println(n + " plus " + factor + " is " + (n + factor));
		
	}
	public static void displayNumberSquared(int one, int two)
	{
	int factor = 99;
	int factor1 = 14;
	
		System.out.println(one + " times " + factor + " is " + (one * one));
		System.out.println(two + " times " + factor1 + " is " + (two * two));
	}
	
}
