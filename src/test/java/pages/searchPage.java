package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
	
	WebDriver driver = null;
	
	By  search_field = By.cssSelector("input[name='q']");
	By  search_key = By.cssSelector("By.name('btnK')");
	By  search_luck = By.cssSelector("By.name('btnI')");
	
	
	public searchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void  sendSearchText (String  text) {
		
		 driver.findElement(search_field).sendKeys(text);
	}
	
	public void searchTextReturn() {
		driver.findElement(search_field).sendKeys(Keys.RETURN);
	}
	
	public void clicksearchKey () {
		
		 driver.findElement(search_key).click();
	}
	
	public void clickluckKey () {
		
		driver.findElement(search_luck).click();
	}
	

}
