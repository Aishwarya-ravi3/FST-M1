package LMSProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	JavascriptExecutor executor;

@BeforeTest
public void openbrowser()
{
	driver = new FirefoxDriver();
	driver.navigate().to("https://alchemy.hguy.co/lms/");	
}

@Test
public void allCourses()
{
	driver.findElement(By.xpath("//a[contains(@href,'/lms/my-account/')]")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[contains(@href,'#login')]")).click();
	driver.findElement(By.xpath("//*[@class='ld-modal-heading']")).getText();
	driver.findElement(By.xpath("//*[@id ='user_login']")).sendKeys("root");
	driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']")).isDisplayed());
	driver.findElement(By.xpath("//*[contains(@href,'/lms/all-courses/')]")).click();
	driver.findElement(By.xpath("//*[@class='btn btn-primary' and contains(@href,'lms/courses/social-media-marketing/')]")).isDisplayed();
	driver.findElement(By.xpath("//*[@class='btn btn-primary' and contains(@href,'lms/courses/social-media-marketing/')]")).click();
	driver.findElement(By.xpath("//h2[contains(text(),'Course Content')]")).isDisplayed();
	driver.findElement(By.xpath("//div[contains(text(),'Developing Strategy')]/parent::a")).click();
	String coursetitle=driver.findElement(By.xpath("//h1[text()='Developing Strategy']")).getText();
	System.out.println(coursetitle);
	Assert.assertEquals(coursetitle, "Developing Strategy");
	driver.findElement(By.xpath("//*[text()='Basic Investment & Social Media Influencing']")).click();
	WebElement completionStatus=driver.findElement(By.xpath("//div/div[contains(@class,'ld-status-complete')]"));
    Assert.assertEquals(completionStatus.getText(),"COMPLETE");
    
}

	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
}
