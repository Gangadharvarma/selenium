package TestNg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class parameters {


	@Test(dataProvider="getData")
	public void contactustesting(String name,String email,String message) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "/Users/janki/Desktop/technologyandoffice/selenium/chromedriver");
					WebDriver driver =new ChromeDriver();
						driver.get("http://digital-lync.com/");
						driver.findElement(By.xpath(".//*[@id='wpcf7-f5564-o1']/form/p[1]/span/input")).sendKeys(name);
						driver.findElement(By.xpath(".//*[@id='wpcf7-f5564-o1']/form/p[2]/span/input")).sendKeys(email);
						driver.findElement(By.xpath(".//*[@id='wpcf7-f5564-o1']/form/p[3]/span/input")).sendKeys(message);
						driver.findElement(By.xpath(".//*[@id='wpcf7-f5564-o1']/form/p[4]/input")).click();
						
					//	driver.wait(5000);
						//driver.quit();
	
	}
	
	
//
//public void gettingthemarks(S){
//	System.out.println("dd");
//	System.out.println("students marks in social are:"+social);
//	System.out.println("students marks in physics are:"+physics);
//	System.out.println("students marks in history are:"+history);


//}

@DataProvider
public Object [][] getData(){
	Object[][] paramerterizartion =new Object[3][3];
	paramerterizartion[0][0]="sairam";
	paramerterizartion[0][1]="rram4000@gmail.com";
	paramerterizartion[0][2]="heyy";
	
	paramerterizartion[1][0]="12345";
	paramerterizartion[1][1]="ramgmail.com";
	paramerterizartion[1][2]="2314324";

	paramerterizartion[2][0]=" ";
	paramerterizartion[2][1]=" ";
	paramerterizartion[2][2]=" ";
	return paramerterizartion;

}
}
