package ro.peviitor.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ro.peviitor.pageobject.modules.FooterModule;
import ro.peviitor.pageobject.pages.HomePage;

import static org.testng.Assert.*;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();
    private final FooterModule footerModule = new FooterModule();

    @Given("User is on the homepage")
    public void userHasHomepageOpen() {
        homePage.open();
    }

    @Then("the homepage title is {string}")
    public void theHomepageTitleIs(String pageTitle) {
        assertEquals(homePage.getPageTitle(), pageTitle, "The title of the page is incorrect.");
    }

    @Then("the first section is spelled as {string}")
    public void firstSectionIsSpelledAs(String orgName) {
        assertEquals(footerModule.organizationText(), orgName, "The Organizație section is not spelled correctly");
    }

    @Then("the first link text under Organizatie is {string}")
    public void theFirstLinkTextUnderOrganizatieIs(String firstElementText) {
        assertEquals(footerModule.aboutUsText(), firstElementText, "The 'Despre noi' text is not spelled correctly");
    }

    @And("the first link is {string}")
    public void theFirstLinkIs(String firstLink) {
        assertEquals(footerModule.aboutUsLink(), firstLink, "The first link is not correct");
    }

    @And("on click the link opens in a new tab")
    public void onClickTheLinkOpensInANewTab() {
        assertTrue(footerModule.doesAboutUsLinkOpenInANewTab(), "The link does not open in a new tab");
    }

    @Then("the second link text under Organizatie is {string}")
    public void theSecondLinkTextUnderOrganizatieIs(String secondElementText) {
        assertEquals(footerModule.joinUsText(), secondElementText, "The 'Alatura-te cauzei noastre' text is not spelled correctly");
    }

    @And("the second link is {string}")
    public void theSecondLinkIs(String secondLink) {
        assertEquals(footerModule.joinUsLink(), secondLink, "The second link is not correct");
    }

    @And("on second click the link opens in a new tab")
    public void onSecondClickTheLinkOpensInANewTab() {
        assertTrue(footerModule.doesJoinUsLinkOpenInANewTab(), "The link does not open in a new tab");
    }

    @Then("the second section is spelled as {string}")
    public void theSecondSectionIsSpelledAs(String orgName) {
        assertEquals(footerModule.additionalInformationText(), orgName, "The Informatii suplimentare is not spelled correctly");
    }

    @Then("the first link text under Informatii suplimentare is {string}")
    public void theFirstLinkTextUnderInformatiiSuplimentareIs(String firstLink) {
        assertEquals(footerModule.termsAndConditionsLink(), firstLink, "The first link is not correct");
    }

    @Then("the second link text under Informatii suplimentare is {string}")
    public void theSecondLinkTextUnderInformatiiSuplimentareIs(String secondLink) {
        assertEquals(footerModule.confidentialityPolicyLink(), secondLink, "The second link is not correct");
    }

    @Then("the first link text in second section  under Informatii suplimentare is {string}")
    public void theFirstLinkTextInSecondSectionUnderInformatiiSuplimentareIs(String firstElementText) {
        assertEquals(footerModule.termsAndConditionText(), firstElementText, "The text in Conditii suplimnentare its not spelled correctly");
    }

    @Then("the second link text in second section under Informatii suplimentare is {string}")
    public void theSecondLinkTextInSecondSectionUnderInformatiiSuplimentareIs(String secondElementText) {
        assertEquals(footerModule.confidentialityPolicyText(), secondElementText, "The text in Politica de confidențialitate its not spelled correctly");
    }

    @And("the first link in second section is {string}")
    public void theFirstLinkInSecondSectionIs(String firstLink) {
        assertEquals(footerModule.termsAndConditionsLink(), firstLink, "The  first link its not correct!");
    }

    @And("the second link in second section is {string}")
    public void theSecondLinkInSecondSectionIs(String secondLink) {
        assertEquals(footerModule.confidentialityPolicyLink(), secondLink, "The second kink its not correct!");
    }

    @Then("the section is spelled as {string}")
    public void theSectionIsSpelledAs(String text) {
        assertEquals(footerModule.copyrightText(), text, "The spelling of copyright section its not correct!");
    }

    @And("on click nothing happens")
    public void onClickNothingHappens() {
        assertFalse(footerModule.doesClickingOnCopyrightOpenNewTab(), "Clicking on copyright section opens a new page.");
    }

    @Then("the first link underneath Social Media is {string}")
    public void theFirstLinkUnderneathSocialMediaIs(String firstLink) {
        assertEquals(footerModule.linkedInLInk(), firstLink, "The first link its not correct");
    }

    @And("on click first link from Social Media opens in a new tab")
    public void onClickFirstLinkFromSocialMediaOpensInANewTab() {
        assertTrue(footerModule.doesClickOnFirstSocialMediaOpenNewTab(), "The link does not open in a new tab");
    }

    @Then("the second link underneath Social Media is {string}")
    public void theSecondLinkUnderneathSocialMediaIs(String secondLink) {
        assertEquals(footerModule.discordText(), secondLink, "The link its not correct");
    }

    @And("on click second link from Social Media opens in a new tab")
    public void onClickSecondLinkFromSocialMediaOpensInANewTab() {
        assertTrue(footerModule.doesClickOnSecondSocialMediaOpenNewTab(), "The link does not open in a new tab");
    }

    @Then("the name is spelled as {string}")
    public void theNameIsSpelledAs(String text) {
        assertEquals(footerModule.socialMediaText(), text, "The text Social Media  is not spelled correctly");
    }

    @Then("phrase is spelled as {string}")
    public void phraseIsSpelledAs(String text) {
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
        assertEquals(homePage.blueSectionBackgroundColour(),color,"The color of the background is not correct");
    }
}
