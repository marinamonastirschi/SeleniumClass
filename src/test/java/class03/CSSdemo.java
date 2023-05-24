package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        // because the DOM doesn't have first name by default, shows up after click on create new account
        //and the codes takes some time to appear in DOM for firstName
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.cssSelector("input[placeholder='First name']"));
        firstName.sendKeys("Veronica");
        // close the popup
        driver.findElement(By.cssSelector("img[src$='Gm8t.png']")).click();
        driver.quit();


    }
}
