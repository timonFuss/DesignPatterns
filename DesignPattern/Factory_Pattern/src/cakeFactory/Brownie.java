package cakeFactory;

public class Brownie implements Cake {
	private Consistency consistence = Consistency.SQUISHY;
	private Shape shape = Shape.SQUARE;

	@Override
	public void tastesLike() {
		System.out.println("I taste like chocolate!");
	}

	@Override
	public Consistency getConsistency() {
		return consistence;
	}

	@Override
	public Shape getShape() {
		return shape;
	}

}
