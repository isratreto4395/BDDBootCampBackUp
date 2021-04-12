Feature: Verify the Providers page

  Background:
    Given I am on the Aetna providers Homepage

  @Israt
  Scenario: Navigate to the View provider update video
    And I click on the viewProviderUpdateVideo on the Partnering with providers pop-up
    When I click on the continue button
    Then I verify "COVID-19 Vaccines: Provider Update - YouTube" as the title of the video on YouTube

  @Israt
  Scenario: close the alert on the Providers homepage
    When I close the Partnering with providers alert
    Then I verify the Providers page title as "Aetna for Health Care Providers | Resources & Support for Health Care Professionals"

  @Israt
  Scenario Outline: Check the functionality of Search by CPT code searchBox with one valid code
    And I click on the precertificationButton
    And I enter "<CPT code>" in the code searchBox field and hit enter
    When I click on iAccept
    And I verify the page title as "Precertification Lists Results – Health Care Professionals | Aetna"

    Examples:
      | CPT code |
      | 33275    |
      | 01999    |
      | 70010    |

  @Israt
  Scenario Outline: Check the functionality of Search by CPT code searchBox with five valid code
    And I click on the precertificationButton
    And I enter "<CPT code1>" in the code searchBox field1
    And I enter "<CPT code2>" in the code searchBox field2
    And I enter "<CPT code3>" in the code searchBox field3
    And I enter "<CPT code4>" in the code searchBox field4
    And I enter "<CPT code5>" in the code searchBox field5 and hit enter
    When I click on iAccept
    And I verify the page title as "Precertification Lists Results – Health Care Professionals | Aetna"

    Examples:
      | CPT code1 |CPT code2|CPT code3|CPT code4|CPT code5|
      | 33275    | 70010    |90281    |99500    |99607    |
      | 01999    |99199     |80047    |01000    |10021    |

  @Israt
  Scenario: Check the Manuals, webinars and more link
    When I click on explore health care resources
    Then I should see "Provider Education & Manuals"

  @Israt
  Scenario: Check the Newsletters link
    When I click on read provider newsletters
    Then I verify page "OfficeLink Updates Newsletter Archive | Aetna"

  @Israt
  Scenario: Check the State regulations link
    When I click on find regulations by state link
    Then The title is "Insurance regulations by state"

  @Israt
  Scenario: Check the Disputes and appeals link
    When I click on learn about disputes and appeals
    Then I verify the text "Disputes & Appeals"

  @Israt
  Scenario: Navigate to the payment and claims helpful links
    And I right click the payment solutions link to open in a new window
    When I click on the explore claims options
    Then I verify the title as "Electronic claims | Aetna"

  @Israt
  Scenario: Navigate to the Availity claims management and authorizations site
    And I right click the payment solutions link to open in a new window
    When I click on the explore claims options
    And I click on the submit claims through the availity site
    And I click on contiue to availity site and close the old window
    When I click on the no button on the availity site pop-up
    Then I verify the page as "Availity Revenue Cycle Management, Clearinghouse, Provider Portal"


