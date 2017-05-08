package array;
import java.util.Scanner;
public class array1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] numbers = {23, 6, 47, 35, 2, 14};
		int total = 0;
		int highest = 0;
		int odd = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<6; ++i)
		{
			total = total + numbers[i];
		}
		System.out.println("The total is " + total/6);
		
		for( int j = 0; j < 6; j++)
		{
			if(highest < numbers[j])
			{
				highest = numbers[j];
			
			}
			if(odd < numbers[j] % 2)
			{
				System.out.println("The odd numbers are " + numbers[j]);
			}
		}
		System.out.println("The highest number is>> " + highest);
		
		
		
	}

}
