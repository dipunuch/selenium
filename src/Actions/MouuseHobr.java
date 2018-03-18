package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouuseHobr {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")
				+"/driver/geckodriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.actimind.com/");
	String xp="//a[@class='c-link dropdown-toggle']";
	WebElement menu = driver.findElement(By.xpath(xp));
	Actions actions=new Actions(driver);
	actions.moveToElement(menu).perform();
	List<WebElement> allmenu = driver.findElements(By.xpath("//li"));
	System.out.println(allmenu.get(1).getText());
	
}
}
