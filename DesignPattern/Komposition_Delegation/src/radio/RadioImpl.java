package radio;

public class RadioImpl implements Radio {
	private boolean state = true;

	public RadioImpl(boolean state) {
		this.state = state;
	}

	@Override
	public void einschalten() {
		this.state = true;

	}

	@Override
	public void ausschalten() {
		this.state = false;

	}

	@Override
	public boolean isOn() {
		if (state == true) {
			System.out.println("Das Radio ist an!!");
			return true;
		}
		System.out.println("Das Radio ist aus!!");
		return false;
	}

}
