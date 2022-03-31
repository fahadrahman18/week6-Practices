Feature: Login and Delete Leads in Leaftaps

Background: 
Given A chrome browser is launched
And Load the Leaftaps url

Scenario Outline: TC004 DeleteLead Leaftaps

Given give username as <username>
And give password as <password>
When click login to enter the application
Then Welcome page should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' should be displayed
When Click on 'Leads' link
Then 'My Leads' should be displayed

Given Click Find Leads
And click phone
And enter '91' in phone number 
And click find lead button
And print the first resultant ID and store it 
And click the first resultant ID
Then Verify the title

Given Click the Delete button

Given Click Find Leads
And enter the stored lead ID in the Lead ID textbox
And click find lead button
Then verify no results found because we deleted the ID

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
