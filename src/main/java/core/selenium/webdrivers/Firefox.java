package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * This class initializes the specific characteristics of Chrome.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class Firefox implements IBrowsers {

    /**
     * Initializes Firefox driver.
     *
     * @return a FirefoxDriver.
     */
    public WebDriver init() {
        FirefoxDriverManager.getInstance().version("0.24.0").setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        return new FirefoxDriver(firefoxOptions);
    }
}
