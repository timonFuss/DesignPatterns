package wecker;

public class WeckerImpl implements Wecker {
	private boolean state = true;

	public WeckerImpl(boolean state) {
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
			System.out.println("Der Wecker ist an!!");
			return true;
		}
		System.out.println("Der Wecker ist aus!!");
		return false;
	}

}
