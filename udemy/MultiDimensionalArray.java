//Practicing with multi dimensional arrays
//Jonathan Cameron

package udemy;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{
		short ROW = 2; 		//3 rows
		short COL = 2;      //3 columns
		
//		int[][] numArray = new int[ROW][COL];
		
		//creating an array that stores 3 rows of digits like a num pad
		int[][] numArray = {{1,2,3},{4,5,6},{7,8,9}};
		
		//lets show the value of what's stored at this reference
		System.out.println(numArray[0][2] + "\n\n");
		
		//for fun, creating an array to store some strings
		String[][] texts = new String[2][3];
		
		//now to print out the multi dimensional array with a for loop
		for(int x = 0;x < numArray.length;x++)
			for(int y = 0;y < numArray[x].length;y++)
			{
				System.out.println(numArray[x][y]);
			}
	}
	

}
