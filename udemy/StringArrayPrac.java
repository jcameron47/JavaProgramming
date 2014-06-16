//Practicing with strings stored in arrays
//Jonathan Cameron

package udemy;

public class StringArrayPrac {

	public static void main(String[] args) 
	{
		String[] names = {"Jonathan", "Ireland", "Madison"};
		
		for(int x = 0;x < names.length;x++)
		{
			System.out.println("Human: " + names[x]);			
		}

		for(String person: names)
			System.out.println(person);
		
	}

}
