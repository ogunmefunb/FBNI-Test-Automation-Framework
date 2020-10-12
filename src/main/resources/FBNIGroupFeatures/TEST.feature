#@CurrentTest
Feature: Category

  Scenario Outline: Populate Premium Mask
    Given User is on http://172.28.162.17:6001/LMSGroup/
    When User inputs valid username BOGUNMEFUN and password Tezzateam123#
    Then user Click on The Quotation Module
    And User click on the Quotation Processing Sublink
    When System displays Select A Quotation Transaction Screen
    Then User provides TEST:
      | Product Name       | <productList>               |
      | Operation Type     | New Quotation               |
      | Effective Date     | 14-Aug-2020                 |
      | Client             | A.E. MUONEKE & SONS LIMITED |
      | UmbrellaCover Flag | Yes                         |
      | Access Group       | DEFAULT GROUP               |

   

      Examples: 
      | productList |
      | GROUP KEYMAN ASSURANCE |
   
