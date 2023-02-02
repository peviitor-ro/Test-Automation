package ro.peViitor;

import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
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
        serp.driver=driver;
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

    @Story("\"Alătură-te\" text is displayed in the right corner, besides the briefcase icon")
    @Test
    public void positionAlaturate() throws InterruptedException {
        assertEquals(serp.alaturateLocation(),"(888, 20)");
    }

    @Story("\"Alătură-te\" button text has diacritics  ")
    @Test
    public void alaturateDiacritics() throws InterruptedException {
    String s = serp.alaturateDiacristics();
        Normalizer.isNormalized(s, Normalizer.Form.NFD);
    }

    @Story("\" Alătură-te\" button text letter spacing  ")
    @Test
    public void alaturateSpacing() throws InterruptedException {
        assertEquals(serp.alaturateSpacing(),"-0.02em");
    }

    @Story("\" Alătură-te\" text's font color ")
    @Test
    public void alaturateColor() throws InterruptedException {
        assertEquals(serp.alaturateColor(),"rgba(9, 10, 10, 1)");
    }

    @Story("\"Alătură-te\" text's font ")
    @Test
    public void alaturateFont()throws InterruptedException{
        assertEquals(serp.alaturateFont(),"SF Pro");
    }

    @Story("\"Alătură-te\" text's font weight ")
    @Test
    public void alaturateWeight()throws InterruptedException{
        assertEquals(serp.alaturateWeight(),"400");
    }

    @Story("\"Alătură-te\" text's font style ")
    @Test
    public void alaturateStyle()throws InterruptedException{
        assertEquals(serp.alaturateStyle(),"normal");
    }

    @Story("\"Alătură-te\" text's font size ")
    @Test
    public void alaturateSize()throws InterruptedException{
        assertEquals(serp.alaturateSize(),"16px");
    }

    @Story("\"Alătură-te\" text's height")
    @Test
    public void alaturateHeight()throws InterruptedException{
        assertEquals(serp.alaturateHeight(),"19px");
    }

    @Story("\"Alătură-te\" text's  width")
    @Test
    public void alaturateWidth()throws InterruptedException{
        assertEquals(serp.alaturateWidth(),"73px","can't separate the elements, briefcase + text");
    }

    @Story("\" Alătură-te\" button text's line height")
    @Test
    public void alaturateButtonHeight()throws InterruptedException{
        assertEquals(serp.alaturateButtonHeight(),"19px");
    }

    @Story("Briefcase icon displayed on the right corner of the header")
    @Test
    public void briefcaseDisplayed()throws InterruptedException{
        assertEquals(serp.briefcaseDisplayed(),"(888, 20)");
    }

    @Story("Briefcase icon width ")
    @Test
    public void briefcaseWidth()throws InterruptedException{
        assertEquals(serp.briefcaseWidth(),"16,67px");
    }

    @Story("Briefcase icon height ")
    @Test
    public void briefcaseHeight()throws InterruptedException{
        assertEquals(serp.briefcaseHeight(),"15px");
    }

    @Story("Briefcase icon - color")
    @Test
    public void briefcaseColor()throws InterruptedException{
        assertEquals(serp.briefcaseColor(),"rgba(9, 10, 10, 1)");
    }

    @Story("Logo image is displayed in the left corner (TC422,TC423,TC424,TC425)")
    @Test
    public void logoPosition() throws InterruptedException {
        assertEquals(logo().getLocation().toString(),"(20, 16)");
    }






}

