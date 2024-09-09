package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//testNg is one of the framework used with selenium 
//TestNg offers Assertions to check whether expected and actual output are identical.

public class HandlingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // this check whether the checkbox is selected or not.
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//Assert.assertFalse(false); // always expects false.
		
		
  // count the number of checkbox in the page:
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox")).size());
	}

}
