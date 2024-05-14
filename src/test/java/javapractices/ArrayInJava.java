package javapractices;

public class ArrayInJava {

	public static void main(String[] args) {

		int a;
		int c;
		// valid array declarations
		int numbers[];

		int numbers1[];

		int[] numbers2;

		int[] numbers3;

		int[] numbers4;

		// array declaration and initialization

		int b = 20;

		int numbers5[] = new int[10];

		// value storing inside array by using indexes
		numbers5[0] = 10;
		numbers5[1] = 20;
		numbers5[4] = 40;
		numbers5[3] = 45;
		numbers5[5] = 30;
		numbers5[6] = 90;
		numbers5[7] = 70;
		numbers5[8] = 40;
		numbers5[9] = 60;
		numbers5[2] = 50;

		// numbers5[11] = 50;

		// System.out.println(numbers5[11]);

		System.out.println(numbers5[8]);

		System.out.println(numbers5.length);

		System.out.println("######################################");

		// declaration+initialization+value assignments
		int array[] = { 100, 200, 50, 55, 60, 600, 700, 900 };

		System.out.println(array.length);

		System.out.println(array[3]);

		// replacing existing element of array
		array[3] = 66;

		System.out.println(array[3]);

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		// how to print complete array elements

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("##########################################");
		// sorting of array elements
		// original random order- 100,200,50,66,60,600,700,900
		// 200,100,50,66,60,600,700,900

		// Ascending order-50,60,66,100,200,600,700,900
		// Descending order-900,700,600,200,100,66,60,50

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
		}

		System.out.println("Largest element from array is: " + array[(array.length - 1)]);
		System.out.println("Second Largest element from array is: " + array[(array.length - 2)]);

		System.out.println("smallest element from array is: " + array[0]);
		System.out.println("Second samllest element from array is: " + array[1]);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
