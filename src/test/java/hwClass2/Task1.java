package hwClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@rel='async']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Smith");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("user123@gmail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abracadabra");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("23");
        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1993");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(1000);
        driver.quit();


    }
}
