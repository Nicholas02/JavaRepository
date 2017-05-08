package gameZone;

public class TestsScores 
{

	public static void main(String[] args)
	{
		double [] salaries = new double [4];
		
		salaries[0] = 6.25;
		salaries[1] = 6.55;
		salaries[2] = 10.25;
		salaries[3] = 16.85;
		
		System.out.println("Salaries printed one by one>>");
		System.out.println(salaries[0]);
		System.out.println(salaries[1]);
		System.out.println(salaries[2]);
		System.out.println(salaries[3]);
		
		double [] Othersalaries = {6.25, 6.55, 10.25, 16.85};
		
		System.out.println("Salaries printed one by one>>");
		System.out.println(salaries[0]);
		System.out.println(salaries[1]);
		System.out.println(salaries[2]);
		System.out.println(salaries[3]);
		
		System.out.println("Salaries printed one by one>>");
		for(int i = 0; i < 4; i = i + 1)
		{
			System.out.println(salaries[i]);
		}
		
		double total= 0;
		for(int j = 0; j < 4; j = j +1)
		{
			total = total + salaries[j];
			
		}
		System.out.println("The total printed is >>" + total);
	}

}
