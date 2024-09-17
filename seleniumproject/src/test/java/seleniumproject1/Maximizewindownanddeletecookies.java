package seleniumproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximizewindownanddeletecookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 //delete specific session login cookie
		 driver.manage().deleteCookieNamed("providecookiename");
		 //then user again have to specify credentials to login.
		 
		 
	}

}
