package ro.peViitor.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;


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

    public WebElement politica() {
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/footer/section[1]/section[3]/nav/ul/li[2]/a"));
        assertEquals(ele.getText(), "Politica de confidențialitate");
        return ele;
    }

    public WebElement flogo() {
        return driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/img"));
    }

    public WebElement all() {
        WebElement all = driver.findElement(By.xpath("/html/body/div/section/section/footer/section[2]"));
        assertEquals(all.getText(), "© 2022 - Toate drepturile rezervate PE VIITOR.");
        return all;
    }

    public WebElement conditii() {
        WebElement terms = driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[3]/nav/ul/li[1]/a"));
        assertEquals(terms.getText(), "Condiții de utilizare");
        return terms;
    }

    public WebElement info() {
        WebElement info = driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[3]/h3"));
        assertEquals(info.getText(), "Informații suplimentare");
        return info;
    }

    public WebElement organizatie() {
        WebElement ele = driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[2]/h3"));
        assertEquals(ele.getText(), "Organizație");
        return ele;
    }

    public WebElement alatura_te() {
        WebElement ele = driver.findElement(By.xpath("/html/body/div/section/section/section[1]/a[2]"));
        assertEquals(ele.getText(), "Alătură-te");
        return ele;
    }

    public WebElement instagram() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section/footer/section[1]/section[1]/a[2]/img"));
    }

    public WebElement search_button() {
        WebElement button = driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/button"));
        assertEquals(button.getText(), "Caută");
        return button;
    }

    public WebElement job() {
        WebElement ele = driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[1]/h1/span"));
        assertEquals(ele.getText(), "jobul dorit");
        return ele;
    }

    public WebElement avem() {
        return driver.findElement(By.className("description"));
    }

    public WebElement despre() {
        WebElement ele = driver.findElement(By.xpath("/html/body/div/section/section/footer/section[1]/section[2]/nav/ul/li[1]/a"));
        assertEquals(ele.getText(), "Despre noi");
        return ele;
    }

    public WebElement logo() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[1]/a[1]/img"));
    }

    public WebElement sectionTopBarBorder() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[1]"));
    }

    public WebElement gasesteTiJobulDoritAcum() {
        WebElement ele = driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[1]/h1"));
        assertEquals(ele.getText(), "Găsește-ți jobul dorit acum");
        return ele;
    }

    public WebElement firstSearchBar() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/div/div[1]"));
    }

    public WebElement alaturate_cauzei() {
        WebElement alaturate_cauza = driver.findElement(By.xpath("/html/body/div/section/section/section[3]/a"));
        return alaturate_cauza;
    }

    public WebElement doresti() {
        WebElement elem = driver.findElement(By.xpath("/html/body/div/section/section/section[3]/h3"));
        return elem;
    }

    public WebElement magnifyingGlass() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/div/div[1]/img"));
    }

    public WebElement placeholder() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/div/div[1]/input"));
    }

    public WebElement secondSearchBar() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/div"));
    }

    public WebElement placeholderCountry() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/div/div[2]/select"));
    }

    public WebElement locationIcon() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[2]/main/section[2]/div/div[2]/img"));
    }

    public WebElement blueBanner() {
        return driver.findElement(By.xpath("/html/body/div/section/section/section[3]"));
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

    public String teste_diacritics() {
        return alatura_te().getText();
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
        return alatura_te().getCssValue("font-style");
    }

    public String alaturateFontWeight() {
        return alatura_te().getCssValue("font-weight");
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

    public String organizatieMargin() {
        return organizatie().getCssValue("margin-bottom");
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

    public void conditiiTap() {
        conditii().click();
    }

    public String conditiiFontStyle() {
        return conditii().getCssValue("font-style");
    }

    public String conditiiFontWeight() {
        return conditii().getCssValue("font-weight");
    }

    public String conditiiFontColor() {
        return conditii().getCssValue("color");
    }

    public String allFontStyle() {
        return all().getCssValue("font-style");
    }

    public String allFontColor() {
        return all().getCssValue("color");
    }

    public String flogoHeight() {
        return flogo().getCssValue("height");
    }

    public String fLogoWidth() {
        return flogo().getCssValue("width");
    }

    public void politicaTap() throws InterruptedException {
        politica().click();
        sleep(1000);
    }

    public String politicaFontStyle() {
        return politica().getCssValue("font-style");
    }

    public String politicaFontWeight() {
        return politica().getCssValue("font-weight");
    }

    public String politicaFontColor() {
        return politica().getCssValue("color");
    }

    public void peViitorLogo() {
        logo().click();
    }

    public boolean isLogoVisible() {
        return logo().isDisplayed();
    }

    public String logoSize() {
        return String.valueOf(logo().getSize());
    }

    public String topBorderHeader() {
        return sectionTopBarBorder().getCssValue("padding-top");
    }

    public String leftBorderHeader() {
        return sectionTopBarBorder().getCssValue("padding-left");
    }

    public String bottomBorderHeader() {
        return sectionTopBarBorder().getCssValue("padding-bottom");
    }

    public boolean isGasesteTiJobulDoritAcumVisible() {
        return gasesteTiJobulDoritAcum().isDisplayed();
    }

    public String fontFamilyGaseteTiJobulDoritAcum() {
        return gasesteTiJobulDoritAcum().getCssValue("font-family");
    }

    public String fontStyleGaseteTiJobulDoritAcum() {
        return gasesteTiJobulDoritAcum().getCssValue("font-style");
    }

    public String sizeGaseteTiJobulDoritAcum() {
        return gasesteTiJobulDoritAcum().getCssValue("font-size");
    }

    public String lineHeightGaseteTiJobulDoritAcum() {
        return gasesteTiJobulDoritAcum().getCssValue("line-height");
    }

    public String outerBorder1stSearchBar() {
        return firstSearchBar().getCssValue("border-bottom");
    }

    public boolean magnifyingGlassIsVisible() {
        return magnifyingGlass().isDisplayed();
    }

    public boolean clickMagnifyingGlass() {
        return magnifyingGlass().isEnabled();
    }

    public String positionMagnifyingGlass() {
        return magnifyingGlass().getCssValue("position");
    }

    public String ceDoritiSaLucrati() {
        return placeholder().getAttribute("placeholder");
    }

    public String cedoritiFontStyle() {
        return placeholder().getCssValue("font-style");
    }

    public String fontSizeSearch() {
        return placeholder().getCssValue("font-size");
    }

    public String magnifyingGlassPosition() {
        return magnifyingGlass().getCssValue("position");
    }

    public String ssd(String data) {
        placeholder().sendKeys(data);
        return data;
    }

    public String ceDoritiWeight() {
        return placeholder().getCssValue("font-weight");
    }

    public String ceDoritiHexColor() {
        return placeholder().getCssValue("border-top-color");
    }

    public String outerBorder() {
        return secondSearchBar().getCssValue("border-width");
    }

    public String textHeightSecondSearchBar() {
        return placeholderCountry().getCssValue("font-size");
    }

    public String textFontStyleSecondSearchBar() {
        return placeholderCountry().getCssValue("font-style");
    }

    public String defaultTextSecondSearchBar() {
        return (placeholderCountry().getText());
    }

    public boolean isLocationIconVisible() {
        return locationIcon().isDisplayed();
    }

    public String romaniaColor() {
        return placeholderCountry().getCssValue("color");
    }

    public void select_between_options() throws InterruptedException {
        Select select = new Select(placeholderCountry());
        select.selectByVisibleText("Toate");
        sleep(3000);
        select.selectByVisibleText("România");
    }

    public String blueBannerColorCode() {
        return blueBanner().getCssValue("background-color");
    }

    public void alaturateCauzeiTap() {
        alaturate_cauzei().click();
    }

    public String dorestiColor() {
        return doresti().getCssValue("color");
    }

    public String dorestiFont() {
        return doresti().getCssValue("font-family");
    }

    public String dorestiFontStyle() {
        return doresti().getCssValue("font-style");
    }

    public String dorestiFontSize() {
        return doresti().getCssValue("font-size");
    }

    public String dorestiAlign() {
        return doresti().getCssValue("text-align");
    }

}
