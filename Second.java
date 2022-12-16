package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Second extends all{
	
	@Test (priority = 0)
	public void openurl() {
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void select() throws InterruptedException {
		
		WebElement sel = driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select select = new Select(sel);
		
//		select.selectByIndex(1);
//		Thread.sleep(3000);
		
//		select.selectByValue("1");
//		Thread.sleep(2000);
		
		select.selectByVisibleText("Norway");
		Thread.sleep(2000);
	}
}
