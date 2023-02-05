package ro.peviitor.testpages;

import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ro.peviitor.BaseTest;
import ro.peviitor.pageobject.pages.LandingPage;
import ro.peviitor.pageobject.pages.SerpPage;

import java.text.Normalizer;

import static org.testng.Assert.assertEquals;
import static ro.peviitor.utils.TypesOfData.*;

public class SerpPageTest extends BaseTest
{

    SerpPage serpPage = new SerpPage(webDriver);

//    @Story("Logo is displayed in header.")
//    @Test
//    public void logoVisible()
//    {
//        SerpPage serpPage = new SerpPage(webDriver);
//        serpPage.isLogoVisible();
//    }

    @Story("The logo is clickable.")
    @Test
    public void logoClick()
    {
        LandingPage.logo().click();
        assertEquals(webDriver.getCurrentUrl(), HOMEPAGE);
        webDriver.get(SERP);
    }

//    @Story("Logo's width x height")
//    @Test
//    public void getLogoSize()
//    {
//        assertEquals(serpPage.logoSize(), "(93, 28)");
//    }

    @Story("Tapping on \"Alătură-te\" button ")
    @Test
    public void clickOnAlaturate() throws InterruptedException
    {
//        serp.driver = driver;
        serpPage.clickAlaturate();
        LandingPage.verifyIfNewTabOpens(webDriver, VOLUNTARI);
    }

    @Story("\"Alătură-te\" button text has diacritics  ")
    @Test
    public void alaturateDiacritics() throws InterruptedException
    {
        String s = serpPage.alaturateDiacristics();
        Normalizer.isNormalized(s, Normalizer.Form.NFD);
    }

    @Story("\" Alătură-te\" text's font color ")
    @Test
    public void alaturateColor() throws InterruptedException
    {
        assertEquals(serpPage.alaturateColor(), "rgba(9, 10, 10, 1)");
    }

    @Story("\"Alătură-te\" text's font weight ")
    @Test
    public void alaturateWeight() throws InterruptedException
    {
        assertEquals(serpPage.alaturateWeight(), "400");
    }

    @Story("\"Alătură-te\" text's font style ")
    @Test
    public void alaturateStyle() throws InterruptedException
    {
        assertEquals(serpPage.alaturateStyle(), "normal");
    }

    @Story("\"Alătură-te\" text's font size ")
    @Test
    public void alaturateSize() throws InterruptedException
    {
        assertEquals(serpPage.alaturateSize(), "16px");
    }

    @Story("Briefcase icon - color")
    @Test
    public void briefcaseColor() throws InterruptedException
    {
        assertEquals(serpPage.briefcaseColor(), "rgba(9, 10, 10, 1)");
    }

//    @Story("Logo image is displayed in the left corner (TC422,TC423,TC424,TC425)")
//    @Test
//    public void logoPosition() throws InterruptedException
//    {
//        assertEquals(SerpPage.logo().getLocation().toString(), "(20, 16)");
//    }

}

