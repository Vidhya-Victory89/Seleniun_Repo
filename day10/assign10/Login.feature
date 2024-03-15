Feature: Login Functionality of Leaftap Application


@sanity @smoke
Scenario: Login With Positive Credential
#Given Launch the browser and Load the URL
When Enter the UserName as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
And Click on the LoginButton
Then Homepage should be displayed


@smoke
Scenario: Login With Negative Credential
#Given Launch the browser and Load the URL
When Enter the UserName as 'Demosales'
And Enter the Password as 'crmsfa'
And Click on the LoginButton
But Homepage should not be displayed