package com.testngpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase1 {

	WebDriver driver;
	
	@BeforeClass
	
	public void driversetup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver =new ChromeDriver();

	}
	
	
	@BeforeMethod
public void commonmethod() {
	
		driver.get("https://pankeke.dreamhosters.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		

}
	
	
	@Test
	public void validation1() {
	
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@name ='user_email']")).sendKeys("ajay");
		
		driver.findElement(By.xpath("//input[@name ='user_password']")).sendKeys("ajaykumar");
		
		driver.findElement(By.xpath("(//span[contains(text(),'Sign in')]//parent::a[@href='#'])[2]")).click();
		
		WebElement ele= driver.findElement(By.xpath("//li[@class='menu-item-has-children']//i"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		WebElement dashboard= driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
		act.moveToElement(dashboard).click(dashboard).build().perform();
		
		driver.findElement(By.xpath("//a[contains(@href ,'switch-profile')]")).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Place to Stay')]//parent::span//preceding-sibling::span[@class='rz--radio']")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[contains(text(),'Select a plan')]//parent::span)[2]")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='post_title']")).sendKeys("qqq");

		driver.findElement(By.xpath("//textarea[@name='post_content']")).sendKeys("wwwee");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		
		driver.findElement(By.xpath("//span[contains(text(),'Apartment')]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	
		js.executeScript("window.scrollBy(0,150)", "");
	

		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement category = driver.findElement(By.xpath("//span[contains(text(),'Entire place')]//parent::label//i"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", category);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", category); 
		 
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='rz_listing_region']")));

		sel.selectByVisibleText("Kuwait");
		
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='rz_beds']")).clear();
		driver.findElement(By.xpath("//input[@name='rz_beds']")).sendKeys("1");
		
		
		driver.findElement(By.xpath("//input[@name='rz_toilets']")).clear();
		driver.findElement(By.xpath("//input[@name='rz_toilets']")).sendKeys("1");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='rz_price']")).sendKeys("100");
		
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Continue')]/parent::a[@data-action='submission-continue']")).click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]//parent::a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

		
	}
	
	
	
	@AfterClass
	public void driverclose() {
		driver.close();
	}
	
	
	
}
