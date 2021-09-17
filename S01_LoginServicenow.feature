@Login
Feature: Login functionality of Servicenow Application
@regression
Scenario Outline: SNTC001_Login test 
#Given open the browser
#Given load url
#Given Enter the username 
#Given Enter the password 
#When click on login 
#Given Enter the incident on filter 
When click on createnew
Then Get first number id
When click on caller
Given Enter short description <description>
When click on submit and gernumbeId and Verify

Examples:
|description|
|'TestLeafSolutions'|
|'TestLeaf'|

@smoke
Scenario Outline: SNTC002_update test 
When Click serviceincident
Given Enter the numberid <numerid>
When Click on urgency
When Click on state
Given Enter Worknotes<wroknote>
When Click on update
When verify state
When verify prority

Examples:
|numerid|wroknote|
|'INC0000019'|'Developer'|
|'INC0000046'|'Tester'|

@functional
Scenario Outline:SNTC003_Assign test 
When click on service incidents
Given Enter numberId<Numid>
When Click on display numid
When click on Assigngroup and value as <value>
When click on Assignto
Given Enter Worknote <wroknote>
When click on assignupdate
When Click on Assigngroup check
When Click on Assignto check

Examples:
|Numid|value|wroknote|
|'INC0000007'|'software'|'Development'|

@regression
Scenario Outline: SNTC004_Delete test 
When click on serviceinci
Given Give the numid<nameId>
When click on appeared number
When click delete button
Given Enter the <nameId> and verify

Examples:
|nameId|
|'INC0000018'|









