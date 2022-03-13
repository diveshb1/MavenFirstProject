package Com.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.AddUserPage;
import com.Pages.DashBoardPage;
import com.Pages.LoginPage;
import com.Pages.OperatorsPage;
import com.Pages.RegisterPage;
import com.Pages.UsersPage;

public class LoginTest {
	WebDriver driver;
	
	@Test

	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91883/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		LoginPage lp = new LoginPage(driver);
		
		//DashBoardPage dp=lp.validLogin();
		
		//UsersPage up=dp.clickuser();
		
	   //  OperatorsPage op=dp.clickoperator();
	   
	//  Adduser Au=up.clickAdduser();
	  
	    RegisterPage rp=lp.clickRegister();
	    	  
	    }
	}
	

