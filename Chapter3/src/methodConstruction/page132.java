package methodConstruction;

public class page132 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
double salary = 400.00;
		double startingWage = 1600.00;
		System.out.println("Demonstrating some raises");
		predictRaise(800.00);
		predictRaise(salary);
		predictRaise(startingWage);
	}
	
	public static void predictRaise(double salary)
	{
	double newSalary;
	final double RAISE_RATE = 1.10;
	newSalary = salary * RAISE_RATE;
	System.out.println("Current salary: " + salary + " After raise: " + newSalary);
	
	}
}
