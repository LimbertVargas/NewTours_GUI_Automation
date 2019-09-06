import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {

    private WebDriver driver;
    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");
    By usernameLocator = By.id("email");
    By passwordLocator = By.name("password");
    By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
    By resgisterBtnLocator = By.name("register");

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

    }
}