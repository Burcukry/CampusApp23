Feature: Human Resources Test Case 1
  Validate an Admin User is able to ADD a position category

  Background:
    Given Navigate to website
    When Enter user name and password
    And Click onLogin Button
    When Navigate to Human Resources Set Up Position Categories

  Scenario: HR-TestCaseId-1
    Given Enter a position name into name text field
      | Sales Manager |

    When Click on Search Button
    And User should see Tehre is no data to be displayed after seacrh
    And  Click on Add Button
    And Enter  a new position name into the text field
      | Sales Manager |
    And  Click on Save Button
    Then Success message should be displayed

  Scenario:HR-TestCaseId-4
    Given Click on Add Button
    And Enter same name into the text field
    And  Click on Save Button
    Then  position categories should not be added

    Scenario: HR-TestCaseId-3
      Given  Enter a position name into name text field
        | Sales Manager |
      And Click on Search Button
      And Click on Edit Button
      And Enter  a new position name into the text field
        |Teacher|
      And Click on Save Button
      Then Position should be updated






















