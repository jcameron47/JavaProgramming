//Practice messing with constructors 
//a method that is ran with every
//instance created
//
//Jonathan Cameron


package udemy;

class Prac00
{
	int number;
	
	public Prac00()
	{
		System.out.println("Constructor running!");
		number = 47;
	}
	
	public Prac00(int number)
	{
		System.out.println("Constructor running!");
		System.out.printf("Number passed through: %d\n",number);
		
		this.number = number;
	}
}

public class Constructors {

	public static void main(String[] args) 
	{
		Prac00 object = new Prac00(100);
		Prac00 object1 = new Prac00(1000);
	}

}
