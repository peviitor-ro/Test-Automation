package ro.peViitor;

import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ro.peViitor.pages.Landing;
import ro.peViitor.pages.Serp;

import java.io.IOException;
import java.text.Normalizer;

import static org.testng.Assert.assertEquals;

public class SerpTest extends Landing {

    public WebDriver driver;
    Serp serp = new Serp();

    @BeforeTest
    public void startUp() throws IOException, InterruptedException {
        driver = openBrowser();
        driver.get(SERP);
        serp.driver = driver;
    }
//
//    @AfterClass
//    public void cleanUp() {
//        driver.quit();
//    }

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
        driver.get(SERP);

    }

    @Story("Logo's width x height")
    @Test
    public void getLogoSize() {
        assertEquals(logoSize(), "(93, 28)");
    }

    @Story("Tapping on \"Alătură-te\" button ")
    @Test
    public void clickOnAlaturate() throws InterruptedException {
//        serp.driver = driver;
        serp.clickAlaturate();
        verify(driver, VOLUNTARI);
    }


    @Story("\"Alătură-te\" button text has diacritics  ")
    @Test
    public void alaturateDiacritics() throws InterruptedException {
        String s = serp.alaturateDiacristics();
        Normalizer.isNormalized(s, Normalizer.Form.NFD);
    }


    @Story("\" Alătură-te\" text's font color ")
    @Test
    public void alaturateColor() throws InterruptedException {
        assertEquals(serp.alaturateColor(), "rgba(9, 10, 10, 1)");
    }


    @Story("\"Alătură-te\" text's font weight ")
    @Test
    public void alaturateWeight() throws InterruptedException {
        assertEquals(serp.alaturateWeight(), "400");
    }

    @Story("\"Alătură-te\" text's font style ")
    @Test
    public void alaturateStyle() throws InterruptedException {
        assertEquals(serp.alaturateStyle(), "normal");
    }

    @Story("\"Alătură-te\" text's font size ")
    @Test
    public void alaturateSize() throws InterruptedException {
        assertEquals(serp.alaturateSize(), "16px");
    }

    @Story("Briefcase icon - color")
    @Test
    public void briefcaseColor() throws InterruptedException {
        assertEquals(serp.briefcaseColor(), "rgba(9, 10, 10, 1)");
    }

    @Story("Logo image is displayed in the left corner (TC422,TC423,TC424,TC425)")
    @Test
    public void logoPosition() throws InterruptedException {
        assertEquals(logo().getLocation().toString(), "(20, 16)");
    }


}

