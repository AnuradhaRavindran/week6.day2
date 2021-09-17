@DeleteLead
Feature: Delete Lead functionality of LeafTaps Application
@functional
Scenario Outline: TC006_DeleteLead Test
When click on findleads link
When click on phone link
Given Enter the phonenumber<phone>
When Click on Again findleads link and select first item and verify

Examples:
|phone|
|'99'|
|'98'|


