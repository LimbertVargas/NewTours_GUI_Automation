package MercuryTours.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is the intermediary between the 'WebDriverManager' class and the pages.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public abstract class Base {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    /**
     * This method initializes the base class.
     */
    public Base() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        this.webDriverWait = WebDriverManager.getInstance().getWebDriverWait();
        PageFactory.initElements(webDriver, this);
    }
}
