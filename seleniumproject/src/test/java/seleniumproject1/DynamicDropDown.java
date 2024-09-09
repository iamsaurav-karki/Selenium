package seleniumproject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// //a[@value='MAA']  -- chennai xpath
		// //a[@value='BLR']  -- bangalaru xpath
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		
		//or using parent to child Relationship:
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
		
		// working with date
		// selecting current data
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		

	}

}
