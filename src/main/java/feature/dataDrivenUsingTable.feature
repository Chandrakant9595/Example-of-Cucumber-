Feature: Add living cost feature

Scenario: Add living cost scenario
	    Given admin is on home page
	    When verify the url
	    Then admin enter username and password
	    | admin | Wedriveon16! |
	    Then admin click on login button
	    Then url verify the home page
	    Then open Add Living Cost page
	    Then admin enter livinh cost details
	    | test1 | 100 |
	    Then driver close the browser 
	    			