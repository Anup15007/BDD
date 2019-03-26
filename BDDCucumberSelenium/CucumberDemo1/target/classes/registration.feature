Feature: GitHub Registration feature
Scenario: user is trying to signin in GitHub using Invalid username and password
Given user is on GitHub Registration Page
When user enter Invalid username and password
Then 'Incorrect username or password.' Message should display

Scenario: user is trying to signin in GitHub using valid username and password
Given user is on GitHub Registration Page
When user enter valid username and password
Then user can see the GitHub HomePage' 