package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.training-support.net");
	String title = driver.getTitle();
    System.out.println("Page title is: " + title); 
	WebElement id = driver.findElement(By.id("about-link"));
	System.out.println(id.getText());
	WebElement classname = driver.findElement(By.className("green"));
	System.out.println(classname.getText());
	WebElement linktext = driver.findElement(By.linkText("About Us"));
	System.out.println(linktext.getText());
	WebElement cssSelector = driver.findElement(By.cssSelector(".green"));
	System.out.println(cssSelector.getText());
	driver.close();
	}
}
