package com.hrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.hrm.qa.util.TestUtil;
import com.hrm.qa.util.WebEventListener2;

import io.github.bonigarcia.wdm.WebDriverManager;




public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener2 listener;
	
	
	public TestBase() {
		
		
		try {
			prop=new Properties();
			FileInputStream input=new FileInputStream("./src/main/java/com/hrm/qa/config/Config.properties");
			prop.load(input);	
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void initialization() throws MalformedURLException {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//driver=new ChromeDriver();
			//below lines for Headless Execution
			ChromeOptions coptions =new ChromeOptions();
			//coptions.addArguments("--headless=chrome");
			coptions.addArguments("--disable-dev-shm-usage");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			//driver=WebDriverManager.chromedriver().capabilities(coptions).create();
			driver= new RemoteWebDriver(new URL("http://localhost:4444/"),coptions);
		       
		    
		}
		else if(browserName.equals("FF")){
			
			driver = new FirefoxDriver();
		}
		
	// 	e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
	//	listener = new WebEventListener2();
		//e_driver.register(listener);
		//driver = e_driver;
		  
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGELOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICT_WAIT));
		
		driver.get(prop.getProperty("url"));
		
		
	}

}
