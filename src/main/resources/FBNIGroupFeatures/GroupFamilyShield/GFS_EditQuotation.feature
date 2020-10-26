#@CurrentTest
Feature: Edit Quotation

  Scenario Outline: Edit Created Quotation
    Given User is on http://172.28.162.17:6001/LMSGroup/
    When User inputs valid username BOGUNMEFUN and password Teamtezza123#
    Then user Click on The Quotation Module
    And User click on the Quotation Processing Sublink
    When System displays Select A Quotation Transaction Screen
    Then User provides quotation details as specified below:
      | Product Name       | <productList> |
      | Operation Type     | Edit Quotation|
      | Quotation Number   |9305000019	|
      | Quotation Revisions|	|
      |	Access Group       | DEFAULT GROUP |
    Then User Clicks on the Next button
    Then User clicks on Process
    When system displays quotation details showing current tickets 
    Then User clicks Process on the Ticket processing page
    Then User updates Quotation details as specified below
    |Commission Rate|16|
    Then User Clicks Save button on quotation details page
    Then User clicks Quotation Authorization Tab
    And User clicks Authorisation Tab
		And user clicks Authorise Quotation


    Examples: 
      | productList |
      |GROUP FAMILY SHIELD PLAN|
   