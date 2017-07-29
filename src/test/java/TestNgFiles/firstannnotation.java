package TestNgFiles;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class firstannnotation {
	
	@BeforeSuite
	public void firstexecution (){
		System.out.println("executed ");
	}
	@BeforeMethod
	public void beforemethodexecution(){
		System.out.println("Before method execution");
	}
	
	
	@BeforeTest
	public void beforetestexecution(){
		System.out.println("Before test execution");
	}
	@AfterTest
	public void AfterExecution(){
		System.out.println("after test execution");
	}
	
	
	
	@Test
	public void Aexecutionoffirst(){
		System.out.println("1st test casein @test");
	}
	@Test 
	public void Bexecutionofsecond(){
		System.out.println("2st test casein @test");

	}
	@Test 
	public void Cexecutionofthird(){
		System.out.println("3st test casein @test");

	}
	@Test 
	public void Dexecutionoffourth(){
		System.out.println("4st test casein @test");

	}
	@Test 
	public void Eexecutionoffivth(){
		System.out.println("5st test casein @test");

	}
}
