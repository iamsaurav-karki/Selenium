package seleniumproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:/Users/saura/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]")).click();
	}

}
