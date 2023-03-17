package ro.peviitor.pageobject.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.peviitor.pageobject.BasePage;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class SearchModule extends BasePage {

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement search;
    @FindBy(xpath = "//div/img[@alt='magnify glass icon']")
    protected WebElement magnifyingGlass;
    @FindBy(xpath = "//input[@placeholder='Ce doriți să lucrați?']")
    protected WebElement inputSearchField;
    @FindBy(xpath = "//div/img[@alt='location icon']")
    protected WebElement locationIcon;
    @FindBy(xpath = "//option[@value='România']")
    protected WebElement defaultValue;
    @FindBy(xpath = "//select[@id='country']")
    protected WebElement countrySelect;

    private Select locationSelect() {
        return new Select(countrySelect);
    }

    public Integer getSelectSize(){ return locationSelect().getOptions().size();}

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
        new WebDriverWait(webDriver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(magnifyingGlass));
        return magnifyingGlass.isDisplayed();
    }

    public String getSearchPlaceholderText() {
        return inputSearchField.getAttribute("placeholder");
    }

    public void sendTextInSearchField(String text) {
        inputSearchField.clear();
        System.out.println(inputSearchField);
        inputSearchField.sendKeys(text);
    }

    public boolean isDefaultValueVisible() {
        return defaultValue.isDisplayed();
    }

    public String getTextInputtedInSearchField() {
        return inputSearchField.getAttribute("value");
    }

    public boolean isLocationIconVisible() {
        new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(locationIcon));
        return locationIcon.isDisplayed();
    }

    public String getDefaultValueText() {
        return defaultValue.getText();
    }

    public boolean doesClickingOnMagnifyingGlassOpenNewTab() {
        String originalUrl = webDriver.getCurrentUrl();
        new WebDriverWait(webDriver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(magnifyingGlass));
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

    public boolean doesPressingEnterReturnsResults() {
        String originalUrl = webDriver.getCurrentUrl();
        search.sendKeys(ENTER);
        String newUrl = webDriver.getCurrentUrl();
        return (!originalUrl.equals(newUrl));
    }

}
