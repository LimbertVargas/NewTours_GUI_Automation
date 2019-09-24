package steps;

import MercuryTours.ui.components.SideMenu;
import MercuryTours.ui.pages.ApplicationBasePage;
import cucumber.api.java.en.When;

/**
 * SideMenuSteps class
 *
 * @author Limbert Vargas
 * @version 1.0
 */
public class SideMenuSteps {

    @When("I go to \"(.*?)\" page$")
    public void navigateInSideMenu(final String option) {
        SideMenu sideMenu = new SideMenu();
        sideMenu.clickOption(option);
    }

    @When("I go to \"Flights\" page$")
    public void navigateInSideMenu() {

    }

    @When("I go to \"Home\" page$")
    public void navigateToHomePage() {

    }

}
