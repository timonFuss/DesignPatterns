package pattern;

import java.util.Comparator;
import java.util.List;

public class MergeSort implements Strategy {
	@Override
	public List<Integer> algorithm(List<Integer> list) {
		list.sort(Comparator.naturalOrder());
		return list;
	}

}
