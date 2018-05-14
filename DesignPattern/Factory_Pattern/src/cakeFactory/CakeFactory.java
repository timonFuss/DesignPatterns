package cakeFactory;

import java.util.ArrayList;
import java.util.List;

public class CakeFactory {
	private static CakeFactory instance = null;

	private CakeFactory() {

	}

	public static CakeFactory getInstance() {
		if (instance == null) {
			instance = new CakeFactory();
		}
		return instance;
	}

	public List<Cake> createCharge(int howmuch) {

		List<Cake> cakeCharge = new ArrayList<Cake>();
		for (int i = 0; i < howmuch; i++) {
			cakeCharge.add(this.getCake(Sort.RND));
		}

		return cakeCharge;
	}

	public static Cake getCake(Sort sort) {
		if (sort == Sort.FRUITY) {
			return new StrawberryCake();
		} else if (sort == Sort.CHOCOLATEY) {
			return new Brownie();
		} else if (sort == Sort.CHEESE) {
			return new CheeseCake();
		} else if (sort == Sort.RND) {
			int random = (int) (Math.random() * 3);
			switch (random) {
			case 1:
				return new StrawberryCake();
			case 2:
				return new Brownie();
			case 3:
				return new CheeseCake();
			}
		}
		return null;
	}

}
