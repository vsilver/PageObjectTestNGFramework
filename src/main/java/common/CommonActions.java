package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

import static common.Configurations.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(){
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER){
            case "windows_chrome":
                System.setProperty("webdriver.chrome.driver","src.main.resources");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser" + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }

    /*public static WebDriver getDriver(String browser){
        WebDriver defaultDriver = new FirefoxDriver();

        if ("CHROME".equalsIgnoreCase(browser)){
            return new ChromeDriver();
        } else if ("IE".equalsIgnoreCase(browser)){
            return new InternetExplorerDriver();
        } else if ("OPERA".equalsIgnoreCase(browser)){
            return new OperaDriver();
        } else {
            return defaultDriver;
        }
    }*/
}
