#@CurrentTest
Feature: Member Details

  Scenario Outline: Manual Capture Of Member Details
   Given User is on http://172.28.162.17:6001/LMSGroup/
    When User inputs valid username JNYOKABI and password Tquest123#
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
    #And User Inputs Cover type provision [Inconclusive As there is an error that prevents step execution]
    And User clicks next button
    When System Displays Quotation Members Page
    Then User clicks add button to manually add quotation members
    And User inputs member details as specified below:
    |Payroll or Mem No|1234|
    |Surname|Doe|
    |Other Names|John|
    |Date of Birth|01-Sep-1991|
    |Category|New Business Category|
    |Occupation|BROKER|
    |Sex|Male|
    |Monthly Earnings|500000|
    |Monthly Earn Periods|1|
    |Joining Date|13-Sep-2020|
    And user clicks Save Member button
    When System displays success notification
    Then User clicks Ok to confirm member addition
    And user clicks back to Member button
    
    	
  
    
       Examples: 
      | productList |
      | GROUP KEYMAN ASSURANCE |
    