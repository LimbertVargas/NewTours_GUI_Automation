package MercuryTours.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {

    @FindBy(name = "userName")
    private WebElement userNameTxtBx;

    @FindBy(name = "password")
    private WebElement passwdTxtBx;

    @FindBy(name = "login")
    private WebElement signInBtn;

    @FindBy(linkText = "SIGN-OFF")
    private WebElement homePageTxt;

    public void login(final String userName, final String password) {
        setUserName(userName);
        setPassword(password);
        clickSignInBtn();
    }

    public void setUserName(final String userName) {
        userNameTxtBx.sendKeys(userName);
    }

    public void setPassword(final String password) {
        passwdTxtBx.sendKeys(password);
    }

    public void clickSignInBtn() {
        signInBtn.click();
    }

    public String getText() {
        return homePageTxt.getText();
    }

    public void closeWindow() {
        driver.close();
    }
}
