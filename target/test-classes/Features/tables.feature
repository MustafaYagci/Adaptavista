Feature: Tables

  #For this automation there is no acceptance criteria or any other instructions. So I just store all the table on OOP concepts of Java.
  @tables @all
  Scenario: Tables Automation
    Given User navigates to URL "tablesUrl" page
    When  Page header is "Data Tables"
    Then  Table values are setted up
