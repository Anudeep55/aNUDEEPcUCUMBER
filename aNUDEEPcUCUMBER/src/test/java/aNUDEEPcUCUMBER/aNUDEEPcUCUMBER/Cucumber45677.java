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
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}
	@When("I provideusername {string}")
	public void i_provideusername(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(string);
		 driver.findElement(By.xpath("//span[text()='Male']")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(string);
		 driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(string); 
		 driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(string);
//		 driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(string);
	
		System.out.println("Your user name:"+string);
		System.out.println("Your user fname:"+string);
		System.out.println("Your user lname:"+string);
		System.out.println("Your user password:"+string);
		System.out.println("Your user Cnfrpassword:"+string);
		System.out.println("Your user email:"+string);
		System.out.println("Your user mobile:"+string);
		System.out.println("Your user dob:"+string);
		System.out.println("Your user address:"+string);
		System.out.println("Your user answer:"+string);
	}

	@When("I provide password {string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(string);	
		System.out.println("Your user answer:"+string);
	}
	@Then("I click on login and verify")
	public void i_click_on_login_and_verify() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
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
