package LMSProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 {

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
			}
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[contains(@href,'#login')]")).click();
			driver.findElement(By.xpath("//*[@class='ld-modal-heading']")).getText();
			driver.findElement(By.xpath("//*[@id ='user_login']")).sendKeys("root");
			driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
			driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']")).isDisplayed());
			driver.close();
			

		}


	}


