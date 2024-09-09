package seleniumproject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class windowActivities {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); // waits unitl all the components of page is loaded 100% 
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); //doesnot waits for the content to load completely.
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}
}
