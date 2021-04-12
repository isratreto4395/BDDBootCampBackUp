Feature: Check the Input functionality of the Roundtrip section in Book

  Background:
    Given I am on the United homepage

  Scenario: Input dates in the date field and Navigate to the Flights Results page
    And I enter "Philadelphia PHL" in the fromField
    And I enter "Miami MIA" in the toField
    And I enter "May 21" in the departDate
    When I enter "June 12" in the returnDate and hit enter
    Then I should see "United Airlines Reservations - Book a Flight on More Than 80 Airlines" properly appear

    Scenario: Select dates from the calendar and Navigate to the flights results page
      And I enter "Philadelphia PHL" in the fromField
      And I enter "Detroit, MI, US (DTW)" in the toField
      And I click on the departDate field
      And using the arrow I go to the next month and select the depart date
      And I click on the returnDate field
      And using the arrow I go to the next month and select the return date
      When I click on the Find Flights button
      Then I verify the page title as "We can't process this request. Please restart your search."


    Scenario: Navigate to the Flights Results Page after adding multiple adult travellers from the homepage
      And I enter "Philadelphia PHL" in the fromField
      And I enter "Detroit, MI, US (DTW)" in the toField
      And I click on the departDate field
      And using the arrow I go to the next month and select the depart date
      And I click on the returnDate field
      And using the arrow I go to the next month and select the return date
      And I click on the travellersButton
      And I click on the add More Adults Button five times
      And I click on the Find Flights button
      When I click on the submit button
      Then I verify the error message "Please correct the following 1 error(s):"






