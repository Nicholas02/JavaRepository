package degadosTacos;
import java.util.Scanner;
public class delgadosTacos {
	private static double totalPrice;
	
	
	

	public static void main(String[] args) 
	{
		menu();
		orderingMenu();
		tacotruck();
		salesTax(totalPrice);
	
	}
	public static void salesTax(double totalPrice)
	{
		double totalWithTax;
		final double SALES_TAX = 1.075;
		totalWithTax = totalPrice * SALES_TAX;
		System.out.println("Total with tax is " + totalWithTax);
		
		
		
		
	}
	
	public static void orderingMenu()
	{
		//String tacoString, burritostring;
		double tacoPrice = 0.99;
		double burritoPrice = 2.00;	
		double quesadillaPrice = 4.00;	
		double tortaPrice = 2.00;	
		double salsaPrice = 2.50;	
		double nachoPrice = 7.00;	
		double saladPrice = 9.00;	
		double streetcornPrice = 4.00;
		double tacobowlPrice = 4.20;
		double enchilladaPrice = 5.00;
		
		double tacoOrdered= 0;
		double burritoOrdered= 0;
		double quesadillaOrdered= 0;
		double tortaOrdered=0;
		double salsaOrdered=0;
		double nachoOrdered=0;
		double saladOrdered=0;
		double streetcornOrdered=0;
		double tacobowlOrdered=0;
		double enchilladaOrdered=0;
		int menuOrder;
		//String choiceYes = null;
	
		
		Scanner inputDevice = new Scanner(System.in);
		do{
		System.out.print("From the menu, which item do you want to order?>>>");
		menuOrder = inputDevice.nextInt();
		
			if(menuOrder == 1)
				{
				System.out.println("how many tacos do you want? >>>>>");
				tacoOrdered = inputDevice.nextDouble();
				
				}
			if(menuOrder == 2)
				{
				System.out.println("How many burritos do you want? >>>>>");
				burritoOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 3)
				{
				System.out.println("How many quesadillas do you want? >>>>>");
				quesadillaOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 4)
				{
				System.out.println("How many tortas do you want? >>>>>");
				tortaOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 5)
				{
				System.out.println("How many salsas do you want? >>>>>");
				salsaOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 6)
				{
				System.out.println("How many nachos do you want? >>>>>");
				nachoOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 7)
				{
				System.out.println("How many salads do you want? >>>>>");
				saladOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 8)
				{
				System.out.println("How many street corns do you want? >>>>>");
				streetcornOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 9)
				{
				System.out.println("How many tacobowls do you want? >>>>>");
				tacobowlOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			if(menuOrder == 10)
				{
				System.out.println("How many enchillads do you want? >>>>>");
				enchilladaOrdered = inputDevice.nextDouble();
				inputDevice.nextLine();
				}
			System.out.println("Would you like anything else? type 11 for yes any number above 11 for no>>>>");
			menuOrder = inputDevice.nextInt();
			inputDevice.nextLine();
			}while(menuOrder == 11);	
		totalPrice = (tacoPrice * tacoOrdered) + (burritoOrdered * burritoPrice) + (quesadillaPrice * quesadillaOrdered) + (tortaPrice * tortaOrdered)
				 + (salsaOrdered * salsaPrice) + (nachoOrdered * nachoPrice) + (saladOrdered * saladPrice) + (streetcornOrdered * streetcornPrice) + 
				 (tacobowlPrice * tacobowlOrdered) + (enchilladaPrice * enchilladaOrdered);
		
		System.out.println("Here you ordered " + tacoOrdered + " Tacos, " + burritoOrdered + " burritos, " + quesadillaOrdered + " quesadiilas. " + 
		tortaOrdered + " tortas, " + salsaOrdered + " salsa, " + nachoOrdered + " nachos, " + saladOrdered + " salads, " + streetcornOrdered + 
		" street corns, " + tacobowlOrdered + "taco bowls, " + enchilladaOrdered + " enchillads, for a total price of " + totalPrice);
		
		
	}

	public static void menu()
	{
		System.out.println("tacos = 0.99");
		
		System.out.println("Burritos = 2.00");
		
		System.out.println("Quesadillas = 4.00");
		
		System.out.println("Torta = 2.00");
		
		System.out.println("Salsa = 2.50");
		
		System.out.println("Nachos = 7.00");
		
		System.out.println("Salad = 9.00");
		
		System.out.println("Street Corn = 4.00");
		
		System.out.println("Taco Bowl = 4.20");
		
		System.out.println("Enchillads = 5.00");
		
		
	}
	public static void tacotruck()
	{
	
	
		
	
	}
	

	
	
	
	
}
