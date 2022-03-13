package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	WebDriver updriver;
	
	public UsersPage(WebDriver driver) {
		this.updriver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//a[@href='users.html']")
	 WebElement userclick;

	 @FindBy(xpath="//button[text()='Add User']")
	 WebElement adduser;
	 public void UserPage() { 
		userclick.click();
	}
	 public AddUserPage clickAdduser() {
		 adduser.click();
		 return new AddUserPage(updriver);
	 }
	
}