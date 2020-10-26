#@CurrentTest
Feature: Add Category

  Scenario Outline: Add Category to Quotation Group Mortgage Protection
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
      | Agent/Broker                                | AKINWANDE          |
      | Currency                                    | NGN                |
      | Currency Fixed Rate                         | Yes                |
      | Exchange Rate if currency fixed rate is YES |                180 |
      | Quotation Calc Type                         | Detailed Mem Info  |
      | Quotation Covers                            | Self & Dependants  |
      | Duration Type                               | Annual             |
      | Facultative Type                            | Fac Inward         |
      | Frequency Of Payment                        | Semi Annual        |
      | Unit Rate Option                            | Weighted Age       |
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
   
   
   
   

      Examples: 
      | productList |
      |GROUP MORTGAGE PROTECTION|