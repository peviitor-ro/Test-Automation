package ro.peViitor;

import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import ro.peViitor.pages.Landing;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LandingPageTest extends Landing {

    private static final String CONDITII = "https://legal.peviitor.ro/";
    private static final String ONG = "https://www.oportunitatisicariere.ro/";
    private static final String LINKEDIN = "https://www.linkedin.com/company/asociatia-oportunitati-si-cariere/?original_referer=";
    private static final String SERP = "https://beta.peviitor.ro/rezultate?country=Rom%C3%A2nia&page=1";
    private static final String HOMEPAGE = "https://beta.peviitor.ro/";
    private static final String VOLUNTARI = "https://www.oportunitatisicariere.ro/voluntari";
    private static final String FACEBOOK = "https://www.facebook.com/people/Asociatia-oportunitati-si-cariere/100088634384252/";
    private static final String INSTAGRAM = "https://www.instagram.com/peviitor/";
    public WebDriver driver;

    public static void verify(WebDriver driver, String PAGE) {
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        assertEquals(driver.getCurrentUrl(), PAGE);
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

    @BeforeClass
    public void startUp() {
        driver = openBrowser();
        driver.get(HOMEPAGE);
    }

    @AfterClass
    public void cleanUp() {
        driver.quit();
    }

    @Story("Page title: peviitor I motor de căutare locuri de muncă TC734")
    @Test
    public void isHomepage() {
        assertEquals(driver.getCurrentUrl(), HOMEPAGE, "Verifying reaching desired page");
        assertEquals(driver.getTitle(), "peviitor | motor de căutare locuri de muncă", "Verify reaching Homepage TC734");
    }

    @Story("Alătură-te button font style TC283")
    @Test
    public void join_FontStyle() {
        assertEquals(joinFontStyle(), "normal");
    }

    @Story(" Alătură-te button font color TC 284")
    @Test
    public void join_color() {
        assertEquals(joinColor(), "rgba(9, 10, 10, 1)");
    }

    @Story("Alătură-te button font weight TC282 ")
    @Test
    public void join_font_weight() {
        assertEquals(joinFontWeight(), "400");
    }

    @Story("\" Alătură-te\" button letter spacing TC285")
    @Test
    public void join_letter_spacing() {
        assertEquals(joinLetter(), "normal");
    }

    @Story("\"Alătură-te\" button font size TC178 ")
    @Test
    public void join_font_Size() {
        assertEquals(joinFontSize(), "16px");
    }

    @Story("Tapping on \"Alătură-te\" button TC182 ")
    @Test
    public void join_tap() {
        voluntariRedirect();
        verify(driver, VOLUNTARI);
    }

    private void voluntariRedirect() {
        joinTap();
    }

    @Story("Alătură-te button text has diacritics TC240 ")
    @Test
    public void join_characters() {
        assertEquals(joinCharacters(), "Alătură-te");
    }

    @Ignore
    @Story("Tapping on \"Instagram\" button TC182 ")
    @Test
    public void instagram_tap() {
        instagramRedirect();
        verify(driver, INSTAGRAM);
    }

    private void instagramRedirect() {
        instagramLogo();
    }

    @Story("Cauta search button hex code TC262")
    @Test
    public void search_BColor() {
        assertEquals(searchBColor(), "rgba(224, 141, 33, 1)");
    }

    @Story("Height for the 'Caută' text is 24px. TC271")
    @Test
    public void search_height() {
        assertEquals(searchHeight(), "24px");
    }

    @Story("The distance between the second search and the button for 'cauta' is 30px. TC 265")
    @Test
    public void search_Margin() {
        assertEquals(searchTopMargin(), "30px");
    }

    @Story("The search button is aligned in the center. ")
    @Test
    public void search_Center() {
        assertEquals(searchCenter(), "center");
    }

    @Story("Border radius for the search button is of 8px.")
    @Test
    public void search_border_Radius() {
        assertEquals(search_borderRadius(), "8px");
    }

    @Story("The text 'Caută' is present in the search button.")
    @Test
    public void search_visible() {
        assertTrue(isSearchVisible());
    }

    @Story("The font style for the text 'caută', in the search button, is 'normal'.")
    @Test
    public void search_fontStyle() {
        assertEquals(searchFontStyle(), "normal");
    }

    @Story("The hex code for 'caută' is #FFFFFF.")
    @Test
    public void search_text_color() {
        assertEquals(searchColor(), "rgba(255, 255, 255, 1)");
    }

    @Story("When you click on the search button it redirects you to the SERP page.")
    @Test
    public void search_tap() throws InterruptedException {
        searchTap();
        sleep(1500);
        assertEquals(driver.getCurrentUrl(), SERP);
        driver.get(HOMEPAGE);
    }

    @Story("Tapping LinkedIn footer logo ")
    @Test
    public void linkedIn_tap() {
        linkedInTap();
        assertTrue(Boolean.parseBoolean(String.valueOf(LINKEDIN.contains("https://www.linkedin.com/company/asociatia-oportunitati-si-cariere/"))));
    }

    @Story("Tapping Facebook footer logo")
    @Test
    public void facebook_tap() {
        facebookTap();
        verify(driver, FACEBOOK);
    }

    @Story("The content in the border is \"Gaseste-ti jobul dorit acum\"")
    @Test
    public void job_text() {
        assertEquals(jobText(), "jobul dorit");
    }

    @Story("The font-family used for \"Gaseste-ti jobul dorit acum\" is Poppins")
    @Test
    public void job_font() {
        assertEquals(jobFont(), "PoppinsRegular");
    }

    @Story("The font-style for the text \"Gaseste-ti jobul dorit acum\" is normal")
    @Test
    public void job_fontStyle() {
        assertEquals(jobFontStyle(), "normal");
    }

    @Story("The size used for \"Gaseste-ti jobul dorit\" is 26px")
    @Test
    public void job_fontSize() {
        assertEquals(jobFontSize(), "26px");
    }

    @Story("The line height used for \"Gaseste-ti jobul dorit acum\" is 32px")
    @Test
    public void job_line() {
        assertEquals(jobLine(), "32px");
    }

    @Story("The color for \"jobul dorit\" from the \"Gaseste-ti jobul dorit acum\" is Orange #E08D22")
    @Test
    public void job_color() {
        assertEquals(jobColor(), "rgba(224, 141, 34, 1)");
    }

    @Story("The border between \"Gaseste-ti jobul dorit acum\" and \"Avem 90.000 de oportunitati in acest moment in Romania\" has the Height 16px")
    @Test
    public void distance() {
        assertEquals(gap(), "16px");
    }

    @Story("The text in the border  \"Avem 90.000 de oportunitati in acest moment in Romania\" contains diacritics")
    @Test
    public void avem_diacritics() {
        String s = test_diacritics();
        Normalizer.isNormalized(s, Normalizer.Form.NFD);
    }

    @Ignore
    @Story("The font-family used for the text \"Avem X  de oportunitati in acest moment in Romania\" is SF Pro")
    @Test
    public void avem_family_font() {
        assertEquals(avemFontFamily(), "SF Pro");
    }

    @Story("The weight used for the text \"Avem X de oportunitati in acest moment in Romania\" is 400")
    @Test
    public void avem_fontWeight() {
        assertEquals(avemFontWeight(), "400");
    }

    @Story("The size used for the text \"Avem X  de oportunitati in acest moment in Romania\" is 16px")
    @Test
    public void avem_font_size() {
        assertEquals(avemFontSize(), "16px");
    }

    @Ignore
    @Story("The line height used for the text \"Avem X de oportunitati in acest moment in Romania\" is 19.09px")
    @Test
    public void avem_line_height() {
        assertEquals(avemLineHeight(), "19.09px");
    }

    @Ignore
    @Story("The color used for the text \"Avem X de oportunitati in acest moment in Romania\" is Ink black #090A0A")
    @Test
    public void avem_color() {
        assertEquals(avemColor(), "rgba(9, 10, 10, 1)");
    }

    @Story("The font-style used for the text \"Avem X  de oportunitati in acest moment in Romania\" is normal")
    @Test
    public void avem_font_style() {
        assertEquals(avemFontStyle(), "normal");
    }

    @Story("Tapping on \"Despre noi\" footer section text ")
    @Test
    public void despre_tap() {
        despreTap();
        verify(driver, ONG);
    }

    @Story("\"Despre noi\" footer section text font - color")
    @Test
    public void despre_text_color() {
        assertEquals(despreTextColor(), "rgba(9, 10, 10, 1)");
    }

    @Story("\"Despre noi\" footer section text font - style")
    @Test
    public void despre_font_style() {
        assertEquals(despreFontStyle(), "normal");
    }

    @Story("\"Despre noi\" footer section text font - weight")
    @Test
    public void despre_font_weight() {
        assertEquals(despreFontWeight(), "400");
    }

    @Story(" \"Alătură-te cauzei noastre\" footer section text font - style")
    @Test
    public void alaturate_font_style() {
        assertEquals(alaturateFontStyle(), "normal");
    }

    @Story(" \"Alătură-te cauzei noastre\" footer section text font - style")
    @Test
    public void alaturate_font_weight() {
        assertEquals(alaturateFontWeight(), "400");
    }

    @Story("\"Organizație\" footer text font style")
    @Test
    public void organizatie_font_style() {
        assertEquals(organizatieFontStyle(), "normal");
    }

    @Story("\"Organizație\" footer text font weight")
    @Test
    public void organizatie_font_weight() {
        assertEquals(organizatieFontWeight(), "700");
    }

    @Story("\"Organizație\" footer text font size ")
    @Test
    public void organizatie_font_size() {
        assertEquals(organizatieFontSize(), "16px");
    }

    @Story("\"Informații suplimentare\" footer text font size")
    @Test
    public void info_font_size() {
        assertEquals(infoFontSize(), "16px");
    }

    @Story("\"Informații suplimentare\" footer text font color")
    @Test
    public void info_font_color() {
        assertEquals(infoFontColor(), "rgba(0, 0, 0, 1)");
    }

    @Story("\"Informații suplimentare\" footer text font style ")
    @Test
    public void info_font_style() {
        assertEquals(infoFontStyle(), "normal");
    }

    @Story("Tapping on \"Condiții de utilizare\" footer section text")
    @Test
    public void conditii_tap(){
        conditiiTap();
        verify(driver, CONDITII);
    }

}

