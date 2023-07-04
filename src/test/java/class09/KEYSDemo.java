package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KEYSDemo extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // locate the username
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test",Keys.ENTER);


    }
}
