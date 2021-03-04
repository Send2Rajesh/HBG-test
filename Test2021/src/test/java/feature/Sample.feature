Feature: facebook Smoke Test

Scenario: facebook signup
Given User enter the project URL
And User click "Create new account" button
And User enter Firstname "Firstname"
And User enter Surname "surname"
And User enter Email "test@gmail.com"
And User select the birth date "10"
And User select the birth month "Jun"
And User select the birth year "1999"
And User click gender "Male"
Then User click submit button
