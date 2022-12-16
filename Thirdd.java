package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Thirdd extends all{
	
	@Test (priority = 0)
	public void open() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void locator() throws InterruptedException {
		WebElement gender = driver.findElement(By.id("female"));
		gender.click();
		Thread.sleep(2000);
		
		WebElement tuesday = driver.findElement(By.id("tuesday"));
		tuesday.click();
		Thread.sleep(2000);
		
		WebElement friday = driver.findElement(By.id("friday"));
		friday.click();
		Thread.sleep(2000);
	}

}
