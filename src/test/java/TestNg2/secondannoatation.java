package TestNg2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class secondannoatation {
	@BeforeSuite(groups={"Priority2"})
	public void bef(){
		System.out.println("this the before suit1");
		
	}
	@Test(groups={"Priority1"})
	public void afff(){
		System.out.println("executing2");
	}
}
