package pattern;

import java.util.List;

public class ListIterator implements Iterator {

	List<String> list;
	int index;

	public ListIterator(List<String> list) {
		this.list = list;
		index = 0;
	}

	@Override
	public Object currentItem() {
		if (!isDone()) {
			return list.get(index);
		} else {
			return list.get(index - 1);
		}
	}

	@Override
	public boolean isDone() {
		if (index == list.size()) {
			return true;
		}
		return false;
	}

	@Override
	public void next() {
		if (!isDone()) {
			index += 1;
		}

	}

	@Override
	public void first() {
		index = 0;

	}

}
