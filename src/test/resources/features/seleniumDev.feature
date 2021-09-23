Feature: Download Page

Scenario: Verification of Download Page link
	Given User is on Home Page of Selenium
	When user clicks on Download link
	Then title should be "Downloads | Selenium"