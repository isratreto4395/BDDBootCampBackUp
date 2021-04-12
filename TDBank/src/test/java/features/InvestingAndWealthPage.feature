Feature: Check the Investing And Wealth Page

  Background:
    Given I am on the TD Bank homePage
    When I close the Ads Choices & Personalization popUp
    Then I click on the Investing And Wealth Tab

@Israt
  Scenario Outline: TD Bank Type your question searchBox functionality check in the Investing & Wealth with valid questions
    And I enter "<question>" in the searchBox
    When I click on the askNow Button
    Then I should see "<expectedQuestion>" properly appear below the searchBox
    But I should not see "<notExpectedQuestion>" appear below the searchBox
    Examples:
      | question                                        | expectedQuestion                                | notExpectedQuestion                |
      | What is SWIFT?                                  | What is SWIFT?                                  | What is a account?                 |
      | What is the TD Connect Card?                    | What is the TD Connect Card?                    | How do I close my account?         |
      | What's the purpose of adding account nicknames? | What's the purpose of adding account nicknames? | When should I use a wire transfer? |

  @Israt
  Scenario: Verify the Preserve Your wealth Page
    And I hover over the Financial Goals link and I select Preserve Your Wealth option
    Then I should see the page title as "How To Preserve & Grow Your Wealth For Generations | TD Wealth"

  @Israt
  Scenario: Verify Our Process on the Investment Management Page
    And I hover over the Financial Goals link and I select Preserve Your Wealth option
    And I click on the Investment Management Find out more link
    When I click on Our Process
    Then I should see "Our investment management process" title

  @Israt
  Scenario: Verify the Corporate Trust Tab
    And I hover over the Solutions link and I select the Corporate & Not-for-Profit
    When I click on the Corporate rate Trust
    Then I verify the title as "Corporate trust"

  @Israt
  Scenario Outline: Check the functionality of the Find a Store or An Atm Near You SearchBox
    And I click on the Individuals and Families icon
    And I click the Find a TD Bank Button
    When I enter "<state>" in the searchBox and hit enter
    Then I verify "<expectedState>" properly appeared below the searchBox
    Examples:
      | state          | expectedState |
      | New Jersey,USA | NJ            |
      | New York,USA   | New York, NY  |
      | Delware,USA    | DE            |

  @Israt
  Scenario: Navigate to Payment Solutions tab in the Private Banking page
    And I click on the Business Owners icon
    And I click on the Private Banking Link
    When I click on the Payment Solutions Tab
    Then I should see "Payment solutions" as the title

  @Israt
  Scenario: Verify the functionality of the Watch video button on the Legacy and Philanthropic planning page
    And I click on the Retirement and Wealth Planning icon
    And I click on the Legacy and Philanthropic Planning link
    When I click on the Watch video button of TD wealth Planning
    And I clicked on transcript
    Then I verify "A recent report by Bloomberg shows 76% of Americans are afraid of running out of money in retirement." is the first sentence of the transcript on the video

  @Israt
  Scenario: Navigate to the TD Ameritrade page
    And I click on the TD Ameritrade icon
    Then I click on the TD Ameritrade education Start Learning button
    When I click on the Continue to site button on the pop-up
    Then I should see the TD Ameritrade Page open in a new window and close the old window
    Then I should see "Why TD Ameritrade?" as a header on the page

  @Israt
  Scenario: Verify the functionality of the Zip Code search window in Planning for Retirement page
    And I click on the Insights link
    And I click on the Retirement101 link which takes me to a new window and I close the old window
    And I click on the Zip Code? box located on the left bar
    When I click on the openInNewWindow button
    Then A new window opens and I enter the zipcode
    Then I click submit
    Then I should see "Your response has been recorded."

  @Israt
  Scenario: Navigate to the Busines Succession Planning page
    And I scrolled down to click the exploreYourOption button
    When I scrolled down to click the Success Planning learnMore button
    Then I verify the "Business Succession Planning" title

  @Israt
  Scenario: Verify Download additional resources
    When I click on the Reg BI Disclosure Brochure(PDF)
    Then I verify "Wealth & Investment Management And Financial Planning | TD Wealth" title





