Feature: Check user is able to shop items by category
@Priority5
Scenario: Successfully able to view category
Given Page opens in ebay website 
When page loads click on shopbycategory
And click on computers and navigate back 
And click on cameras and navigate back
And click on video games and navigate back
Then successfully shop by category is working
