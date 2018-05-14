package code;

public class Bauer {
	private static Bauer instance = null;
	private String name = "Hans";
	private int alter = 54;
	

	private Bauer() {

	}

	public static Bauer getInstance(){
		if(instance == null){
			return new Bauer();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "Bauer [name=" + name + ", alter=" + alter + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
}
