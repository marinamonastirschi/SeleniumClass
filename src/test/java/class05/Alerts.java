package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
       WebElement alertButton1= driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
       alertButton1.click();
        Thread.sleep(2000);
       // switch the focus of the driver to the alert
       Alert confirmationAlert= driver.switchTo().alert();
       confirmationAlert.accept();
       WebElement alertButton2=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
       alertButton2.click();
       Thread.sleep(2000);
       Alert confirmationAlert2= driver.switchTo().alert();
       confirmationAlert2.dismiss();

     WebElement alertButton3= driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
     alertButton3.click();
     Alert confirmationAlert3=driver.switchTo().alert();
     confirmationAlert3.sendKeys("john");
        Thread.sleep(2000);
        confirmationAlert3.accept();


    }
}
