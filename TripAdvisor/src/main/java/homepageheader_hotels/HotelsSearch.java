package homepageheader_hotels;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepageheader_hotels.HotelsWebElement.*;

public class HotelsSearch extends WebAPI {
    @FindBy(how = How.XPATH, using = addRoomsButton)
    public WebElement addRooms;
    @FindBy(how = How.XPATH, using = addAdultsButton)
    public WebElement addAdults;
    @FindBy(how = How.XPATH, using = addChildrenButton)
    public WebElement addChildrens;
    @FindBy(how = How.XPATH, using = languageDropdownLocator)
    public WebElement languageDropdown;
    @FindBy(how = How.XPATH, using = restaurantsCheckbox)
    public WebElement restaurants;
    @FindBy(how = How.XPATH, using = thingsToDoCheckbox)
    public WebElement thingsToDo;
    @FindBy(how = How.XPATH, using = transitCheckbox)
    public WebElement transit;


    public void whereToSearchBox() {
        clickByXpath(whereToSearchBox);
    }

    public void selectPopularDestination() {
        clickByXpath(popularDestinationsLocator);
    }

    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = getTextByXpath(searchDestinationTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }


    public void checkInBox() {
        clickByXpath(checkInBox);
    }

    public void checkInDate() {
        clickByXpath(nextButton);
        clickByXpath(checkInDate);
    }

    public void checkOutDate() {
        clickByXpath(checkOutBox);
        clickByXpath(checkFromDate);
    }

    public void guestsUpdateButton() throws InterruptedException {
        sleepFor(3);
        clickByXpath(updateButton);
        sleepFor(3);
    }

