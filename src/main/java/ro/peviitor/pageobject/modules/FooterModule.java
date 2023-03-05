package ro.peviitor.pageobject.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ro.peviitor.pageobject.BasePage;

public class FooterModule extends BasePage
{
    @FindBy(xpath = "//section[@class='company']/h3")
    protected WebElement firstFooterSection;
    @FindBy(xpath = "//a[@href='https://www.oportunitatisicariere.ro/']")
    protected WebElement aboutUs;
    @FindBy(xpath = "//section[@class='company']//a[contains(@href, 'voluntari')]")
    protected WebElement joinUs;
    @FindBy(xpath = "//section[@class='info']")
    protected WebElement secondFooterSection;
    @FindBy(xpath = "//a[@href='https://legal.peviitor.ro/']")
    protected WebElement termsAndConditions;
    @FindBy(xpath = "//a[@href='https://legal.peviitor.ro/confidentialitate']")
    protected WebElement confidentialityPolicy;
    public String firstFooterSectionText()
    {
        return firstFooterSection.getText();
    }

    public String aboutUsText()
    {
        return aboutUs.getText();
    }

    public String aboutUsLink()
    {
        return aboutUs.getAttribute("href");
    }

    public String joinUsText()
    {
        return joinUs.getText();
    }

    public String joinUsLink()
    {
        return joinUs.getAttribute("href");
    }

    public String secondFooterSectionText()
    {
        return secondFooterSection.getText();
    }

    public String termsAndConditionsText()
    {
        return termsAndConditions.getText();
    }

    public String termsAndconditionsLink()
    {
        return termsAndConditions.getAttribute("href");
    }

    public String confidentialityPolicyText()
    {
        return confidentialityPolicy.getText();
    }

    public String confidentialityPolicyLink()
    {
        return confidentialityPolicy.getAttribute("href");
    }
    public boolean doesAboutUsLinkOpenInANewTab()
    {
        String originalUrl = webDriver.getCurrentUrl();
        aboutUs.click();
        webDriver.getWindowHandles().forEach(tab ->webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesJoinUsLinkOpenInANewTab()
    {
        String originalUrl = webDriver.getCurrentUrl();
        joinUs.click();
        webDriver.getWindowHandles().forEach(tab ->webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesTermsAndConditionsLinkOpenInANewTab()
    {
        String originalUrl = webDriver.getCurrentUrl();
        termsAndConditions.click();
        webDriver.getWindowHandles().forEach(tab ->webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesConfidentialityPolicyLinkOpenInANewTab()
    {
        String originalUrl = webDriver.getCurrentUrl();
        confidentialityPolicy.click();
        webDriver.getWindowHandles().forEach(tab ->webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }
}
