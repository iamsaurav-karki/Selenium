package practicemain;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class first {
    public static void main(String[] args) throws InterruptedException {
        // Set up the WebDriver (ensure you have the correct driver for your browser)
        WebDriver driver = new ChromeDriver();
        
        // Open the target URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Click on the logo
        driver.findElement(By.className("logoClass")).click();
        System.out.println(driver.getTitle());
        
        // Navigate back to the previous page
        driver.navigate().back();
        
        // Locate the link to be opened in a new tab
        WebElement link = driver.findElement(By.cssSelector(".blinkingText"));
        
        // Create Actions object
        Actions actions = new Actions(driver);
        
        // Open the link in a new tab
        actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform(); // Use Keys.COMMAND for Mac

        // Wait for a moment to ensure the new tab is opened
        Thread.sleep(2000);
        
//        // Switch to the new tab (the second window handle)
       Set<String> windowhandle =  driver.getWindowHandles();
       Iterator<String> It = windowhandle.iterator();
       String parentID = It.next();
       String childID = It.next();
       driver.switchTo().window(childID);
       System.out.println(driver.getTitle());
       driver.switchTo().window(parentID);
    }
}

