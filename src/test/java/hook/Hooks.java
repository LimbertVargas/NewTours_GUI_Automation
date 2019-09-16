package hook;

import core.selenium.WebDriverManager;
import core.utils.Log;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * This class is used for defines the Hooks hooks.
 *
 * @author Limber Alvaro Vargas Laura.
 * @version 0.0.1
 */
public class Hooks {
    private WebDriver webDriver;

    /**
     * This method is used for initializes the variables.
     */
    public Hooks() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * This method is used for implement After.
     * @param scenario The parameter scenario defines a input scenario.
     */
    @After
    public void tearDown(final Scenario scenario) {
        if (scenario.isFailed()) {
            try{
                byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException e) {
                Log.getInstance().getLogger().error(e + "Scenario is failed.");
                throw new WebDriverException();
            }
        }
    }
}
