package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver = new ChromeDriver();
        // use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");
        //maximize the window of the browser
        driver.manage().window().maximize();
        // returns current url
        String currentURL=driver.getCurrentUrl();
        // print on the console
        System.out.println("the current url of the website is: "+currentURL);
        // get the title of the page
        String title=driver.getTitle();
        //print the title on the console
        System.out.println("the title of the page is: "+title);
        //add some wait time
        Thread.sleep(5000);
        //close the web browser
        driver.quit();


    }
}
