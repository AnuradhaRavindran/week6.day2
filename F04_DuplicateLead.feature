@DuplicateLead
Feature: DuplicateLead functionality for LeafTaps Application
@functional
Scenario Outline: TC004_DuplicateLead Test
When click on findleadslink
When Click on email link
Given Enter the emailaddress<emailid>
When click on findlead button
When select firstitem in the list
When click on dupliacte button and verify page
When click on submit and verify leadname

Examples:
|emailid|
|'jenniferaniston@gmail.com'|




