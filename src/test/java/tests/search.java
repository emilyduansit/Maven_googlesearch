package tests;
import  pages.searchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class search {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		searchPage spage = new searchPage(driver);
		
		spage.sendSearchText("rental");
		spage.searchTextReturn();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
