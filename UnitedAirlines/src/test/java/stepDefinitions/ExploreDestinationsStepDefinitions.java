package stepDefinitions;

import common.WebAPI;
import homepageheader_book.BookOneWay;
import homepageheader_book.ExploreDestinationsUsingInteractiveMap;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class ExploreDestinationsStepDefinitions extends WebAPI {
    static ExploreDestinationsUsingInteractiveMap explore;

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
        explore = PageFactory.initElements(driver, ExploreDestinationsUsingInteractiveMap.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I click on the From button")
    public void i_click_on_the_from_button() throws InterruptedException {
        explore.fromButton();
    }

    @Given("I enter {string} in the from depart field")
    public void i_enter_in_the_from_depart_field(String location) throws InterruptedException {
        explore.fromDepartField(location);
    }

    @Given("I click on the Max price input box")
    public void i_click_on_the_max_price_input_box() {
        explore.maxPrice();
    }

    @Given("I enter {string} in the max price input box")
    public void i_enter_in_the_max_price_input_box(String price) {
        explore.maxPriceInput(price);
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() throws InterruptedException {
        explore.searchButton();
    }

    @Then("I should see {string} is displayed")
    public void i_should_see_is_displayed(String expectedText) {
        explore.verifyListsResultsText(expectedText);
    }


    @Then("I click on the searchType button and select specific date")
    public void i_click_on_the_search_type_button_and_select_specific_date() throws InterruptedException {
        explore.searchTypeButton();
    }

    @Then("I enter {string} in the filtered departDate")
    public void i_enter_in_the_filtered_depart_date(String departDate) {
        explore.filteredDepartDate(departDate);
    }

    @Then("I enter {string} in the filtered returnDate and hit enter")
    public void i_enter_in_the_filtered_return_date_and_hit_enter(String returnDate) throws InterruptedException {
        explore.filteredReturnDate(returnDate);
    }

    @Given("I click on the filter by interest button")
    public void i_click_on_the_filter_by_interest_button() {
        explore.filterByInterestButton();
    }

    @When("I select all of the filter options")
    public void i_select_all_of_the_filter_options() throws InterruptedException {
        explore.filterOptions();
    }

    @When("I click on apply filter")
    public void i_click_on_apply_filter() {
        explore.applyFilter();
    }

    @Then("I verify the text {string}")
    public void i_verify_the_text(String expectedText) {
        explore.verifyFilterResultsText(expectedText);
    }
}
