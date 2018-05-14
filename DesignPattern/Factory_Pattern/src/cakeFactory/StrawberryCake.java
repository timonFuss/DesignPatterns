package cakeFactory;

public class StrawberryCake implements Cake {
	private Consistency consistence = Consistency.SOFT;
	private Shape shape = Shape.ROUND;

	@Override
	public void tastesLike() {
		System.out.println("I taste fruity and of course like strawberry!");
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
