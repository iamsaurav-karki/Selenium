package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/saura/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("https://practice.expandtesting.com/hovers");
//		//driver.get("https://www.amazon.com/ref=nav_logo");
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][1]/img"))).build().perform(); //build means this step is ready to execute.
//		//perform means now it executes.
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("autocomplete"))).click().keyDown(Keys.SHIFT).sendKeys("nepal").doubleClick().build().perform();
		//move to specific element
		//a.moveToElement(driver.findElement(By.id("mousehover"))).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.className("logoClass"))).contextClick().build().perform();
		

	}

}
