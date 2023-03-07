package ro.peviitor.pageobject.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ro.peviitor.pageobject.BasePage;

public class FooterModule extends BasePage {
    @FindBy(xpath = "//section[@class='company']/h3")
    protected WebElement organization;
    @FindBy(xpath = "//a[@href='https://www.oportunitatisicariere.ro/']")
    protected WebElement aboutUs;
    @FindBy(xpath = "//section[@class='company']//a[contains(@href, 'voluntari')]")
    protected WebElement joinUs;
    @FindBy(xpath = "//section[@class='info']/h3")
    protected WebElement additionalInformation;
    @FindBy(xpath = "//a[@href='https://legal.peviitor.ro/']")
    protected WebElement termsAndConditions;
    @FindBy(xpath = "//a[@href='https://legal.peviitor.ro/confidentialitate']")
    protected WebElement confidentialityPolicy;
    @FindBy(xpath = "//section[@class='all-rights-reserved']")
    protected WebElement copyright;
    @FindBy(xpath = "//section[@class='social-media']/h3")
    protected WebElement socialMedia;
    @FindBy(xpath = "//section[@class='social-media']//a[contains(@href,'linkedin')]")
    protected WebElement linkedIn;
    @FindBy(xpath = "//section[@class='social-media'] //a[contains(@href,'discord')]")
    protected WebElement discord;


    public String organizationText() {
        return organization.getText();
    }

    public String aboutUsText() {
        return aboutUs.getText();
    }

    public String aboutUsLink() {
        return aboutUs.getAttribute("href");
    }

    public String joinUsText() {
        return joinUs.getText();
    }

    public String joinUsLink() {
        return joinUs.getAttribute("href");
    }

    public String additionalInformationText() {
        return additionalInformation.getText();
    }

    public String termsAndConditionsLink() {
        return termsAndConditions.getAttribute("href");
    }

    public String termsAndConditionText() {
        return termsAndConditions.getText();
    }

    public String confidentialityPolicyLink() {
        return confidentialityPolicy.getAttribute("href");
    }

    public String confidentialityPolicyText() {
        return confidentialityPolicy.getText();
    }

    public String copyrightText() {
        return copyright.getText();
    }

    public String socialMediaText() {
        return socialMedia.getText();
    }

    public String linkedInLInk() {
        return linkedIn.getAttribute("href");
    }

    public String discordText() {
        return discord.getAttribute("href");

    }

    public boolean doesAboutUsLinkOpenInANewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        aboutUs.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesJoinUsLinkOpenInANewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        joinUs.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesClickingOnCopyrightOpenNewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        copyright.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesClickOnFirstSocialMediaOpenNewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        linkedIn.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesClickOnSecondSocialMediaOpenNewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        discord.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }
}
