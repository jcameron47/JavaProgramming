package udemy;

public class ForLoop {

	public static void main(String[] args) 
	{
		int x = 0;
		int number = 10000;
		
		for(;x < 10;x++)
		{
			System.out.println(x + " Happy");
		}
		
		System.out.println(x);	//x in for loop scope still effects the value stored.
		
		
		for(;;)
		{
			System.out.printf("Number: %d\n", x);
			x++;
			
			if(x == number)
				break;
		}
	}

}
