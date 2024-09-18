package seleniumproject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calenderrecent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String year = "2027";
		String monthNumber = "6";
		String date ="15";
		
		String [] expectedList = {  monthNumber, date, year};
		driver.findElement(By.cssSelector("div.react-date-picker__wrapper")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
//		driver.findElement(By.xpath("//abbr[text()='June']")).click();
//		driver.findElement(By.xpath("//abbr[text()='15']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List<WebElement> actualdatelist = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0; i<actualdatelist.size();i++) {
		System.out.println(actualdatelist.get(i).getAttribute("value"));
		Assert.assertEquals(actualdatelist.get(i).getAttribute("value"), expectedList[i]);
		}

	}

}
