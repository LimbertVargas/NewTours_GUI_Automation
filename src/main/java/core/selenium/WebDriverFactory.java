package core.selenium;

import core.selenium.webdrivers.Browsers;
import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.Firefox;
import org.openqa.selenium.WebDriver;

public final class WebDriverFactory {
    private static WebDriver webDriver;
    private static final String BROWSER_MESSAGE = "Browser is not exist";

    public static WebDriver getWebDriver(Browsers browsers) {
        switch (browsers) {
            case CHROME:
                webDriver = new Chrome().initChrome();
                break;

            case FIREFOX:
                webDriver = new Firefox().initFirefox();
                break;

            default:
                throw new RuntimeException(BROWSER_MESSAGE);
        }
        return webDriver;
    }
}
