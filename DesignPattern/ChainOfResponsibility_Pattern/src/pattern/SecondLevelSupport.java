package pattern;

public class SecondLevelSupport implements Handler {

	private Handler nextHandler;

	public SecondLevelSupport() {
		this.nextHandler = new ThirdLevelSupport();
	}

	@Override
	public void handleRequest(Support support) {
		if (support.equals(Support.SECOND)) {
			System.out.println("handled by SecondLevelSupport");
		} else {
			System.out.println("not handled by SecondLevelSupport");
			if (nextHandler != null) {
				nextHandler.handleRequest(support);
			} else {
				System.out.println("end of chain");
			}
		}

	}

}
