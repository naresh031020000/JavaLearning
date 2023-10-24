package arraylist;
import java.util.Arrays;

public class SliceArrayExample1 {
//creating a functiion to the slice of an array  
	public static int[] getSlice(int[] array, int startIndex, int endIndex) {
// Get the slice of the Array   
		int[] slicedArray = new int[endIndex-startIndex];
//copying array elements from the original array to the newly created sliced array  
		for (int i = 0; i < slicedArray.length; i++) {
			slicedArray[i] = array[startIndex + i];
			System.out.println(Arrays.toString(slicedArray)+"-------------------"+i+"----------------");
		}
		return slicedArray;

//returns the slice of an array  
	}

//main() method  
	public static void main(String args[]) {
//array from which we will find the slice   
		int[] array = { 23, 56, 78, 22, 45, 90 };
//start index and end index denotes the part of the original array to be slice  
		int startIndex = 1, endIndex = 5;
//Get the slice of the array   
		int[] slicedArray = getSlice(array, startIndex+1, endIndex+1 );
//prints the slice array  
		System.out.println("Slice of Array: " + Arrays.toString(slicedArray));
	}
}