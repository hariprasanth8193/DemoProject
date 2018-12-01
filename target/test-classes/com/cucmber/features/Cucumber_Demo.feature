@Cucumeber_demo
Feature: Cucumber demo
description

Background: Launch The browser
Given User launch application


@Scenario1 @Scenario3
Scenario: User verifies login
When User enter username
And User enter password
Then User verifies crendentials

@Scenario3
Scenario: User verifies login by passing paramters
When User enter username 'ABC'
And User enter password '@XYZ'
Then User verifies crendentials

@Scenario3 @Ignore
Scenario Outline: User verifies login by example keyword
When User enter username '<UserName>'
And User enter password '<Password>'
Then User verifies crendentials 

Examples:
|UserName	|Password	|
|ABC		|@XYZ		|
|MNO		|@XYZ		|

@Scenario1
Scenario: User verifies login using list of data
When User enter username and password
|ABC|xyz|
|MNO|XYZ|
Then User verifies crendentials

Scenario: User verifies login using list of map
When User enter username and password using map
|Username|Password|
|ABC|XYZ|
|XYZ|MNO|
Then User verifies crendentials



