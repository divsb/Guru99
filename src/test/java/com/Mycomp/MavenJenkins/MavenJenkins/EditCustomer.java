package com.Mycomp.MavenJenkins.MavenJenkins;



import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Mycomp.MavenJenkins.testUtils.LoginBankHelper;

public class EditCustomer extends LoginBankHelper {
  @Test
  public void customerEdit()  throws InterruptedException{
	  login();
	  Thread.sleep(5000);
	driver.findElement(By.linkText("Edit Customer")).click();
	driver.findElement(By.name("cusid")).sendKeys("13580"); 
	driver.findElement(By.name("AccSubmit")).click();
	driver.findElement(By.name("city")).clear();
	driver.findElement(By.name("city")).sendKeys("Monroe");
	driver.findElement(By.name("sub")).click();
	Thread.sleep(5000);
	//String custedit = driver.findElement(By.className("heading3")).getText();
	System.out.println(driver.findElement(By.className("heading3")).getText());
	
	
  }
}