
public class Hans implements Mensch{
	int gewicht=85;
	
	@Override
	public void speak(){
		System.out.println("Guten Tag");
	}
	
	@Override
	public int getGewicht(){
		return gewicht;		
	}
}
