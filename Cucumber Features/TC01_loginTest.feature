Feature: Login in the Leaftaps

Background: 

Given A chrome browser is launched
And Load the Leaftaps url


Scenario Outline: TC001 Login Leaftaps

Given give username as <username>
And give password as <password>
When click login to enter the application
Then Welcome page should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|