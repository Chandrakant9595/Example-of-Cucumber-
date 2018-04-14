Feature: OneAdd living cost feature

Scenario: OneAdd living cost scenario
	    Given one admin is on home page
	    When one verify the url
	    Then one admin enter username and password
	    	| userName | password     |
	    	| admin    | Wedriveon16! |
	    Then one admin click on login button
	    Then one url verify the home page
	    Then one open Add Living Cost page
	    Then one admin enter livinh cost details
	    	| Living Type Name | Cost | 
	    	| test1            | 100  |
	    	| test2            | 200  | 
	    Then one driver close the browser 