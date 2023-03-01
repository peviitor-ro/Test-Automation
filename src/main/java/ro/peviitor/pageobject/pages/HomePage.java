package ro.peviitor.pageobject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ro.peviitor.pageobject.BasePage;
import ro.peviitor.utils.TypesOfData;

public class HomePage extends BasePage
{
    @FindBy(className = "all-rights-reserved")
    protected WebElement copyrightFooterText;

    public void open()
    {
        webDriver.get(TypesOfData.HOMEPAGE);
    }


}
