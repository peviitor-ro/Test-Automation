package ro.peviitor.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ro.peviitor.pageobject.BasePage;


import static ro.peviitor.utils.TypesOfData.XPATH;

public class SerpPage extends BasePage
{


    public SerpPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public WebElement alaturate()
    {
        return getElementBy(XPATH, "/html/body/div/section/section/section/section/a[2]", 30);
    }

    public WebElement briefcase()
    {
        return getElementBy(XPATH, "/html/body/div/section/section/section/section/a[2]/img", 30);
    }


    public void clickAlaturate() throws InterruptedException
    {
        WebElement alatura_te = alaturate();
        alatura_te.click();
    }

    public String alaturateLocation() throws InterruptedException
    {
        return String.valueOf(alaturate().getLocation());
    }

    public String alaturateDiacristics() throws InterruptedException
    {
        return alaturate().getText();
    }

    public String alaturateSpacing() throws InterruptedException
    {
        return alaturate().getCssValue("letter-spacing");
    }

    public String alaturateColor() throws InterruptedException
    {
        return alaturate().getCssValue("color");
    }

    public String alaturateFont() throws InterruptedException
    {
        return alaturate().getCssValue("font-family");
    }

    public String alaturateWeight() throws InterruptedException
    {
        return alaturate().getCssValue("font-weight");
    }

    public String alaturateStyle() throws InterruptedException
    {
        return alaturate().getCssValue("font-style");
    }

    public String alaturateSize() throws InterruptedException
    {
        return alaturate().getCssValue("font-size");
    }

    public String alaturateHeight() throws InterruptedException
    {
        return alaturate().getCssValue("line-height");
    }

    public String alaturateWidth() throws InterruptedException
    {
        return alaturate().getCssValue("width");
    }

    public String alaturateButtonHeight() throws InterruptedException
    {
        return alaturate().getCssValue("height");
    }

    public String briefcaseDisplayed() throws InterruptedException
    {
        return String.valueOf(briefcase().getLocation());
    }

    public String briefcaseWidth() throws InterruptedException
    {
        return briefcase().getCssValue("Width");
    }

    public String briefcaseHeight() throws InterruptedException
    {
        return briefcase().getCssValue("Height");
    }

    public String briefcaseColor() throws InterruptedException
    {
        return briefcase().getCssValue("color");
    }

}
