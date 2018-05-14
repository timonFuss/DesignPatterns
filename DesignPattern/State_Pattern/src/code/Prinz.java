package code;

public class Prinz implements State {

	@Override
	public void handle(Context context) {
		System.out.println("Ich bin ein Prinz!");
		context.setState(this);
	}


}
