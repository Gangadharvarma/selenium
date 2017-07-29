package TestNg2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class global {
	WebDriver driver=null;
	@Test
		public void gloabalcallingvariables() throws IOException{
		
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("/Users/janki/Desktop/selenium test cases/frameworkpackage/src/TestNg2/datadriving.properties");
		prop.load(fis);
		
		
		if(prop.getProperty("Browser").contains("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/janki/Desktop/technologyandoffice/selenium/chromedriver");
			
			 driver=new ChromeDriver();
		}
		else if (prop.getProperty("Browser").contains("firefox")){
			System.setProperty("webdriver.chrome.driver", "/Users/janki/Desktop/technologyandoffice/selenium/chromedriver");
			 driver =new FirefoxDriver();
		}
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		
		
		
		
		
	}
}
