@execute
Feature: Google Search Feature
Using this feature user can able to search very vital information

Scenario: User want to search information on 'Agile Methodlogy' by entering valid set of words
Given User is on Google HomePage
When User search for 'Agile Mehtodlogy'
Then All links should display with 'Agile Methodlogy'