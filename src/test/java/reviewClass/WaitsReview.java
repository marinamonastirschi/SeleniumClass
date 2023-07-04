package reviewClass;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsReview extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/dynamic_controls";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // find the checkbox and click it
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        // get the button and click on it
        WebElement removeBtn=driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeBtn.click();

        // we have to verify that text is gone
       WebElement text= driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']/following-sibling::p"));
        System.out.println(text.getText());

// get the button enable
       WebElement enable= driver.findElement(By.xpath("//form[@id=\"input-example\"]/child::button"));
       enable.click();
       // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // wait until
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id=\"input-example\"]/child::input")));
        // now send the text
       WebElement textBox= driver.findElement(By.xpath("//form[@id=\"input-example\"]/child::input"));
        System.out.println(textBox.isEnabled());
       textBox.sendKeys("blah blah");

    }
}
