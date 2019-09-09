package core.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private static WebDriverManager webDriverManager;
    private static WebDriver webDriver;
    private static WebDriverWait webDriverWait;

    public WebDriverManager(){
        initializes();
    }

    public static WebDriverManager getInstance(){
        if(webDriverManager == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    private void initializes(){
        this.webDriver = WebDriverFactory.getWebDriver(WebDriverConfig.getInstance().getBrowser());
        this.webDriver.get("http://newtours.demoaut.com/");
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().implicitlyWait(WebDriverConfig.getInstance().getImplicitWaitTime(),
                TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, WebDriverConfig.getInstance().getExplicitWaitTime());
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
