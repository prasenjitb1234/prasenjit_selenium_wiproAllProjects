Feature: Check user is able to shop items by all categories
@Priority6 
Scenario: Successfully Able to shop by all category
Given Page opens in ebay all categories
When page loads click on All Categories
And select one category and press enter
Then successfully Shop By All category is working
