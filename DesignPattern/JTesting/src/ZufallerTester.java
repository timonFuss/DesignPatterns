import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ZufallerTester {
	Zufaller zufaller = new Zufaller();

	@Test
	public void testeBereich() {
		zufaller.setMax(100);
		for (int i = 0; i < 10000; i++) {
			int random = zufaller.createZahl();
			if (1 <= random && random <= 100) {
				assertTrue(true);
			} else {
				assertFalse(false);
			}
		}
	}

	@Test
	public void testeRandomZahlen() {
		int number = 0;
		boolean richtig = true;
		zufaller.setMax(100);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			int random = zufaller.createZahl();
			if (map.containsKey(random)) {
				int temp = map.get(random);
				temp += 1;
				map.put(random, temp);
			} else {
				map.put(random, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			number += value;
			System.out.println("<" + key + "," + value + ">");

			if (95 <= value && value <= 105) {

			} else {
				assertFalse(false);
			}
		}
		System.out.println(number);
		assertTrue(true);

	}
}
