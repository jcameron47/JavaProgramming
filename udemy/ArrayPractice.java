//Practicing with Arrays
//Jonathan Cameron

package udemy;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		int NUMBER = 100;
		int[] jonathan;
		
		jonathan = new int[NUMBER];
		
//		for(int x = 0;x < NUMBER;x++)	//or array.length
//		{
//			//fill the array with numbers from the counter
//			jonathan[x] = x;
//			System.out.printf("Number: %d\n",jonathan[x]);
//		}
		
		for(int x = 0;x < jonathan.length;x++)	//or array.length
		{
			//fill the array with numbers from the counter
			jonathan[x] = x;
			System.out.printf("Number: %d\n",jonathan[x]);
		}
		
		System.out.println("Max number: " + NUMBER);
	}
}
