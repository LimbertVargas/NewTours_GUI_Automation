package core.selenium;

import core.selenium.webdrivers.Browsers;
import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.Firefox;
import org.openqa.selenium.WebDriver;

/**
 * WebDriverFactory class, this class initializes a browser according to the type it receives.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public final class WebDriverFactory {
    private static WebDriver webDriver;
    private static final String BROWSER_MESSAGE = "Browser is not exist";

    /**
     * This method returns the initialized web driver according to the name of the browser it receives.
     *
     * @param browsers this parameter indicates the type of browser to be initialized.
     * @return webDriver, an initialized browser.
     */
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
