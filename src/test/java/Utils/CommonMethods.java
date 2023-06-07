package Utils;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static void sentText(String text, WebElement element){
        element.sendKeys(text);
    }
}
