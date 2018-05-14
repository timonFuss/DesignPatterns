package pattern;

public class Main {
	public static void main(String args[]){
		Menge menge = new MengeAdapter();
		
		menge.add("Das");
        menge.add("ist");
        menge.add("ein");
        menge.add("kleiner");
        menge.add("Text");
        menge.add("kleiner");
        System.out.println(menge.toString());

	}

}
