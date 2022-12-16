package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Fifth extends all{
	
	@Test (priority = 0)
	public void open() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void hover() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		
		WebElement Automotive_Motorbike = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		actions.moveToElement(Automotive_Motorbike).perform();
		Thread.sleep(1000);
		
		WebElement Motorcycle_Riding_Gear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		actions.moveToElement(Motorcycle_Riding_Gear).perform();
		Thread.sleep(1000);
		
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		actions.moveToElement(helmet).perform();
		helmet.click();
		Thread.sleep(1000);	
	}
}

