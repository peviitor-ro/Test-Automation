package ro.peviitor.pageobject.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ro.peviitor.pageobject.BasePage;

public class HeaderModule extends BasePage {

    @FindBy(xpath = "//img[@alt='briefcase logo']")
    protected WebElement briefcaseLogo;
    @FindBy(xpath = "//section[contains(@class ,'topbar')]/a[@href='https://www.oportunitatisicariere.ro/voluntari']")
    protected WebElement joinUs;
    @FindBy(xpath = "//img[@alt='pe viitor logo']")
    protected WebElement logo;

    public boolean isBriefcaseLogoVisible() {
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

    private boolean isResultsShownInNewTabClickingOn(WebElement element) {
        String originalUrl = webDriver.getCurrentUrl();
        element.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

}
