package com.hrm.qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrm.qa.base.TestBase;

public class UserManagementPage extends TestBase{
	
	
	//System users section
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]") WebElement username_text;	
	@FindBy(xpath="(//*[contains(text(),'-- Select --')])[1]") WebElement user_role;	
	@FindBy(xpath="//input[@placeholder='Type for hints...']") WebElement employee_name;	
	@FindBy(xpath="//div[@role='listbox']/*") List<WebElement> employee_autolist;	

	@FindBy(xpath="(//*[contains(text(),'-- Select --')])[1]") WebElement user_status;
	@FindBy(xpath="//*[contains(text(),'Enabled')]") WebElement user_actif;

	
	@FindBy(xpath="//button[normalize-space()='Reset']") WebElement reset_button;
	@FindBy(xpath="//button[normalize-space()='Search']") WebElement search_button;

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']") WebElement search_result;


	
	//AdddUsers
	
	@FindBy(xpath="//button[normalize-space()='Add']") WebElement add_user_button;	

	@FindBy(xpath="(//*[contains(text(),'-- Select --')])[1]") WebElement add_user_role;
	@FindBy(xpath="//*[contains(text(),'Admin')]") WebElement selected_user_role;

	
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']") WebElement add_employee_namee;	
	@FindBy(xpath="//div[@role='listbox']/*") List<WebElement> name_autolist;	

	
	@FindBy(xpath="(//*[contains(text(),'-- Select --')])[1]") WebElement add_status;
	@FindBy(xpath="//*[contains(text(),'Enabled')]") WebElement adduser_active;

	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]") WebElement add_username;	
	
	@FindBy(xpath="(//input[@type='password'])[1]") WebElement add_password;	
	@FindBy(xpath="(//input[@type='password'])[2]") WebElement confirm_password;	
	
	
	@FindBy(xpath="///button[normalize-space()='Cancel']") WebElement add_cancel;	
	@FindBy(xpath="//button[@type='submit']") WebElement add_save;	
	
	@FindBy(xpath="//div/div/div[2]/p[1]") WebElement message;	

	
	

	
	public UserManagementPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String SearchUser() throws InterruptedException {
		
		
		username_text.sendKeys("admin");
		
		user_role.click();
		user_role.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
		
		employee_name.sendKeys("O");
		Thread.sleep(2000);
		employee_autolist.get(0).click();
		
		user_status.click();
		Thread.sleep(100);
		user_status.sendKeys(Keys.ARROW_DOWN);
		
	
		user_actif.sendKeys(Keys.ESCAPE);
		
		
		search_button.click();
		
		return search_result.getText();
	}
	
	
	public String addUser(String Role, String EmpName, String userstatus, String uname,String Pwd, String cpwd) throws InterruptedException {
		
		add_user_button.click();
		
	
		add_user_role.sendKeys(Role);
		selected_user_role.click();

		add_employee_namee.sendKeys(EmpName);
		Thread.sleep(2000);
		name_autolist.get(0).click();

		
		add_status.sendKeys(userstatus);
		adduser_active.click();
		
	
		
		add_username.sendKeys(uname);
		add_password.sendKeys(Pwd);
		confirm_password.sendKeys(cpwd);
	
		Thread.sleep(1000);
		add_save.click();
		
		Thread.sleep(1000);

		//System.out.println(message.getText());
		return message.getText();		
	}
	




}
