package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        // task 1: print baby cat on screen and select Babycat from dropdown
        // as the WebElement is inside an iframe first we need to switch to it
        driver.switchTo().frame(1);
        // find the WebElement animal
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
       WebElement select= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel= new Select(select);
        sel.selectByValue("babycat");

        // switch the focus to main page
        driver.switchTo().defaultContent();
// switch to frame containing text box
        driver.switchTo().frame("frame1");
       WebElement input= driver.findElement(By.xpath("//input"));
       input.sendKeys("abracadabra");

       // switch to nested frame
       driver.switchTo().frame("frame3");
      driver.findElement(By.id("a")).click();


    }
}
