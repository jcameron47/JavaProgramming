//StringBuilder practice
//It is more efficient to use a StringBuilder
//rather than changing a string manually
//because a new string is created everytime
//it's changed. 
//
//also string formatting
//%f - float
//%d - digit
//%s - string
//
//Jonathan Cameron

package udemy;

public class StrBuildr {

	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();		//you can append objects also!
		
		sb.append("Happy, happy...\n")
		.append("Joy, joy...");
		
		System.out.println(sb.toString());
		
		System.out.printf("Here is a float with 2 precision - %.2f\n", 47.123456);
		System.out.printf("here's a string! %s", "Cool,huh?\n");
		
		
		

	}

}
