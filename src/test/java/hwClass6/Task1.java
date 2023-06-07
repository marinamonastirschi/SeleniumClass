package hwClass6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        // click the button "start"
        WebElement btnStart= driver.findElement(By.xpath("//button[@id='startButton']"));
        btnStart.click();
        WebElement message= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));

        // wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(message,"Welcome Syntax Technologies"));
        String text= message.getText();
        System.out.println(text);
    }
}
