package LMSProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {

	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
	
     driver = new FirefoxDriver();
     driver.navigate().to("https://alchemy.hguy.co/lms");
     Thread.sleep(5000);
	}	
	
	@Test
	public void allCourses()
	{
		driver.findElement(By.xpath("//*[contains(@href,'/lms/all-courses/')]")).click();
		System.out.println(driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText());
		List<WebElement> coursescount = driver.findElements(By.xpath("//article"));
		int coursescountsize = coursescount.size();
		System.out.println(coursescountsize);
		driver.close();	
	}

}
