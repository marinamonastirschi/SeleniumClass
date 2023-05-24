package hwClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Laura");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Doe");
        driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']")).sendKeys("123A@gmail.com");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("111-222-3333");
        driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("4 Privet Drive");
        driver.findElement(By.cssSelector("input[placeholder='city']")).sendKeys("Little Whinging");
        driver.findElement(By.cssSelector("select[name='state']")).sendKeys("United Kingdom");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("1235");
        driver.findElement(By.cssSelector("input[placeholder='Website or domain name']")).sendKeys("www.HarryPotter.com");
        driver.findElement(By.cssSelector("input[value='yes']")).click();
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("abracadabra");
    }
}
