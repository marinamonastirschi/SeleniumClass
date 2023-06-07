package class06;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        // click on enable button after 10 sec then click on the button
        // we don't know what is the time to get enabled
       WebElement button1= driver.findElement(By.xpath("//button[@id='enable-button']"));
       button1.click();
       // declare the wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("First-Name")));
       WebElement eBtn=driver.findElement(By.xpath("//button[text()='Button']"));
       eBtn.click();

      WebElement alertBtn= driver.findElement(By.xpath("//button[@id='alert']"));
      alertBtn.click();

      wait.until(ExpectedConditions.alertIsPresent());
     Alert alert= driver.switchTo().alert();
     alert.accept();
    }
}
