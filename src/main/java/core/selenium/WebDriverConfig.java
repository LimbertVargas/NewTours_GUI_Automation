package core.selenium;

import core.selenium.webdrivers.Browsers;
import core.utils.Log;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class contains the basic configuration for the browser.
 *
 * @author Limbert Alvaro Vargas Laura.
 * @version 0.1
 */
public final class WebDriverConfig {
    private static WebDriverConfig webDriverConfig;
    private static Properties properties;
    private static final String EXPLICIT_WAIT = "explicit_wait";
    private static final String IMPLICIT_WAIT = "implicit_wait";
    private static final String BROWSER = "browser";
    private static final String MAIN_URL = "main_url";

    /**
     * This constructor initializes variables.
     */
    private WebDriverConfig() {
        properties = readConfigurationFile();
    }

    /**
     * This method reads browser properties and initializes the basic browser characteristics.
     */
    private Properties readConfigurationFile() {
        InputStream inputProperties;
        try {
            inputProperties = new FileInputStream("gradle.properties");
            properties = new Properties();
            properties.load(inputProperties);
        } catch (Exception e) {
            Log.getInstance().getLogger().error(e + "Something went wrong.");
            throw new NullPointerException(e + "Something went wrong");
        }
        return properties;
    }

    /**
     * This method verifies that there is only one instance of 'WebDriverConfig' and if there is not,
     * it creates it, according to the Singleton pattern.
     *
     * @return an instance of WebDriverConfig.
     */
    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    /**
     * This method get the properties  set for the WebDriver.
     *
     * @return a properties.
     */
//    public Properties getProperties() {
//        return properties;
//    }

    /**
     * This method gets the browser type set for the WebDriver.
     *
     * @return a browser type.
     */
    public Browsers getBrowser() {
        return Browsers.valueOf(properties.getProperty(BROWSER).toUpperCase());
    }

    /**
     * This method gets the implicit wait time set for the WebDriver.
     *
     * @return the implicit wait time for the browser.
     */
    public int getImplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(IMPLICIT_WAIT));
    }

    /**
     * This method gets the explicit wait time set for the WebDriver.
     *
     * @return the explicit wait time for the browser.
     */
    public int getExplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(EXPLICIT_WAIT));
    }
}
