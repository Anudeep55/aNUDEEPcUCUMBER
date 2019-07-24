package aNUDEEPcUCUMBER.aNUDEEPcUCUMBER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber45677 {
	WebDriver driver;
	@Given("I  launching the test me app in chrome")
	
	public void i_launching_the_test_me_app_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		
		System.out.println("Code for launching");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	}

	@Given("I click on the signin")
	public void i_lick_on_the_signin() {
		System.out.println("code for sign in");
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}
	@When("I provideusername {string}")
	public void i_provideusername(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		System.out.println("Your user name:"+string);
	}

	@When("I provide password {string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);	
		System.out.println("Your user name:"+string);
	}
	@Then("I click on login and verify")
	public void i_click_on_login_and_verify() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		String LoginVal= driver.getTitle();
		String s="Home";
		if(LoginVal.equals(s))
		{
			System.out.println("Login Succesw");
			
		}
		else
		{
			System.out.println("Login not  Succesw");
			driver.close();
		}
		
	}
}
