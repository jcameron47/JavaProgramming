//Practice passing values through parameters
//This program passes a string type
//and returns the string with toUpperCase()
//which capitalizes everything

//Jonathan Cameron

package udemy;

//program that capitalizes the words
class Practice00
{
	String caps(String word)
	{
		return word.toUpperCase();
	}
}
public class MethodParameters {

	public static void main(String[] args) 
	{
		Practice00 prac = new Practice00();
		
		String whatever = "Woohoo! Awesome!";
		
		
		System.out.println(whatever);
		
		whatever = prac.caps(whatever);
		
		System.out.println(whatever);
	}

}
