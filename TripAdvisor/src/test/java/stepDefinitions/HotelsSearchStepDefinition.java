package stepDefinitions;

import common.WebAPI;
import homepageheader_hotels.HotelsSearch;
import homepageheader_hotels.HotelsSearchWithKeyword;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class HotelsSearchStepDefinition extends WebAPI {
    static HotelsSearch hotelsSearch;

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
        hotelsSearch = PageFactory.initElements(driver, HotelsSearch.class);
    }

    //@After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I click on the whereTo searchBox")
    public void i_click_on_the_where_to_search_box() {
        hotelsSearch.whereToSearchBox();
    }

    @When("I select Los Angeles from the popular destinations suggestion")
    public void i_select_los_angeles_from_the_popular_destinations_suggestion() {
        hotelsSearch.selectPopularDestination();
    }

    @Then("I verify the title {string}")
    public void i_verify_the_title(String expectedTitle) {
        hotelsSearch.verifyPageTitle(expectedTitle);
    }

    //    @Then("I verify the title {string}")
//    public void iVerifyTheTitle(String expectedTitle ) {
//        hotelsSearch.verifyPageTitle(expectedTitle);
//    }
    @When("I click on the checkIn box")
    public void i_click_on_the_check_in_box() {
        hotelsSearch.checkInBox();
    }

    @When("I click on the right angle bracket on the calendar to go next and I select a date")
    public void i_click_on_the_right_angle_bracket_on_the_calendar_to_go_next_and_i_select_a_date() {
        hotelsSearch.checkInDate();
    }

    @When("I select a checkOut date")
    public void i_select_a_check_out_date() {
        hotelsSearch.checkOutDate();
    }

    @When("I click update on the Guests box")
    public void i_click_update_on_the_guests_box() throws InterruptedException {
        hotelsSearch.guestsUpdateButton();
    }

    @Then("I verify the page title as {string}")
    public void i_verify_the_page_title_as(String expectedTitle) {
        hotelsSearch.verifyHotelSearchResults(expectedTitle);
    }


    @When("I click on the plus sign to add {int} Rooms")
    public void i_click_on_the_plus_sign_to_add_rooms(Integer rooms) throws InterruptedException {
        hotelsSearch.addRooms(rooms);
    }

    @When("I click on the plus sign to add {int} Adults")
    public void i_click_on_the_plus_sign_to_add_adults(Integer adults) throws InterruptedException {
        hotelsSearch.addAdults(adults);
    }

    @Then("I should see {string} in the guestsBox")
    public void i_should_see_in_the_guests_box(String expectedRoomsCount) {
        hotelsSearch.verifyNumberOfRooms(expectedRoomsCount);
    }

    @Then("I should also see {string} in the guestBox")
    public void i_should_also_see_in_the_guest_box(String expectedAdultsCount) {
        hotelsSearch.verifyNumberOfAdults(expectedAdultsCount);
    }

    @When("I click on the plus sign to add {int} Children")
    public void i_click_on_the_plus_sign_to_add_children(Integer childrens) throws InterruptedException {
        hotelsSearch.addChildren(childrens);
    }

    @When("I select {int} on the Age dropdown for the first child")
    public void i_select_on_the_age_dropdown_for_the_first_child(Integer age) {
        hotelsSearch.child1Age(age);
    }

    @When("I select {int} on the age dropdown for the second child")
    public void i_select_on_the_age_dropdown_for_the_second_child(Integer age) {
        hotelsSearch.child2Age(age);
    }

    @Then("I should see {string}")
    public void i_should_see(String expectedChildrenCount) {
        hotelsSearch.verifyNumberOfChildren(expectedChildrenCount);
    }

    @When("I filter the price by xdataOffset {int} and ydataOffset {int}")
    public void i_filter_the_price_by_xdata_offset_and_ydata_offset(Integer xOffset, Integer yOffset) throws InterruptedException {
        hotelsSearch.filterPriceUsingSlider(xOffset, yOffset);
    }

    @Then("I verify the price {string}")
    public void i_verify_the_price(String expectedPriceRange) {
        hotelsSearch.verifyFilteredPrice(expectedPriceRange);
    }

    @When("I select Price low to high from the sortBY option")
    public void i_select_price_low_to_high_from_the_sort_by_option() {
        hotelsSearch.sortByDropdown();
    }

    @Then("I should see {string} on the sortBy option")
    public void i_should_see_on_the_sort_by_option(String expectedSortByOption) {
        hotelsSearch.verifySortByOption(expectedSortByOption);
    }

