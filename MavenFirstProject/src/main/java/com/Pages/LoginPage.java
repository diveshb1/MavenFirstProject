package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver lpdriver;
	
	public  LoginPage(WebDriver driver) {
		this.lpdriver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	 private WebElement username;
	
	@FindBy(id="password")
	 private WebElement pass;
	
	@FindBy(xpath="//button")
	 private WebElement Loginbtn;
	
	@FindBy(xpath="//a[text()='Register a new membership']")
	WebElement registerclick;
	
	public void LoginToApplication(String uname,String password) {
		username.sendKeys(uname);
		pass.sendKeys(password);
		Loginbtn.click();	
	}
	
	public DashBoardPage validLogin() {
		username.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		Loginbtn.click();
		return new DashBoardPage(lpdriver);
	}
	public RegisterPage clickRegister() {
		registerclick.click();
		return new RegisterPage(lpdriver);
	}

}
