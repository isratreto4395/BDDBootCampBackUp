Feature: Check the  FAQs page

  Background:
    Given I am on the Aetna providers Homepage
    And I close the Partnering with providers alert
    Then i click on the COVID FAQs on the Providers page

  @Israt
  Scenario: Verifying the VaccineFAQs Information page
    Then I click on the VaccineFAQs button
    When I click on Which COVID vaccinations will Aetna cover? tab
    Then I verify the first sentence "Aetna will cover any COVID-19 vaccine that has received FDA authorization, at no added cost to members."

  @Israt
  Scenario:  Verify the functionality of the Availity signIn page with invalid user Information
    Then I click on the VaccineFAQs button
    And I click on the Availity link on the Vaccine Updates pop-up
    Then I click the continue button to open the Availity page on another window and I close the old window
    When I enter invalid UserID and Password
      | UserID   | yinyan123 |
      | Password | abc1234   |
    Then I click on the showPassword checkbox
    Then I click on the LogIn button
    Then I verify the error message "Problem accessing /availity/web/public.elegant.login/public.elegant.login. Reason:"

  @Israt
  Scenario: Verify the Forgot Password Functionality of the CAQH solution signIn page with invalid UserName
    Then I click on the VaccineFAQs button
    And I click on the CAQH link on the Vaccine Updates pop-up
    Then I click the continue button to open the CAQH page on another window and I close the old window
    And I enter invalid UserName
      | UserName | yinyan123 |
    When I click on Forgot Password
    Then I enter invalid UserName
      | UserName | yinyan123 |
    And I click on the TermsOfService checkbox
    When I hit continue
    Then I verify the page title "CAQH ProView - Self Service Forgot Password"

  @Israt
  Scenario: Verify the BillingAndCodingFAQs Information page
    Then I click on the BillingAndCodingFAQs button
    When I click on Where can providers access the telemedicine policy and related codes? tab
    Then I verify the answer "Aetna’s telemedicine policy is available to providers on the Availity provider portal."

  @Israt
  Scenario: Verify the ViewUpToDateVaccineDataFromTheCDC Information page
    Then I click on the TelemedicineFAQs button
    When I click on How can members access services without going to a provider's office? tab
    Then I click on the Coronavirus resource page
    Then I click on ViewUpToDateVaccineDataFromTheCDC link
    Then I click the continue button to open the CDC site page on another window and I close the old window
    Then I should see "CDC COVID Data Tracker" as the page title

  @Israt
  Scenario: Verify the WisconsinVaccineInformaton page
    And I click on the PatientCOverageFAQs button
    And I click on the covidStateResources button
    And I click on the StateInputBox dropdown to select "Wisconsin"
    When I click on the WisconsinVaccineInformaton link
    And I click the continue button to open the WisconsinVaccineInformation page on another window and I close the old window
    Then I should see "COVID-19: Vaccine" as the title

  @Israt
  Scenario: Verify the CARES Act information for providers PDF page
    And I click on the ManagementResourcesFAQs button
    And I click on the CARES Act information for providers tab
    When I click on the CARESActInformationForProvidersPDF
    Then I verify "COVID-19 Policy Updates & Liberalizations for Aetna Providers" as the title


