package testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepdefinition.stepbulider;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\report\\Master_Report.html"},features="src\\test\\java\\feature",glue="stepdefinition",strict=true,dryRun=false)


public class testrunner extends baseclass {
	//public static WebDriver driver;
@BeforeClass
public static void brower() {
	// TODO Auto-generated method stub
browerlaunch();
}

@AfterClass
public static void quit() {
	// TODO Auto-generated method stub
System.out.println("System run successfully");
}
}
