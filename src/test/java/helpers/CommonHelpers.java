package helpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserFactory;

public class CommonHelpers {
    BrowserFactory browserFactory = new BrowserFactory();

    WebDriver driver;
    WebDriverWait wait;

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    public void BaseFunction() {
        browserFactory.setupBrowser();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 10);
    }

    public void openPage(String url) {
        LOGGER.info("Opening page by URL: " + url);

        if (!url.startsWith("http://") && !url.startsWith("https://")){
            url = "https://" + url;
        }

        driver.get(url);
    }

    public void click(By locator){
        LOGGER.info("Clicking on element: " + locator);

        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }

    public void clickEnterText(By locator, String text) {
        LOGGER.info("Waiting then field would be visible and entering text");

        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    public void closeBrowser() {
        driver.close();
    }

}