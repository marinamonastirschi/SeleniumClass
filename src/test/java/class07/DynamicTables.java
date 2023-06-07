package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class DynamicTables extends CommonMethods {
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
        // click on PIM
        WebElement pimButton = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimButton.click();
        // print the row number of the row that has the id 56247A
        List<WebElement> allIds=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i < allIds.size(); i++) {
            String id=allIds.get(i).getText();
            if(id.equals("56247A")){
                System.out.println("the id is on row number "+(i+1));
            }
        }


    }
}