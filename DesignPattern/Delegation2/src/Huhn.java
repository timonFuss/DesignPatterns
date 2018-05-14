
public class Huhn implements Tier{
	private int meter=0;
	
	@Override
	public int walk(int meter){
		return this.meter+=meter;
	}
}
