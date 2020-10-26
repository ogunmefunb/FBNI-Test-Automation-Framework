#@CurrentTest
Feature: Quotation Date of Birth Validation

  Scenario Outline: DOB Validation Group Term
    Given User is on http://172.28.162.17:6001/LMSGroup/
    When User inputs valid username BOGUNMEFUN and password Tezzateam123#
    Then user Click on The Quotation Module
    And User click on the Quotation Processing Sublink
    When System displays Select A Quotation Transaction Screen
    Then User provides quotation details as specified below:
      | Product Name       | <productList>               |
      | Operation Type     | New Quotation               |
      | Effective Date     | 14-Aug-2020                 |
      | Client             | A.E. MUONEKE & SONS LIMITED |
      | UmbrellaCover Flag | Yes                         |
      | Access Group       | DEFAULT GROUP               |
    Then User Clicks on the Next button
    When system opens quotation basic details form
    Then user supplies details as specified below
      | Branch                                      | DEFAULT            |
      | Mask ID                                     | DEFAULT            |
      | Agent/Broker                                | AKINWANDE          |
      | Marketer                                    | AKINWUNMI STEVE    |
      | Joint Marketer flag                         | Yes                |
      | Select Joint Marketer                       |                100 |
      | Earnings Prd Type                           | Monthly            |
      | Coinsurance Flag                            | NO                 |
      | Currency                                    | NGN                |
      | Currency Fixed Rate                         | Yes                |
      | Exchange Rate if currency fixed rate is YES |                180 |
      | Quotation Calc Type                         | Detailed Mem Info  |
      | Quotation Covers                            | Self & Dependants  |
      | Duration Type                               | Annual             |
      | Facultative Type                            | Fac Inward         |
      | Umbrella Duration Type                      | Semi Annual        |
      | Frequency Of Payment                        | Semi Annual        |
      | Unit Rate Option                            | Weighted Age       |
      | Total Claims paid                           |                100 |
      | Total Premium Paid                          |                101 |
      | Investment Rider Allowed                    | No                 |
      | Investment Term                             |                    |
    Then User clicks on next button
    When Quotation Cover Details Screen appears with the Main cover populated
    Then User clicks on next button
    When Quotation Tax Page opens up
    Then User clicks next button
    Then System displays Categories Description screen
    When User Clicks New on categories Details screen
    Then System Populates the premium mask field
    When User inputs category details as specified below:
      | Short Desc           | NBC |
      | Description          | New Business Category |
      | Multiple of earnings |2  |
    And User clicks Save button
    And User clicks next button
    And User Inputs Quotation Subdivision
      |Short Desc|NQS|
      |Description|New Quote Subdivision|
      |Postal Address|12345|
    And User clicks next button
    When System Displays Quotation Members Page
#    Given User is on Quotation Members grid
#    When user imports date as 29-01-1900
#    Then The system defaults the date to 29-Nov-1998
#    Then System saved The entered date successfully


    Examples:
      | productList |
      |GROUP FAMILY SHIELD PLAN|

    