package ro.peviitor.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ro.peviitor.pageobject.modules.FooterModule;
import ro.peviitor.pageobject.modules.HeaderModule;
import ro.peviitor.pageobject.modules.SearchModule;
import ro.peviitor.pageobject.pages.HomePage;

import static org.testng.Assert.*;

public class HomePageSteps {
    private final HomePage homePage = new HomePage();
    private final FooterModule footerModule = new FooterModule();
    private final HeaderModule headerModule = new HeaderModule();
    private final SearchModule searchModule = new SearchModule();

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

    @Then("Briefcase logo visible")
    public void briefcaseLogoVisible() {
        assertTrue(headerModule.isBriefcaseLogoVisible(), "The briefcase logo is not displayed");
    }

    @Then("Alătură-te text displayed")
    public void alăturăTeTextDisplayed() {
        assertTrue(headerModule.isJoinUsVisible(), "The Alătură-te is not displayed");
    }

    @And("the link of Alătură-te is {string}")
    public void theLinkOfAlăturăTeIs(String link) {
        assertEquals(headerModule.joinUsLink(), link, "The redirect link it is not correct");
    }

    @And("clicking on Alătură-te opens a new tab")
    public void clickingOnAlăturăTeOpensANewTab() {
        assertTrue(headerModule.doesJoinUsLinkOpenInANewTab(), "The link does not open in a new tab");
    }

    @Then("Spelling of the word  is {string}")
    public void spellingOfTheRightHeaderWordText(String text) {
        assertEquals(headerModule.joinUsText(), text, "The Alătură-te it is not spelled correctly");
    }

    @Then("logo is visible")
    public void logoIsVisible() {
        assertTrue(headerModule.isLogoVisible(), "The logo is not displayed in the header");
    }

    @And("click on logo nothing happens")
    public void clickOnLogoNothingHappens() {
        assertFalse(headerModule.doesClickingOnLogoOpenNewTab(), "Clicking on logo opens a new page.");
    }

    @And("logo is displayed in left corner of the header at {string}")
    public void logoIsDisplayedInLeftCornerOfTheHeaderAt(String position) {
        assertEquals(headerModule.headerLogoPosition(), position, "The position of logo is not correct");
    }

    @Then("the button Caută is spelled as {string}")
    public void theButtonCautăIsSpelledAs(String text) {
        assertEquals(searchModule.searchText(), text, "The Caută is not spelled correctly");
    }

    @Given("the button Caută is displayed")
    public void theButtonCautăIsDisplayed() {
        assertTrue(searchModule.isSearchVisible(), "The search button in not visible");
    }

    @Then("a magnifying glass is visible")
    public void aMagnifyingGlassIsVisible() {
        assertTrue(searchModule.isMagnifyingGlassVisible(),"The magnifying glass is not displayed");
    }

    @And("click on magnifying glass nothing happens")
    public void clickOnMagnifyingGlassNothingHappens() {
        assertFalse(searchModule.doesClickingOnMagnifyingGlassOpenNewTab(),"Clicking on magnifying glass open a new tab");
    }

    @Then("the spelling of the text inside first search bar is {string}")
    public void theSpellingOfTheTextInsideFirstSearchBarIs(String placeholder) {
        assertEquals(searchModule.getSearchPlaceholderText(),placeholder , "The message displayed inside search field is not correct");
    }

    @And("Caută can be clicked and returned results without search parameter")
    public void cautăCanBeClickedAndReturnedResultsWithoutSearchParameter() {
       assertTrue(searchModule.doesClickingOnSearchButtonReturnsResults(),"Clicking on search do not return eny results");
    }

    @And("user can type any job in the search bar like {string}")
    public void userCanTypeAnyJobInTheSearchBarLike(String job) {
        searchModule.sendTextInSearchField(job);
        assertEquals(searchModule.getTextInputtedInSearchField(), job, "The job inputted in search text field returned nothing ");
    }

    @And("user can search by company name like {string}")
    public void userCanSearchByCompanyNameLike(String company) {
        searchModule.sendTextInSearchField(company);
        assertEquals(searchModule.getTextInputtedInSearchField(), company, "The company inputted in search text field returned nothing ");
    }

    @When("user press ENTER after filling desired search parameters returns result")
    public void userPressENTERAfterFillingDesiredSearchParametersReturnsResult() {
        assertTrue(searchModule.doesPressingEnterReturnsResults(),"Pressing ENTER do not return eny results");
    }

    @Then("a location icon is visible")
    public void aLocationIconIsVisible() {
        assertTrue(searchModule.isLocationIconVisible(),"The location icon is not displayed");
    }

    @Then("the text inside second search criteria is by default România")
    public void theTextInsideSecondSearchCriteriaIsByDefaultRomânia() {
        assertTrue(searchModule.isDefaultValueVisible(),"The default value(România) is not displayed");
    }

    @And("the spelling of the text is {string}")
    public void theSpellingOfTheTextIs(String text) {
        assertEquals(searchModule.getDefaultValueText(), text ,"The default value(România) is not spelled correctly");
    }

    @And("clicking on the text from second search a dropdown appear")
    public void clickingOnTheTextFromSecondSearchADropdownAppear() {
        assertTrue(searchModule.getSelectSize()>1);
    }

    @Then("you can select first option from dropdown {string}")
    public void youCanSelectFirstOptionFromDropdown(String firstOption){
        assertEquals(searchModule.selectFirstOption(),firstOption,"The user cannot select option România");
    }

    @Then("you can select second option from dropdown {string}")
    public void youCanSelectSecondOptionFromDropdown(String secondOption) {
        assertEquals(searchModule.selectSecondOption(),secondOption,"The user cannot select option Toate");
    }
}
