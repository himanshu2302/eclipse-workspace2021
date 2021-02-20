Feature: Login to ClaimsPro

Scenario: Test login functionality in ClaimsPro

Given url is launched
When user is on login page
Then user enters username and password
Then user clicks on login button

Scenario: Creat PA Claim

Given user is on homepage
When user is on create claim page
Then user enters date of occurrence
And user enters policy number for PA claim
Then user clicks on search icon
Then user provides the notification details
Then user clicks on initiate button
Then user clickc on continue to add new button
And user saves the claim number


