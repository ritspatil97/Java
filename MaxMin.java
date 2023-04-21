package Practise;

public class MaxMin {

	public static void main(String[] args) {

		int array1[] = { 100, 50, 300, 600, 80 };

		int max = array1[0];

		for (int i = 1; i < array1.length; i++) {
			if (max < array1[i]) {
				max = array1[i];
			}
		}

		int min = array1[0];
		for (int i = 1; i < array1.length; i++) {
			if (array1[i] < min) {
				min = array1[i];
			}
		}

		System.out.println(min);
		System.out.println(max);

	}

}
