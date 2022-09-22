package intern;
import java.util.Scanner;

public class FourthProgram {
	
	 // Declaration global variable length
    static int length;
 
    // Method 1
    // To print the array
    public static void printArray(int[] array)
    {
        // Iterating using for loops
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        if(array == null || array.length == 0) {        	
        	System.out.println(array.length);
        }else
        System.out.println();
    }
 
    // Method 2
    // To sort an array
    public static void sortArray(int[] array)
    {
        int temporary = 0;
 
        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
 
        // Displaying elements of array after sorting
        System.out.println(
            "Elements of array sorted in ascending order: ");
        printArray(array);
    }

	public static void main(String[] args) {
		  try (// Initializing custom array elements
		        // The array contains 6 elements.
		    Scanner s = new Scanner(System.in)) {
			System.out.print("Enter no. of elements you want in array:\n");
			int n = s.nextInt();
			int array[] = new int[n];
			System.out.println("Enter all the elements:\n");
			for(int i = 0; i < n; i++)
			{
			    array[i] = s.nextInt();
			}
 
			// Initialize length
			length = array.length;
 
			// Displaying elements of original array
			System.out.print("Elements of original array: ");
 
			// Call printArray method
			printArray(array);
 
			// Call sortArray method
			sortArray(array);
		}

	}

}