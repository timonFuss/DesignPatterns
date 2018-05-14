public class Zufaller {

	private int max = 0;

	public void setMax(int max) {
		this.max = max;
	}

	public int createZahl() {
		int randomNum;
		return randomNum = 1 + (int) (Math.random() * max);
	}

}
