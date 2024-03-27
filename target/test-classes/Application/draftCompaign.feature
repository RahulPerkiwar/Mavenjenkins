# Drafts Campaign
# Created Campaign
# Sent Campaign

Feature: Campaign Functionality

@Sanity 
Scenario: Drafts Campaign
Given user is at Campaign Portal
When User click on draft campaign button
And user submit the required information
Then  Campaign drfts created successfully

@Regression
Scenario: Created Campaign
Given user is at Campaign Portal
When user click on created campaign button
And user submit thre required information for created campaign
Then user created campaign successfully

@Smoke
Scenario: Sent campaign
Given user is at Campaign Portal
When User click on Sent Campaign button
And User submit the customer requirement sent information
Then Sent Campaign successfully created