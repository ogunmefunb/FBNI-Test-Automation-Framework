#@CurrentTest
Feature: Quotation Enquiry

  Scenario Outline:  Perform Quotation Enquiry
    Given User is on http://172.28.162.17:6001/LMSGroup/
    When User inputs valid username BOGUNMEFUN and password Teamtezza123#
    Then user Click on The Quotation Module
   And User click on the Quotation Enquiry Sublink
    When System displays Select A Quotation Enquiry Screen
    Then User provides quotation Enquiry details as specified below:
     	| Product Name       | <productList> |
      | Client					   | A.E. MUONEKE & SONS LIMITED  |
      | Agent						   |FBN INSURANCE BROKERS LIMITED	|
      | Branch						 |HEAD OFFICE	|
      |	Status			       |Successful |	
      |Date From					 |01-Jan-2020|
      |Date To						 |17-Sep-2020	|
    Then User Clicks on the Search button
    And User select the Quotation at Quotation Tickets and clicks View
    
    
    
   	


    Examples: 
      | productList |
      | GROUP TERM  |
   