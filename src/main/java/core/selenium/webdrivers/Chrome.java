package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class initializes the specific characteristics of Chrome.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class Chrome {

    /**
     * Initializes Chrome driver.
     *
     * @return a ChromeDriver.
     */
    public WebDriver initChrome() {
        ChromeDriverManager.getInstance().version("76.0.3809.126").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        return new ChromeDriver(chromeOptions);
    }
}
