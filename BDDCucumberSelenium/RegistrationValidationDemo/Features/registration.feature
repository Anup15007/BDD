Feature: Registration feature
Scenario: user is trying to register invalid set of details
Given user is accessing Registration Page on  Browser

When user is trying submit data without entering "user id"
Then 'User Id should not be empty / length be between 5 to 12' alert message should display.

When user is trying submit data without entering "pass id"
Then 'Password should not be empty / length be between 7 to 12' alert message should display.

When user is trying submit data without entering "username"
Then 'Name should not be empty and must have alphabet characters only' alert message should display.

When user is trying submit data without entering "address"
Then 'User address must have alphanumeric characters only' alert message should display.

When user is trying submit data without entering "country"
Then 'Select your country from the list' alert message should display.

When user is trying submit data without entering "zipCode"
Then 'ZIP code must have numeric characters only' alert message should display.

When user is trying submit data without entering "email"
Then 'You have entered an invalid email address!' alert message should display.

When user is trying submit data without entering "gender"
Then 'Please Select gender' alert message should display.


Scenario: user is trying to register valid set of details
Given user is accessing Registration Page on  Browser
When user is trying submit data
Then 'Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile' alert message should display.