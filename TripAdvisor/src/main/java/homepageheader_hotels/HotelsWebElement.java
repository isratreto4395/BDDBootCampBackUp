package homepageheader_hotels;

public class HotelsWebElement {

    public static final String hotelsLinkLocator = "//a[@href='/Hotels']";
    public static final String whereToSearchBox = "//div[@data-test-attribute='typeahead-QuickLink_HOTELS_geopicker']//form//input[@aria-label='Search']";
    public static final String checkInBox = "//div[@data-test-target='picker-CHECKIN']";
    public static final String nextButton = "//button[@data-testid='nav_next']";
    public static final String checkOutBox = "//div[@data-test-target='picker-CHECKOUT']";
    public static final String checkInDate = "//div[@aria-label='Thu Jun 10 2021']";
    public static final String checkFromDate = "//div[@aria-label='Thu Jun 24 2021']";
    public static final String addRoomsButton = "//button[@data-test-target='ticker-plus-rooms']";
    public static final String addAdultsButton = "//button[@data-test-target='ticker-plus-adults']";
    public static final String addChildrenButton = "//button[@data-test-target='ticker-plus-children']";
    public static final String updateButton = "//button[normalize-space()='Update']";
    public static final String hotelsLocator = "//a[normalize-space()='Hotels']";
    public static final String hotelsMatchResults = "//div[@class='search-results-title']";
    public static final String searchBoxInputBox = "//input[@id='mainSearch']";
    public static final String searchButton = "SEARCH_BUTTON";
    public static final String queryResultText = "//span[@class='title-query']";
    public static final String clearField = "CLEAR_WHAT";
    public static final String currencyDropdownButton = "//button[@aria-label='Currency: A$ AUD']";
    public static final String verifyTheNumberOfRooms = "//span[normalize-space()='3 rooms']";
    public static final String verifyTheNumberOfAdults = "//span[normalize-space()='5 adults']";
    public static final String ageDropdownForChild1 = "//body//div//div[@data-test-target='trip-search-open']//div//div//div[1]//div[1]//button[1]";
    public static final String ageThree = "//body//div//button[4]";
    public static final String ageEight = "//body//div//button[9]";
    public static final String verifyTheNumberOfChildren = "//span[normalize-space()='2 children']";
    public static final String ageDropDownForChild2 = "//body//div//div[@data-test-target='trip-search-open']//div//div//div[2]//div[1]//button[1]";
    public static final String filterPriceLocator = "//body/div/div/div/div/div[@data-breakpoint='desktop']/div/div[@data-placement-name='wc_filter_list_container']/div[@data-component-props='page-manifest']/div[@data-test-target='hotels-filters']/div/div[@data-param='pRange']/div/div/div/div[2]/div[1]";
    public static final String filterPriceResult = "//body/div/div/div/div/div[@data-breakpoint='desktop']/div/div[@data-placement-name='wc_filter_list_container']/div[@data-component-props='page-manifest']/div[@data-test-target='hotels-filters']/div/div[@data-param='pRange']/div/div/div[1]/div[1]/div[1]";
    public static final String sortByDropdown = "//body/div/div/div/div/div/div[@data-placement-name='dh_sort_filter_entry_wc']/div[@data-component-props='page-manifest']/div/div[2]/span[1]/div[1]";
    public static final String sortByOption = "//div[contains(text(),'Price (low to high)')]";
    public static final String searchBox = "//input[@title='Search']";
    public static final String takeSurveyButton = "//a[contains(text(),'Take survey')]";
    public static final String surveyNextButton = "NextButton";
    public static final String languageDropdownLocator = "Q_lang";
    public static final String freeCancellationCheckBox = "//span[contains(text(),'Free cancellation')]";
    public static final String reserveNowCheckBox = "//div[@class='aHmccbzd']//span[text()='Reserve now, pay at stay']";
    public static final String propertiesWithSpecialOffersCheckBox = "//span[contains(text(),'Properties with special offers')]";
    public static final String firstCheckBoxFilterResult = "//div[@data-component='@ta/hotels.sort-filter-header']//div//div//div//div//div[contains(text(),'Free cancellation')]";
    public static final String secondCheckBoxFilterResult = "//div[@data-component='@ta/hotels.sort-filter-header']//div//div//div//div//div[contains(text(),'Reserve now, pay at stay')]";
    public static final String thirdCheckBoxFilterResult = "//div[@data-component='@ta/hotels.sort-filter-header']//div//div//div//div//div[contains(text(),'Properties with special offers')]";
    public static final String viewMapButton = "//span[normalize-space()='View map']";
    public static final String closeMapText = "//span[normalize-space()='Close Map']";
    public static final String restaurantsCheckbox = "//span[contains(text(),'Restaurants')]";
    public static final String thingsToDoCheckbox = "//span[contains(text(),'Things to do')]";
    public static final String transitCheckbox = "//span[contains(text(),'Transit')]";
    public static final String restaurantCheck = "//input[@id='restaurants']";
    public static final String thingsToDoCheck = "//input[@id='thingsToDo']";
    public static final String transitCheck = "//input[@id='transit']";
    public static final String sortByInViewMap = "//div[normalize-space()='Sort']";
    public static final String sortByOptionInViewMap = "//label[normalize-space()='Distance to city center']";
    public static final String doneButtonInViewMap = "//button[normalize-space()='Done']";
    public static final String filterDropdwonInViewMap = "//div[normalize-space()='Filter']";
    public static final String tripAdvsiorPlusCheckbox = "//label[@for='checkbox_168']//div//span//span[contains(text(),'Show only stays with member offers')]";
    public static final String postButton = "//button[@aria-label='Post']";
    public static final String writeAReviewLink = "//span[normalize-space()='Write a review']";
    public static final String reviewPageTitle = "//div[normalize-space()=\"Review a place you've visited\"]";
    public static final String covidFilterText = "//body/div/div/div/div/div/div/div/div/div/div/ul/li[3]/div[1]";
    public static final String covidCheckbox = "//label[@for='checkbox_72']//div[@class='aHmccbzd']//span[text()='Properties taking safety measures']";
    public static final String freeCancellationCheckbox = "//label[@for='checkbox_38']";
    public static final String freeCancellationText = "//body/div/div/div/div/div/div/div/div/div/div/ul/li[3]/div[text()='Free cancellation']";
    public static final String closeButton = "//span[normalize-space()='Close Map']";
    public static final String citySearchBox = "DualWhere";
    public static final String hotelsSearchBox = "DualWhat";
    public static final String hiltonHotelLocation = "//*[@id=\"taplc_war_unattach_dual_search_0\"]/div[1]/form/div[2]/div[2]/ul/li[1]";
    public static final String hotelCoxsHiltonTitle = "//h2[normalize-space()='Hotel Cox's Hilton']";
    public static final String bangladeshAsiaLocator = "//div[@data-placement-name='war_unattach_dual_search']//li[1]";
    public static final String alertsButton = "//span[normalize-space()='Alerts']";
    public static final String savedTripsLocator = "//a[@href='/Trips']";
    public static final String savedTripsWelcomeText = "//h1[contains(text(),'Traveling soon? Save your amazing ideas all in one')]";
    public static final String getStartedButton = "//button[normalize-space()='Get started']";
    public static final String continueWithEmailLogIn = "//body/div[@id='regBody']/div[@id='coreReg']/div[@id='coreWrapper']/div[@id='signupSigninWrapper']/div[@id='leftCol']/div[@id='ssoButtons']/button[1]";
    public static final String signInLocator = "//span[normalize-space()='Sign in']";
    public static final String continueWithEmailButton = "//*[text()='Continue with email']";
    public static final String emailAddressInputBox = "regSignUp.email";
    public static final String passwordInputBox = "regSignUp.password";
    public static final String alertsLocator = "//a[@href='/Inbox']";
    public static final String joinButton = "//button[normalize-space()='Join']";
    public static final String becomeAMemberButton = "//button[normalize-space()='Become a member']";
    public static final String becomeAMemberBoxTitle = "//div[contains(text(),'Become a member.')]";
    public static final String popularDestinationsLocator = "//*[@href='/Hotels-g32655-Los_Angeles_California-Hotels.html']";
    public static final String searchDestinationTitle = "//h1[normalize-space()='Los Angeles Hotels']";


}
