package ro.peviitor.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.peviitor.drivermanager.DriverManager;

import java.time.Duration;


public abstract class BasePage
{
    protected WebDriver webDriver;
    protected final WebDriverWait wait;

    protected BasePage()
    {
        this.webDriver = DriverManager.getDriver();
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 20), this);
    }
}
