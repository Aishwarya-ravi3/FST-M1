package LMSProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Verify the website title
public class Activity1 {
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
	
     driver = new FirefoxDriver();
     driver.navigate().to("https://alchemy.hguy.co/lms");
	}
	
	@Test
	public void getTitle()
	{
     
	String actualTitle = driver.getTitle();
     String ExpectedTitle = "Alchemy LMS – An LMS Application";
     if(actualTitle.equalsIgnoreCase(ExpectedTitle))
     	 driver.close();
     else
    	 System.out.println("Title is not matching");
   
	}

}
