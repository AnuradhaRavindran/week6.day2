@MergeLead
Feature: Merge Lead functionality of LeafTaps Application
@smoke
Scenario Outline: TC005_CreateLead Test
When click on create button
When clcik on Merge contacts
When click on From contact
Given Enter firstname<firstname>
Given Enter lastname<lastname>
When click on merge button

Examples:
|firstname|lastname|
|'Indhumathi'|'Annamalai'|
