package ro.peviitor.pageobject.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.peviitor.pageobject.BasePage;

import java.time.Duration;

public class HeaderModule extends BasePage {

    @FindBy(xpath = "//img[@alt='briefcase logo']")
    protected WebElement briefcaseLogo;
    @FindBy(xpath = "//section[contains(@class ,'topbar')]/a[@href='https://www.oportunitatisicariere.ro/voluntari']")
    protected WebElement joinUs;
    @FindBy(xpath = "//a/img[@alt='pe viitor logo']")
    protected WebElement logo;

    public boolean isBriefcaseLogoVisible() {
        new WebDriverWait(webDriver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(briefcaseLogo));
        return briefcaseLogo.isDisplayed();
    }

    public boolean isJoinUsVisible() {
        return joinUs.isDisplayed();
    }

    public String joinUsLink() {
        return joinUs.getAttribute("href");
    }

    public String joinUsText() {
        return joinUs.getText();
    }

    public boolean isLogoVisible() {
        new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logo));
        return logo.isDisplayed();
    }

    public String headerLogoPosition() {
        return String.valueOf(logo.getLocation());
    }

    public boolean doesJoinUsLinkOpenInANewTab() {
        return isResultsShownInNewTabClickingOn(joinUs);
    }

    public boolean doesClickingOnLogoOpenNewTab() {
        return isResultsShownInNewTabClickingOn(logo);
    }

    public String getPageAfterClickingLogo(){
        logo.click();
        return  webDriver.getCurrentUrl();
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
