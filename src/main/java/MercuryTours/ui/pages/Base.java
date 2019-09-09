package MercuryTours.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    public WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(driver,this);
    }
}
