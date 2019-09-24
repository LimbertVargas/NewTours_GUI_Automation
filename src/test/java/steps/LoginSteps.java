package steps;

import MercuryTours.ui.pages.ApplicationBasePage;
import MercuryTours.ui.pages.FlightsPage;
import MercuryTours.ui.pages.LoginPage;
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
    private static LoginPage loginPage = new LoginPage();
    FlightsPage flightsPage;

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



    public void testLogin() {
        loginPage = new LoginPage();

        flightsPage = loginPage.setUserName("")
                .setPassword("")
                .clickSignInBtn();
        Assert.assertTrue(flightsPage.getTopMenu().isSignOffBtnDisplayed(),
                "Login successful");
    }

}
