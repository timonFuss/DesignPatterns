package pattern;

public class Porschnorchi implements Auto, Wohnwagen {

	private Auto porsche;
	private Wohnwagen schnorchi;

	public Porschnorchi() {
		porsche = new Porsche();
		schnorchi = new Schnorchi();
	}

	@Override
	public void setHeizung(int temp) {
		schnorchi.setHeizung(temp);

	}

	@Override
	public void hupen(int anzahl) {
		porsche.hupen(anzahl);

	}

	@Override
	public int bremsen() {
		return porsche.bremsen();
	}

}
