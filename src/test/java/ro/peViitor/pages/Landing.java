package ro.peViitor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class Landing {

    public WebDriver driver;

    public WebDriver openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<>();
        browserstackOptions.put("osVersion", "16.1.2");
        browserstackOptions.put("deviceName", "iPhone 13 Pro");
        browserstackOptions.put("realMobile", "true");
        capabilities.setCapability("bstack:options", browserstackOptions);
        return driver;
    }

    public WebElement alatura_te() {
        return driver.findElement(By.xpath("/html/body/div/section/section/div/section/a[2]"));
    }

    public WebElement briefcase() {
        return driver.findElement(By.xpath("/html/body/div/section/section/div/section/a[2]/img"));
    }

    public WebElement instagram() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section/footer/section[1]/section[1]/a[2]/img"));
    }

    public WebElement cauta() {
        return driver.findElement(By.xpath("/html/body/div/section/section/div/main/section[2]/button"));
    }

    public String joinWidth() {
        return alatura_te().getCssValue("width");
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

    public String joinFont() {
        return alatura_te().getCssValue("font-family");
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

    public String joinFontHeight() {
        return alatura_te().getCssValue("line-height");
    }

    public String briefcaseWidth() {
        return briefcase().getCssValue("width");
    }

    public String briefcaseHeight() {
        return briefcase().getCssValue("height");
    }

    public void instagramLogo() {
        instagram().click();
    }

    public String instagramLogoWidth() {
        return instagram().getCssValue("width");
    }

    public String instagramLogoHeight() {
        return instagram().getCssValue("height");
    }

    public String cautaColor() {
        return cauta().getCssValue("background-color");
    }

    public String cautaWidth() {
        return cauta().getCssValue("width");
    }

    public String cautaHeight() {
        return cauta().getCssValue("height");
    }
}


