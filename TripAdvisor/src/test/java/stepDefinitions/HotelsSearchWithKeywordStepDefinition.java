package stepDefinitions;

import common.WebAPI;
import homepageheader_hotels.HotelsSearchWithKeyword;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HotelsSearchWithKeywordStepDefinition extends WebAPI {
    static HotelsSearchWithKeyword hotels;

    // Cucumber Hook
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
        hotels = PageFactory.initElements(driver, HotelsSearchWithKeyword.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the Trip Advisor homepage")
    public void i_am_on_the_trip_advisor_homepage() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @And("I click on Hotels")
    public void i_click_on_hotels() throws InterruptedException {
        hotels.hotelsLink();
    }

    @When("I enter {string} in the whereTo searchBox and hit enter")
    public void i_enter_in_the_where_to_search_box_and_hit_enter(String location) throws InterruptedException {
        hotels.whereToSearchBox(location);
    }

    @When("I click on the hotels button")
    public void i_click_on_the_hotels_button() throws InterruptedException {
        hotels.hotelsButton();
    }

    @Then("I verify the title as {string}")
    public void i_verify_the_title_as(String expectedTitle) {
        hotels.verifyHotelsSearchResultPage(expectedTitle);
    }

    @When("I click on the searchBox and clear it")
    public void i_click_on_the_search_box_and_clear_it() throws InterruptedException {
       hotels.clearSearchBox();
    }
    @When("I enter {string} in the searchBox")
    public void i_enter_in_the_search_box(String text) throws InterruptedException {
        hotels.typeInSearchBox(text);
    }
    @When("I click on the searchButton")
    public void i_click_on_the_search_button() {
      hotels.searchButton();
    }
    @Then("I should see {string} properly appeared")
    public void i_should_see_properly_appear(String expectedSearchResult) {
       hotels.verifyExpectedSearchResult(expectedSearchResult);
    }


}
