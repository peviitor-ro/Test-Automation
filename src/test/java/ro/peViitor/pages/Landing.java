package ro.peViitor.pages;

import com.sun.source.tree.BreakTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Landing {

    public WebDriver driver;

    public WebDriver openBrowser() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        return driver;
    }

    public WebElement alatura_te() {
        return driver.findElement(By.xpath("/html/body/div/section/section/div/section/a[2]"));
    }

    public WebElement instagram() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section/footer/section[1]/section[1]/a[2]/img"));
    }

    public WebElement search_button() {
        return driver.findElement(By.xpath("/html/body/div/section/section/div/main/section[2]/button"));
    }

    public String joinFontStyle() {
        return alatura_te().getCssValue("font-style");
    }

    public String joinColor() {
        return alatura_te().getCssValue("color");
    }

    public String joinFontWeight() {
        return alatura_te().getCssValue("font-weight");
    }

    public String joinLetter() {
        return alatura_te().getCssValue("letter-spacing");
    }

    public String joinFontSize() {
        return alatura_te().getCssValue("font-size");
    }

    public void joinTap() {
        alatura_te().click();
    }

    public String joinCharacters() {
        return alatura_te().getText();
    }

    public void instagramLogo() {
        instagram().click();
    }

    public String searchBColor() {
        return search_button().getCssValue("background-color");
    }

    public String searchHeight(){
        return search_button().getCssValue("height");
    }

    public String searchTopMargin(){
        return search_button().getCssValue("margin-top");
    }

    public String searchCenter(){
        return search_button().getCssValue("text-align");
    }

    public String search_borderRadius(){
        return search_button().getCssValue("border-radius");
    }

    public boolean isSearchVisible(){
        return search_button().isDisplayed();
    }

    public String searchFontStyle(){
        return search_button().getCssValue("font-style");
    }

    public String searchColor(){
        return search_button().getCssValue("color");

    }

    public void  searchTap(){
        search_button().click();
    }
}


