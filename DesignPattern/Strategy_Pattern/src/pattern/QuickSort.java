package pattern;

import java.util.Collections;
import java.util.List;

public class QuickSort implements Strategy {
	@Override
	public List<Integer> algorithm(List<Integer> list) {
		sort(list);
		return list;
	}

	public void sort(List<Integer> list) {
		sortQuick(list, 0, list.size() - 1);
	}

	public void sortQuick(List<Integer> list, int from, int to) {
		if (from < to) {
			int pivot = from;
			int left = from + 1;
			int right = to;
			int pivotValue = list.get(pivot);
			while (left <= right) {
				// left <= to -> limit protection
				while (left <= to && pivotValue >= list.get(left)) {
					left++;
				}
				// right > from -> limit protection
				while (right > from && pivotValue < list.get(right)) {
					right--;
				}
				if (left < right) {
					Collections.swap(list, left, right);
				}
			}
			Collections.swap(list, pivot, left - 1);
			sortQuick(list, from, right - 1); // <-- pivot was wrong!
			sortQuick(list, right + 1, to); // <-- pivot was wrong!
		}
	}

}
