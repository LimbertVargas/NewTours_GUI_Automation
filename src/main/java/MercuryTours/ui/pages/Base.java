package MercuryTours.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Base {
    protected WebDriver driver;

    public Base() {
        this.driver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(driver,this);
    }
}
