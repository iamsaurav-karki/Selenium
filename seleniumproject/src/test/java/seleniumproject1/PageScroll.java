package seleniumproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PageScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/saura/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(3000);
		 js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,300)"); //
	List<WebElement> tableelement=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int sum = 0;
    for (int i=0; i<tableelement.size();i++) {
    	sum = sum + Integer.parseInt(tableelement.get(i).getText()); //Integer.parseInt -- converts string to integer.
		 	}
    System.out.println(sum);
    int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
    Assert.assertEquals(sum, total);
	}

}
