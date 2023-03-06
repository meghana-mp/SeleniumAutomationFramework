package com.hrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(className="oxd-userdropdown-tab") WebElement profilename;	
	@FindBy(linkText="About") WebElement aboutLink;
	
	@FindBy(xpath="//div[@class='oxd-grid-2 orangehrm-about']//div[2]//p[1]") WebElement companyname;

	@FindBy(linkText="Support") WebElement supportLink;
	@FindBy(linkText="ossupport@orangehrm.com") WebElement supportmail;
	
	
	@FindBy(linkText="Change Password") WebElement changepasswordlink;
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']") WebElement changepasswordheader;
	
	
	@FindBy(linkText="Logout") WebElement logoutlink;	
	@FindBy(xpath="//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']") WebElement closeAbout;
	
	
	@FindBy(xpath="//span[normalize-space()='Admin']") WebElement Adminlink;	
	
	//a[@class='oxd-main-menu-item active']//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']

	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateHomepageTitle() {
		return driver.getTitle();
	}
	
	public String clickAbout() {
		profilename.click();
		aboutLink.click();
		return driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-about']//div[2]//p[1]")).getText();
	}
	
	//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']	
		public void closeAbout() {
			closeAbout.click();
		}
	
	public boolean clickSupport() {
		profilename.click();
		supportLink.click();
		return supportmail.isDisplayed();
		
	}
	
	public void clickProfile() {
		profilename.click();
	}
	
	public void clickChangePassword() {
		
		changepasswordlink.click();

	}
	
	
	public String getChangePasswordHeader() {
		return changepasswordheader.getText();

	}
	
	
	public UserManagementPage clickAdminLink() {
		Adminlink.click();
		return new UserManagementPage();
	}
	

}
