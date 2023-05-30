package hwClass4;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.facebook.com/","chrome");
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        WebElement month= driver.findElement(By.cssSelector("select[id='month']"));
        Select sel1=new Select(month);
        sel1.selectByValue("2");
        WebElement day= driver.findElement(By.cssSelector("select[id='day']"));
        Select sel2= new Select(day);
        sel2.selectByValue("16");
        WebElement year= driver.findElement(By.cssSelector("select[id='year']"));
        Select sel3= new Select(year);
        sel3.selectByValue("1992");
        Thread.sleep(2000);
        driver.quit();
    }
}
