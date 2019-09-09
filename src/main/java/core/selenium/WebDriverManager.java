package core.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * This class creates an instance of a browser.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class WebDriverManager {
    private static WebDriverManager webDriverManager;
    private static WebDriver webDriver;
    private static WebDriverWait webDriverWait;

    /**
     * Constructor of WebDriverManager.
     */
    public WebDriverManager() {
        initializes();
    }

    /**
     * This method verifies that there is only one instance of 'WebDriverManager'
     * and if there is not, it creates it, according to the Singleton pattern.
     *
     * @return 'webDriverManager' variable, that is an instance of WebDriverManager.
     */
    public static WebDriverManager getInstance() {
        if (webDriverManager == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    /**
     * This method initializes the characteristics of the browser.
     */
    private void initializes() {
        this.webDriver = WebDriverFactory.getWebDriver(WebDriverConfig.getInstance().getBrowser());
        this.webDriver.get("http://newtours.demoaut.com/");
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().implicitlyWait(WebDriverConfig.getInstance().getImplicitWaitTime(),
                TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, WebDriverConfig.getInstance().getExplicitWaitTime());
    }

    /**
     * This method returns an instance if WebDriverManager.
     *
     * @return webDriver, that is an instance of a browser.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }
}
