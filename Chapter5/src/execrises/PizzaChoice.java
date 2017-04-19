
/**
 * Antle
 * 04/19/17
 * Pizza Choice
 */

package execrises;
import java.util.Scanner;
public class PizzaChoice {

	public static void main(String[] args) 
	{
		String choice; 
		int choice2;
		int toppingChoice;
		double large = 10.99;
		double medium = 7.99;
		double small = 4.99;
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like a pizza? Yes or No>>>>>");
		choice = input.nextLine();
		
		if ("Yes".equals(choice) ||"yes".equals(choice)||"Y".equals(choice)||"y".equals(choice) )
		{
			System.out.println("you said " + choice + " to eating pizza");
			System.out.print("Please choose a topping 1 for Hamburger, 2 for Pepperoni, or 3 for Candian Bacon.");
			toppingChoice = input.nextInt();
			if(toppingChoice == 1)
			{
				System.out.println("You said hamburger pizza, what size do you want? 1 Small, 2 Medium or 3 Large.");
				choice2 = input.nextInt();
				if(choice2 == 1)
				{
					System.out.println("Your price is " + small);
					//here your going to display the price
				}
				if(choice2 ==2)
				{
					//here your going to display the price
					System.out.println("Your price is " + medium);
				}
				if(choice2 == 3)
				{
					//here your going to display the price
					System.out.println("Your price is " + large);
				}
			}
			if(toppingChoice == 2)
			{
				System.out.println("You said pepperoni pizza, what size do you want? 1 Small, 2 Medium or 3 Large.");
				choice2 = input.nextInt();
				if(choice2 == 1)
				{
					System.out.println("Your price is " + small);
					//here your going to display the price
				}
				if(choice2 ==2)
				{
					//here your going to display the price
					System.out.println("Your price is " + medium);
				}
				if(choice2 == 3)
				{
					//here your going to display the price
					System.out.println("Your price is " + large);
				}
			}
			if(toppingChoice == 3)
			{
				System.out.println("You said canadian bacon pizza, what size do you want? 1 Small, 2 Medium or 3 Large.");
				choice2 = input.nextInt();
				if(choice2 == 1)
				{
					System.out.println("Your price is " + small);
					//here your going to display the price
				}
				if(choice2 ==2)
				{
					//here your going to display the price
					System.out.println("Your price is " + medium);
				}
				if(choice2 == 3)
				{
					//here your going to display the price
					System.out.println("Your price is " + large);
				}
			}
		
		}
		
	}

}
