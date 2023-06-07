package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        String url="http://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // click on help and privacy button
      WebElement helpBtn= driver.findElement(By.linkText("Help"));
      helpBtn.click();
      WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));
      privacyBtn.click();

      // get the window handle
       String mainPageHandle= driver.getWindowHandle();
        System.out.println("Main page handle is :"+mainPageHandle);
        // get all the window handles and print the titles associated with each window handle on the console
// switch to google help
        Set<String> allHandles= driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title=driver.getTitle();
            if(title.equals("Google Account Help")){
                break;
            }
           // System.out.println("The title associated with "+handle+" is "+title);
        }
        //when the focus is shifted
        System.out.println("the current page under focus is :"+driver.getTitle());

        // after switching to the page google account help, we can deal with any element we want in a regular manner
        // switch to main page
        driver.switchTo().window(mainPageHandle);
        // check
        System.out.println("the focus is on :"+driver.getTitle());
    }
}
