package code;

public class StatePatternDemo {
	public static void main(String [] args){
		Context context = new Context();
		Frosch frosch = new Frosch();
		Prinz prinz = new Prinz();
		
		prinz.handle(context);
		frosch.handle(context);
		
	}

}
