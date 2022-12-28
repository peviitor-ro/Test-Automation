package ro.peViitor.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Landing {

    public WebDriver driver;

    public WebDriver openBrowser() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
        driver = new ChromeDriver();
        return driver;

    }
    public WebElement conditii(){
        return driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[3]/nav/ul/li[1]/a"));
    }

    public WebElement info() {
        return driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[3]/h3"));
    }

    public WebElement organizatie() {
        return driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[2]/h3"));
    }

    public WebElement alatura_te() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[1]/a[2]"));
    }

    public WebElement instagram() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section/footer/section[1]/section[1]/a[2]/img"));
    }

    public WebElement search_button() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/button"));
    }

    public WebElement job() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[1]/h1/span"));
    }

    public WebElement avem() {
        return driver.findElement(By.className("description"));
    }

    public WebElement alaturate() {
        return driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[2]/nav/ul/li[2]/a"));
    }

    public WebElement despre() {
        return driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[2]/nav/ul/li[1]/a"));
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

    public String searchHeight() {
        return search_button().getCssValue("height");
    }

    public String searchTopMargin() {
        return search_button().getCssValue("margin-top");
    }

    public String searchCenter() {
        return search_button().getCssValue("text-align");
    }

    public String search_borderRadius() {
        return search_button().getCssValue("border-radius");
    }

    public boolean isSearchVisible() {
        return search_button().isDisplayed();
    }

    public String searchFontStyle() {
        return search_button().getCssValue("font-style");
    }

    public String searchColor() {
        return search_button().getCssValue("color");
    }

    public void searchTap() {
        search_button().click();
    }

    public void linkedInTap() {
        driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[1]/a[3]/img")).click();
    }

    public void facebookTap() {
        driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[1]/a[1]")).click();
    }

    public String jobText() {
        return job().getText();
    }

    public String jobFont() {
        return job().getCssValue("font-family");
    }

    public String jobFontStyle() {
        return job().getCssValue("font-style");

    }

    public String jobFontSize() {
        return job().getCssValue("font-size");
    }

    public String jobLine() {
        return job().getCssValue("line-height");
    }

    public String jobColor() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[1]/h1/span")).getCssValue("color");
    }

    public String gap() {
        return avem().getCssValue("margin-top");
    }

    public String test_diacritics() {
        return avem().getText();
    }

    public String avemFontFamily() {
        return avem().getCssValue("font-family");
    }

    public String avemFontWeight() {
        return avem().getCssValue("font-weight");
    }

    public String avemFontSize() {
        return avem().getCssValue("font-size");
    }

    public String avemLineHeight() {
        return avem().getCssValue("line-height");
    }

    public String avemColor() {
        return avem().getCssValue("color");
    }

    public String avemFontStyle() {
        return avem().getCssValue("font-style");
    }

    public void despreTap() {
        despre().click();
    }

    public String despreTextColor() {
        return despre().getCssValue("color");
    }

    public String despreFontStyle() {
        return despre().getCssValue("font-style");
    }

    public String despreFontWeight() {
        return despre().getCssValue("font-weight");
    }

    public String alaturateFontStyle() {
        return alaturate().getCssValue("font-style");
    }

    public String alaturateFontWeight() {
        return alaturate().getCssValue("font-weight");
    }

    public String organizatieFontStyle() {
        return organizatie().getCssValue("font-style");
    }

    public String organizatieFontWeight() {
        return organizatie().getCssValue("font-weight");
    }

    public String organizatieFontSize() {
        return organizatie().getCssValue("font-size");
    }


    public String infoFontStyle() {
        return info().getCssValue("font-style");
    }

    public String infoFontSize() {
        return info().getCssValue("font-size");

    }

    public String infoFontColor() {
        return info().getCssValue("color");
    }

    public void conditiiTap(){
        conditii().click();

    }

}
