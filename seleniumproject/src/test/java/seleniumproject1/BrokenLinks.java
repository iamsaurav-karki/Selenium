package seleniumproject1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args)  {
		// Set up Chrome WebDriver
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open the webpage
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		// Find all anchor elements
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links: " + links.size());
		int noofbrokenlinks = 0;
		
		// Iterate through each link
		for (WebElement link : links) {
			String ahrefattvalue = link.getAttribute("href");
			
			// Check if href is null or empty
			if (ahrefattvalue == null || ahrefattvalue.isEmpty()) {
				System.out.println("Href value is null or empty, skipping");
				continue;
			}
			
			// Convert href to URL and check if it's broken
			try {
				URL linkURL = new URL(ahrefattvalue); // Convert string to URL
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // Open connection to server
				conn.connect(); // Connect to server
				
				if (conn.getResponseCode() >= 400) {
					System.out.println(ahrefattvalue + " is a broken link.");
					noofbrokenlinks++;
				} else {
					System.out.println(ahrefattvalue + " is not a broken link.");
				}
			} catch (Exception e) {
				
			}
		}
		System.out.println("no of broken links:"+ noofbrokenlinks);
		
		// Close the browser
		driver.quit();
	}
}
