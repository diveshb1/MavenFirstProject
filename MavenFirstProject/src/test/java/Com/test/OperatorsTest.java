package Com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Pages.OperatorsPage;

public class OperatorsTest {
	
	WebDriver driver;
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("file:///C:/Users/91883/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApplication("kiran@gmail.com", "123456");
		
		OperatorsPage op=new OperatorsPage(driver);
		op.OperatorPage();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Operators");
	}
	
	

}
