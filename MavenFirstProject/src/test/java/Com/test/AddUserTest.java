package Com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Pages.AddUserPage;
import com.Pages.DashBoardPage;
import com.Pages.LoginPage;
import com.Pages.UsersPage;

public class AddUserTest {

	
	WebDriver driver;

	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91883/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
      
		LoginPage lp=new LoginPage(driver);
		
		DashBoardPage dp=lp.validLogin();
		
		UsersPage up=dp.clickuser();
		
		AddUserPage au=up.clickAdduser();
		
		AddUserPage au1=au.adduser();

	}
}
