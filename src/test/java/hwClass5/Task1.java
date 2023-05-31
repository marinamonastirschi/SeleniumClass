package hwClass5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox= driver.findElement(By.id("a"));
        checkBox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement animals= driver.findElement(By.id("animals"));
        Select sel= new Select(animals);
        sel.selectByValue("babycat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox= driver.findElement(By.xpath("//input"));
        textBox.sendKeys("flash");
        Thread.sleep(2000);
        driver.quit();




    }
}
