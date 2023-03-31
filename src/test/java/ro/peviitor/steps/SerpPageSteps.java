package ro.peviitor.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ro.peviitor.pageobject.modules.HeaderModule;
import ro.peviitor.pageobject.modules.SearchModule;
import ro.peviitor.pageobject.pages.SerpPage;
import ro.peviitor.utils.TypesOfData;

import static org.testng.Assert.*;

public class SerpPageSteps {

    private final SerpPage serpPage = new SerpPage();
    private final HeaderModule headerModule= new HeaderModule();
    private final SearchModule searchModule = new SearchModule();

    @Given("User is on SERP page")
    public void userIsOnSERPPage() {
        serpPage.open();
    }

    @And("click on logo user is redirected to HOMEPAGE")
    public void clickOnLogoUserIsRedirectedToHOMEPAGE() {
        assertEquals(headerModule.getPageAfterClickingLogo(), TypesOfData.HOMEPAGE, "Clicking on logo opens a new page.");
    }

    @Then("the logo is visible in footer section")
    public void theLogoIsVisibleInFooterSection() {
        assertTrue(serpPage.isFooterLogoDisplayed(),"The footer logo is not displayed in footer");
    }

    @And("on click on footer logo nothing happens")
    public void onClickOnFooterLogoNothingHappens() {
        assertFalse(serpPage.doesClickingOnFooterLogoOpenANewTab(),"Clicking on footer logo opens a new tab");
    }

    @Then("the button Vezi postul is displayed")
    public void theButtonVeziPostulIsDisplayed() {
        assertTrue(serpPage.isSeeJobButtonDisplayed(),"The Vezi postul button not displayed on page");
    }

    @And("is spelled as {string}")
    public void isSpelledAs(String text) {
        assertEquals(serpPage.seeJobText(),text,"The Vezi postul  button is not spelled correctly");
    }

    @And("clicking on the Vezi postul  button opens  a new tab")
    public void clickingOnTheVeziPostulButtonOpensANewTab() {
        assertTrue(serpPage.doesClickingOnVeziPostulOpenANewTab(),"Clicking on Vezi postul button do not open a new tab");
    }

    @Then("there are displayed {int} jobs displayed")
    public void thereAreDisplayedJobsDisplayed(int jobs) {
        assertEquals(serpPage.initialNumberOfJobsPerPage(), jobs,"The number of jobs displayed is higher than normal");
    }

    @Then("the job name displayed in the job result section")
    public void theJobNameDisplayedInTheJobResultSection() {
        assertTrue(serpPage.isJobNameDisplayedInJobSection(), "The job title is not displayed");
    }

    @And("the company`s name displayed in the job  result section")
    public void theCompanySNameDisplayedInTheJobResultSection() {
        assertTrue(serpPage.isCompanyNameDisplayedInJobSection(),"The company name is not displayed");
    }

    @And("the country name displayed in the job result section")
    public void theCountryNameDisplayedInTheJobResultSection() {
        assertTrue(serpPage.isCountryNameDisplayedInJobSection(),"The country name is not displayed");
    }

    @And("the country icon displayed n the job result section")
    public void theCountryIconDisplayedNTheJobResultSection() {
        assertTrue(serpPage.isCountryIconDisplayedInJobSection(),"The country icon is not displayed");
    }

    @Then("the Load more button displayed on SERP Page")
    public void theLoadMoreButtonDisplayedOnSERPPage() {
        assertTrue(serpPage.isLoadMoreButtonDisplayed(),"The Incarca mai multe button is not displayed");
    }

    @And("the Load more button is spelled {string}")
    public void theLoadMoreButtonIsSpelled(String buttonText) {
        assertEquals(serpPage.loadMoreButtonText(),buttonText, "The text inside Incarca mai multe is not spelled correctly");
    }

    @When("click on Load more button loads more additional jobs as a total of {int}")
    public void clickOnLoadMoreButtonLoadsMoreAdditionalJobsAsATotalOf(int totalJobs){
        assertEquals(serpPage.numberOfJobDisplayedPerPageAfterClickOnLoadMoreButton(), totalJobs,"The number of visible job not incresead by 10 more jobs");
    }

    @Then("input a search parameter like {string}")
    public void inputASearchParameterLike(String job) {
        assertEquals(searchModule.sendSearchParameter("sofer"),job,"The search parameter inputted is not correct");
    }

    @And("click on Caută button")
    public void clickOnCautăButton() {
            searchModule.clickOnSearchButton();
    }

    @When("all job are displayed button is not longer visible")
    public void allJobAreDisplayedButtonIsNotLongerVisible() {
        assertTrue(serpPage.isLoadMoreButtonDisplayed(),"The button is displayed on page");
    }

    @And("click on Load more button if not all job displayed")
    public void clickOnLoadMoreButtonIfNotAllJobDisplayed() {
        assertTrue(serpPage.isAllJobDisplayed(),"All job not displayed");
    }
}
