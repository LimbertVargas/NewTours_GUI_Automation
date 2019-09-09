package steps;

import MercuryTours.ui.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    private static LoginPage loginPage;

    @Given("I visit the page")
    public void initializePage() {
        loginPage = new LoginPage();
    }

    @When("I fill the fields \"([^\"]*)\" and \"([^\"]*)\"$")
    public void fillSigInForm(String userName, String password){
        userName = "LimbertTest";
        password = "test123";
        loginPage.login(userName,password);
    }

    @Then("To check the user the title FLIGHT FINDER is displayed")
    public void verifyAccount() {
        Assert.assertEquals(loginPage.getImg(),"/images/masts/mast_flightfinder.gif");
    }
}
