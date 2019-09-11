package MercuryTours.ui.common;

import core.utils.Log;
import java.io.FileInputStream;
import java.util.Properties;

public class AppReader {
    private static final String URL_LOGIN = "url_login";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String FILE_PROPERTIES = "MercuryTours.properties";
    private static AppReader appReader;
    private Properties properties;

    private AppReader() {
        readConfigFile();
    }

    private void readConfigFile() {
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(FILE_PROPERTIES);
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            Log.getInstance().getLogger().error(e + "Something went worng");
        }
    }

    public static AppReader getInstance() {
        if (appReader == null) {
            appReader = new AppReader();
        }
        return appReader;
    }

    public String getUrlLogin() {
        return properties.getProperty(URL_LOGIN);
    }

    public String getUsername() {
        return properties.getProperty(USERNAME);
    }
    public String getPassword() {
        return properties.getProperty(PASSWORD);
    }
}
