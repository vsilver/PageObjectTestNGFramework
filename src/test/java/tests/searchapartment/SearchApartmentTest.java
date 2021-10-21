package tests.searchapartment;

import tests.base.BaseTest;

import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {
    public void checkIsRedirectToListing(){
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .clickToFind();
    }

}