//    @When("I click on the take survey button")
//    public void i_click_on_the_take_survey_button() {
//        hotelsSearch.takeSurveyButton();
//    }
//    @When("I select {string} from the language dropdown")
//    public void i_select_from_the_language_dropdown(String language) {
//        hotelsSearch.languageDropdownOption(language);
//    }
//    @When("I click on sounds good")
//    public void i_click_on_sounds_good() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("I click on the next button")
//    public void i_click_on_the_next_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should see the text {string}")
//    public void i_should_see_the_text(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


    @When("I select the three checkboxes under deals")
    public void i_select_the_three_checkboxes_under_deals() {
        hotelsSearch.dealsCheckBoxes();
    }

    @Then("I verify the first checkBox {string} as one of the filters")
    public void i_verify_the_first_check_box_as_one_of_the_filters(String expectedCheckBox) {
        hotelsSearch.verifyFirstCheckBox(expectedCheckBox);
    }

    @Then("I verify the second checkBox {string} as the second filter")
    public void i_verify_the_second_check_box_as_the_second_filter(String expectedCheckBox) {
        hotelsSearch.verifySecondCheckBox(expectedCheckBox);
    }

    @Then("I verify the third checkBox {string} as the third filter")
    public void i_verify_the_third_check_box_as_the_third_filter(String expectedCheckBox) {
        hotelsSearch.verifyThirdCheckBox(expectedCheckBox);
    }

    @When("I click on the viewMap button")
    public void i_click_on_the_view_map_button() throws InterruptedException {
        hotelsSearch.viewMapButton();
    }

    @Then("I should see {string} when the page opens")
    public void i_should_see_when_the_page_opens(String expectedText) {
        hotelsSearch.verifyViewMapPageText(expectedText);
    }

    @When("I click on the restaurants, things to do, and transit checkBox")
    public void i_click_on_the_restaurants_things_to_do_and_transit_check_box() throws InterruptedException {
        hotelsSearch.showNearBySelection();
    }

    @Then("I verify if restaurants was checked")
    public void i_verify_if_restaurants_was_checked() throws InterruptedException {
        hotelsSearch.verifyRestaurantCheckboxCheck();
    }

    @Then("I verify that things to do is checked")
    public void i_verify_that_things_to_do_is_checked() throws InterruptedException {
        hotelsSearch.verifyThingsToDoCheckboxCheck();
    }

    @Then("lastly I verify that transit is checked")
    public void lastly_i_verify_that_transit_is_checked() throws InterruptedException {
        hotelsSearch.verifyTransitCheckboxCheck();
    }

    @When("I click on the post button")
    public void i_click_on_the_post_button() throws InterruptedException {
        hotelsSearch.postButton();
    }

    @When("I click on write a review")
    public void i_click_on_write_a_review() {
        hotelsSearch.writeAReviewLink();
    }

    @Then("I should see {string} as the title")
    public void i_should_see_as_the_title(String expectedTitle) {
        hotelsSearch.verifyTheReviewPageTitle(expectedTitle);
    }

    @When("I click on the Sort button")
    public void i_click_on_the_sort_button() {
        hotelsSearch.sortButton();
    }

    @When("I click on the distance to city center")
    public void i_click_on_the_distance_to_city_center() {
        hotelsSearch.sortOptionInViewMap();
    }

    @When("I click on the done button")
    public void i_click_on_the_done_button() throws InterruptedException {
        hotelsSearch.doneButton();
    }

    @When("I click on the close button")
    public void i_click_on_the_close_button() throws InterruptedException {
        hotelsSearch.closeButton();
    }

    @When("I click on the city searchBox")
    public void i_click_on_the_city_search_box() {
        hotelsSearch.clickCitySearchBox();
    }

    @When("I enter {string} in the city searchBox")
    public void i_enter_in_the_city_search_box(String destination) {
        hotelsSearch.citySearchBox(destination);
    }

    @When("I click on Bangladesh Asia")
    public void i_click_on_bangladesh_asia() throws InterruptedException {
        hotelsSearch.bangladeshAsiaLocator();
    }

    @When("I click on the hotels searchBox")
    public void i_click_on_the_hotels_search_box() {
        hotelsSearch.clickHotelsSearchBox();
    }

    @When("I enter {string} in the hotels searchBox")
    public void i_enter_in_the_hotels_search_box(String hotel) throws InterruptedException {
        hotelsSearch.hotelsSearchBox(hotel);
    }

    @When("I click on the Hotel Cox's Hilton location")
    public void i_click_on_the_hotel_cox_s_hilton_location() {
        hotelsSearch.hotelCoxsHiltonLocation();
    }

    @Then("I should see the hotel title as {string}")
    public void i_should_see_the_hotel_title_as(String expectedName) {
        hotelsSearch.verifyHotelTitle(expectedName);
    }

    @When("I click on the alerts button")
    public void i_click_on_the_alerts_button() {
        hotelsSearch.alertsButton();
    }

    @Then("I verify the text {string}")
    public void i_verify_the_text(String expectedText) {
        hotelsSearch.verifySignInPage(expectedText);
    }

    @When("I click on the saved trips locator")
    public void i_click_on_the_saved_trips_locator() {
        hotelsSearch.savedTrips();
    }

    @Then("I should see the text {string}")
    public void i_should_see_the_text(String expectedText) {
        hotelsSearch.savedTripsPageText(expectedText);
    }


    @When("I click on the get started button")
    public void i_click_on_the_get_started_button() {
        hotelsSearch.getStartedButton();
    }

    @When("I click on the continue with email button on the signIn pop-up")
    public void i_click_on_the_continue_with_email_button_on_the_sign_in_pop_up() throws InterruptedException {
       hotelsSearch.continueWithEmailPopUP();
    }

}



