package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	WebElement uname;
	
	@FindBy(id="mobile")
	WebElement number;
	
	@FindBy(id="email")
	WebElement mail;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button")
	WebElement registerbtn;
	
	public void Registration(String name,String mobile,String email,String password) {
		uname.sendKeys(name);
		number.sendKeys(mobile);
		mail.sendKeys(email);
		pass.sendKeys(password);
		registerbtn.click();
	}
	public RegisterPage validRegistraton() {
		uname.sendKeys("abcd");
		number.sendKeys("345678");
		mail.sendKeys("abcd@gmail.com");
		pass.sendKeys("456789");
		registerbtn.click();
	return new	RegisterPage(driver) ;
	}
}
