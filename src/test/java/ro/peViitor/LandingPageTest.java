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

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LandingPageTest extends Landing {

    public final String SERP = "https://beta.peviitor.ro/rezultate?page=1";
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
    public void search_Margin(){
        assertEquals(searchTopMargin(),"30px");
    }

    @Story("The search button is aligned in the center. ")
    @Test
    public void search_Center(){
        assertEquals(searchCenter(),"center");
    }

    @Story("Border radius for the search button is of 8px.")
    @Test
    public void search_border_Radius(){
        assertEquals(search_borderRadius(),"8px");
    }

    @Story("The text 'Caută' is present in the search button.")
    @Test
    public void search_visible(){
        assertTrue(isSearchvisible());
    }

    @Story("The font style for the text 'caută', in the search button, is 'normal'.")
    @Test
    public void search_fontStyle(){
        assertEquals(searchfontStyle(), "normal");
    }

    @Story("The hex code for 'caută' is #FFFFFF.")
    @Test
    public void search_text_color(){
        assertEquals(searchColor(),"rgba(255, 255, 255, 1)");
    }

    @Story("When you click on the search button it redirects you to the SERP page.")
    @Test
    public void search_tap() throws InterruptedException {
        searchTap();
        sleep(500);
        assertEquals(driver.getCurrentUrl(), SERP);
        driver.get(HOMEPAGE);

    }
}
