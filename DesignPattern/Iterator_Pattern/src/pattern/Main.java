package pattern;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		Aggregate aggregate = new ListAggregate(Arrays.asList("Das", "ist",
				"ein", "kleiner", "Text"));
		Iterator iterator = aggregate.createIterator();

		while (!iterator.isDone()) {
			System.out.println(iterator.currentItem());
			iterator.next();
		}
		iterator.first();
		System.out.println(iterator.currentItem());
	}
}
