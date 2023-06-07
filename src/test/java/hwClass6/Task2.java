package hwClass6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // click the button get new user
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement getNewUser= driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUser.click();

        WebElement firstName= driver.findElement(By.xpath("//p[contains(text(),'First Name ')]"));
        String text= firstName.getText();
        System.out.println(text);
    }
}