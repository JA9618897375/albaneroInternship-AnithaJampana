package intern;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FifthProgram {

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

		System.out.println("Even Numbers:\n");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}

	}

}