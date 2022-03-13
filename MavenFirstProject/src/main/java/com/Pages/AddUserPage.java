package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {

	
WebDriver driver;
	
	public AddUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	WebElement uname;
	
	@FindBy(id="mobile")
	WebElement number;
	
	@FindBy(id="email")
	WebElement mail;
	
	@FindBy(id="course")
	WebElement courses;
	
	@FindBy(id="Male")
	WebElement Radiobtn;
	
	@FindBy(xpath="//select")
	WebElement Dropdown;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//input[@id='mobile' and @placeholder='FriendMobile']")
	WebElement Frdmobile;
	
	@FindBy(xpath="//button")
	WebElement submitbtn;
	
	public AddUserPage adduser() {
		uname.sendKeys("qwerty");
		number.sendKeys("23232322");
		mail.sendKeys("qwer@gmail.com");
		courses.sendKeys("JAVA");
		Radiobtn.click();
		Select s=new Select(Dropdown);
		s.selectByValue("Maharashtra");
		pass.sendKeys("909090909");
		Frdmobile.sendKeys("65565656");
		submitbtn.click();
		driver.switchTo().alert().accept();
		return new AddUserPage(driver);
	}
	
	
}
