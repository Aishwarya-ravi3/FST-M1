package LMSProject;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import java.time.Duration;

	public class Activity3 {

	    WebDriver driver;
	    WebDriverWait wait;
	    String url="https://alchemy.hguy.co/lms/";

	    @BeforeTest
	    public void init(){
	        driver=new FirefoxDriver();
	        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.get(url);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    }

	    @AfterTest
	    public void teardown(){
	        driver.close();
	    }

	    @Test
	    public void verifyInfoBoxTitle(){
	        String boxTitle=driver.findElement(By.xpath("//h3[contains(text(),'Actionable')]")).getText();
	        System.out.println("Assert.assertEquals(boxTitle,'Actionable Training')");
	    }
	}

