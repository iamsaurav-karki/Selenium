package seleniumproject1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("saurav");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText()
				.equals("Hello saurav, share this practice page and share your knowledge"));
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("saurav");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
	}

}
