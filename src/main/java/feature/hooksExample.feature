Feature: Free CRM feature

Scenario: Free CRM scenario
    Given login page
    When verify login page URL
    Then user enetr username and password  
    
Scenario: Create Deal
	Given move on deal page
	When verify the deal page
	Then create deal     
	