Feature: Check the commercial page

  Background:
    Given I am on the TD Bank homePage
    When I close the Ads Choices & Personalization popUp
    Then I click on the Commercial tab

  @Israt
  Scenario Outline: TD Bank Type your question searchBox functionality check in the Commercial page with valid questions
    And I enter "<question>" in the searchBox
    When I click on the askNow Button
    Then I should see "<expectedQuestion>" properly appear below the searchBox
    But I should not see "<notExpectedQuestion>" appear below the searchBox
    Examples:
      | question                           | expectedQuestion                   | notExpectedQuestion                |
      | What is a voiceprint?              | What is a voiceprint?              | What is a account?                 |
      | When should I use a wire transfer? | When should I use a wire transfer? | How do I close my account?         |
      | How do I cancel my TD debit card?  | How do I cancel my TD debit card?  | When should I use a wire transfer? |

  @Israt
  Scenario: Verify the Commercial Lending page
    And I hover over the Lending button and I select Commercial Lending option
    Then I verify "TD Bank Commercial & Corporate Loans, Lending & Financing" in the product title

  @Israt
  Scenario: Verify the functionality of the Request a call button
    And I hover over the Lending button and I select Commercial Lending option
    And I scrolled down to click on the Request a call button
    And I enter all the personal information to schedule an appointment
      | FirstName    | Akash                |
      | LastName     | Batash               |
      | BusinessName | PNT                  |
      | Phone        | 579-522-6742         |
      | Email        | akashb@iamfrombd.com |
    When I clicked on the Are you a TD customer radioButton
    Then I verify the "Schedule an Appointment" header on the page

  @Israt
  Scenario: Verify the functionality of the Learn More Button
    And I hover over the Lending button and I select Commercial Lending option
    When I click on the Learn More button
    Then I verify that it scrolls down to "Flexible lending options, personal service" on the page

  @Israt
  Scenario: Verify the TD Investor Relations Page
    And I hover over the Lending button and I select Commercial Lending option
    When I scrolled down to click TD Global Trade Finance Get details button
    Then I clicked on the Visit TD Investor Relations link
    Then I verify the "Investor Relations" title on the page

  @Israt
  Scenario: Sign up for Alerts in Investor Relations news
    And I hover over the Lending button and I select Commercial Lending option
    When I scrolled down to click TD Global Trade Finance Get details button
    Then I clicked on the Visit TD Investor Relations link
    Then I clicked on sign up for alerts
    And I entered all the personal information fields for Get News Alerts By Email
      | firstName | lastName | email             | company | phone        |
      | Angel     | Haire    | test123@gmail.com | PNT     | 789-098-9000 |
    And I used the Sector dropdown to select "Media"
    Then I verify "Get News Alerts by Email" title on the page

  @Israt
  Scenario: Navigate to the Award Winning page in Investor Relations
    And I hover over the Lending button and I select Commercial Lending option
    When I scrolled down to click TD Global Trade Finance Get details button
    Then I clicked on the Visit TD Investor Relations link
    When I scrolled down to click the Award Winning button
    Then I verify the "Presentations and Events" section title of the page

  @Israt
  Scenario: Play the TD eTreasury Link
    And I hover over the Treasury Services and I select the Payables option
    When I click on the TD Information Services Get details Button
    And I click on the TD eTreasury link to play the video
    When I click on transcript
    Then I verify the "Welcome to TD eTreasury." transcript on the video page

  @Israt
  Scenario: Verify the TD Education Financing page
    When I hover over the Industries and I select the Education option
    Then I verify "TD Bank Education Services | Financing For Public & Private Schools" in the page title

  @Israt
  Scenario: Navigate to the Asset Based Learning Icon
    And I scrolled down to click on the Asset Based lending icon
    When I click on the Learn More button
    Then I verify that it scrolls down to "Demonstrated industry expertise" title on the page

  @Israt
  Scenario: Navigate From Commercial Mortgage page window to TD Commercial & Corporate Lending page window
    And I scrolled down to click on the Loans And Lines of Credit icon
    When I scroll down to click on Commercial mortgages to open a new window
    Then I navigate back to the TD Commercial & Corporate Lending page window
    Then I verify "TD Bank Commercial & Corporate Loans, Lending & Financing" in the product title

  @Israt
  Scenario: Navigate to the Fraud Items You might knot know page
    When I scrolled down to click on the Fraud Control icon
    Then I click on the Fraud Items You Might Not Know link
    Then I verify "Cyber fraud terms you should know" on the page title

  @Israt
  Scenario: Navigate to the Equipment Finance page
    When I scrolled down to click on the Equipment Finance page
    Then I verify that "TD Equipment Financing & Loans For Buying Or Leasing New Equipment" Finance is the page title

  @Israt
  Scenario: Navigate to TD Thought Leadership
    And I scrolled down to click on Explore TD's banking offerings by industry
    When I clicked on Growing Business, Growing Risk link
    Then I should see "Growing Business, Growing Risk: Fraud Events Rising" as the page title























