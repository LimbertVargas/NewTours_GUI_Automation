import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MercuryTours_AutomatedTest {

    private WebDriver driver;
    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");
    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
    By resgisterBtnLocator = By.name("register");

    By userLocator = By.name("userName");
    By passLocator = By.name("password");
    By signInBtnLocator = By.name("login");
    By homepageLocator = By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']");

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

    /**
     * This test use to register a user in the page.
     * @throws InterruptedException
     */
    @Test
    public void registerUser() throws InterruptedException {
        driver.findElement(registerLinkLocator).click();
        //timer
        Thread.sleep(2000);
        //for confirm if the image appear when clicking in the REGISTER buttom
        if(driver.findElement(registerPageLocator).isDisplayed()){
            driver.findElement(usernameLocator).sendKeys("LimbertUser");
            driver.findElement(passwordLocator).sendKeys("test123");
            driver.findElement(confirmPasswordLocator).sendKeys("test123");

            driver.findElement(resgisterBtnLocator).click();
        } else {
            System.out.println("Register page was not found");
        }

        List<WebElement> fonts = driver.findElements(By.tagName("font"));
        assertEquals("Note: Your user name is LimbertUser.",fonts.get(5).getText());
    }

    @Test
    public void signIn() throws InterruptedException {
        if(driver.findElement(userLocator).isDisplayed()) {
            driver.findElement(userLocator).sendKeys("LimbertTest");
            driver.findElement(passLocator).sendKeys("test123");
            driver.findElement(signInBtnLocator).click();
            Thread.sleep(2000);
            assertTrue(driver.findElement(homepageLocator).isDisplayed());
        } else {
            System.out.println("user name text box was not present");
        }
    }
}