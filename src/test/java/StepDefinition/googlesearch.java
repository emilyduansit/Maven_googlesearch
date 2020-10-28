package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.searchPage;

public class googlesearch {
	
	WebDriver driver = null;
	searchPage spage = null;
	
	@Given("user open the browser")
	public void user_open_the_browser() {
	  
		this.driver = pages.Browser.getDriver();
		driver.get("https://google.com");
	}

	@Given("enter search text")
	public void enter_search_text() {
		
		spage = new searchPage(driver);
		
		spage.sendSearchText("tommorrow");
		
	   
	}

	@When("click return")
	public void click_return() {
		spage.searchTextReturn();
	}

	@Then("user is navigated to result page")
	public void user_is_navigated_to_result_page() {
		driver.close();
	}
}
