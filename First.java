package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class First extends all{
	
	@Test (priority = 0)
	public void open() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void input() throws InterruptedException {
		
	WebElement name = driver.findElement(By.id("name"));
	name.sendKeys("Israt");
	Thread.sleep(1000);
	
	WebElement mobile = driver.findElement(By.id("phone"));
	mobile.sendKeys("0170000");
	Thread.sleep(1000);
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Israt@gmail.com");
	Thread.sleep(1000);
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("90@#$%90");
	Thread.sleep(1000);
	
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("Dhaka");
	Thread.sleep(1000);
	
	//Submit
	WebElement submit = driver.findElement(By.name("submit"));
	submit.click();
	Thread.sleep(1000);
    }
}
