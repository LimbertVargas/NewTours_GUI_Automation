package MercuryTours.ui;

import MercuryTours.common.AppReader;
import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to navigate the page.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class PageTransporter {
    private static WebDriver webDriver;

    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public static void goToLoginPage(final String url) {
        webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.navigate().to(AppReader.getInstance().getUrlLogin(url));
    }
}
