package seleniumproject1;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupsHandling {

    public static void main(String[] args) {
        // Set ChromeOptions to exclude switches
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/saura/Downloads/chromedriver-win64/chromedriver.exe");

        // Initialize WebDriver with Chrome options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website
        driver.get("https://www.onlinekhabar.com/");
    }
}
