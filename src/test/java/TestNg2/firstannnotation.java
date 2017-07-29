package TestNg2;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class firstannnotation extends global{
	
	@BeforeSuite
	public void firstexecution (){
		System.out.println("executed ");
	}
	@BeforeMethod
	public void beforemethodexecution(){
		System.out.println("Before method execution");
	}
	
	
	@BeforeTest
	public void beforetestexecution() throws IOException{
		gloabalcallingvariables();
		System.out.println("Before test execution");
	}
	@Test
	
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
