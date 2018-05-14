package pattern;

public class ThirdLevelSupport implements Handler {

	private Handler nextHandler;

	public ThirdLevelSupport() {
		this.nextHandler = null;
	}

	@Override
	public void handleRequest(Support support) {
		if (support.equals(Support.THIRD)) {
			System.out.println("handled by ThirdLevelSupport");
		} else {
			System.out.println("not handled by ThirdLevelSupport");
			if (nextHandler != null) {
				nextHandler.handleRequest(support);
			} else {
				System.out.println("End of Chain");
			}
		}

	}

}
