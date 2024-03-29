package MercuryTours.ui.pages;

import MercuryTours.common.AppReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class manage the login locators to use in the login test class.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class LoginPage extends ApplicationBasePage {
    @FindBy(name = "userName")
    private WebElement userNameTxtBx;

    @FindBy(name = "password")
    private WebElement passwdTxtBx;

    @FindBy(name = "login")
    private WebElement signInBtn;


    /**
     * This method uses for set the parameters to login.
     *
     * @param userName is in charge of manage the validate the user name.
     * @param password is in charge of manage the assign password to user name.
     */
    public void login(final String userName, final String password) {
        setUserName(AppReader.getInstance().getFileProperties(userName));
        setPassword(AppReader.getInstance().getFileProperties(password));
        clickSignInBtn();
    }

    /**
     * This method sets the username in the text box of the login form.
     *
     * @param userName that represent a valid user name
     */
    public LoginPage setUserName(final String userName) {
        userNameTxtBx.sendKeys(userName);
        return this;
    }

    /**
     * This method sets the password in the text box of the login form.
     *
     * @param password that represent a valid password for the user name.
     */
    public LoginPage setPassword(final String password) {
        passwdTxtBx.sendKeys(password);
        return this;
    }

    /**
     * This method is in charge of clicking on the sign in button.
     */
    public FlightsPage clickSignInBtn() {
        signInBtn.click();
        return new FlightsPage();
    }

//    /**
//     * This method checks the user credentials with an text.
//     *
//     * @return the text "SIGN-OFF" to show in the page.
//     */
//    public String getText() {
//        return homePageTxt.getText();
//    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {
    }
}
