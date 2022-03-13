package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver dpdriver;

	public DashBoardPage(WebDriver driver) {
		this.dpdriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "h1")
	WebElement header;

	@FindBy(xpath = "//a[@href='users.html']")
	WebElement userclick;

	@FindBy(xpath = "//span[text()='Operators']")
	WebElement Operatorclick;

	public Boolean verifyHeader() {
		return header.isDisplayed();
	}

	public UsersPage clickuser() {
		userclick.click();
		return new UsersPage(dpdriver);
	}

	public OperatorsPage clickoperator() {
		Operatorclick.click();
		return new OperatorsPage(dpdriver);
	}

}
