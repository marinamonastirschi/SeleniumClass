package hwClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Alice");
        driver.findElement(By.name("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("1111 Rush St");
        driver.findElement(By.name("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("12121");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("111-111-1111");
        driver.findElement(By.id("customer.ssn")).sendKeys("222-22-2222");
        driver.findElement(By.name("customer.username")).sendKeys("Rush123");
        driver.findElement(By.name("customer.password")).sendKeys("abracadabra");
        driver.findElement(By.name("repeatedPassword")).sendKeys("abracadabra");
        Thread.sleep(3000);
        driver.quit();

    }
}
