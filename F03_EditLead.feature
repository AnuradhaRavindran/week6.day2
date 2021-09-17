@Editlead
Feature: EditLead  for LeafTaps Application

@smoke
Scenario Outline:TC003_EditLead Test
#Given Enter the username as 'demosalesmanager'   
#Given Enter the password as 'crmsfa'  
#When click on login button  
#Then Home page displayed 
#When click on 'CRM/SFA' link
#Then My home page displayed
#When clicking on 'Leads' link
When click on 'Find Leads' link
Given Enter the firstname as <firstname>
When Again click on Find Leads link
When click on first item and verify ViewLead page
When click on Edit button
Given Enter the company name as <companyname>
When click on update button 

Examples:
|firstname|companyname|
|'ram'|'TCS'|
|'hari'|'TestLeafcorporateservice'|


