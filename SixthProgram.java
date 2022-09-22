package intern;
import java.util.Scanner;

public class SixthProgram {
	
	// Function to find the count of
	// positive integers in an array
	private static int countPositiveNumbers(int[] arr, int n)
	{
	 int pos_count = 0;
	 int i;
	 for (i = 0; i < n; i++) {
	  if (arr[i] > 0)
	   pos_count++;
	 }
	 return pos_count;
	}
	 
	// Function to find the count of
	// negative integers in an array
	private static int sumNegativeNumbers(int[] arr, int n)
	{
	 int neg_sum= 0;
	 int i;
	 for (i = 0; i < n; i++) {
	  if (arr[i] < 0)
	   neg_sum = neg_sum + arr[i];
	 }
	 return neg_sum;
	}
	 
	public static void printArray(int[] array) {
		// Iterating using for loops
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		if (array == null || array.length == 0) {
			System.out.println(array.length);
		} else
			System.out.println();
	}


	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:\n");
		int n = s.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter all the elements:\n");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Originl Array elements:\n");
		printArray(a);
		
		int positiveCount = countPositiveNumbers(a, a.length);
		
		int negativeSum= sumNegativeNumbers(a, a.length);
		
		 int res[] = { positiveCount,negativeSum };
		 System.out.println("Count of positive numbers and Sum of negative Numbers:\n");
		 printArray(res);
		
		

	}

}