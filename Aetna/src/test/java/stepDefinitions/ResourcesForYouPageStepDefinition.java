package stepDefinitions;

import aetnahomepage_Provider.ResourcesForYouPage;
import common.WebAPI;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class ResourcesForYouPageStepDefinition extends WebAPI {
    static ResourcesForYouPage resources;

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
        resources= PageFactory.initElements(driver, ResourcesForYouPage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }
    @Then("i click on the ResourcesForYou on the Providers page")
    public void i_click_on_the_resources_for_you_on_the_providers_page() {
        resources.resourcesForYouButton();
    }

    @Then("I click on the CDC issues guidelines for vaccinated individuals link")
    public void i_click_on_the_cdc_issues_guidelines_for_vaccinated_individuals_link() throws InterruptedException {
        resources.cdcIssuesGuidelineForVaccinatedIndividualsLink();
    }
    @When("I click on continue to site and close the old window")
    public void i_click_on_continue_to_site_and_close_the_old_window() throws InterruptedException {
      resources.continueToCDCGuidelineLink();
    }
    @Then("I verify the title {string}")
    public void i_verify_the_title(String expectedTitle) {
       resources.verifyCDCPageTitle(expectedTitle);
    }

    @When("I enter {string} in the search box and hit enter")
    public void i_enter_in_the_search_box_and_hit_enter(String topic) {
        resources.searchATopic(topic);
    }
    @Then("I should see {string} results are returned")
    public void i_should_see_results_are_returned(String expectedText) {
        resources.verifySearchResult(expectedText);
    }
    @Then("I should not see {string} related results are returned")
    public void i_should_not_see_related_results_are_returned(String expectedText) {
        resources.verifySearchResultNotMatch(expectedText);
    }
    @Then("I verify {string} as the page title")
    public void i_verify_as_the_page_title(String expectedTitle) {
        resources.verifySearchPageTitle(expectedTitle);
    }
    @Then("I click on the AdvancedSearch button")
    public void i_click_on_the_advanced_search_button() throws InterruptedException {
        resources.advancedSearchButton();
    }
    @Then("I enter {string} in the searchBox")
    public void i_enter_in_the_search_box(String topic) {
       resources.searchTopic(topic);
    }
    @Then("I enter {string} in allTheseWords inputBox")
    public void i_enter_in_all_these_words_input_box(String topic) {
        resources.allTheseWordsInputBox(topic);
    }
    @Then("I enter {string} in thisExactWordOrPhase inputBox")
    public void i_enter_in_this_exact_word_or_phase_input_box(String topic) {
        resources.thisExactWordOrPhraseInputBox(topic);
    }
    @Then("I enter {string} in anyOfTheseWords inputBox")
    public void i_enter_in_any_of_these_words_input_box(String topic) {
        resources.anyOfTheseWordsInputBox(topic);
    }
    @Then("I enter {string} in noneOfTheseWords inputBox")
    public void i_enter_in_none_of_these_words_input_box(String topic) {
        resources.noneOfTheseWordsInputBox(topic);
    }
    @Then("I select {string} from the Language dropdown")
    public void i_select_from_the_language_dropdown(String languageOption) {
        resources.languageDropdown(languageOption);
    }
    @Then("I enter {string} in the FromDate inputBox and I enter {string} in the TODate inputBox")
    public void i_enter_in_the_from_date_input_box_and_i_enter_in_the_to_date_input_box(String fromDate, String toDate) throws InterruptedException {
        resources.fromDateToDate(fromDate,toDate);
    }
    @When("I hit search")
    public void i_hit_search() throws InterruptedException {
        resources.searchButton();
    }

    @When("I click on the other languages link at the top of the homepage")
    public void i_click_on_the_other_langauges_link_at_the_top_of_the_homepage() {
        resources.otherLanguagesLink();
    }
    @Then("I verify the other languages page title {string}")
    public void i_verify_the_other_languages_page_title(String expectedTitle) {
       resources.verifyOtherLanguagesPageTitle(expectedTitle);
    }
    @When("I select Bengali from the filterByLanguage dropdown")
    public void i_select_Bengali_from_the_filter_by_language_dropdown() throws InterruptedException {
        resources.filterByLanguageDropdownAndSelectLanguage();
    }
    @When("I enter {string} in the languagePageSearchBox")
    public void i_enter_in_the_language_page_search_box(String searchText) {
        resources.languagePageSearchBox(searchText);
    }
    @Then("I verify the message {string}")
    public void i_verify_the_message(String expectedMessage) {
       resources.verifyResultMessage(expectedMessage);
    }

    @When("I click on the filterByLanguage dropdown")
    public void i_click_on_the_filter_by_language_dropdown() {
        resources.filterByLanguageDropdown();
    }
    @When("I connect to the database and store all the language options in the mySql database")
    public void i_connect_to_the_database_and_store_all_the_language_options_in_the_my_sql_database() {
       resources.storeLanguageOptionsInMySQL();
    }

    @Then("I verify all the language options by using the mySql database")
    public void i_verify_all_the_language_options_by_using_the_my_sql_database() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("I click on the Community strategy to address inequities link")
    public void i_click_on_the_community_strategy_to_address_inequities_link() {
        resources.communityStrategyToAddressInequitiesLink();
    }
    @When("I click on continue and close the old window")
    public void i_click_on_continue_and_close_the_old_window() throws InterruptedException {
      resources.continueToCVSSite();
    }
    @Then("I verify the page {string}")
    public void i_verify_the_page(String expectedTitle) {
        resources.verifyCVSHealthPageTitle(expectedTitle);
    }

    @Then("I click on the CVS Health expands access to vaccines link")
    public void i_click_on_the_cvs_health_expands_access_to_vaccines_link() {
        resources.cvsHealthExpandsAccessToVaccinesLink();
    }





}
