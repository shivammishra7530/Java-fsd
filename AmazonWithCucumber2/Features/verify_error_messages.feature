//You are given a project to demonstrate how to execute multiple scenarios.


Feature: Login Functionality

Background:
Given a user is on the landing page
When he hovers the pointer over Hello Sign-in button in the sub-menu
When he clicks on Sign-in button in the sub-menu

@TC_102 @login_functionality

Scenario: A user with invalid credentials must get an error message  while logging in
And he enters invalid email address in the Email text-box
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address"


Scenario Outline: A user with multiple invalis credentials must get an error message while logging in
And he enters invalid email address  "<emailID>" in the Email text-box
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address"

Examples:
|emailID|
|batman554466@gmail.com|
|superman554466@gmail.com|
|spiderman554466@gmail.com|
|ironman554466@gmail.com|
|captainplanet554466@gmail.com|



