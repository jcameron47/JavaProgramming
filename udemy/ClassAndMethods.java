//Practice with Class and Methods
//also creating getters
//
//Jonathan Cameron

package udemy;

//a class I created :)

class Person
{
	//instance variables (data or "state")
	String name;
	String gender;
	short age;
	short[] height;
	
	//Classes contain
	//Data
	//Subroutines (methods)
	
	//constructor - initialize the variables
	Person()
	{
		name = "Unknown";
		gender = "Unknown";
		age = 0;
		height = new short[2];
		height[0] = 1;
		height[1] = 1;
	}
	
	//display the person's attributes
	void display()
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(height[0] + " " + height[1]);
	}
	
	String getName()
	{
		return name;
	}
	
	String getGender()
	{
		return gender;
	}
	
	short getAge()
	{
		return age;
	}
	
	short[] getHeight()
	{
		return height;
	}
	
}

public class ClassAndMethods 
{	
	//main method that runs the program
	public static void main(String[] args) 
	{
		Person jon = new Person();
		
		jon.display();
		jon.name = "Jonathan";
		jon.age = 32;
		jon.gender = "Beast";
		jon.height[0] = 6;
		jon.height[1] = 0;
		
		jon.display();
		
		int x = jon.age;
	}

}
