package pattern;

import java.util.List;

public class ListAggregate implements Aggregate {

	List<String> list;

	public ListAggregate(List<String> list) {
		this.list = list;
	}

	@Override
	public Iterator createIterator() {
		return new ListIterator(this.list);
	}

}
