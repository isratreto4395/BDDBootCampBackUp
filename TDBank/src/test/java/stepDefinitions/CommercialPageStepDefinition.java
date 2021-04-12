package stepDefinitions;

import common.WebAPI;
import homepageheader.CommercialPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CommercialPageStepDefinition extends WebAPI {
    static CommercialPage commercialPage;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        commercialPage = PageFactory.initElements(driver, CommercialPage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the TD Bank homePage")
    public void i_am_on_the_td_bank_home_page() throws IOException {
        openBrowser("https://www.td.com");
    }

    @When("I close the Ads Choices & Personalization popUp")
    public void i_close_the_ads_choices_personalization_pop_up() {
        commercialPage.adsChoicesAndPersonalizationpopUp();
    }

    @Then("I click on the Commercial tab")
    public void i_click_on_the_commerical_tab() throws InterruptedException {
        sleepFor(5);
        commercialPage.commercialTab();
    }

    @Then("I hover over the Lending button and I select Commercial Lending option")
    public void i_hover_over_the_lending_button_and_i_select_commercial_lending_option() {
        commercialPage.hoverOverLendingAndSelectCommerical();
    }

    @Then("I verify {string} in the product title")
    public void i_verify_in_the_product_title(String expectedText) {
        commercialPage.verifyCommercialLendingPage(expectedText);
    }

    @Then("I scrolled down to click on the Request a call button")
    public void i_scrolled_down_to_click_on_the_request_a_call_button() {
        commercialPage.requestACall();
    }

    @Then("I enter all the personal information to schedule an appointment")
    public void i_enter_all_the_personal_information_to_schedule_an_appointment(List<List<String>> table) {
        Map<String, String> map = TableDictionaryConverter(table);
        commercialPage.enterPersonalInformation(map.get("FirstName"), map.get("LastName"), map.get("BusinessName"), map.get("Phone"), map.get("Email"));
    }

    @When("I clicked on the Are you a TD customer radioButton")
    public void i_clicked_on_the_are_you_a_td_customer_radio_button() {
        commercialPage.areYouATDCustomer();
    }

    @Then("I verify the {string} header on the page")
    public void i_verify_the_header_on_the_page(String expectedText) {
        commercialPage.verifyHeaderOnTheScheduleAppointmentPage(expectedText);
    }

    @When("I click on the Learn More button")
    public void i_click_on_the_learn_more_button() throws InterruptedException {
        commercialPage.learnMoreButton();
    }

    @Then("I verify that it scrolls down to {string} on the page")
    public void i_verify_that_it_scrolls_down_to_on_the_page(String expectedText) {
        commercialPage.verifyFlexibleLendingOptions(expectedText);
    }

    @When("I scrolled down to click TD Global Trade Finance Get details button")
    public void i_scrolled_down_to_click_td_global_trade_finance_get_details_button() {
        commercialPage.tdGlobalTradeFinanceGetDetailsButton();
    }

    @Then("I clicked on the Visit TD Investor Relations link")
    public void i_clicked_on_the_visit_td_investor_relations_link() {
        commercialPage.tdInvestorRelationsLink();
    }

    @Then("I verify the {string} title on the page")
    public void i_verify_the_title_on_the_page(String expectedTitle) {
        commercialPage.verifyTheInvestorRelationsPageTitle(expectedTitle);
    }

    @Then("I clicked on sign up for alerts")
    public void i_clicked_on_sign_up_for_alerts() {
        commercialPage.signUpForALerts();
    }

    @Then("I entered all the personal information fields for Get News Alerts By Email")
    public void i_entered_all_the_personal_information_fields_for_get_news_alerts_by_email(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String firstName = data.get(1).get(0);
        String lastName = data.get(1).get(1);
        String email = data.get(1).get(2);
        String company = data.get(1).get(3);
        String phone = data.get(1).get(4);
        commercialPage.personalInfoFieldOnGetNewsAlerts(firstName, lastName, email, company, phone);
    }

    @Then("I used the Sector dropdown to select {string}")
    public void i_used_the_sector_dropdown_to_select(String sectorOption) {
        commercialPage.sectorDropDown(sectorOption);
    }

    @Then("I verify {string} title on the page")
    public void i_verify_title_on_the_page(String expectedText) {
        commercialPage.verifyGetNewsAlertsTitle(expectedText);
    }

    @When("I scrolled down to click the Award Winning button")
    public void i_scrolled_down_to_click_the_award_winning_button() {
        commercialPage.awardWinningButton();
    }

    @Then("I verify the {string} section title of the page")
    public void i_verify_the_section_title_of_the_page(String expectedText) {
        commercialPage.verifySectionTitle(expectedText);
    }

    @Then("I hover over the Treasury Services and I select the Payables option")
    public void i_hover_over_the_treasury_services_and_i_select_the_payables_option() {
        commercialPage.hoverOverTreasuryServices();
    }

    @When("I click on the TD Information Services Get details Button")
    public void i_click_on_the_td_information_services_get_details_button() {
        commercialPage.tdInformationServicesGetDetailsButton();
    }

    @Then("I click on the TD eTreasury link to play the video")
    public void i_click_on_the_td_e_treasury_link_to_play_the_video() {
        commercialPage.tdeTreasuryLink();
    }

    @When("I click on transcript")
    public void i_click_on_transcript() throws InterruptedException {
        commercialPage.clickTranscript();
    }

    @Then("I verify the {string} transcript on the video page")
    public void i_verify_the_transcript_on_the_video_page(String expectedText) {
        commercialPage.verifyTranscript(expectedText);
    }

    @When("I hover over the Industries and I select the Education option")
    public void i_hover_over_the_industries_and_i_select_the_education_option() {
        commercialPage.hoverOverIndustries();
    }

    @Then("I verify {string} in the page title")
    public void i_verify_in_the_page_title(String expectedTitle) {
        commercialPage.verifyPageTitle(expectedTitle);
    }

    @Then("I scrolled down to click on the Asset Based lending icon")
    public void i_scrolled_down_to_click_on_the_asset_based_lending_icon() {
        commercialPage.assetBasedLendingIcon();
    }

    @Then("I verify that it scrolls down to {string} title on the page")
    public void i_verify_that_it_scrolls_down_to_title_on_the_page(String expectedTitle) {
        commercialPage.verifyTitle(expectedTitle);
    }

    @Then("I scrolled down to click on the Loans And Lines of Credit icon")
    public void i_scrolled_down_to_click_on_the_loans_and_lines_of_credit_icon() {
        commercialPage.loansAndCreditsIcon();
    }

    @When("I scroll down to click on Commercial mortgages to open a new window")
    public void i_scroll_down_to_click_on_commercial_mortgages_to_open_a_new_window() throws InterruptedException {
        commercialPage.commercialMortgageLink();
    }

    @Then("I navigate back to the TD Commercial & Corporate Lending page window")
    public void i_navigate_back_to_the_td_commercial_corporate_lending_page_window() throws InterruptedException {
        commercialPage.navigateBackToTDCommericalAndCorporateLendingWindow();
    }

    @When("I scrolled down to click on the Fraud Control icon")
    public void i_scrolled_down_to_click_on_the_fraud_control_icon() {
        commercialPage.fraudControlIcon();
    }

    @Then("I click on the Fraud Items You Might Not Know link")
    public void i_click_on_the_fraud_items_you_might_not_know_link() {
        commercialPage.fraudItemsYouMightNotKnowLink();
    }

    @Then("I verify {string} on the page title")
    public void i_verify_on_the_page_title(String expectedTitle) {
        commercialPage.verifyThePageTitleOfTheLink(expectedTitle);
    }

    @When("I scrolled down to click on the Equipment Finance page")
    public void i_scrolled_down_to_click_on_the_equipment_finance_page() {
        commercialPage.equipmentFinanceIcon();
    }

    @Then("I verify that {string} Finance is the page title")
    public void i_verify_that_finance_is_the_page_title(String expectedTitle) {
        commercialPage.verifyTheFinancePageTitle(expectedTitle);
    }

    @Then("I scrolled down to click on Explore TD's banking offerings by industry")
    public void i_scrolled_down_to_click_on_explore_td_s_banking_offerings_by_industry() {
        commercialPage.exploreTDBankingOfferingsByIndustryLink();
    }

    @When("I clicked on Growing Business, Growing Risk link")
    public void i_clicked_on_growing_business_growing_risk_link() {
        commercialPage.growingBusinessLink();
    }

    @Then("I should see {string} as the page title")
    public void i_should_see_as_the_page_title(String expectedTitle) {
        commercialPage.verifyGrowingBusinessPageTitle(expectedTitle);
    }

    @Then("I enter {string} in the searchBox")
    public void i_enter_in_the_search_box(String question) throws InterruptedException {
        commercialPage.enterAQuestion(question);
    }
    @When("I click on the askNow Button")
    public void i_click_on_the_ask_now_button() throws InterruptedException {
        commercialPage.askNowButton();
    }
    @Then("I should see {string} properly appear below the searchBox")
    public void i_should_see_properly_appear_below_the_search_box(String expectedQuestion) {
    commercialPage.verifySearchResult(expectedQuestion);
    }
    @Then("I should not see {string} appear below the searchBox")
    public void i_should_not_see_appear_below_the_search_box(String expectedQUestion) {
        commercialPage.verifySearchResultIsNotAMatch(expectedQUestion);
    }


}
