package seleniumproject1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class locators {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out
String name = "saurav";
//for chromedriver
//System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//for firefox browser
System.setProperty("webdriver.gecko.driver", "C:/Users/saura/Downloads/geckodriver-v0.35.0-win64/geckodriver.exe");
WebDriver driver = new FirefoxDriver();

// for Edge Browser:
//System.setProperty("webdriver.edge.driver", "C:/Users/saura/Downloads/edgedriver_win64/msedgedriver.exe");
//WebDriver driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
String password = getPassword(driver);
//System.out.println(password);

driver.get("https://rahulshettyacademy.com/locatorspractice/");

//driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//
//driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//
//driver.findElement(By.className("signInBtn")).click();
//
//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//
//driver.findElement(By.linkText("Forgot your password?")).click();
//
//Thread.sleep(1000);//
//
//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//
//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//
//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//
//driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//
//driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
//
//driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//
//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//
//Thread.sleep(1000);

driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);

driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);

driver.findElement(By.id("chkboxOne")).click();

driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
Thread.sleep(2000);
//System.out.println(driver.findElement(By.tagName("p")).getText());

Assert.assertEquals("You are successfully logged in.",driver.findElement(By.tagName("p")).getText());
Assert.assertEquals("Hello "+name+",",driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
//using xpath method for text:

// incase of xpath we can replace the tagename by * :
driver.findElement(By.xpath("//button[text()='Log Out']")).click();
driver.close();
}
//locators l1 = new locators();  // creating objects.
//l1.getPassword(driver);
//creating the method to extract password from the displayed text.
public static String getPassword(WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
String passwordText = driver.findElement(By.cssSelector("form p")).getText();
String [] splittedText= passwordText.split("'");
String finalPassword = splittedText[1].split("'")[0];
return finalPassword;


//String[] finaltext= splittedText[1].split("'");
//finaltext[0];
	
	
}

}




