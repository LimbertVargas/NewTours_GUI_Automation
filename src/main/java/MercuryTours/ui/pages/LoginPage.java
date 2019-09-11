package MercuryTours.ui.pages;

import MercuryTours.ui.common.AppReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class manage the login locators to use in the login test class.
 *
 * @author Limbert Alvaro Vargas Laura
 * @version 0.0.1
 */
public class LoginPage extends Base {

    @FindBy(name = "userName")
    private WebElement userNameTxtBx;

    @FindBy(name = "password")
    private WebElement passwdTxtBx;

    @FindBy(name = "login")
    private WebElement signInBtn;

    @FindBy(linkText = "SIGN-OFF")
    private WebElement homePageTxt;

    /**
     * This method uses for set the parameters to login.
     *
     * @param userName is in charge of manage the validate the user name.
     * @param password is in charge of manage the assign password to user name.
     */
    public void login(final String userName, final String password) {
        setUserName(AppReader.getInstance().getUsername());
        setPassword(AppReader.getInstance().getPassword());
        clickSignInBtn();
    }

    /**
     * This method sets the username in the text box of the login form.
     *
     * @param userName that represent a valid user name
     */
    public void setUserName(final String userName) {
        userNameTxtBx.sendKeys(userName);
    }

    /**
     * This method sets the password in the text box of the login form.
     *
     * @param password that represent a valid password for the user name.
     */
    public void setPassword(final String password) {
        passwdTxtBx.sendKeys(password);
    }

    /**
     * This method is in charge of clicking on the sign in button.
     */
    public void clickSignInBtn() {
        signInBtn.click();
    }

    /**
     * This method checks the user credentials with an text.
     *
     * @return the text "SIGN-OFF" to show in the page.
     */
    public String getText() {
        return homePageTxt.getText();
    }

    /**
     * This method close the window page.
     */
    public void closeWindow() {
        driver.close();
    }
}
