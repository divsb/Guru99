package com.Mycomp.MavenJenkins.MavenJenkins;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Mycomp.MavenJenkins.testUtils.LoginBankHelper;

public class AddCustomer extends LoginBankHelper {
	
 @Test
 public void custAddTestNG() throws InterruptedException {
	 
 
	//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);  
	login();
	Thread.sleep(5000);
	driver.findElement(By.linkText("New Customer")).click();
	driver.findElement(By.name("name")).sendKeys("Dhir");
	driver.findElement(By.name("rad1")).click();
	driver.findElement(By.id("dob")).sendKeys("10/04/2007");
	driver.findElement(By.name("addr")).sendKeys("Rocky Mountains");
	driver.findElement(By.name("city")).sendKeys("Iselin");
	driver.findElement(By.name("state")).sendKeys("New Jersey");
	driver.findElement(By.name("pinno")).sendKeys("088371");
	driver.findElement(By.name("telephoneno")).sendKeys("1234567899");
	driver.findElement(By.name("emailid")).sendKeys("dhirambani@gmail.com");
	driver.findElement(By.name("password")).sendKeys("password");
	driver.findElement(By.name("sub")).click();
	
	
 }
  
}




