package ro.peviitor.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ro.peviitor.pageobject.modules.FooterModule;
import ro.peviitor.pageobject.pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageSteps
{
    private final HomePage homePage = new HomePage();
    private final FooterModule footerModule = new FooterModule();

    @Given("User is on the homepage")
    public void userHasHomepageOpen()
    {
        homePage.open();
    }

    @Then("the homepage title is {string}")
    public void theHomepageTitleIs(String pageTitle)
    {
        assertEquals(homePage.getPageTitle(), pageTitle, "The title of the page is incorrect.");
    }

    @Then("the section is spelled as {string}")
    public void theSectionIsSpelledAs(String orgName)
    {
        assertEquals(footerModule.organizationText(), orgName, "The Organizație section is not spelled correctly");
    }

    @Then("the first link text under Organizatie is {string}")
    public void theFirstLinkTextUnderOrganizatieIs(String firstElementText)
    {
        assertEquals(footerModule.aboutUsText(), firstElementText, "The 'Despre noi' text is not spelled correctly");
    }

    @And("the first link is {string}")
    public void theFirstLinkIs(String firstLink)
    {
        assertEquals(footerModule.aboutUsLink(), firstLink, "The first link is not correct");
    }

    @And("on click the link opens in a new tab")
    public void onClickTheLinkOpensInANewTab()
    {
        assertTrue(footerModule.doesLinkOpenInANewTab(), "The link does not open in a new tab");
    }

    @Then("the second link text under Organizatie is {string}")
    public void theSecondLinkTextUnderOrganizatieIs(String secondElementText)
    {
        assertEquals(footerModule.joinUsText(), secondElementText, "The 'Alatura-te cauzei noastre' text is not spelled correctly");

    }

    @And("the second link is {string}")
    public void theSecondLinkIs(String secondLink)
    {
        assertEquals(footerModule.joinUsLink(), secondLink, "The second link is not correct");

    }
}
