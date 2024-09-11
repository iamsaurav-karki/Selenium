package seleniumproject1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//1. Give me the count of links in the page.
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int elementCount = elements.size();
		System.out.println(elementCount);
		//2. count of links in footer section.
	 WebElement footerDriver= driver.findElement(By.id("gf-BIG"));
	 List<WebElement> footerElement =  footerDriver.findElements(By.tagName("a"));
	 System.out.println(footerElement.size());
	 //3. loop and click on link on first column and open in new tab.
	WebElement footerFirstdriver = footerDriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
	List<WebElement> footerfirst = footerFirstdriver.findElements(By.tagName("a"));
    System.out.println(footerfirst.size());
    for(int i=1; i<footerfirst.size();i++) {
    	String clickcontrol = Keys.chord(Keys.CONTROL,Keys.ENTER);
    	footerfirst.get(i).sendKeys(clickcontrol);
    	Thread.sleep(3000);
    	
    }
   Set<String> windows= driver.getWindowHandles();
   Iterator<String> it = windows.iterator();
   
   while(it.hasNext()) {
	   driver.switchTo().window(it.next());
	  System.out.println(driver.getTitle());
   }
   driver.quit();
	}

}
