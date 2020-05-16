package testNextGen;

import org.testng.annotations.Test;

public class SecondTest {
	@Test(priority =1 ,groups="Ichku", dependsOnMethods=("SecSecondTestMethod"))
	public static void FirFirstTestMethod(){
		System.out.println("FirFirstTestMethod");
	}
	@Test(priority =2 ,groups="Puchku")
	public static void SecSecondTestMethod(){
		System.out.println("SecSecondTestMethod");
	}
	

}
