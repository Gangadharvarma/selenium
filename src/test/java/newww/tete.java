package newww;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tete {
	public WebDriver driver;
	@BeforeMethod
	public void slinks(){
		
		System.setProperty("webdriver.chrome.driver","/chromedriver");
		driver= new ChromeDriver();
		
	}
	
	@Test
	public  void passmethod() {
		
		driver.get("https://www.google.co.in/?");
		String expectedTitle="Google";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		driver.quit();
	
}
	@Test
	public  void failedmethod() {
		
		driver.get("https://www.google.co.in/?");
		String expectedTitle="oogle";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		driver.quit();
	
}
}