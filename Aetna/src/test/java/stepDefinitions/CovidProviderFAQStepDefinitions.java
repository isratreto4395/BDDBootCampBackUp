package stepDefinitions;

import aetnahomepage_Provider.CovidProviderFAQ;
import aetnahomepage_Provider.ProvidersHomePage;
import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class CovidProviderFAQStepDefinitions extends WebAPI {
    static CovidProviderFAQ covidProviderFAQ;

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
        covidProviderFAQ = PageFactory.initElements(driver, CovidProviderFAQ.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Then("i click on the COVID FAQs on the Providers page")
    public void i_click_on_the_covid_fa_qs_on_the_providers_page() {
    covidProviderFAQ.covidFAQSButton();
    }
    @Then("I click on the VaccineFAQs button")
    public void i_click_on_the_vaccine_fa_qs_button() {
       covidProviderFAQ.vaccineFAQButton();
    }
    @When("I click on Which COVID vaccinations will Aetna cover? tab")
    public void i_click_on_which_covid_vaccinations_will_aetna_cover_tab() throws InterruptedException {
       covidProviderFAQ.vaccineQuestionTab();
    }
    @Then("I verify the first sentence {string}")
    public void i_verify_the_first_sentence(String expectedSentence) {
       covidProviderFAQ.verifyTheFirstSentenceOfQuestion(expectedSentence);
    }

    @Then("I click on the Availity link on the Vaccine Updates pop-up")
    public void i_click_on_the_availity_link_on_the_vaccine_updates_pop_up() {
       covidProviderFAQ.availityLink();
    }
    @Then("I click the continue button to open the Availity page on another window and I close the old window")
    public void i_click_the_continue_button_to_open_the_availity_page_on_another_window_and_i_close_the_old_window() throws InterruptedException {
       covidProviderFAQ.continueToSiteButton();
    }
    @When("I enter invalid UserID and Password")
    public void i_enter_invalid_user_id_and_password(List<List<String>>data) {
        Map<String,String> map = TableDictionaryConverter(data);
        covidProviderFAQ.invalidUserNameAndPassword(map.get("UserID"),map.get("Password"));
    }
    @Then("I click on the showPassword checkbox")
    public void i_click_on_the_show_password_checkbox() throws InterruptedException {
        covidProviderFAQ.showPasswordCheckbox();
    }
    @Then("I click on the LogIn button")
    public void i_click_on_the_log_in_button() {
       covidProviderFAQ.logInButton();
    }
    @Then("I verify the error message {string}")
    public void i_verify_the_error_message(String expectedErrorMessage) {
        covidProviderFAQ.verifyLogInErrorMessage(expectedErrorMessage);
    }

    @Then("I click on the CAQH link on the Vaccine Updates pop-up")
    public void i_click_on_the_caqh_link_on_the_vaccine_updates_pop_up() {
        covidProviderFAQ.cAQHLink();
    }
    @Then("I click the continue button to open the CAQH page on another window and I close the old window")
    public void i_click_the_continue_button_to_open_the_caqh_page_on_another_window_and_i_close_the_old_window() throws InterruptedException {
       covidProviderFAQ.continueToCAQHSiteButton();
    }
    @Then("I enter invalid UserName")
    public void i_enter_invalid_user_name(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String userName = data.get(0).get(1);
        covidProviderFAQ.enterInvalidUserName(userName);
    }
    @When("I click on Forgot Password")
    public void i_click_on_forgot_password() {
        covidProviderFAQ.forgotPasswordLink();
    }
    @Then("I click on the TermsOfService checkbox")
    public void i_click_on_the_terms_of_service_checkbox() {
        covidProviderFAQ.termsOfServiceCHeckBox();
    }
    @When("I hit continue")
    public void i_hit_continue() throws InterruptedException {
        covidProviderFAQ.hitContinue();
    }
    @Then("I verify the page title {string}")
    public void i_verify_the_page_title(String expectedTitle){
       covidProviderFAQ.verifyForgotPasswordErrorMessage(expectedTitle);
    }

    @Then("I click on the BillingAndCodingFAQs button")
    public void i_click_on_the_billing_and_coding_fa_qs_button() {
       covidProviderFAQ.billingAndCodingFAQButton();
    }
    @When("I click on Where can providers access the telemedicine policy and related codes? tab")
    public void i_click_on_where_can_providers_access_the_telemedicine_policy_and_related_codes_tab() throws InterruptedException {
     covidProviderFAQ.billingAndCodingQuestion();
    }
    @Then("I verify the answer {string}")
    public void i_verify_the_answer(String expectedAnswer) {
       covidProviderFAQ.answerToBillingCodingQuestion(expectedAnswer);
    }

    @Then("I click on the TelemedicineFAQs button")
    public void i_click_on_the_telemedicine_fa_qs_button() {
        covidProviderFAQ.telemedicineFAQsButton();
    }
    @When("I click on How can members access services without going to a provider's office? tab")
    public void i_click_on_how_can_members_access_services_without_going_to_a_provider_s_office_tab() {
        covidProviderFAQ.telemedicineQUestionTab();
    }
    @Then("I click on the Coronavirus resource page")
    public void i_click_on_the_coronavirus_resource_page() {
       covidProviderFAQ.coronavirusResourcePage();
    }
    @Then("I click on ViewUpToDateVaccineDataFromTheCDC link")
    public void i_click_on_view_up_to_date_vaccine_data_from_the_cdc_link() {
      covidProviderFAQ.viewUpToDateVaccineDataFromTheCDCLink();
    }
    @Then("I click the continue button to open the CDC site page on another window and I close the old window")
    public void i_click_the_continue_button_to_open_the_cdc_site_page_on_another_window_and_i_close_the_old_window() throws InterruptedException {
        covidProviderFAQ.continueToCDCLink();
    }
    @Then("I should see {string} as the page title")
    public void i_should_see_as_the_page_title(String expectedTitle) {
       covidProviderFAQ.verifyCDCPageTitle(expectedTitle);
    }

    @Then("I click on the PatientCOverageFAQs button")
    public void i_click_on_the_patient_c_overage_fa_qs_button() {
        covidProviderFAQ.patientCoverageFaqsButton();
    }

    @Then("I click on the covidStateResources button")
    public void i_click_on_the_covid_state_resources_button() {
        covidProviderFAQ.covidStateResourcesButton();
    }

    @Then("I click on the StateInputBox dropdown to select {string}")
    public void i_click_on_the_state_input_box_dropdown_to_select(String state) {
       covidProviderFAQ.stateInputBoxDropdown(state);
    }

    @When("I click on the WisconsinVaccineInformaton link")
    public void i_click_on_the_wisconsin_vaccine_informaton_link() {
        covidProviderFAQ.wisconsinVaccineInformatonLink();
    }

    @When("I click the continue button to open the WisconsinVaccineInformation page on another window and I close the old window")
    public void i_click_the_continue_button_to_open_the_wisconsin_vaccine_information_page_on_another_window_and_i_close_the_old_window() throws InterruptedException {
       covidProviderFAQ.continueToWisconsinVaccineInformation();
    }

    @Then("I should see {string} as the title")
    public void i_should_see_as_the_title(String expectedTitle) {
        covidProviderFAQ.verifyWisconsinVaccineInformationPageTitle(expectedTitle);
    }

    @Then("I click on the ManagementResourcesFAQs button")
    public void i_click_on_the_management_resources_fa_qs_button() {
        covidProviderFAQ.managementResourcesFaqsButton();
    }
    @Then("I click on the CARES Act information for providers tab")
    public void i_click_on_the_cares_act_information_for_providers_tab() throws InterruptedException {
       covidProviderFAQ.caresActInformationForProvidersTab();
    }
    @When("I click on the CARESActInformationForProvidersPDF")
    public void i_click_on_the_cares_act_information_for_providers_pdf() {
        covidProviderFAQ.caresActInformationForProvidersPDF();
    }
    @Then("I verify {string} as the title")
    public void i_verify_as_the_title(String expectedTitle) {
        covidProviderFAQ.verifycaresActInformationForProvidersPDFPageTitle(expectedTitle);
    }

}
