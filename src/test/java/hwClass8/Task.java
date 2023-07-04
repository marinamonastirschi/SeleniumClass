package hwClass8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task extends CommonMethods {
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

        // click on PIM
        WebElement pimButton = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimButton.click();
        // get all the ids form the table into the list
        List<WebElement> allIds= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        // iterate thru the ids and find the id 18601439  and click on associated checkbox
        for (int i = 0; i < allIds.size(); i++) {
            String id= allIds.get(i).getText();
            if(id.equals("18601439")){
                System.out.println("The row number is "+(i+1));
            }
        }

    }
}
