package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
static {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
			+"/driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")
			+"/driver/geckodriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.zoho.com/");
	WebElement e = driver.findElement(By.xpath("//a[.='Login']"));
	Thread.sleep(2000);
	e.click();
	/*driver.get("http://localhost/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();*/
	
}
}
