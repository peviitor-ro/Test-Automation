package ro.peviitor.pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.peviitor.pageobject.BasePage;
import ro.peviitor.utils.TypesOfData;

import java.time.Duration;

public class SerpPage extends BasePage {

    @FindBy(xpath = "//footer//img[@alt='peviitor logo']")
    private WebElement footerLogo;

    @FindBy(xpath = "//a[@class='btn-yellow btn']")
    private WebElement seeJob;

    public boolean isFooterLogoDisplayed() {
        new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(footerLogo));
        return footerLogo.isDisplayed();
    }

    public void open() {
        webDriver.get(TypesOfData.SERP);
    }

    public boolean isSeeJobButtonDisplayed() {
        return seeJob.isDisplayed();
    }

    public String seeJobText() {
        return seeJob.getText();
    }

    public boolean doesClickingOnVeziPostulOpenANewTab() {
        return isResultsShownInNewTabClickingOn(seeJob);
    }

    public boolean doesClickingOnFooterLogoOpenANewTab() {
        return isResultsShownInNewTabClickingOn(footerLogo);
    }

    private boolean isResultsShownInNewTabClickingOn(WebElement element) {
        String originalUrl = webDriver.getCurrentUrl();
        new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }
}
