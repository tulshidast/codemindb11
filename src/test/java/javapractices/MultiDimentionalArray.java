package javapractices;

public class MultiDimentionalArray {

	public static void main(String[] args) {

		// declaration
		int array_0[][];
		int[][] array_1;
		int[][] array_2;
		int[][] array_3;
		int[][] array_4;

		// declaration + initialization

		int array_5[][] = new int[3][3];

		// value assignment
		array_5[0][0] = 1;
		array_5[0][1] = 4;
		array_5[0][2] = 3;

		array_5[1][0] = 4;
		array_5[1][1] = 5;
		array_5[1][2] = 6;

		array_5[2][0] = 5;
		array_5[2][1] = 10;
		array_5[2][2] = 7;

		// accessing array element
		System.out.println(array_5[2][1]);

		// replacing element
		array_5[2][2] = 77;

		System.out.println(array_5[2][2]);

		System.out.println("Number of rows: " + array_5.length);

		System.out.println("Number of columns from 0th row: " + array_5[2].length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		// declaration+initialization+value assignment
		int array[][] = { { 1, 4, 3 }, { 4, 5, 6 }, { 5, 10, 7 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
