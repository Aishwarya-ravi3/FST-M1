package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		String Title = driver.getTitle();
		System.out.println(Title);
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		firstname.sendKeys("Aishwarya");
		lastname.sendKeys("Ravi");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("aishu@gmail.com");
		WebElement contact = driver.findElement(By.id("number"));
		contact.sendKeys("1287399298");
		driver.findElement(By.className("green")).click();
		Thread.sleep(1000);
		driver.close();
	}
}
