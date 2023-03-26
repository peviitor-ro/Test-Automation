package ro.peviitor.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import ro.peviitor.pageobject.modules.HeaderModule;
import ro.peviitor.pageobject.pages.SerpPage;
import ro.peviitor.utils.TypesOfData;

import static org.testng.Assert.*;

public class SerpPageSteps {

    private final SerpPage serpPage = new SerpPage();
    private final HeaderModule headerModule= new HeaderModule();

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
}
