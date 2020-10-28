package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		/*solution 1.*/
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("motor");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.RETURN);
		
		//driver.manage().window().maximize();
		//driver.findElement(By.name("btnK")).click();	
		Thread.sleep(5000);
		/*solution 1.end*/
		
//		/*solution 2*/
//		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("motor");		
//		
//		driver.manage().window().maximize();
//		driver.findElement(By.name("btnK")).click();	
//		/*solution 2.end*/		
		
		driver.close();	
		
	}

}
