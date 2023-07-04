package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //press the login button
        WebElement loginbtn = driver.findElement(By.id("btnLogin"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginbtn);
        // declare the instance
        TakesScreenshot ts= (TakesScreenshot) driver;
        File screenShot=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File("/Users/marinamonastirschi/IdeaProjects/syntaxSdetBatch16Basic/screenshot/testSyntax1.png"));

    }
}
