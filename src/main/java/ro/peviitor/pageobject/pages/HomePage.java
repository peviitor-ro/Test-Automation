package ro.peviitor.pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ro.peviitor.pageobject.BasePage;
import ro.peviitor.utils.TypesOfData;

public class HomePage extends BasePage {
    @FindBy(xpath = "//h1")
    protected WebElement pageTitle;
    @FindBy(xpath = "//section[@class='banner']")
    protected WebElement blueSection;
    @FindBy(xpath = "//section[@class='banner']/h3")
    protected WebElement doYouWantHelp;
    @FindBy(xpath = "//p[@class='description']")
    protected WebElement joinAndHelpOut;
    @FindBy(xpath = "//a[@class='btn-yellow btn' and contains(@href,'voluntari')]")
    protected WebElement joinUs;
    @FindBy(xpath = "//section[@class='title']/h1")
    protected WebElement findWantedJobNow;
    @FindBy(xpath = "//section[@class='title']/h1/span")
    protected WebElement wantedJob;
    @FindBy(xpath = "//section[@class='title'] /p[@class='description']")
    protected WebElement secondLineWantedJob;

    public void open() {
        webDriver.get(TypesOfData.HOMEPAGE);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public String firstLineBlueSectionText() {
        return doYouWantHelp.getText();
    }

    public String secondLineInBlueSectionText() {
        return joinAndHelpOut.getText();
    }

    public String theThirdLineText() {
        return joinUs.getText();
    }

    public String theThirdLineLink() {
        return joinUs.getAttribute("href");
    }

    public String findWantedJobNowText(){ return findWantedJobNow.getText();}

    public String wantedJobColor(){ return wantedJob.getCssValue("color");}

    public String blueSectionBackgroundColour() {return blueSection.getCssValue("background-color");
    }

    public String  secondLineWantedJobText() { return secondLineWantedJob.getText();
    }

    public boolean doesTheThirdLinkOpenNewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        joinUs.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

}
