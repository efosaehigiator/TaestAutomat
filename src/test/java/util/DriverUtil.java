package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {
    public static WebDriver driver;
    public void setdriver(String Browser) {
        if (driver == null) {
            if (Browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "C:\\DRIVERS\\geckodriver.exe");
                }
                driver = new FirefoxDriver();
            }
        }

        public void TearDown (){
        driver.quit();
        driver = null;
        }
}
