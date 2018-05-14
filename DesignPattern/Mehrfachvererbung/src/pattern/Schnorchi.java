package pattern;

public class Schnorchi implements Wohnwagen {

	private int temperatur;

	@Override
	public void setHeizung(int temp) {
		this.temperatur = temp;
	}

}
