//Practice with switch, using do while loop
//Jonathan Cameron

package udemy;

import java.util.Scanner;

public class SwitchPrac {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		boolean isRunning = true;
		
		do
		{
			System.out.println("Enter a command(start, stop, exit)");
			String text = input.nextLine();
			
			switch(text.toLowerCase())
			{
			case "start":
				System.out.println("Starting program");
				break;
			case "stop":
				System.out.println("Stopping the program");
				break;
			case "exit":
				System.out.println("Exiting the program");
				isRunning = false;
				break;
			default:
				System.out.println("Incorrect commant. Please try again");
				break;
			}
		}while(isRunning);

		System.out.println("Shutting down");
	}

}
