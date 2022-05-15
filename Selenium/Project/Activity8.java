package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {

	WebDriver driver;
	
@BeforeTest	
public void openbrowser()
{
	driver = new FirefoxDriver();
	driver.navigate().to("https://alchemy.hguy.co/lms");
	
}

@Test
public void contact()
{
	driver.findElement(By.xpath("//*[contains(@href,'lms/contact/')]")).click();
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_0']")).sendKeys("Aishwarya");
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_1']")).sendKeys("aishu462@gmail.com");
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_3']")).sendKeys("Selenium");
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']")).sendKeys("Selenium Project");
	driver.findElement(By.xpath("//*[@id='wpforms-submit-8']")).click();
	driver.findElement(By.xpath("//*[@class='uagb-heading-text'][1]")).isDisplayed();
	driver.findElement(By.xpath("//*[@id='wpforms-confirmation-8']/p")).isDisplayed();
	System.out.println(driver.findElement(By.xpath("//*[@id='wpforms-confirmation-8']/p")).getText());
	
		
}

@AfterTest
public void closebrowser()
{
	driver.close();
}

}
