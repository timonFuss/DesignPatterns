package pattern;

import java.util.HashMap;

public class MengeAdapter implements Menge {

	private HashMap<Object, Object> map;

	public MengeAdapter() {
		map = new HashMap<Object, Object>();
	}

	@Override
	public void add(Object object) {
		if (!hasObject(object)) {
			map.put(object, object);
		}
	}

	private boolean hasObject(Object object) {
		if (map.get(object) != null) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String result = new String();
		for (Object o : map.keySet()) {
			result += o.toString() + ", ";
		}
		return String.format("[%s]", result);

	}

}
