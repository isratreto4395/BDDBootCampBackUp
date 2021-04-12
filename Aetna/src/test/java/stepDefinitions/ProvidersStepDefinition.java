package stepDefinitions;

import aetnahomepage_Provider.ProvidersHomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class ProvidersStepDefinition extends WebAPI {
    public static ProvidersHomePage providers;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public void getInit() {
        providers = PageFactory.initElements(driver, ProvidersHomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the Aetna providers Homepage")
    public void i_am_on_the_aetna_homepage() throws IOException, InterruptedException {
        openBrowser("https://www.aetna.com/health-care-professionals.html");
    }

    @When("I click on the Providers link")
    public void i_click_on_the_providers_link() throws InterruptedException {
        providers.providersLink();
    }

    @When("I click on the viewProviderUpdateVideo on the Partnering with providers pop-up")
    public void i_click_on_the_view_provider_update_video_on_the_partnering_with_providers_pop_up() {
        providers.viewProviderUpdateVideo();
    }

    @When("I click on the continue button")
    public void i_click_on_the_continue_button() {
        providers.continueButton();
    }

    @Then("I verify {string} as the title of the video on YouTube")
    public void i_verify_as_the_title_of_the_video_on_you_tube(String expectedTitle) {
        providers.verifyyouTubeVideoTitle(expectedTitle);
    }

    @When("I close the Partnering with providers alert")
    public void i_close_the_Partnering_with_providers_alert() throws InterruptedException {
        providers.closeAlert();
    }

    @Then("I verify the Providers page title as {string}")
    public void i_verify_the_providers_page_title_as(String expectedTitle) {
      providers.verifyProvidersPageTitle(expectedTitle);
    }

    @When("I click on explore health care resources")
    public void i_click_on_explore_health_care_resources() {
       providers.exploreHealthCareResourcesLink();
    }
    @Then("I should see {string}")
    public void i_should_see(String expectedTitle) {
       providers.verifyManualsAndWebinarsPageTitle(expectedTitle);
    }

    @When("I click on read provider newsletters")
    public void i_click_on_read_provider_newsletters() {
        providers.readProviderNewslettersLink();
    }
    @Then("I verify page {string}")
    public void i_verify_page(String expectedTitle) {
      providers.verifyNewslettersLink(expectedTitle);
    }

    @When("I click on find regulations by state link")
    public void i_click_on_find_regulations_by_state_link() {
        providers.findRegulationsByStateLink();
    }
    @Then("The title is {string}")
    public void the_title_is(String expectedTitle) {
        providers.verifyStateRegulationsTitle(expectedTitle);
    }

    @When("I click on learn about disputes and appeals")
    public void i_click_on_learn_about_disputes_and_appeals() {
       providers.learnAboutDisputesAndAppealsLink();
    }
    @Then("I verify the text {string}")
    public void i_verify_the_text(String expectedTitle) {
       providers.verifydisputesAndAppealsPageTitle(expectedTitle);
    }

    @And("I right click the payment solutions link to open in a new window")
    public void i_right_click_the_payment_solutions_link_to_open_in_a_new_window() throws InterruptedException {
       providers.rightClickPaymentSolutionToOpenNewWindow();
    }
    @When("I click on the explore claims options")
    public void i_click_on_the_explore_claims_options() {
        providers.exploreClaimsOptions();
    }
    @Then("I verify the title as {string}")
    public void i_verify_the_title_as(String expectedTitle) {
        providers.verifyExploreClaimsOptionsPageTitle(expectedTitle);
    }


    @When("I click on the submit claims through the availity site")
    public void i_click_on_the_submit_claims_through_the_availity_site() {
       providers.submitClaimsThroughAvaility();
    }

    @When("I click on contiue to availity site and close the old window")
    public void i_click_on_contiue_to_availity_site_and_close_the_old_window() throws InterruptedException {
       providers.continueToAvailitySite();
    }

    @When("I click on the no button on the availity site pop-up")
    public void i_click_on_the_no_button_on_the_availity_site_pop_up() throws InterruptedException {
        providers.availitySitePop();
    }

    @Then("I verify the page as {string}")
    public void i_verify_the_page_as(String expectedTitle) {
        providers.verifyAvailitySitePageTitle(expectedTitle);
    }

    @When("I click on the precertificationButton")
    public void i_click_on_the_precertification_button() {
        providers.precertificationButton();
    }
    @When("I enter {string} in the code searchBox field and hit enter")
    public void i_enter_in_the_code_search_box_field_and_hit_enter(String code) throws InterruptedException {
        providers.searchBoxField(code);
    }
    @When("I click on iAccept")
    public void I_Click_On_I_Accept() {
        providers.iAcceptButton();
    }
    @Then("I should see CPT codes searched {string}")
    public void i_should_see_cpt_codes_searched(String expectedCode) {
       providers.cptCodesSearched(expectedCode);
    }
    @Then("I verify the page title as {string}")
    public void i_verify_the_page_title_as(String expectedTitle) {
        providers.verifyCodeSearchTitle(expectedTitle);
    }
    @And("I enter {string} in the code searchBox field1")
    public void i_enter_in_the_code_search_box_field1(String code) throws InterruptedException {
        providers.searchBoxField1(code);
    }
    @And("I enter {string} in the code searchBox field2")
    public void i_enter_in_the_code_search_box_field2(String code) throws InterruptedException {
        providers.searchBoxField2(code);

    }
    @And("I enter {string} in the code searchBox field3")
    public void i_enter_in_the_code_search_box_field3(String code) throws InterruptedException {
        providers.searchBoxField3(code);

    }
    @And("I enter {string} in the code searchBox field4")
    public void i_enter_in_the_code_search_box_field4(String code) throws InterruptedException {
        providers.searchBoxField4(code);

    }
    @And("I enter {string} in the code searchBox field5 and hit enter")
    public void i_enter_in_the_code_search_box_field5_and_hit_enter(String code) throws InterruptedException {
        providers.searchBoxField5(code);

    }



}
