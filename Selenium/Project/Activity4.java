package LMSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
	
     driver = new FirefoxDriver();
     driver.navigate().to("https://alchemy.hguy.co/lms");
     Thread.sleep(5000);
	}	
	
		@Test
		public void verifyemailmarketingtext()
		{
		String actualemailMarketingText = driver.findElement(By.xpath("//*[@id='post-71']/div[2]/h3")).getText();
		String ExpectedemailMarketingText = "Email Marketing Strategies";
		if(actualemailMarketingText.equalsIgnoreCase(ExpectedemailMarketingText))
		{
			System.out.println("Email Marketing Strategies text matched");
			driver.close();
		}
		else
			System.out.println("Email Marketing Strategies text is not matched");

	}

}
