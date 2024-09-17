package seleniumproject1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandlingSSLIssues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	//	FirefoxOptions options1 = new FirefoxOptions();
	//	EdgeOptions options2 = new EdgeOptions();
		
		//handling proxy setup to access websites:
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("provide ip address and port no here");
		
		options.setCapability("proxy", proxy);
		
		//set default download directory when chrome downloads files.
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:/Users/saura/Downloads");
		options.setExperimentalOption("prefs", prefs);
	
	    //accepts insucure ssl
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
