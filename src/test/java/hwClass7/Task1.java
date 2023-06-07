package hwClass7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // log into the website
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        //click on PIM
        WebElement pimButton = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimButton.click();

        List<WebElement> allElements= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < allElements.size(); i++) {
            String id=allElements.get(i).getText();
            if(id.equals("56768A")){
                System.out.println("The id is on the row number "+(i+1));
            }
        }
        driver.quit();
    }
}
