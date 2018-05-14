package radiowecker;

import radio.Radio;
import radio.RadioImpl;
import wecker.Wecker;
import wecker.WeckerImpl;

public class RadioWecker implements Wecker, Radio {
	private WeckerImpl wecker;
	private RadioImpl radio;

	public RadioWecker() {
		this.wecker = new WeckerImpl(true);
		this.radio = new RadioImpl(true);
	}

	@Override
	public void einschalten() {
		wecker.einschalten();
		radio.einschalten();

	}

	@Override
	public void ausschalten() {
		wecker.ausschalten();
		radio.ausschalten();
	}

	@Override
	public boolean isOn() {
		if (radio.isOn() && wecker.isOn()) {
			return true;
		}
		return false;
	}

}
