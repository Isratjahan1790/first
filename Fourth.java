package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fourth extends all{
	
	@Test (priority = 0)
	public void open() {

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	}
	
	@Test (priority = 1)
	public void assertion() throws InterruptedException {
		
		//Alert
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		jsAlert.click();
		String consolee = driver.switchTo().alert().getText();
		System.out.println(consolee);
		
		driver.switchTo().alert().accept();	
		Thread.sleep(2000);
		
		String seen = result.getText();
//		//Assert.assertEquals(seen, "You successfully clicked an alert");
//		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(seen, "You successfully clicked an");
		System.out.println(seen);
		Thread.sleep(2000);
	
		
		
		//Confirm
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		jsConfirm.click();

		String console = driver.switchTo().alert().getText();
		System.out.println(console);
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		String seennn = result.getText();
		System.out.println(seennn);
		Thread.sleep(2000);
	
		//Prompt
		WebElement jsPromt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		jsPromt.click();
		
		String conso = driver.switchTo().alert().getText();
		System.out.println(conso);
		
		driver.switchTo().alert().sendKeys("Hello JS");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
        String seenn = result.getText();
        System.out.println(seenn);
        Thread.sleep(2000);
		
		soft.assertAll();
		
	}

}
