@regression
@mehmet
Feature: Login Feature


  Scenario: The student should be able to login with valid credentials
    Given the user goes to examinion home page
    When the user provides correct "student" credentials
    Then the user should be able to login to the platform

  Scenario: Superadmin should be able to login successfully with valid credentials
    Given the user goes to examinion home page
    When the user provides correct "superadmin" credentials
    Then the user should be able to login to the platform



