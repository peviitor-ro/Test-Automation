package ro.peviitor.pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.peviitor.pageobject.BasePage;
import ro.peviitor.utils.TypesOfData;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class SerpPage extends BasePage {

    @FindBy(xpath = "//div[@class='details']/p")
    protected WebElement companyName;
    @FindBy(xpath = "//div[@class='details']/p[@class='location']")
    protected WebElement location;
    @FindBy(xpath = "//div[@class='details']/p[@class='location']/img")
    protected WebElement getLocationIcon;
    @FindBy(xpath = "//section[@class='load-more']/button")
    protected WebElement loadMore;
    @FindBy(xpath = "//div[@class='details']/h2")
    protected WebElement jobTitle;
    @FindBy(xpath = "//footer//img[@alt='peviitor logo']")
    private WebElement footerLogo;
    @FindBy(xpath = "//a[@class='btn-yellow btn']")
    private WebElement seeJob;
    @FindBy(xpath = "//section[@class='job']")
    private List<WebElement> totalJobs;

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

    public Integer initialNumberOfJobsPerPage() {
        return totalJobs.size();
    }

    public Integer numberOfJobDisplayedPerPageAfterClickOnLoadMoreButton() {
        loadMore.click();
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return totalJobs.size();
    }

    public boolean isJobNameDisplayedInJobSection() {return jobTitle.isDisplayed();}

    public boolean isCompanyNameDisplayedInJobSection() {
        return companyName.isDisplayed();
    }

    public boolean isCountryNameDisplayedInJobSection() {
        return location.isDisplayed();
    }

    public boolean isCountryIconDisplayedInJobSection() {
        return getLocationIcon.isDisplayed();
    }

    public boolean isLoadMoreButtonDisplayed() { return loadMore.isDisplayed();}

    public String loadMoreButtonText() {
        return loadMore.getText();
    }

    public boolean isAllJobDisplayed() {
        if(loadMore.isDisplayed()){
            loadMore.click();
        }
        return true;
    }
}
