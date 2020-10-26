#@CurrentTest
Feature: Creation Of Quotation

  Scenario Outline: Import Member details without Capturing the Member Earnings
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
      | Quotation Calc Type       | Aggregate Mem Info |
      | Quotation Covers          | Self & Dependants  |
      | Duration Type             | Annual             |
      | Facultative Type          | Fac Inward         |
      | Umbrella Duration Type    | Semi Annual        |
      | Frequency Of Payment      | Semi Annual        |
      | Unit Rate Option          | Weighted Age       |
      | Total Claims paid         |                100 |
      | Total Premium Paid        |                101 |
      | Investment Rider Allowed  | No                 |
      |Savings Riders|Yes|
      |OS Loan Calc |Ammortization|
    Then User clicks on next button
    When Quotation Cover Details Screen appears with the Main cover populated
    Then user Click on New button
#    Then System populates quotation tax screen
#    Then User clicks on the New button
#    When Select tax screen pops up
#    Then User selects Tax Type (If Applicable)
#    When the selected tax field is highlighted
#    Then User clicks on Next button
#    When The record is highlighted and saved.
#    Then User clicks on Next button
#		When Categories Description is displayed.
#		Then User clicks on the New button
#		When The fields are populated with the Premium Mask details
#		Then User input details as specified below:
#		|Short Desc||
#		|Description||
#		| Multiple of Earnings(Years)||
#		And Click on save
#		When The value is updated on the Categories Description.
#		Then User Highlight the Categories Description
#		When The dependent Type Limits populates
#		Then User Click On Next
#		When Quotation Summary Populates
#		Then User Input the Quotation Subdivisions, if applicable
#		When Quotation Subdivisions is populated
#		Then User Input the Cover Type Provisions, if applicable
#		When Cover Type Provisions is populated.
#		Then User Click on Next
#		When Quotation Members details are populated
#		Then User Click On import Template
#		When Import Members Screen is populated.
#		Then User click on Download Template
#		When The template is downloaded
#		Then User click on Choose File and upload the file with empty  Member Earnings column
#		When System displays Message that annual earnings not captured




    Examples:
      | productList |
      |COMBINED GROUP LIFE WITH GPA|
		
		
		
		
