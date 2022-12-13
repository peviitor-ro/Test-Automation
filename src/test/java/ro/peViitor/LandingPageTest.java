package ro.peViitor;

import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import ro.peViitor.pages.Landing;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class LandingPageTest extends Landing {

    public final String HOMEPAGE = "https://beta.peviitor.ro/";
    public final String VOLUNTARI = "https://www.oportunitatisicariere.ro/voluntari";
    public final String INSTAGRAM = "";
    public WebDriver driver;

    @BeforeClass
    public void startUp() {
        driver = openBrowser();
        driver.manage().window().maximize();
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

    @Story("Alătură-te button width TC242 ")
    @Test
    public void join_width() {
        assertEquals(joinWidth(), "73px");
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

    @Story("\"Alătură-te\" button font TC177 ")
    @Test
    public void join_font() {
        assertEquals(joinFont(), "SF Pro");
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
    }

    private void voluntariRedirect() {
        joinTap();
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        assertEquals(driver.getCurrentUrl(), VOLUNTARI);
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

    @Story("Alătură-te button text has diacritics TC240 ")
    @Test
    public void join_characters() {
        assertEquals(joinCharacters(), "Alătură-te");
    }

    @Story("\"Alătură-te\"  button height TC241")
    @Test
    public void join_font_height() {
        assertEquals(joinFontHeight(), "19px");
    }

    @Story("Briefcase icon width TC179")
    @Test
    public void briefcase_width() {
        assertEquals(briefcaseWidth(), "16.67px");
    }

    @Story("Briefcase icon height TC181")
    @Test
    public void briefcase_height() {
        assertEquals(briefcaseHeight(), "15px");
    }

    @Ignore
    @Story("Tapping on \"Instagram\" button TC182 ")
    @Test
    public void instagram_tap() {
        instagramRedirect();
    }

    private void instagramRedirect() {
        instagramLogo();
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        assertEquals(driver.getCurrentUrl(), INSTAGRAM);
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

    @Story("Instagram logo width TC294")
    @Test
    public void instagram_width() {
        assertEquals(instagramLogoWidth(), "16.67px");
    }

    @Story("Instagram logo height TC295")
    @Test
    public void instagram_height() {
        assertEquals(instagramLogoHeight(), "16.67px");
    }

    @Story("Cauta search button hex code TC262")
    @Test
    public void cauta_Color() {
        assertEquals(cautaColor(), "rgba(224, 141, 33, 1)");
    }

    @Story("Cauta search button width TC263")
    @Test
    public void cauta_Width() {
        assertEquals(cautaWidth(), "335px");
    }

    @Story("Cauta search buton height TC264")
    @Test
    public void cauta_Height() {
        assertEquals(cautaHeight(), "48px");
    }


}