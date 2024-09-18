package practicemain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.id("autocomplete")).sendKeys("Ne");
		Thread.sleep(3000);
		List<WebElement> countrywithne = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //div[@class='ui-menu-item-wrapper']"));
		for(WebElement country : countrywithne) {
			if(country.getText().equals("Nepal")) {
				country.click();
				break;
			}
		}


	}

}
