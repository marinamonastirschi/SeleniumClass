package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // find the element to upload a file
        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        chooseFile.sendKeys("/Users/marinamonastirschi/Desktop/Screen Shot 2023-05-28 at 2.09.49 PM.png");

    }
}
