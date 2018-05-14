package pattern;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		Strategy strategy = new BubbleSort();

		System.out.println(strategy.algorithm(Arrays
				.asList(7, 3, 1, 4, 3, 2, 1)));
		strategy = new MergeSort();
		System.out.println(strategy.algorithm(Arrays
				.asList(7, 3, 1, 4, 3, 2, 1)));
		strategy = new QuickSort();
		System.out.println(strategy.algorithm(Arrays
				.asList(7, 3, 1, 4, 3, 2, 1)));

	}

}
