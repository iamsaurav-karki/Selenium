package seleniumproject1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String actual_title = driver.getTitle();
		if(actual_title.equals("Your Store")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		driver.close();

	}

}
