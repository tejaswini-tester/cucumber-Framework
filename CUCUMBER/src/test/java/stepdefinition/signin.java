package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signin {
	
	ChromeDriver driver;
	@Given("user is in login page")
	public void user_is_in_login_page() {
		driver= new ChromeDriver ();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@When ("enter valid data in username  in inputfield")
	public void enter_valid_data_in_username_in_inputfield() {
		
		driver.findElement(By.id("username")).sendKeys("student");
	}

	@And("enter valid data in password  in inputfield")
	public void enter_valid_data_in_password_in_inputfield() {
		
		driver.findElement(By.id("password")).sendKeys("Password123");   
	}
	@When("user enter  the login button")
	public void user_enter_the_login_button() {
		driver.findElement(By.id("submit")).click(); 
	}
	@Then("user should navigate to Dashboardpage")
	public void user_should_navigate_to_Dashboardpage() {
	   		 String actualresult=driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals("Not matched","Logged In Successfully",actualresult);
	   
	}
	


@When("enter Invalid data in username  in inputfield")
public void enter_invalid_data_in_username_in_inputfield() {
	driver.findElement(By.id("username")).sendKeys("puttitejaswfghjini@gmail.com");
    
}

@When("enter Invalid data in password in  inputfield")
public void enter_invalid_data_in_password_in_inputfield() {
	driver.findElement(By.id("password")).sendKeys("Bitdfghjtuchinnu@3106"); 
}

@When("user click  the login button")
public void user_click_the_login_button1() {
	driver.findElement(By.id("submit")).click(); 
}

@Then("user getting error message username and password are invalid")
public void user_getting_error_message_username_and_password_are_invalid() {
	//Thread.sleep(2000);
	String actualresult=driver.findElement(By.id("error")).getText();
	String expectederror ="Your username is invalid!";
	
	Assert.assertEquals("data is not matched",expectederror,actualresult );
   }


}
