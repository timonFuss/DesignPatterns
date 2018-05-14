package pattern;

public class Porsche implements Auto {

	private int geschwindigkeit = 50;

	@Override
	public void hupen(int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			System.out.println("hup");
		}

	}

	@Override
	public int bremsen() {
		geschwindigkeit -= 5;
		return geschwindigkeit;
	}

}
