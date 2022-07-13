import java.io.*;
import java.util.*;

public class Array {

	public static void main(String args[]) {
		int a = 10; // value
		int i = 0; // indices

		// double array of size 5...
		double[] items = new double[5];
		// indices -> 0, 1, 2, 3, 4

		// 11, 12, 13, 14, 15
		for (i = 0; i < 5; i++) {
			items[i] = (i + 1) + a;
		}

		for (i = 0; i < 5; i++) {
			System.out.print("items[" + i + "] : " + items[i] + " , ");
		}
		System.out.println();

		// calling a function with the input data...
		double[] output = powArray(items);

		System.out.println("New array after finding square of each element :");
		for (i = 0; i < 5; i++) {
			System.out.println(output[i] + " ");
		}
	}

	public static double[] powArray(double[] items) {
	
		double[] output = new double[items.length];
		for (int i = 0; i < 5; i++) {
			output[i] = Math.pow(items[i], 2.0);
		}
		return output;
	}
}