package hook;

import core.selenium.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
    WebDriver webDriver;

    public screenshot() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }
}
