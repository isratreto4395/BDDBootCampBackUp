Feature: Check the Input functionality of the One-way section in Book
  Background:
    Given I am on the United homepage

  Scenario: Select dates from the calendar and Navigate to the flights results page
    And I click on the OneWay button
    And I enter "Miami MIA" in the fromField
    And I enter "Detroit, MI, US (DTW)" in the toField
    And I click on the departDate field
    And using the arrow I go to the next month and select the depart date
    When I click on the Find Flights button
    Then I should see "Book a flight"
