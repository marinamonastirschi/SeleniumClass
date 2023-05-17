package hwClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
            driver.manage().window().maximize();
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
            driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
            String title= driver.getTitle();
            if(title.equals("Web Orders Login")){
                System.out.println("Title is correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }
    }

