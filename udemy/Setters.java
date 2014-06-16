//Setters(set methods, mutators) practice
//
//Jonathan Cameron

package udemy;

class Prac
{
	private String name;
	private int age;
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setInfo(String name, int age)
	{
		setName(name);
		setAge(age);
	}
	
	public void displayInfo()
	{
		System.out.println(getName());
		System.out.println(getAge());
	}
}

public class Setters {

	public static void main(String[] args) {

		Prac object = new Prac();
		
		object.setName("Jonny");
		object.setAge(100);
		
		object.displayInfo();
		
		object.setInfo("Rocket Man", 247);
		
		object.displayInfo();
	}

}
