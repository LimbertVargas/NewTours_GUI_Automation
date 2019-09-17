package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * This interface is used for defines the behavior of the browsers.
 */
public interface IBrowsers {

    /**
     * This method defines the behavior for browser.
     *
     * @return a IBrowser
     */
    WebDriver init();
}
