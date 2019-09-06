package core.selenium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class WebDriverConfig {
    private static WebDriverConfig webDriverConfig;
    private Properties properties;
    private InputStream inputProperties;

    /**
     * This is constructor for init variables.
     */
    private WebDriverConfig() {
        properties = readConfigurationFile();
    }

    /**
     *This method reads the file 'config.properties' and returns its values through the object 'properties'.
     *
     * @return an object 'properties' with which you can get data from "gradle.properties".
     */
    private Properties readConfigurationFile() {
        try {
            inputProperties = new FileInputStream("gradle.properties");
            properties = new Properties();
            properties.load(inputProperties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static WebDriverConfig getInstance(){
        if(webDriverConfig == null){
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    public Properties getProperties(){
        return properties;
    }

    public String getBrowser(){
        return properties.getProperty("browser");
    }

    public String getImplicitWait(){
        return properties.getProperty("ImplicitWait");
    }

    public String getExplicitWait(){
        return properties.getProperty("ExplicitWait");
    }
}
