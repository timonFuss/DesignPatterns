package pattern;

public class FirstLevelSupport implements Handler {

	private Handler nextHandler;

	public FirstLevelSupport() {
		this.nextHandler = new SecondLevelSupport();
	}

	@Override
	public void handleRequest(Support support) {
		if (support.equals(Support.FIRST)) {
			System.out.println("handled by FirstLevelSupport");
		} else {
			System.out.println("not handled by FirstLevelSupport");
			if (nextHandler != null) {
				nextHandler.handleRequest(support);
			} else {
				System.out.println("end of chain");
			}
		}

	}

}
