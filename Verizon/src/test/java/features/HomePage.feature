Feature: SearchBox Functionality check

  @smokeTest
  Scenario: Amazon searchBox functionality check with valid product
    Given I am on amazon homePage
    And I enter "Hand Sanitizer" in searchBox
    When I click on search Button
    Then I should see "Hand Sanitizer" is properly appear
    But I should not see "mobile" is appear
    And I verify "Amazon.com : Hand Sanitizer" in product title

  @pending @mahmud @RegressionTest
  Scenario: Amazon searchBox functionality check with valid product1
    Given I am on amazon homePage
    And I enter "Mask" in searchBox
    When I click on search Button
    Then I should see "Mask1" is properly appear
    But I should not see "mobile" is appear
    And I verify "Amazon.com : Mask" in product title

   @IntegrationTest
  Scenario: Amazon searchBox functionality check with valid product2
    Given I am on amazon homePage
    And I enter "MacBook" in searchBox
    When I click on search Button
    Then I should see "MacBook" is properly appear
    But I should not see "mobile" is appear
    And I verify "Amazon.com : MacBook" in product title

  @test
  Scenario Outline: Amazon searchBox functionality check with valid product3
    Given I am on amazon homePage
    And I enter "<productName>" in searchBox
    When I click on search Button
    Then I should see "<ExpectedProduct>" is properly appear
    But I should not see "<notExpected>" is appear
    And I verify "<verifyTitle>" in product title
    Examples:
      | productName    | ExpectedProduct | notExpected | verifyTitle                 |
      | Hand Sanitizer | Hand Sanitizer  | mobile      | Amazon.com : Hand Sanitizer |
      | Mask           | Mask            | mobile      | Amazon.com : Mask           |
      | MacBook        | MacBook         | mobile      | Amazon.com : MacBook        |















