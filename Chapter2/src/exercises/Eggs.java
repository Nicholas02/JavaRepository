package exercises;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int eggs;
		int dozen;
		int individualEggs;

			Scanner input = new Scanner(System.in);
			System.out.println("Please enter how many eggs you need >> ");
			eggs = input.nextInt();
			
			dozen = eggs / 12;
			individualEggs = eggs % 12; 
			
			System.out.print(" You ordered " + eggs + " eggs, which is " + dozen + " dozen. And " + individualEggs + " individual eggs left");
			
			
		
		
		
		
		
		
		
		
	}

}
