// while loop practice

package udemy;

public class WhileLoop 
{
	public static void main(String arg[])
	{
		int number = 47, x = 0;
		
		
		boolean isRunning = true;
		
		System.out.println("Creating " + number + "'s");
		
		while(isRunning)
		{
			System.out.println("Number: " + x);
			x++;
			if(x == number)
				isRunning = false;
		}
		System.out.println("Count complete.");
	}
}
