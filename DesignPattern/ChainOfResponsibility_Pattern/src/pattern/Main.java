package pattern;

public class Main {
	public static void main(String args[]) {
		Support support = Support.SIXTH;
		Handler handler = new FirstLevelSupport();
		handler.handleRequest(support);
	}

}
