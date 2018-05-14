package cakeFactory;

public class customer {
	public static void main(String [] args){
		CakeFactory cakeFactory = CakeFactory.getInstance();
		Cake cake = cakeFactory.getCake(Sort.CHOCOLATEY);
		cake.tastesLike();
	}

}
