package pages;

import constants.Constants;
import helpers.CommonHelpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageLocators.ServicePointsLocators;

public class ServicePointsPage {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    WebDriver driver;
    WebDriverWait wait;

    private CommonHelpers commonHelpers;
    private ServicePointsLocators servicePointsLocators = new ServicePointsLocators();
    private Constants constants = new Constants();

    public ServicePointsPage (CommonHelpers commonHelpers){
        this.commonHelpers = commonHelpers;
    }

    String address = constants.PICKUP_POINT_NEAREST_ADDRESS;

    public void lookingForAcceptCoockieBtn() {
        LOGGER.info("Looking for Coockie accept button to click on it");

       // commonHelpers.waitToBeVisible(servicePointsLocators.COOCKIE_ACCEPT_BTN);
       // commonHelpers.waitElementToBeLocated(servicePointsLocators.COOCKIE_ACCEPT_BTN);
       // commonHelpers.waitToBeClickable(servicePointsLocators.COOCKIE_ACCEPT_BTN);
        commonHelpers.click(servicePointsLocators.COOCKIE_ACCEPT_BTN);
    }

    public void enterPickupPointsAddress() {
        LOGGER.info("Find search field and enter nearest pickup points address and then click on search button");

        commonHelpers.clickEnterText(servicePointsLocators.SEARCH_FIELD, address);
        commonHelpers.click(servicePointsLocators.SEARCH_BTN);
    }

    public void findValidateNearestPoints() {
        LOGGER.info("Choose my locale address and validate that search field is not empty");

        for(int i=0; i<=5; i++) {
            commonHelpers.waitToBeVisible(servicePointsLocators.POSTI_POINTS);
            commonHelpers.waitToBeClickable(servicePointsLocators.POSTI_POINTS);
            commonHelpers.doubleClick(servicePointsLocators.POSTI_POINTS);
        }
    }

    public void zoomInPage() {
        LOGGER.info("Click on zoom in button");

        commonHelpers.waitToBeVisible(servicePointsLocators.ZOOMIN_BTN);
        commonHelpers.waitToBeClickable(servicePointsLocators.ZOOMIN_BTN);
        commonHelpers.click(servicePointsLocators.ZOOMIN_BTN);
    }

    public void zoomOutPage() {
        LOGGER.info("Click on zoom out button");

        commonHelpers.waitToBeVisible(servicePointsLocators.ZOOMOUT_BTN);
        commonHelpers.waitToBeClickable(servicePointsLocators.ZOOMOUT_BTN);
        commonHelpers.click(servicePointsLocators.ZOOMOUT_BTN);
    }

    public void openFullScreen() {
        LOGGER.info("Click on full screen button");

        commonHelpers.waitToBeVisible(servicePointsLocators.FULLSCREEN_BTN);
        commonHelpers.waitToBeClickable(servicePointsLocators.FULLSCREEN_BTN);
        commonHelpers.click(servicePointsLocators.FULLSCREEN_BTN);
    }

    public void chooseMyLocaleAddress() {
        LOGGER.info("Choose my locale address and validate that search field is not empty");

        commonHelpers.click(servicePointsLocators.SHARE_YOUR_LOCATION_BTN);
        commonHelpers.waitToBeVisible(servicePointsLocators.SEARCH_FIELD);
        commonHelpers.waitElementToBeLocated(servicePointsLocators.SEARCH_FIELD);
        commonHelpers.waitToBeClickable(servicePointsLocators.SEARCH_FIELD);
        String searchFieldValue = commonHelpers.getSearchFieldText(servicePointsLocators.SEARCH_FIELD);
        Assertions.assertFalse(searchFieldValue.isEmpty(), "Search field is empty");
    //    Assertions.assertNotNull(commonHelpers.getSearchFieldText(servicePointsLocators.SEARCH_FIELD), "\"Search field is empty\"");
    //    Assertions.assertEquals("", commonHelpers.getSearchFieldText(servicePointsLocators.SEARCH_FIELD), "Search field is not empty");
    }

    public void sleep () {
        try {
            Thread.sleep(7000);
        }
        catch (Exception e) {

        }

    }

}
