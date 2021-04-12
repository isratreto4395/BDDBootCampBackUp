Feature: Registering for an Account

  Background:
    Given I am on the Trip Advisor homepage
    And I click on the alerts button
    When I click on the continue with email button

  @Israt
  Scenario: Verify the registration page
    And I enter user information from the table
      | Email           | laciwe2019@684hh.com |
      | CreateAPassword | Abcde12345           |
    Then I click on the join button

