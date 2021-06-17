package L1;

public class ArrayEx {

	public static void main(String[] args) {
		int sum = 0;

		int[] z = new int[9];
		z[0] = 17;
		z[1] = 3;
		z[2] = 4;
		System.out.println(z[1] + " , " + z[3] + " , " + z[2]); // Line 12

		int[] number = { 6, 3, 5, 7, 13 };

		for (int i = 0; i < number.length; i++) {
			sum += number[i];

			System.out.println("Iteration " + i + ": Element = " + number[i]);
			System.out.println("Sum = " + sum);
			// end of for loop
		}

		double average = (double) sum / number.length;
		System.out.println("Average of the numbers = " + average);

		// end of method
		System.out.println();
		System.out.println(z.length);
		System.out.println(number.length);

	}

}
