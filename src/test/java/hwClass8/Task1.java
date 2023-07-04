package hwClass8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement recruitmentBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentBtn.click();
        WebElement calender = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        calender.click();
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel = new Select(month);
        sel.selectByVisibleText("Feb");
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel2= new Select(year);
        sel2.selectByValue("2023");
        boolean found = false;
        while (!found) {
            List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));

            for (WebElement date : allDates) {
                String currentDate = date.getText();
                if (currentDate.equals("15")) {
                    date.click();
                }
            }found=true;

        }
    }
}
