package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // as the element is inside the iframe first we need to switch focus
        driver.switchTo().frame(0);
        // find the draggable WebElement
       WebElement drag= driver.findElement(By.id("draggable"));
       // find the dropable where you want to drop
      WebElement drop= driver.findElement(By.id("droppable"));
// Action class
        Actions actions= new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();
actions.scrollToElement(drag);
    }
}
