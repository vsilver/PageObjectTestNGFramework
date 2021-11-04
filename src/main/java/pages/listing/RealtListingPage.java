package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class = 'listing-item highlighted']");

    public int checkCountCards(){
        int countCards = driver.findElements(card).size();
        return countCards;
    }
}
