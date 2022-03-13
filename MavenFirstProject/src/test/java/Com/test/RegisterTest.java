package Com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.Pages.RegisterPage;
@Test
public class RegisterTest {

	WebDriver driver;
	
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91883/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		//driver.findElement(By.xpath("//a[text()='Register a new membership']")).click();
		
	   LoginPage lp=new LoginPage(driver);
	     
	    RegisterPage rp=lp.clickRegister();
	  
	    
	    RegisterPage rp1=rp.validRegistraton();
	    
		
	}
}
