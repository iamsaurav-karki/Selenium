package seleniumproject1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/saura/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companion/");
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("form-field-travel_comp_date")));
		Thread.sleep(2000);
		//element.click();
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		//November 23
		//grab common attribute put into list and iterate.
		Thread.sleep(3000);
		
		while(!driver.findElement(By.cssSelector(".cur-month")).getText().contains("November")) {
			driver.findElement(By.cssSelector(".flatpickr-next-month > svg:nth-child(1)")).click();
		}
		//Thread.sleep(3000);
	     List<WebElement> dates= driver.findElements(By.className("flatpickr-day"));
	     int count = driver.findElements(By.className("flatpickr-day")).size();
	     for(int i=0; i<count;i++) {
	    	 String text = driver.findElements(By.className("flatpickr-day")).get(i).getText(); 
	    	 if(text.equalsIgnoreCase("20")) {
	    		 driver.findElements(By.className("flatpickr-day")).get(i).click();
	    		 break;
	    	 }
	    	 
	     }
		
	}

}
