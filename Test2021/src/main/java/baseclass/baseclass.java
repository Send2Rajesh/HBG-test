package baseclass;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	
	public static WebDriver driver;
	
 public static WebDriver browerlaunch() {
	// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
}
 public static void geturl(String url) {
	// TODO Auto-generated method stub
driver.get(url);
}
 
 public static void dropdown_duplicates() {
	// TODO Auto-generated method stub
Select sc=new Select(driver.findElement(By.xpath("Xpath")));
List<WebElement> options = sc.getOptions();
int size = options.size();
Set<WebElement>set=new TreeSet<WebElement>();
for (WebElement webElement : options) {
	//set.add(webElement.toString().toLowerCase().replace(" ", ""));
}
int size2 = set.size();
if (size==size2) {
	System.out.println("no duplicate found in drop down");
}else {
	System.out.println("duplicate found in drop down");
}
}
}
