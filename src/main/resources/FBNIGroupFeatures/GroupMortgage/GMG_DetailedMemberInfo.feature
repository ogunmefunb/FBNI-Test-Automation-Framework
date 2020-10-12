#@CurrentTest
Feature: Detailed Member Info

Scenario Outline: Detailed Member Information
  Given User is on http://172.28.162.17:6001/LMSGroup/
    When User inputs valid username BOGUNMEFUN and password Teamtezza123#
    Then user Click on The Quotation Module
    And User click on the Quotation Processing Sublink
    When System displays Select A Quotation Transaction Screen
    Then User provides quotation details as specified below:
      | Product Name       | <productList>           |
      | Operation Type     | New Quotation           |
      | Effective Date     | 14-Aug-2020             |
      | Client             |A.E. MUONEKE & SONS LIMITED|
      | UmbrellaCover Flag | Yes                     |
      | Access Group       | DEFAULT GROUP           |
    Then User Clicks on the Next button
    When system opens quotation basic details form
    Then user supplies details as specified below
      | Branch                    | DEFAULT            |
      | Mask ID                   | DEFAULT            |
      | Agent/Broker              | AKINWANDE          |
      | Marketer                  | AKINWUNMI STEVE    |
      | Joint Marketer flag       | Yes                |
      | Select Joint Marketer     | 100    						 |
      | Earnings Prd Type         | Monthly            |
      | Coinsurance Flag          | NO                 |
      | Currency                  | NGN                |
      | Currency Fixed Rate       | Yes                |
      |Exchange Rate if currency fixed rate is YES| 180|
      | Quotation Calc Type       | Detailed Mem Info |
      | Quotation Covers          | Self & Dependants  |
      | Duration Type             | Open             	 |
      | Facultative Type          | Normal        		 |
      | Umbrella Duration Type    | Annual        		 |
      | Frequency Of Payment      | Annual        		 |
      | Unit Rate Option          | None      				 |
      | Investment Rider Allowed  | No                 |
      | Savings Rider							| No								 |
      | OS Loan Calc       				|Ammortization       |
    Then User clicks on next button
    Then User clicks on next button
    When Quotation Tax Page opens up
    And User Clicks on New button
    Then Select tax screen pops up.
    When User Select LEVY as Tax Type and clicks next
    When System displays add Tax screen
    Then User clicks save after specifying info as stated below:
    |Rate| 0|
    |Tax Amount|00|
    Then User clicks next button
    Then System displays Categories Description screen
    When User Clicks New on categories Details screen
    Then System Populates the premium mask field
    When User inputs category details as specified below:
      | Short Desc           | NBC |
      | Description          | New Business Category |
      | Multiple of earnings |2  |
    And User clicks Save button
    And User highlights the Categories description
    When dependant type limit populates
    Then User clicks next button
    And User Inputs Quotation Subdivision
    |Short Desc|NQS|
    |Description|New Quote Subdivision|
    |Postal Address|12345|
    #And User Inputs Cover type provision Inconclusive
    And User clicks next button
    Then User Clicks Import Template
    And User Clicks Download Template
    And User clicks choose file to upload
    And User clicks Add Members to Quote
    Then Members successfully imported
    When user clicks Back to Members
    When User clicks next button
    Then user clicks finish button
    When Quotation Details Screen Populates
    Then User Clicks Quotation Underwriting
    And User clicks cover types tab
    And User clicks compute premium
    Then System displays Success notification
    And User clicks Quotation Authorization Tab
    And User clicks Authorisation Tab
    And user clicks Make Ready
    Then System displays Success notification
    And User clicks Quotation Agents Tab
    And user clicks edit Agent
    And User clicks Assign To drop down and selects Yes
    And user clicks Authorised drop down and select Yes
    And user clicks Save
    And User clicks Authorisation Tab
    And user clicks Make Ready
    And user clicks Authorise Quotation

       Examples: 
      | productList |
      |GROUP MORTGAGE PROTECTION|