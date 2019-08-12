package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

public class SignUpPage extends DriverUtil {

    By SignIn = By.xpath("//a[@class='login'][contains(.,'Sign in')]");
    By EnterEmail = By.id("email_create");
    By CreateAccountButton = By.xpath("//span[contains(.,'Create an account')]");
    By TickTitle = By.xpath("//input[@type='radio'][contains(@id,'gender1')]");
    By FirstName = By.xpath("//input[contains(@name,'customer_firstname')]");
    By LastName = By.xpath("//input[contains(@name,'customer_lastname')]");
    By Password = By.xpath("//input[contains(@type,'password')]");
    By DateDropdown = By.xpath("//select[contains(@name,'days')]");
    By MonthDropdown = By.xpath("//select[contains(@name,'months')]");
    By YearsDropdown = By.xpath("//*[@id=\"years\"]");
    By AddressFirstName = By.xpath("//input[@id='firstname']");
    By AddressLastName = By.xpath("//input[@id='lastname']");
    By EnterHomeAddress = By.id("address1");
    By EnterCity = By.id("city");
    By SelectState = By.id("id_state");
    By EnterPostCode = By.id("postcode");
    By SelectCountry = By.id("id_country");
    By EnterMobilePhoneNumber = By.id("phone_mobile");
    By AssignAlias = By.id("alias");
    By RegisterButton = By.xpath("//span[contains(.,'Registe')]");






    String BaseUrl = "http://automationpractice.com";

    public void LauchUrl(){
        driver.get(BaseUrl);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public void ClickSignInButton(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(SignIn)).click();
    }

    public void EnterEmailAddress(){
        driver.findElement(EnterEmail).sendKeys("wetindey@europe.com");
    }

    public void ClickCreateAccount(){
        driver.findElement(CreateAccountButton).click();
        if(driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")){
            System.out.println("Registration page is opened");
        }else {System.out.println("Registration page not opened");}

    }

    public void TickTitle(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(TickTitle)).click();
    }

    public void FirstNameAndLastName(){
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        driver.findElement(FirstName).sendKeys("Automation");
        driver.findElement(LastName).sendKeys("Tester");
    }
    public void EnterPassword(){
        driver.findElement(Password).sendKeys("medge");
    }

    public void EnterDateOfBirth(){
        Select dropdown = new Select(driver.findElement(DateDropdown));
        dropdown.selectByValue("8");
    }

    public void EnterMonthOfBirth()throws InterruptedException{
        Select dropdown = new Select(driver.findElement(MonthDropdown));
        dropdown.selectByIndex(6);
        Thread.sleep(2000);
    }

    public void EnterYearOfBirth () throws InterruptedException{
        Select dropdown = new Select(driver.findElement(YearsDropdown));
        dropdown.selectByValue("2002");
        Thread.sleep(3000);

    }

    public void enterAddressDetails(){
        // scrolling up the page for element to be visible
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).build().perform();

        driver.findElement(AddressFirstName).sendKeys("Automation");
        driver.findElement(AddressLastName).sendKeys("Tester");

        //scrolling up page for element to be visible
        Actions actions1 = new Actions(driver);
        actions1.sendKeys(Keys.PAGE_UP).build().perform();

        driver.findElement(EnterHomeAddress).sendKeys("15 tester street");
        driver.findElement(EnterCity).sendKeys("Bramhall");
        Select state = new Select(driver.findElement(SelectState));
        state.selectByVisibleText("Arizona");

        driver.findElement(EnterPostCode).sendKeys("12345");

        Select country = new Select (driver.findElement(SelectCountry));
        country.selectByVisibleText("United States");

        driver.findElement(EnterMobilePhoneNumber).sendKeys("071234567");
        driver.findElement(AssignAlias).sendKeys("testAdmin");
    }

    public void ClickRegisterButton (){
        driver.findElement(RegisterButton).click();
    }

}
