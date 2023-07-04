package class09;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
       WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions= new Actions(driver);
        // perform the right click
        //right click is also called context click
        actions.contextClick(rightClick).perform();
        WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
       actions.click(edit).perform();
       driver.switchTo().alert().accept();

       // find the WebElement to double click
        WebElement doubleClick= driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        actions.doubleClick(doubleClick).perform();
        driver.switchTo().alert().accept();
    }
}
