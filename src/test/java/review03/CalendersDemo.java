package review03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class CalendersDemo extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "https://www.delta.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement calender = driver.findElement(By.xpath("//div[@role='button']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // click on calendar
        js.executeScript("arguments[0].click();", calender);
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean found = false;
        while (!found) {
            String currentMonth = month.getText();
            if (currentMonth.equals("September")) {
                js.executeScript("arguments[0].style.border='4px solid red'",month);
                found = true;
            }
            //            next button
            if (!found) {
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();
            }
        }
       List<WebElement> dates= driver.findElements(By.xpath("//table/tbody/tr/td"));
        for(WebElement date: dates){
            String dd=date.getText();
            if(dd.equals("17")){
                date.click();
                break;
            }
        }
        takeScreenShot("selectedDate");
    }
}
