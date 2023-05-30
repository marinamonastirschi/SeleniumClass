package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-radiobutton-demo.php", "chrome");
        // find the radio button male and click on it
        WebElement r1 = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();
        // check if the radio button r1 is selected
        boolean r1isSelected = r1.isSelected();
        System.out.println("The radio button male is selected: " + r1isSelected);
        // check if the radio button is displayed
        boolean r1isDisplayed = r1.isDisplayed();
        System.out.println("The radio button Male is displayed: " + r1isDisplayed);
        //check if is enabled
        boolean r1isEnabled = r1.isEnabled();
        System.out.println("The radio button Male is enabled: " + r1isEnabled);
        // in order to deselect click on female button
        WebElement r2 = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();
        // check if the button is deselected
        r1isSelected=r1.isSelected();
        System.out.println("The radio button male is selected: " + r1isSelected);


    }
}
