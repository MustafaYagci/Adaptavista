Feature: Alerts

  @alerts @all
  Scenario: Alerts Automation
    Given User navigates to URL "alertsUrl" page
    When  Page header is "JavaScript Alerts"
    And   User should clicks "Click for JS Alert" button
    And   User should clicks "Click for JS Confirm" button
    Then  User should clicks "Click for JS Prompt" button