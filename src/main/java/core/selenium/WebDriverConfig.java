package core.selenium;

import core.selenium.webdrivers.Browsers;

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
    private static InputStream inputProperties;
    private static final String EXPLICIT_WAIT = "explicit_wait";
    private static final String IMPLICIT_WAIT = "implicit_wait";
    private static final String BROWSER = "browser";

    /**
     * This constructor initializes variables.
     */
    private WebDriverConfig() {
        readConfigurationFile();
    }

    /**
     * This method reads the file 'gradle.properties' and returns its values through the object 'properties'.
     *
     * @return an object 'properties' with which you can get data from "gradle.properties".
     */
    public void readConfigurationFile() {
        try {
            inputProperties = new FileInputStream("gradle.properties");
            properties = new Properties();
            properties.load(inputProperties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    public Properties getProperties() {
        return properties;
    }

    public Browsers getBrowser() {
        return Browsers.valueOf(properties.getProperty(BROWSER));
    }

    public int getImplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(IMPLICIT_WAIT));
    }

    public int getExplicitWaitTime() {
        return Integer.parseInt(properties.getProperty(EXPLICIT_WAIT));
    }
}
