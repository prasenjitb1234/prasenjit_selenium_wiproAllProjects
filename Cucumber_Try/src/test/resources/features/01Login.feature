Feature: Check user is able to login with valid credentials
@Priority1
Scenario: Successful Login
Given login page should open in default browser
When page loads click on signin button
And click on username and click continue
And click on password and click continue
Then login successfully and open home page