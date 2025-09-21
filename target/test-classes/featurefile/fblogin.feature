@fb
Feature: To validate fb Login function

Background:

Given To user launch edge browser

@smoke @regression
Scenario: To validate login with invalid username and invalid passwor

When To user enter valid url 
And To user enter  invalid username and invalid password
Then To user click login button 

@smoke  
Scenario: To validate login with valid username and valid passwor

When To user enter valid url 
And To user enter  valid username and valid password
Then To user click login button 



