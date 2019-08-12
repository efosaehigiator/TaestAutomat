package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

public class LoginPage extends DriverUtil {

    By SignInTab = By.xpath("//a[@class='login'][contains(.,'Sign in')]");
    By EmailButton = By.id("email");
    By PasswordButton = By.id("passwd");
    By SignInButton = By.xpath("//span[contains(.,'Sign in')]");

    String BaseUrl = "http://automationpractice.com";
public void launchUrl (){
        driver.get(BaseUrl);
     }


public void logIn () {
    WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(SignInTab)).click();

    }

public void enterEmailAddress () {
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.PAGE_UP).build().perform();
    WebDriverWait wait = new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(EmailButton)).sendKeys("wetindey@europe.com");
}

public void enterPassword(){
    driver.findElement(PasswordButton).sendKeys("medge");
}

public void clickSigInButton(){
    driver.findElement(SignInButton).click();
    if(driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=my-account")){
        System.out.println("Login Successful");
    }else {
        System.out.println("Login Fail");
    }

}




}



