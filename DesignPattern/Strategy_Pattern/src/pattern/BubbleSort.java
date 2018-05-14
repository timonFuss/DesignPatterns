package pattern;

import java.util.List;

public class BubbleSort implements Strategy {

	@Override
	public List<Integer> algorithm(List<Integer> list) {
		for (int j = 0; j < list.size() - 1; j++) {
			for (int i = 0; i < list.size() - 1; i++) {
				int current = list.get(i);
				int next = list.get(i + 1);

				if (current > next) {
					list.set(i, next);
					list.set(i + 1, current);
				}
			}
		}
		return list;
	}

}
