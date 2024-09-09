package seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Dropdown with select class
		//there is a select class in selenium 
//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
//		Select dropdown = new Select(staticDropdown);
//		dropdown.selectByIndex(3);
//		//System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("AED");
//		//System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("INR");
//		//System.out.println(dropdown.getFirstSelectedOption().getText());
//		System.out.println(dropdown.getAllSelectedOptions());
		
		
		//handling radio button and active and disable elements:
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
	    else {
	    	Assert.assertTrue(false);
	    }
	}

}
