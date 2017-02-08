package com.Mycomp.MavenJenkins.MavenJenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Mycomp.MavenJenkins.testUtils.LoginBankHelper;


public class DeleteCustomer extends LoginBankHelper {
	
  @Test
  public void custDelete() throws InterruptedException {
	login();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Delete Customer")).click();
	driver.findElement(By.name("cusid")).sendKeys("13580");
	driver.findElement(By.name("AccSubmit")).click();

	
	  
  }
}
