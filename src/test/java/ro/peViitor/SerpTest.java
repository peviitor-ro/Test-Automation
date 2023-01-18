package ro.peViitor;

import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ro.peViitor.pages.Landing;
import ro.peViitor.pages.Serp;

import static org.testng.Assert.assertEquals;

public class SerpTest extends Landing {

    public WebDriver driver;
    Serp serp = new Serp();

    @BeforeTest
    public void startUp() {
        driver = openBrowser();
        driver.get(SERP);
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }

    @Story("Logo is displayed in header.")
    @Test
    public void logoVisible() {
        isLogoVisible();
    }

    @Story("The logo is clickable.")
    @Test
    public void logoClick() {
        logo().click();
        assertEquals(driver.getCurrentUrl(), HOMEPAGE);
    }

    @Story("Logo's width x height")
    @Test
    public void getLogoSize() {
        assertEquals(logoSize(), "(93, 28)");
    }

    @Story("Tapping on \"Alătură-te\" button ")
    @Test
    public void clickOnAlaturate() {
        serp.driver = driver;
        serp.clickAlaturate();
        verify(driver, VOLUNTARI);
    }
}

