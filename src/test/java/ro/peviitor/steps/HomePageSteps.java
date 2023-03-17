package ro.peviitor.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ro.peviitor.pageobject.pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();

    @Given("User is on the homepage")
    public void userHasHomepageOpen() {
        homePage.open();
    }

    @Then("the homepage title is {string}")
    public void theHomepageTitleIs(String pageTitle) {
        assertEquals(homePage.getPageTitle(), pageTitle, "The title of the page is incorrect.");
    }

    @Then("phrase is spelled as {string}")
    public void firstLineIsSpelledAs(String text) {
        assertEquals(homePage.firstLineBlueSectionText(), text, "The phrase is not spelled correctly");
    }

    @Then("the first text in blue section is spelled as {string}")
    public void theSecondLineInBlueSectionIsSpelledAs(String text) {
        assertEquals(homePage.secondLineInBlueSectionText(), text, "The phrase is not spelled correctly");
    }

    @Then("the third line text is {string}")
    public void theThirdLineTextIs(String text) {
        assertEquals(homePage.theThirdLineText(), text, "The phrase is not spelled correctly");
    }

    @And("the third line link text is {string}")
    public void theThirdLineLinkTextIs(String linkText) {
        assertEquals(homePage.theThirdLineLink(), linkText, "The link is not correct!");
    }

    @And("on click the link from blue section opens a new tab")
    public void onClickTheLinkFromBlueSectionOpensANewTab() {
        assertTrue(homePage.doesTheThirdLinkOpenNewTab(), "The link does not open in a new tab");
    }

    @And("the background color of Blue section is {string}")
    public void theBackgroundColorOfBlueSectionIs(String color) {
        assertEquals(homePage.blueSectionBackgroundColour(), color, "The color of the background is not correct");
    }

    @Then("the content of wanted job section is spelled as {string}")
    public void theContentOfWantedJobIsSpelledAs(String text) {
        assertEquals(homePage.findWantedJobNowText(), text, "The text displayed it is not correct ");
    }

    @And("The color for jobul dorit from the Gaseste-ti jobul dorit acum is {string}")
    public void theColorForJobulDoritFromTheGasesteTiJobulDoritAcumIs(String color) {
        assertEquals(homePage.wantedJobColor(), color, "The color of the text is not correct");
    }

    @Then("the second line from this section is spelled as {string}")
    public void theSecondLineFromThisSectionIsSpelledAs(String text) {
        assertTrue(homePage.secondLineWantedJobText().contains(text), "The displayed text it is not correct");
    }

}
