package testNextGen;

import org.testng.annotations.Test;

public class First {

	
	@Test(priority =9 ,groups="Hema")
	public static void FirstTestMethod(){
		System.out.println("FirstTestMethod");
	}
	@Test(priority =8 ,groups="Nonu")
	public static void SecondTestMethod(){
		System.out.println("SecondTestMethod");
	}
	
	@Test(priority =3 ,groups="Hema")
	public static void ThirdTestMethod(){
		System.out.println("ThirdTestMethod");
	}
	
	@Test(priority =4 ,groups="Nonu")
	public static void FourthTestMethod(){
		System.out.println("FourthTestMethod");
	}
}