    public void verifyHotelSearchResults(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    public void addRooms(Integer rooms) throws InterruptedException {
        sleepFor(3);
        for (int i = 1; i < rooms; i++) {
            addRooms.click();
        }
        sleepFor(3);
    }

    public void addAdults(Integer adults) throws InterruptedException {
        sleepFor(3);
        for (int i = 3; i < adults; i++) {
            addAdults.click();
        }
        sleepFor(3);
    }

    public void verifyNumberOfRooms(String expectedRoomsCount) {
        String actualRoomsCount = getTextByXpath(verifyTheNumberOfRooms);
        Assert.assertEquals(actualRoomsCount, expectedRoomsCount, "Incorrect amount of rooms");
    }

    public void verifyNumberOfAdults(String expectedAdultsCount) {
        String actualAdultsCount = getTextByXpath(verifyTheNumberOfAdults);
        Assert.assertEquals(actualAdultsCount, expectedAdultsCount, "Incorrect amount of adults");
    }

    public void addChildren(Integer children) throws InterruptedException {
        sleepFor(3);
        for (int i = 1; i < children; i++) {
            addChildrens.click();
        }
        sleepFor(3);
    }

    public void child1Age(Integer age) {
        clickByXpath(ageDropdownForChild1);
        clickByXpath(ageThree);
    }

    public void child2Age(Integer age) {
        clickByXpath(ageDropDownForChild2);
        clickByXpath(ageEight);
    }

    public void verifyNumberOfChildren(String expectedChildrensCount) {
        String actualChildrensCount = getTextByXpath(verifyTheNumberOfChildren);
        Assert.assertEquals(actualChildrensCount, expectedChildrensCount, "Incorrect amount of Childrens");
    }

    public void filterPriceUsingSlider(Integer xOffset, Integer yOffset) throws InterruptedException {
        windowHalfPageScroll();
        slideByXpath(filterPriceLocator, xOffset, yOffset);
        sleepFor(5);
    }

    public void verifyFilteredPrice(String expectedPriceRange) {
        String actualPriceRange = getTextByXpath(filterPriceResult);
        Assert.assertEquals(actualPriceRange, expectedPriceRange, "Incorrect price range");
    }

    public void sortByDropdown() {
        clickByXpath(sortByDropdown);
        clickByXpath(sortByOption);
    }

    public void verifySortByOption(String expectedsortByOption) {
        String actualsortByOption = getTextByXpath(sortByOption);
        Assert.assertEquals(actualsortByOption, expectedsortByOption, "Incorrect option is displayed");
    }

    public void takeSurveyButton() {
        clickByXpath(takeSurveyButton);
    }

    public void languageDropdownOption(String language) {
        selectOptionByVisibleText(languageDropdown, language);
    }


    public void dealsCheckBoxes() {
        clickByXpath(freeCancellationCheckBox);
        clickByXpath(reserveNowCheckBox);
        clickByXpath(propertiesWithSpecialOffersCheckBox);
    }

    public void verifyFirstCheckBox(String expectedCheckBox) {
        String actualCheckBox = getTextByXpath(firstCheckBoxFilterResult);
        Assert.assertEquals(actualCheckBox, expectedCheckBox, "Text does not match");
    }

    public void verifySecondCheckBox(String expectedCheckBox) {
        String actualCheckBox = getTextByXpath(secondCheckBoxFilterResult);
        Assert.assertEquals(actualCheckBox, expectedCheckBox, "Text does not match");
    }

    public void verifyThirdCheckBox(String expectedCheckBox) {
        String actualCheckBox = getTextByXpath(thirdCheckBoxFilterResult);
        Assert.assertEquals(actualCheckBox, expectedCheckBox, "Text does not match");
    }

    public void viewMapButton() throws InterruptedException {
        clickByXpath(viewMapButton);
        sleepFor(3);
    }

    public void verifyViewMapPageText(String expectedText) {
        String actualText = getTextByXpath(closeMapText);
        Assert.assertEquals(actualText, expectedText, "Text is not a match");
    }

    public void showNearBySelection() throws InterruptedException {
        for (int i = 0; i < 1; i++) {
            restaurants.click();
            thingsToDo.click();
            transit.click();
        }
        sleepFor(5);
    }

    public void verifyRestaurantCheckboxCheck() throws InterruptedException {
        boolean actualRestaurantCheckBox = verifyIfACheckboxIsCheckedOrNotByXpath(restaurantCheck);
        Assert.assertTrue(actualRestaurantCheckBox);
    }

    public void verifyThingsToDoCheckboxCheck() throws InterruptedException {
        boolean actualThingsToDoCheckBox = verifyIfACheckboxIsCheckedOrNotByXpath(thingsToDoCheck);
        Assert.assertTrue(actualThingsToDoCheckBox);
    }

    public void verifyTransitCheckboxCheck() throws InterruptedException {
        boolean actualTransitCheckBox = verifyIfACheckboxIsCheckedOrNotByXpath(transitCheck);
        Assert.assertTrue(actualTransitCheckBox);
    }

    public void postButton() throws InterruptedException {
        sleepFor(3);
        clickByXpath(postButton);
    }

    public void writeAReviewLink() {
        clickByXpath(writeAReviewLink);
    }

    public void verifyTheReviewPageTitle(String expectedTitle) {
        String actualTitle = getTextByXpath(reviewPageTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void sortButton() {
        clickByXpath(sortByInViewMap);
    }

    public void sortOptionInViewMap() {
        clickByXpath(sortByOptionInViewMap);
    }

    public void doneButton() throws InterruptedException {
        clickByXpath(doneButtonInViewMap);
        sleepFor(3);
    }

    public void closeButton() throws InterruptedException {
        clickByXpath(closeButton);
        sleepFor(3);
    }

    public void clickCitySearchBox() {
        clickById(citySearchBox);
    }

    public void citySearchBox(String destination) {
        typeById(citySearchBox, destination);
    }

    public void bangladeshAsiaLocator() throws InterruptedException {
        sleepFor(3);
        clickByXpath(bangladeshAsiaLocator);
    }

    public void clickHotelsSearchBox() {
        clickById(hotelsSearchBox);
    }

    public void hotelsSearchBox(String hotel) throws InterruptedException {
        sleepFor(3);
        typeById(hotelsSearchBox, hotel);

        sleepFor(4);
    }

    public void hotelCoxsHiltonLocation() {
        clickByXpath(hiltonHotelLocation);
    }

    public void verifyHotelTitle(String expectedName) {
        //String actualName = getTextByXpath(hotelCoxsHiltonTitle);
        String actualName = driver.getTitle();
        Assert.assertEquals(actualName, expectedName, "Name is not a match");

    }

    public void alertsButton() {
        clickByXpath(alertsButton);
    }

    public void verifySignInPage(String expectedText) {
        String actualText = getTextByXpath(becomeAMemberBoxTitle);
        Assert.assertEquals(actualText, expectedText, "Text is not a match");
    }

    public void savedTrips() {
        clickByXpath(savedTripsLocator);
    }

    public void savedTripsPageText(String expectedText) {
        String actualText = getTextByXpath(savedTripsWelcomeText);
        Assert.assertEquals(actualText, expectedText, "Text is not a match");
    }

    public void getStartedButton(){
        clickByXpath(getStartedButton);
    }
    public void continueWithEmailPopUP() throws InterruptedException {
        sleepFor(4);
        clickByXpath(continueWithEmailButton);
    }



}
