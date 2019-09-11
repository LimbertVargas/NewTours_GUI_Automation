package steps;

import MercuryTours.ui.pages.LoginPage;
import MercuryTours.ui.pages.PageTransporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * This class describes the steps for login test.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class LoginSteps {
    private LoginPage loginPage;

    /**
     * This method is in charge of opening the page.
     */
    @Given("I visit the main page of Mercury Tours")
    public void initializePage() {
        loginPage = PageTransporter.getInstance().goToLoginPage();
    }

    /**
     * This method fills in the user data to be able to log in.
     *
     * @param userName represent the user name.
     * @param password represent the password according to the username.
     */
    @When("I fill the fields \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fillSigInForm(final String userName, final String password) {
        loginPage.login(userName, password);
    }

    /**
     * This method checks the login with a text in the window.
     */
    @Then("To check the user, the title SIGN-OFF is displayed")
    public void verifyAccount() {
        Assert.assertEquals(loginPage.getText(), "SIGN-OFF");
    }
}
