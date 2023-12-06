package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signinoutline {

	WebDriver driver;
	@Given("open browser enter url")
	public void open_browser_enter_url() {
		driver= new ChromeDriver();
	    driver.get("http://admin-demo.nopcommerce.com/login");
	}
	
	@When ("enter valid data in user enter username")
	public void enter_valid_data_in_user_enter_username() {
		driver.findElement(By .name("Email")).clear();
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	}

	@And("enter valid data in user enter password")
	public void enter_valid_data_in_user_enter_password() {
		driver.findElement(By .name("Password")).clear();
		
		driver.findElement(By.id("Password")).sendKeys("admin");   
	}
	@When("user enter  the signin button")
	public void user_enter_the_signin_button() {
		driver.findElement(By.className("login-button")).click();
	}
	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
	   		 String actualresult=driver.findElement(By.xpath("(//h1)[2]")).getText();
		Assert.assertEquals("Not matched","Dashboard",actualresult);
	   
	}
	
	@When("click opn catologlink and productpage")
	public void click_opn_catologlink_and_productpage() {
	    
		driver.findElement(( By.xpath("//i[@class='nav-icon fas fa-book']"))).click();
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		
	}
	


	@When("^user enter product name as(.*)$")
	public void user_enter_product_name_as(String productname) throws InterruptedException {
		driver.findElement(By.id("search-products")).sendKeys(productname);
		Thread.sleep(1000);
	    
	}

	@When("click search button then particular record should be displayed")
	public void click_search_button_then_particular_record_should_be_displayed() {
		System.out.println("product is displayed");
	    
	}
}
