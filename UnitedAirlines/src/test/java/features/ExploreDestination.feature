Feature: Explore destinations using the interactive map

  Background:
    Given I am on the United homepage

  Scenario: RoundTrip search by map with maxPrice
    And I click on the From button
    And I enter "Miami MIA" in the from depart field
    And I click on the Max price input box
    And I enter "200" in the max price input box
    When I click on the search button
    Then I should see "List of search results" is displayed

  Scenario: RoundTrip search with specific date
    And I click on the From button
    And I enter "Philadelphia PHL" in the from depart field
    And I click on the searchType button and select specific date
    And I enter "May 12" in the filtered departDate
    When I enter "June 11" in the filtered returnDate and hit enter
    Then I should see "List of search results" is displayed

    Scenario: Filter by interest
      And I click on the From button
      And I enter "Philadelphia PHL" in the from depart field
      And I click on the filter by interest button
      And I select all of the filter options
      When I click on apply filter
      Then I verify the text "Filter by interest (4)"



