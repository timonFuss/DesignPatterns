
public class DogFactory {
	
	public static Dog getDog(String criteria){
		if(criteria.equals("cool")){
			return new AustralianShepard();
		}else if(criteria.equals("small")){
			return new Dackel();
		}else if(criteria.equals("cold")){
			return new Huskey();
		}
		return null;
	}

}
