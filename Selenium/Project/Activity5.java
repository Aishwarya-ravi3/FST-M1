package LMSProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {

	
	WebDriver driver;
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
	
     driver = new FirefoxDriver();
     driver.navigate().to("https://alchemy.hguy.co/lms");
     Thread.sleep(5000);
	}	
		@Test
		public void Myaccount()
		{
			driver.findElement(By.xpath("//a[contains(@href,'/lms/my-account/')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pagetitle = driver.getTitle();
			System.out.println(pagetitle);
			String Expectedpagetitle = "My Account – Alchemy LMS"; 
			if(pagetitle.equalsIgnoreCase(Expectedpagetitle))
			{
				System.out.println("My Account – Alchemy LMS is matched and closing the browser");
		
			}
			
		
			String myaccounttext = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
			System.out.println(myaccounttext);
			String Expectedmyaccounttext = "My Account"; 
			if(myaccounttext.equalsIgnoreCase(Expectedmyaccounttext))
			{
				System.out.println("My Account text is matched and closing the browser");
				driver.close();
			}
			else
			{
				System.out.println("My Account – Alchemy LMS is not matched thus browser is not closed");
			}
			
	}

}
