@CurrentTest
Feature: Creation Of Quotation

  Scenario Outline: Aggregate Quotation
    Given User is on http://172.28.162.17:6001/LMSGroup/
    When User inputs valid username BOGUNMEFUN and password Tezzateam123#
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
      |Investment Term						|										 |
    Then User clicks on next button
    When Quotation Cover Details Screen appears with the Main cover populated
    Then user Click on New button
    When System displays Cover Details form
    Then User provides details as specified below
      | Cover Type               					|GROUP TERM COVER|
      | No. of Members           					| 5 |
      | Av. Earnings Per Member  					|50000  |
      | Load Rate                					| 15 |
      | Average ANB              					| 100 |
      | Select Rate             					|Select Specific Mask|
      | Sum Assured              					| 2000000 |
      | Dependent Type           					|COUSIN|
      | Multiple Earnings Period 					| 1 |
      | Load 					           					| Load Age |
      | Load Div Factor          					| 100 |
      | Discount? 				         				|Discount|
      | Discount Div Factor      					|100  |
      | Premium Mask         							|DEFAULT|
      
    Then User clicks save button
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
      | productList           |
      		|GROUP TERM|
      #		|GROUP MORTGAGE PROTECTION|
      #		|GROUP LIFE ASSURANCE|
      #		|GROUP WELFARE SCHEME|
      #		|GROUP FAMILY SHIELD PLAN|
      #		|GROUP EASY SAVE|
      #		|FIRST KEYMAN|
#      | GROUP KEYMAN ASSURANCE |
       #| CREDIT LIFE ASSURANCE |
#		|TUITION PROTECTION|
#		|STAFF EASY SAVE|
