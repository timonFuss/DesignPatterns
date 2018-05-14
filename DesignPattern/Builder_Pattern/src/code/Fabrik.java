package code;

public class Fabrik {
	public static void main(String[] args) {
		Auto auto = new Auto.Builder(4).vonDerMarke(Marke.PORSCHE).mitFarbe(Farbe.BLAU).faehrtMit(Treibstoff.DIESEL).build();
		
		System.out.println(auto.toString());
	}

}
