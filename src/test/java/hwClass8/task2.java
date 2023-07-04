package hwClass8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class task2 extends CommonMethods {
    public static void main(String[] args) {


        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement userNAme=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        userNAme.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        password.sendKeys("Hum@nhrm123");
        WebElement login= driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        login.click();
        WebElement recrButt= driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b"));
        recrButt.click();
        WebElement cal= driver.findElement(By.xpath("//*[@id=\"frmSrchCandidates\"]/fieldset/ol/li[8]/img"));
        cal.click();
        WebElement clikYear= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
        Select sel=new Select(clikYear);
        sel.selectByVisibleText("2023");

        WebElement clickMonth= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
        Select sel2=new Select(clickMonth);
        sel2.selectByVisibleText("Jun");

        boolean found=false;
        while(!found){
            List<WebElement> days=driver.findElements(By.xpath("//table/tbody/tr/td"));
            for(WebElement day:days){
                String dayss=day.getText();
                if(dayss.equals("15")){
                    day.click();
                }
            }found=true;
        }
    }


}
