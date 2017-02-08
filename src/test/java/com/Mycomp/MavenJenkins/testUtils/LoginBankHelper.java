package com.Mycomp.MavenJenkins.testUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class LoginBankHelper {
	protected static WebDriver driver;

	@BeforeTest
	public void launchBrowser(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\BrowserDrivers\\geckodriver.exe" );
		//.setProperty("webdriver.gecko.driver","C:\\Users\\Dhir\\workspace\\Copart\\src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	} 
	
  public void  login() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/V4/");
            Thread.sleep(5000);
         // Enter username
            driver.findElement(By.name("uid")).sendKeys("mngr61343");

           // Enter Password
           driver.findElement(By.name("password")).sendKeys("bydUdyv");

           // Click Login
            driver.findElement(By.name("btnLogin")).click();
           	}

          
		@AfterTest(enabled=false)
		public void closeBrowser(){
			driver.findElement(By.linkText("Sign Out")).click();
			driver.quit();

  }
}
