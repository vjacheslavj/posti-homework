package pageLocators;

import org.openqa.selenium.By;

public class ServicePointsLocators {
    public final By COOCKIE_ACCEPT_BTN = By.id("onetrust-accept-btn-handler");
    public final By SEARCH_FIELD = By.id("searchTerm");
    public final By SHARE_YOUR_LOCATION_BTN = By.xpath("(//span[@class = 'sc-1ux7fz4-2 eTFgeo'])[1]");
    public final By SEARCH_BTN = By.xpath("(//span[@class = 'sc-1ux7fz4-2 eTFgeo'])[2]");
    public final By POSTI_POINTS = By.xpath("//div[contains(@class,'Component-root-0-1-54')]");
    public final By ZOOMIN_BTN = By.xpath("(//div[@class='gmnoprint']//*[@class= 'gm-control-active'])[1]");
    public final By ZOOMOUT_BTN = By.xpath("(//div[@class='gmnoprint']//*[@class= 'gm-control-active'])[2]");
    public final By FULLSCREEN_BTN = By.cssSelector("button.gm-fullscreen-control");
}
