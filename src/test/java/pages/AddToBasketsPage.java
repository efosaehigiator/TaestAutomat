package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

public class AddToBasketsPage extends DriverUtil {
    By TShirtButton = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a");
    By ImageClick = By.xpath("//img[contains(@title,'Faded Short Sleeve T-shirts')]");
    By AddToCart = By.xpath("//span[contains(.,'Add to cart')]");
    By ProceedToCheckOut = By.xpath("//span[contains(.,'Proceed to checkout')]");
    By ViewBasket = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/b");
    By ItemIdentifyier = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a");

    public void ClickTShirtButton(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(TShirtButton)).click();

    }

    public void AddtoBaskets()throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(ImageClick));

        WebElement element = driver.findElement(ImageClick);
        actions.moveToElement(element).perform();
        driver.findElement(AddToCart).click();
        Thread.sleep(5000);
    }

    public void clickProceedToCheckOut(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckOut)).click();
    }

    public void verifyItemInBasket (){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(ViewBasket));
        WebElement element = driver.findElement(ViewBasket);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        String item = "Faded Short sleeve T-Shirt";
        if(driver.findElement(ItemIdentifyier).getText().contains(item))
        {System.out.println("Right Item");}
        else {
            System.out.println("Wrong Item");
        }
    }
}
