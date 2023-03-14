package ro.peviitor.pageobject.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import ro.peviitor.pageobject.BasePage;

import java.util.List;

import static java.lang.Thread.sleep;

public class SearchModule extends BasePage {

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement search;
    @FindBy(xpath = "//img[@alt='magnify glass icon']")
    protected WebElement magnifyingGlass;
    @FindBy(xpath = "//input[@placeholder='Ce doriți să lucrați?']")
    protected WebElement inputSearchField;
    @FindBy(xpath = "//img[@alt='location icon']")
    protected WebElement locationIcon;
    @FindBy(xpath = "//option[@value='România']")
    protected WebElement defaultValue;
    @FindBy(xpath = "//select[@id='country']")
    protected WebElement element;
    @FindBy(xpath = "//select[@id='country']/option[@value='România']")
    protected WebElement firstSelectOption;
    @FindBy(xpath = "//select[@id='country']/option[@value='România']")
    protected WebElement secondSelectOption;

    private Select locationSelect() {
        Select select = new Select(element);
        return select;
    }

    public String selectFirstOption() {
        return locationSelect().getFirstSelectedOption().getText();
    }

    public String selectSecondOption() {
        locationSelect().selectByIndex(1);
        return locationSelect().getFirstSelectedOption().getText();
    }

    public boolean isSearchVisible() {
        return search.isDisplayed();
    }

    public String searchText() {
        return search.getText();
    }

    public boolean isMagnifyingGlassVisible() {
        return magnifyingGlass.isDisplayed();
    }

    public String getSearchPlaceholderText() {
        return inputSearchField.getAttribute("placeholder");
    }

    public void sendTextInSearchField(String text) {
        inputSearchField.clear();
        inputSearchField.sendKeys(text);
    }

    public boolean isDefaultValueVisible() {
        return defaultValue.isDisplayed();
    }

    public String getTextInputtedInSearchField() {
        return inputSearchField.getAttribute("value");
    }

    public boolean isLocationIconVisible() {
        return locationIcon.isDisplayed();
    }

    public String getDefaultValueText() {
        return defaultValue.getText();
    }

    public boolean doesClickingOnMagnifyingGlassOpenNewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        magnifyingGlass.click();
        webDriver.getWindowHandles().forEach(tab -> webDriver.switchTo().window(tab));
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

    public boolean doesClickingOnSearchButtonReturnsResults() {
        String originalUrl = webDriver.getCurrentUrl();
        search.click();
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

}
