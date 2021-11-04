package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By option2Rooms = By.xpath("//select[@id = 'rooms']//option[3]");
    private final By findBtn = By.xpath("//*[@class = 'common-search-submit btn btn-primary']");

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(option2Rooms).click();

        return this;
    }

    public RealtHomePage clickToFind(){
        WebElement btnFind = driver.findElement(findBtn);
        waitElementIsVisible(btnFind).click();

        return this;
    }

}
