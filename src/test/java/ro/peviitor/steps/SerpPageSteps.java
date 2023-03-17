package ro.peviitor.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

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
}
