Feature: Check the items on the hotels search page

  Background:
    Given I am on the Trip Advisor homepage
    And I click on Hotels
    And I click on the whereTo searchBox
    When I select Los Angeles from the popular destinations suggestion

  @Israt
  Scenario: Verify the page title on the hotels searched page
    Then I verify the title "Los Angeles Hotels"

  @Israt
  Scenario: Navigate to view map
    When I click on the viewMap button
    Then I should see "Close Map" when the page opens

  @Israt
  Scenario: Filter the map by Restaurants, Things to do, and Transit
    And  I click on the viewMap button
    When I click on the restaurants, things to do, and transit checkBox
    Then I verify if restaurants was checked
    And I verify that things to do is checked
    And lastly I verify that transit is checked

  @Israt

  Scenario: Sort functionality in View Map and close the map
    And  I click on the viewMap button
    And I click on the Sort button
    And I click on the distance to city center
    And I click on the done button
    When I click on the close button
    Then I verify the page title as "THE 10 BEST Hotels in Los Angeles, CA for 2021 (from $52) - Tripadvisor"

  @Israt

#  Scenario: Check the take survey button
#    And I click on the checkIn box
#    And I click on the right angle bracket on the calendar to go next and I select a date
#    And I select a checkOut date
#    When I click update on the Guests box
#    And I click on the take survey button
#    And I select "English - Canada" from the language dropdown
#    And I click on sounds good
#    When I click on the next button
#    Then I should see the text "What is the main reason you came to Tripadvisor today?"
  @Israt

  Scenario: Filter by deals
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    When I click update on the Guests box
    When I select the three checkboxes under deals
    Then I verify the first checkBox "Free cancellation" as one of the filters
    And I verify the second checkBox "Reserve now, pay at stay" as the second filter
    And I verify the third checkBox "Properties with special offers" as the third filter

  @Israt

  Scenario: Check the functionality of CheckIn and CheckOut of the hotel
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    When I click update on the Guests box
    Then I verify the page title as "THE 10 BEST Hotels in Los Angeles, CA for 2021 (from $52) - Tripadvisor"

  @Israt

  Scenario: Check the functionality of the sort by option
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click update on the Guests box
    When I select Price low to high from the sortBY option
    Then I should see "Price (low to high)" on the sortBy option

  @Israt

  Scenario: Filter the price from 0 to 300
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click update on the Guests box
    When I filter the price by xdataOffset 40 and ydataOffset 0
    Then I verify the price "$195 - $294 +"

  @Israt

  Scenario: Update the Guests section to 3 Rooms and 5 adults
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click on the plus sign to add 3 Rooms
    And I click on the plus sign to add 5 Adults
    When I click update on the Guests box
    Then I should see "3 rooms" in the guestsBox
    And I should also see "5 adults" in the guestBox

  @Israt

  Scenario: Update the Children count on the guest section to 2
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click on the plus sign to add 3 Rooms
    And I click on the plus sign to add 5 Adults
    And I click on the plus sign to add 3 Children
    And I select 3 on the Age dropdown for the first child
    And I select 8 on the age dropdown for the second child
    When I click update on the Guests box
    Then I should see "2 children"

  @Israt

  Scenario: Navigate to the Post button
    And I click on the post button
    When I click on write a review
    Then I should see "Review a place you've visited" as the title

  @Israt

  Scenario: Check the functionality of the City or destination and hotels searchBoxInputBox
    And I click on the post button
    When I click on write a review
    And I click on the city searchBox
    And I enter "Bangladesh, Asia" in the city searchBox
    And I click on Bangladesh Asia
    And I click on the hotels searchBox
    And I enter "Hilton" in the hotels searchBox
    When I click on the Hotel Cox's Hilton location
#  Then I should see the hotel title as "Hotel Cox's Hilton"
    Then I should see the hotel title as "Write a review - Tripadvisor"

  @Israt

  Scenario: Check the alert's button
    And I click on the alerts button
    When I click on the continue with email button
    Then I verify the text "Become a member."

  @Israt

  Scenario: Verify the saved trips page title
    When I click on the saved trips locator
    Then I should see the text "Traveling soon? Save your amazing ideas all in one place with Trips."

  @Israt

  Scenario: Become a member
    And I click on the saved trips locator
    And I click on the get started button
    And I click on the continue with email button on the signIn pop-up
    And I enter user information from the table
      | Email           | laciwe2019@684hh.com |
      | CreateAPassword | Abcde12345           |
    Then I click on the join button

















