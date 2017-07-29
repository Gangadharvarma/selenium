package TestNgFiles;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class secondannoatation {
	@BeforeSuite
	public void beforerunningofhesuite(){
		System.out.println("this the before suit");
	}
		
		@Test
		@Parameters({"adminid"})
		public void parameter(String id){
			System.out.println(id);
			
			
		}
	}

