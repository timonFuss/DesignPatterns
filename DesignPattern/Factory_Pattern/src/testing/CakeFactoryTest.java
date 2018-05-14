package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cakeFactory.*;

public class CakeFactoryTest {
	
	CakeFactory cakefactory = CakeFactory.getInstance();
	
	
	@Test
	public void testCakeCharge(){
		CakeFactory.getInstance();
		List<Cake> cakeList = cakefactory.createCharge(10);
		List<Cake> testList = new ArrayList<>();
		for(int i=0; i<10;i++){
			testList.add(CakeFactory.getCake(Sort.RND));
		}
		assertEquals(testList.size(),cakeList.size());
	}
	
	@Test 
	public void testStrawberryCake(){
		CakeFactory.getInstance();
		Cake cake = CakeFactory.getCake(Sort.FRUITY);
		
		assertTrue(cake instanceof StrawberryCake);
		assertTrue(cake.getShape() == Shape.ROUND);
	}
	
	@Test 
	public void testBrownie(){
		CakeFactory.getInstance();
		Cake cake = CakeFactory.getCake(Sort.CHOCOLATEY);
		
		assertTrue(cake instanceof Brownie);
	}
	
	@Test 
	public void Cheesecake(){
		CakeFactory.getInstance();
		Cake cake = CakeFactory.getCake(Sort.CHEESE);
		
		assertTrue(cake instanceof CheeseCake);
	}

}
