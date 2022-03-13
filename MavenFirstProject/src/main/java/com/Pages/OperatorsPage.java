package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OperatorsPage {
	
	WebDriver driver;
	
	public OperatorsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement GetHeader() {
		return driver.findElement(By.xpath("//a[@href='operators.html']"));
	}
	
	 public void OperatorPage() {
		 GetHeader().click();
		
	}

}
