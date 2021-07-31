Feature: Editor

  @editor @all
  Scenario: Editor Automation
    Given User navigates to URL "editorUrl" page
    When  User navigates to page as a default "Your content goes here." writen
    And   User clears the text field
    And   User selects bold option
    Then  User write "ADAPTAVISTA"
