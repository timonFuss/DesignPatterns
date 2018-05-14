
public class Mutant implements Tier,Mensch{
	Mensch m;
	Tier t;
	
	public Mutant(){
		m=new Hans();
		t= new Huhn();
	}
	
	@Override
	public void speak(){
		m.speak();
	}
	
	@Override
	public int walk(int meter){
		return t.walk(meter);
	}
	
	@Override
	public int getGewicht(){
		return m.getGewicht();
	}
}
