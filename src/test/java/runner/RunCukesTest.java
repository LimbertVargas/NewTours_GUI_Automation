package runner;

import MercuryTours.report.Report;
import core.selenium.WebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;

/**
 * RunCukesTest class.
 *
 * @author Maday Alcala
 * @version 0.0.1
 */
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"steps", "hook"},
        features = {"src/test/resources/features"})

public class RunCukesTest extends AbstractTestNGCucumberTests {
    /**
     * This method afterExecution executes the project, close the driver instance and generates the reports.
     */
    @AfterTest
    public void afterExecution() {
        WebDriverManager.getInstance().getWebDriver().quit();
        Report.getInstance().generateReport();
    }
}
