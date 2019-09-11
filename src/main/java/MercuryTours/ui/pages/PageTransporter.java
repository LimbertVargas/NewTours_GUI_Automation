package MercuryTours.ui.pages;

import MercuryTours.ui.common.AppReader;
import org.openqa.selenium.WebDriver;
import core.selenium.WebDriverManager;

public class PageTransporter {
    private static PageTransporter pageTransporter;
    private WebDriver webDriver;

    private PageTransporter() {
        browserInit();
    }

    public void browserInit() {
        webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    public static PageTransporter getInstance() {
        if (pageTransporter == null) {
            pageTransporter = new PageTransporter();
        }
        return pageTransporter;
    }

    public void goToUrl (final String url) {
        webDriver.navigate().to(url);
    }

    public LoginPage goToLoginPage() {
        goToUrl(AppReader.getInstance().getUrlLogin());
        return new LoginPage();
    }
}
