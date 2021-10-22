package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class = 'listing-item highlighted']");

    public RealtListingPage checkCountCards(){
        int countCards = driver.findElements(card).size();
        Assert.assertEquals(countCards, 20);
        return this;
    }
}
