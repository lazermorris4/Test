#Author: reenu@dp360crm.com
#Keywords Summary :
#Feature: Create lead
#Scenario: User can create lead successfully
#Given: User is logged in with crm user id and password
#When: When user creates a lead
#Then: Lead should be created and listed in lead details
@Lead
Feature: Create lead

  @tag1
  Scenario: User can create lead successfully
    Given user enters credentials in the CRM landing page
    |UserName|Password|
    |reenup|Access1234!|
    When user creates a lead
    Then validate that
    

