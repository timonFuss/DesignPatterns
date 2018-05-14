package cakeFactory;

public class CheeseCake implements Cake {
	private Shape shape = Shape.ROUND;
	private Consistency consistence = Consistency.SOFT;

	@Override
	public void tastesLike() {
		System.out.println("I taste cheesy!");
	}

	@Override
	public Shape getShape() {
		return shape;
	}

	@Override
	public Consistency getConsistency() {
		return consistence;
	}

}
