package MercuryTours.ui.common;

import core.utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is used for implement the read og the properties file.
 *
 * @author Limbet Alvaro Vargas Laura
 * @version 0.0.1
 */
public final class AppReader {
    private static final String URL_LOGIN = "url_login";
    private static final String FILE_PROPERTIES = "MercuryTours.properties";
    private static AppReader appReader;
    private Properties properties;
    private FileInputStream fileInputStream;

    /**
     * this method is used for initializes the variables.
     */
    private AppReader() {
        properties = readConfigFile();
    }

    /**
     * This method reads the file 'gradle.properties' ans return its values through the object 'properties'.
     *
     * @return an object 'properties' with wich you can get data from 'gradle.properties'.
     */
    private Properties readConfigFile() {
        try {
            fileInputStream = new FileInputStream(FILE_PROPERTIES);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            Log.getInstance().getLogger().error(e);
        }
        return properties;
    }

    /**
     * This method ensure that only one instance is created according to the build pattern.
     *
     * @return an instance of 'ReadAppProperties' type.
     */
    public static AppReader getInstance() {
        if (appReader == null) {
            appReader = new AppReader();
        }
        return appReader;
    }

    /**
     * This method is used for get the url of login in page.
     *
     * @param url The parameter url defines a input url for chose on properties file.
     * @return a string with the email.
     */
    public String getUrlLogin(final String url) {
        return properties.getProperty(url);
    }

    /**
     * This method is used for get the email of the user.
     *
     * @param property The parameter properties defines a input string for chose on properties file.
     * @return a string with the email.
     */
    public String getFileProperties(final String property) {
        return properties.getProperty(property);
    }
}
