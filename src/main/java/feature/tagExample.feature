@FunctionalTest
Feature: CRM application test

@SmokeTes
Scenario: smoke test one 
Given this id smoke test one 

@RegressionTest
Scenario: regression test one 
Given this is regression test one

@SmokeTes
Scenario: smoke test Two 
Given this id smoke test Two

@RegressionTest @SmokeTes
Scenario: smoke and regression test three 
Given this is smoke and regression test three
