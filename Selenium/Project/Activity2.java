package LMSProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Verify the website heading
public class Activity2 {

WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
	
     driver = new FirefoxDriver();
     driver.navigate().to("https://alchemy.hguy.co/lms");
	}	
	
	@Test
	public void getpageTitle()
	{
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     String pagetitle = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
	     String expectedpagetitle = "Learn from Industry Experts";
	     if(pagetitle.equalsIgnoreCase(expectedpagetitle))
	    	 {
	    	 System.out.println("Page title is matching"); 
	    	 driver.close();
	    	 }
	     	 
	     else
	    	 System.out.println("Page title is not matching"); 
	}

}
