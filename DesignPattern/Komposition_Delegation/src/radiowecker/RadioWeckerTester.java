package radiowecker;

public class RadioWeckerTester {
	public static void main(String[] args) {
		RadioWecker radiowecker = new RadioWecker();
		System.out.println(radiowecker.isOn());
		radiowecker.ausschalten();
		System.out.println(radiowecker.isOn());
	}

}
