package core.selenium;

import core.selenium.webdrivers.Browsers;
import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.Firefox;
import core.selenium.webdrivers.IBrowsers;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static core.selenium.webdrivers.Browsers.CHROME;
import static core.selenium.webdrivers.Browsers.FIREFOX;

/**
 * WebDriverFactory class, this class initializes a browser according to the type it receives.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class WebDriverFactory {
    private static WebDriver webDriver;
    private static final String BROWSER_MESSAGE = "Browser is not exist";

    /**
     * This method returns the initialized web driver according to the name of the browser it receives.
     *
     * @param browsers this parameter indicates the type of browser to be initialized.
     * @return webDriver, an initialized browser.
     */
    public static WebDriver getWebDriver(final Browsers browsers) {
        Map<Browsers, IBrowsers> map;
        map = new HashMap<>();
        map.put(CHROME, new Chrome());
        map.put(FIREFOX, new Firefox());
        return map.get(browsers).init();
    }
}
