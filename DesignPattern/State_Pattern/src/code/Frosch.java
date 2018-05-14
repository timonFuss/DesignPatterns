package code;

public class Frosch implements State {

	@Override
	public void handle(Context context) {
		System.out.println("Ich bin ein Frosch!");
		context.setState(this);
	}

}
