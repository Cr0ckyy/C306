package L1;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		int sum = 0;
		ArrayList<Integer> number = new ArrayList<Integer>();

		number.add(1);
		number.add(3);
		number.add(5);
		number.add(7);
		number.add(9);

		for (int i : number) {
			sum += i;

			System.out.println("Value of i = " + i);
			System.out.println("Sum= " + i);
		}

		System.out.println("Sum of the numbers = " + sum);
	}

}
