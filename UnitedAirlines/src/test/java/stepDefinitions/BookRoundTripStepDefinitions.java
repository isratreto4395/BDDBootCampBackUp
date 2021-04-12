package stepDefinitions;

import common.WebAPI;
import homepageheader_book.BookRoundTrip;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class BookRoundTripStepDefinitions extends WebAPI {
    static BookRoundTrip bookRoundTrip;
    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        bookRoundTrip= PageFactory.initElements(driver,BookRoundTrip.class);
    }

    //@After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on the United homepage")
    public void i_am_on_the_united_homepage() throws IOException {
        openBrowser("https://www.united.com/en/us");
    }
    @And("I enter {string} in the fromField")
    public void i_enter_in_the_from_field(String location) throws InterruptedException {
      bookRoundTrip.fromLocationField(location);
    }
    @And("I enter {string} in the toField")
    public void i_enter_in_the_to_field(String location) {
        bookRoundTrip.toLocationField(location);
    }
    @And("I enter {string} in the departDate")
    public void i_enter_in_the_depart_date(String date) {
       bookRoundTrip.departDateField(date);
    }
    @When("I enter {string} in the returnDate and hit enter")
    public void i_enter_in_the_return_date_and_hit_enter(String date) throws InterruptedException {
        bookRoundTrip.returnDateField(date);
    }

    @Then("I should see {string} properly appear")
    public void i_should_see_properly_appear(String expectedTitle) {
        bookRoundTrip.verifySearchPageTitle(expectedTitle);
    }
    @And("I click on the departDate field")
    public void i_click_on_the_depart_date_field() {
        bookRoundTrip.departDate();
    }
    @Given("using the arrow I go to the next month and select the depart date")
    public void using_the_arrow_i_go_to_the_next_month_and_select_the_depart_date() throws InterruptedException {
        bookRoundTrip.selectDepartDate();
    }
    @Given("I click on the returnDate field")
    public void i_click_on_the_return_date_field(){
        bookRoundTrip.returnDate();
    }
    @Given("using the arrow I go to the next month and select the return date")
    public void using_the_arrow_i_go_to_the_next_month_and_select_the_return_date() throws InterruptedException {
       bookRoundTrip.selectReturnDate();
    }
    @When("I click on the Find Flights button")
    public void i_click_on_the_find_flights_button() throws InterruptedException {
        bookRoundTrip.findFlightsButton();
    }
    @Then("I verify the page title as {string}")
    public void i_verify_the_page_title_as(String expectedText) {
      bookRoundTrip.verifySearchPageText(expectedText);
    }

    @And("I click on the travellersButton")
    public void i_click_on_the_travellers_button() {
        bookRoundTrip.travellersButton();
    }
    @When("I click on the add More Adults Button five times")
    public void i_click_on_the_add_more_adults_button_five_times() throws InterruptedException {
        bookRoundTrip.addMoreAdultsButton();
    }
    @When("I click on the submit button")
    public void iClickOnTheSubmitButton() throws InterruptedException {
        bookRoundTrip.submitButton();
    }
    @Then("I verify the input {string} in the travellersField")
    public void i_verify_the_input_in_the_travellers_field(String expectedAdultAmount) {
       bookRoundTrip.verifyAddedAdultTravellersAmount(expectedAdultAmount);
    }

    @Then("I verify the error message {string}")
    public void iVerifyTheErrorMessage(String expectedError) {
        bookRoundTrip.verifyErrorMessage(expectedError);
    }
}
