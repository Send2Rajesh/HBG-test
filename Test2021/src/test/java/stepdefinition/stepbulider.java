package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testrunner.testrunner;

public class stepbulider extends baseclass {
	
	//public static WebDriver driver;
	
	
	@Given("^User enter the project URL$")
	public void user_enter_the_project_URL() throws Throwable {
	  // driver.get("https://www.facebook.com/");
		geturl("https://www.facebook.com/");
	}

	@Given("^User click \"([^\"]*)\" button$")
	public void user_click_button(String arg1) throws Throwable {
	   driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
	}

	@Given("^User enter Firstname \"([^\"]*)\"$")
	public void user_enter_Firstname(String arg1) throws Throwable {
		//WebDriverWait w=(WebDriverWait) new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(driver.findElement(By.name("firstname"))));
	   Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys(arg1);
	}

	@Given("^User enter Surname \"([^\"]*)\"$")
	public void user_enter_Surname(String arg1) throws Throwable {
		driver.findElement(By.name("lastname")).sendKeys(arg1);
	}

	@Given("^User enter Email \"([^\"]*)\"$")
	public void user_enter_Email(String arg1) throws Throwable {
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(arg1);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(arg1);
	}

	@Given("^User select the birth date \"([^\"]*)\"$")
	public void user_select_the_birth_date(String arg1) throws Throwable {
	    Select sc=new Select(driver.findElement(By.id("day")));
	    sc.selectByVisibleText(arg1);
	}

	@Given("^User select the birth month \"([^\"]*)\"$")
	public void user_select_the_birth_month(String arg1) throws Throwable {
		Select sc=new Select(driver.findElement(By.id("month")));
	    sc.selectByVisibleText(arg1);
	}

	@Given("^User select the birth year \"([^\"]*)\"$")
	public void user_select_the_birth_year(String arg1) throws Throwable {
		Select sc=new Select(driver.findElement(By.id("year")));
	    sc.selectByVisibleText(arg1);
	}

	@Given("^User click gender \"([^\"]*)\"$")
	public void user_click_gender(String arg1) throws Throwable {
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

	@Then("^User click submit button$")
	public void user_click_submit_button() throws Throwable {
		driver.findElement(By.name("websubmit")).click();
		Assert.fail();
	}


}
