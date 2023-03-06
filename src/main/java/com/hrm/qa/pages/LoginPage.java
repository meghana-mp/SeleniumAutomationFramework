package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory or Object Repository
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	
	@FindBy(xpath="//button[@type='submit']") WebElement login_button;
	
	
	@FindBy(linkText="Forgot your password? ") WebElement reset_password;
	
	@FindBy(xpath="//div[@class='orangehrm-login-logo']") WebElement logo;
	
	
	//Initialize the Page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login_button.click();
		
		return new HomePage();
	}
}
