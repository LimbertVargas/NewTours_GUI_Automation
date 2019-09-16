package steps;

import MercuryTours.ui.PageTransporter;
import cucumber.api.java.en.Given;

/**
 * This class is used for defines the steps of the scenarios.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class ManagerStep {
    /**
     * This method opens the page.
     *
     * @param url defines a input string with the url.
     */
    @Given("I visit the main page of Mercury Tours")
    public static void initializePage(final String url) {
        PageTransporter.goToLoginPage(url);
    }
}
