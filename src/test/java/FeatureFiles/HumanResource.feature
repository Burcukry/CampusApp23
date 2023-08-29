Feature: Human Resources Test Case 1
  Validate an Admin User is able to ADD a position category

  Background:
    Given Navigate to website
    When Enter user name and password
    And Click onLogin Button


  Scenario: HR-TestCaseId-1
    When Navigate to Human Resources Set Up Position Categories
    Then Enter a position name into name text field
    And  Click on Search Button
    And  Click on Add Button
    Then Success message should be displayed

















