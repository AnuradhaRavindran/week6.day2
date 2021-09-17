@login
Feature: LoginFunctionality of LeafTaps Application

#Background: 
#Given open the browser
#And load the application url 
#Given Enter the username as demosalesmanager 
#Given Enter the password as crmsfa
#When click on login button  
#Then Home page displayed 
#When click on 'CRM/SFA' link
#Then My home page displayed
#When clicking on 'Leads' link



@regression
Scenario Outline: TC001_Login test with positive credentials
Given open the browser
And load the application url 
Given Enter the username as <username>   
Given Enter the password as <password>  
When click on login button  
Then Home page displayed 
When click on 'CRM/SFA' link
Then My home page displayed
When clicking on 'Leads' link


Examples: 
|username|password|
|'demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#Scenario Outline: TC002_Login tets with negetive Credentials
#Given Enter the username as <username>
#Given Enter the password as <password>
#When click on login button 
#But Error message should be displayed 

#Examples: 
#|username|password|
#|'demo123'|'crmsfa'|




