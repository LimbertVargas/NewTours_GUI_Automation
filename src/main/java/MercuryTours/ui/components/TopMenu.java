package MercuryTours.ui.components;

import MercuryTours.ui.pages.Base;
import core.selenium.WebDriverConfig;
import core.selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * TopMenu class
 *
 * @author Limbert Vargas
 * @version 1.0
 */
public class TopMenu extends Base {

    @FindBy(linkText = signOffLinkText)
    private WebElement homePageTxt;

    private final String signOffLinkText = "SIGN-OFF";

    public boolean isSignOffBtnDisplayed() {
       return isElementPresent(By.linkText(signOffLinkText));
    }

    // Move to other class
    private boolean isElementPresent(final By elementBy) {
        webDriverWait = new WebDriverWait(webDriver, 1);
        boolean isDisplayed;
        try {
            webDriver.findElement(elementBy);
            isDisplayed = true;
        } catch (NoSuchElementException e) {
            isDisplayed = false;
        } finally {
            webDriverWait = WebDriverManager.getInstance().getWebDriverWait();
        }
        return isDisplayed;
    }
}
