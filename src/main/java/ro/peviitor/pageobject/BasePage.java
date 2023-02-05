package ro.peviitor.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.peviitor.drivermanager.DriverManager;

import java.time.Duration;

import static ro.peviitor.utils.TypesOfData.*;


public class BasePage
{
    protected WebDriver webDriver;

    protected BasePage(WebDriver webDriver)
    {
        webDriver = DriverManager.getDriver();
        PageFactory.initElements(webDriver, this);
    }

    protected WebElement getElementBy(String byType, String path, int time)
    {
        switch (byType)
        {
            case ID:
                return new WebDriverWait(webDriver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(By.id(path)));
            case NAME:
                return new WebDriverWait(webDriver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(By.name(path)));
            case XPATH:
                return new WebDriverWait(webDriver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
            default:
                return null;
        }
    }

}
