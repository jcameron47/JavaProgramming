//practice with user input as well as error handling 101
//Jonathan Cameron

package udemy;

import java.util.InputMismatchException;
import java.util.Scanner;



public class UserInput {

	public static void main(String[] args) 
	{
		try
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter a line of text: \n");
			String line = input.nextLine();
			
			System.out.println("Enter a float: ");
			double value = input.nextDouble();
			
			System.out.println("Enter a number: ");
			int number = input.nextInt();
			
			System.out.println("You've entered:\n" + line);
			System.out.printf("float = %d\n", value);
			System.out.printf("number = %d", number);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong input! Program closing");
		}
		
	}

}
