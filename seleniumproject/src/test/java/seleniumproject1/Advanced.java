package seleniumproject1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Advanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// for explicit wait:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		String[] itemNames = { "Brocolli", "Cauliflower", "Cucumber" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, itemNames);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		// using explicit wait:

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		// or creating object of class Advanced.
		// Advanced a1 = new Advanced();
		// a1.addItems(driver, itemNames);

	}

	public static void addItems(WebDriver driver, String[] itemNames) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			// orignal Brocolli -1 Kg
			// splitting it to compare:
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// String name = products.get(i).getText();

			// converting array to arraylist for easy search
			// using another way to check:
			List items = Arrays.asList(itemNames);
			if (items.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemNames.length) {
					break;
				}
			}
		}

//			for(int i=0; i<products.size(); i++) {
//				String name = products.get(i).getText();
//			if(name.contains("Cucumber")) {
//				//click on add to cart
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//			}
//			
//		}
//		for(int i=0; i<products.size(); i++) {
//			String name = products.get(i).getText();
//			if(name.contains("Brocolli")) {
//				//click on add to cart
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//			}

	}

}
