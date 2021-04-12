Feature: Check the Resources For You page

  Background:
    Given I am on the Aetna providers Homepage
    And I close the Partnering with providers alert
    Then i click on the ResourcesForYou on the Providers page
@Israt
  Scenario: Navigate to the CDC website
    And I click on the CDC issues guidelines for vaccinated individuals link
    When I click on continue to site and close the old window
    Then I verify the title "CDC Issues First Set of Guidelines on How Fully Vaccinated People Can Visit Safely with Others | CDC Online Newsroom | CDC"
@Israt
  Scenario: Check the searchBox functionality on the Centers for Disease Control and Prevention(CDC) page
    And I click on the CDC issues guidelines for vaccinated individuals link
    And I click on continue to site and close the old window
    When I enter "Vaccine" in the search box and hit enter
    Then I should see "Vaccine" results are returned
    But I should not see "CDC Guideline" related results are returned
    And I verify "Search Results | CDC" as the page title
@Israt
  Scenario: Check the functionality of the AdvancedSearch link on the CDC page
    And I click on the CDC issues guidelines for vaccinated individuals link
    And I click on continue to site and close the old window
    And I click on the AdvancedSearch button
    And I enter "Vaccine" in the searchBox
    And I enter "Vaccine" in allTheseWords inputBox
    And I enter "Immunization" in thisExactWordOrPhase inputBox
    And I enter "Provider" in anyOfTheseWords inputBox
    And I enter "Vac" in noneOfTheseWords inputBox
    And I select "English" from the Language dropdown
    And I enter "3/21/2021" in the FromDate inputBox and I enter "3/24/2021" in the TODate inputBox
    When I hit search
    Then I should see "Vaccine" results are returned
@Israt
  Scenario: Verify the other languages option page on the CDC advancedSearch page
    And I click on the CDC issues guidelines for vaccinated individuals link
    And I click on continue to site and close the old window
    And I click on the AdvancedSearch button
    When I click on the other languages link at the top of the homepage
    Then I verify the other languages page title "CDC Resources in Languages Other than English"
@Israt
  Scenario: Store all the Filter by Languages options in the database
    And I click on the CDC issues guidelines for vaccinated individuals link
    And I click on continue to site and close the old window
    And I click on the AdvancedSearch button
    And I click on the other languages link at the top of the homepage
    When I click on the filterByLanguage dropdown
    And I connect to the database and store all the language options in the mySql database
#    And I read the data from the mySql database
#    Then I verify all the language options by using the mySql database
@Israt
  Scenario: verify the Filter by Language option in the other languages option page
    And I click on the CDC issues guidelines for vaccinated individuals link
    And I click on continue to site and close the old window
    And I click on the AdvancedSearch button
    When I click on the other languages link at the top of the homepage
    And I select Bengali from the filterByLanguage dropdown
    And I enter "Vaccine" in the languagePageSearchBox
    Then I verify the message "No results available for the selected criteria. Please adjust the filter options above."
@Israt
  Scenario: Navigate to the CVS Health Family site
    And I click on the Community strategy to address inequities link
    When I click on continue and close the old window
    Then I verify the page "CVS Health builds on community-based strategy to address COVID-19 vaccine education and equity | CVS Health"
@Israt
  Scenario: Navigate to the CVS Health expands access to vaccines link
    And I click on the CVS Health expands access to vaccines link
    When I click on continue and close the old window
    Then I verify the page "CVS Health now offering COVID-19 vaccines in 29 states | CVS Health"







