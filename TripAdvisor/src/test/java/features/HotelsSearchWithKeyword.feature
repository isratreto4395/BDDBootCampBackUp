Feature: Check the Hotels searchPage in Trip Advisor

  Background:
    Given I am on the Trip Advisor homepage
    And I click on Hotels
    When I enter "California" in the whereTo searchBox and hit enter
    And I click on the hotels button

  @Israt
  Scenario: Verify the searchBox keyword on the hotels search page
    Then I verify the title as "Search results: California - Tripadvisor"

  @Israt
  Scenario Outline:  Check the searchBox functionality box in the hotels page with valid searchTopics
    And I click on the searchBox and clear it
    And I enter "<stateInitials>" in the searchBox
    When I click on the searchButton
    Then I should see "<expectedStateInitials>" properly appeared
    Examples:
      | stateInitials | expectedStateInitials |
      | Ca            | Ca                    |
      | NJ            | NJ                    |
      | NY            | NY                    |





