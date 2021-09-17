@createlead
Feature: Create Lead functionality of LeafTaps Application
#Background: 
#Given open the browser
#And load the application url 'http://leaftaps.com/opentaps/'
#Given Enter the username as 'demosalesmanager'   
#Given Enter the password as 'crmsfa'  
#When click on login button  
#Then Home page displayed 
#When click on 'CRM/SFA' link
#Then My home page displayed
#When clicking on 'Leads' link
@functional @regression
Scenario Outline: TC002_CreateLead Test
#Given open the browser
#And load the application url
#Given Enter the username as 'demosalesmanager'   
#Given Enter the password as 'crmsfa'  
#When click on login button  
#Then Home page displayed 
#When click on 'CRM/SFA' link
#Then My home page displayed
#When clicking on 'Leads' link
When Clicking on to Create Lead link
Given Enter the companyname as<companyName>
Given Enter the firstname as<firstName>
Given Enter the lastname as<lastName>
Given Enter the phone number<primaryPhoneNumber>
When Click on CreateLead Button

Examples:
|companyName|firstName|lastName|primaryPhoneNumber|
|'TestLeaf'|'Anu'|'Ravi'|'987345523'|
|'TestLeafSolutions'|'Ram'|'Raja'|'8752344'|
|'Wipro'|'gopi'|'raja'|'765324425'|


