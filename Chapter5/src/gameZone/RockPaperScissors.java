package gameZone;

import java.util.Random;

import javax.swing.JOptionPane;



public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
	
		int answerInt;
		String choice, result = null;
		Random r = new Random();
		
		int computer = r.nextInt(3) + 1;
		int tie = 0;
		int humanScore = 0;
		int computerScore = 0;
		
		
		String answer = JOptionPane.showInputDialog(null, "Choose: \n1 for Rock\n2 for Paper \n3 for Scissors");
		answerInt = Integer.parseInt(answer);
		
		if(answerInt == 1 && computer == 1)
		{
			result = "tie";
			tie++;
		}
		if(answerInt == 2 && computer == 2)
		{
			result = "tie";
			tie++;
		}
		if(answerInt == 3 && computer == 3)
		{
			result = "tie";
			tie++;
		}
		if(answerInt == 1 && computer == 2)//paper covers rock computer w
		{
			result = "Computer Wins";
			humanScore++;
		}
		if(answerInt == 3 && computer == 1)//rock smash scissors computer w
		{
			result = "Computer Wins";
			humanScore++;
		}
		if(answerInt == 3 && computer == 2)//scissors cut paper human w
		{
			result = "Human Wins";
			humanScore++;
		}
		if(answerInt == 2 && computer == 3)//scissors cut paper computer w
		{
			result = "Computer Wins";
			humanScore++;
		}
		
		if(answerInt == 2 && computer == 1)//paper covers rock human w
		{
			result = "Human Wins";
			humanScore++;
		}
		if(answerInt == 1 && computer == 2)// rock smash scissors human w
		{
			result = "human Wins";
			humanScore++;
		}
		
		
		
	
	}

}
