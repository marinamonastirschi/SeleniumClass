package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiDD extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // inspect and find the element that has the dropdown
       WebElement DD= driver.findElement(By.xpath("//select[@name='States']"));
       // create an object of the class and pass in the parameters the element dropdown
        Select sel=new Select(DD);
       boolean isMultiple= sel.isMultiple();
        System.out.println("The dropdown is multi select :"+isMultiple);

        // select by visible text
        sel.selectByVisibleText("California");

        //select by value
        sel.selectByValue("Ohio");

        // select by index
        sel.selectByIndex(7);

        // we have deselect methods also available for multi select dropdown
        sel.deselectByVisibleText("Ohio");
    }
}
