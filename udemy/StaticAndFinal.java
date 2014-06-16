//Practicing with Static variables and methods
//within classes
//
//Jonathan Cameron

package udemy;

class Prac01
{
	public static int count;
	public int number;
	public static int staticInt;
	
	public Prac01()
	{
		count++;	//keeps track of how many instances are created
	}
	
		//This method displays the number of instance created
	public static void displayCount()
	{
		System.out.println("There are " + count + " instances.");
	}
}

public class StaticAndFinal {

	public static void main(String[] args) {
		Prac01 object = new Prac01();
		Prac01 object1 = new Prac01();	//created to see the counter work
		
		Prac01.staticInt = 47;
		
		object.number = 100;
	
		//you get warnings for not using the static way :P
		//wanted to experiment to see the results
		System.out.println(object.staticInt);
		
		object.staticInt = 9000;
		
		System.out.println(object.staticInt);
		
		Prac01.displayCount();
	}
}
