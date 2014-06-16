//Practice with Getters and return 

package udemy;

//class Person is made in ClassAndMethods file
//class Person
//{
//	String name;
//	int age;
//	
//	void speak()
//	{
//		System.out.println("My name is " + name);
//	}
//}

public class GettersAndReturns {

	public static void main(String[] args) 
	{
		udemy.Person person1 = new Person();
		
		person1.name = "Jon";
		person1.age = 32;
		
		person1.display();

	}

}
