package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	
	System.out.println ("Enter in Start Amount: ");
	double startAmount = in.nextDouble();
	System.out.println ("Enter in Win Chance as a Percentage: ");
	double winChance = in.nextDouble();
	System.out.println ("Enter in Win Limit: ");
	double winLimit = in.nextDouble();
	int count=0;
	double money=startAmount;
	System.out.println ("Enter the total number of Simulations Days: ");
	int totalSimulations = in.nextInt();
	
	for (int simulationCount = 1; simulationCount <= totalSimulations; simulationCount++)
	{ 
		while (money > 0 && money < winLimit)
		{
			double randomWinChance = Math.random();
			if (randomWinChance < winChance/100)
			{
				money++;
			}
			else 
			{ 
				money--;
			}
			count++;
		}
			if (money >= winLimit)
			{
				System.out.println ("Simulation:" + simulationCount + " " + count + " " + "WIN");
			}
			else 
			{
				System.out.println ("Simulation:" + simulationCount + " " + count + " " + "LOSE");
			}
		
			money=startAmount;
	}
	
	
	}
}
