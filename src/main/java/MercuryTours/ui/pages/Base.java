package MercuryTours.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class is the intermediary between the 'WebDriverManager' class and the pages.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public abstract class Base {
    protected WebDriver driver;

    /**
     * This method initializes the base class.
     */
    public Base() {
        this.driver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(driver, this);
    }
}
