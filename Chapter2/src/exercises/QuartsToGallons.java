package exercises;
import java.util.Scanner;
public class QuartsToGallons {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int gallons;
int quarts;
int remainder;

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter how many quarts you need >> ");
	quarts = input.nextInt();
	
	gallons = quarts / 4;
	remainder = quarts % 4;
	
	System.out.print(" You ordered " + quarts + " quarts, which is this " + gallons + " gallon. And " + remainder + " quarts left");
	
	
	
	
	}

}
