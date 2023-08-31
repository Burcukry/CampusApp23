Feature: Attestation Functionality
  User should be able to Add Attestations, Edit Attestations and Delete
  Attestations for setting up human resources details for management of schools.


  Background:
    Given Navigate to website
    When Enter user name and password
    And Click onLogin Button
    Given Navigate to Attestation
    And Enter a position name into name text field
      | Lesson1 |
    And Click on Search Button


  Scenario: HR-ATTES-TestCaseid-1 // ADD ATTESTATIONS
    And Click on Add Button
    And Enter  a new position name into the text field
      | Lesson1 |
    And Click on Save Button
    And Success message should be displayed

  Scenario:HR-ATTES-TestCaseid-4 //NOT TO BE ADD
    And Click on Add Button
    And Enter same name into the text field
      | Lesson1 |
    And Click on Save Button
    Then Attestation Should not be added

  Scenario: HR-ATTES-TestCaseid-2// EDIT
    And Click on Edit Button
    And Enter  a new position name into the text field
      | Lesson5 |
    And Click on Save Button
    And Success message should be displayed

  Scenario: HR-ATTES-TestCaseid-5 //NOT TO BE EDIT
    And Click on Edit Button
    And Clear existing name into the Name text field
    Then Position should not be updated

Scenario: HR-ATTES-TestCaseid-3 //DELETE
  And Click on Delete Button
  And Click on DeleteClick Button
  Then Success message should be displayed

  Scenario: HR-ATTES-TestCaseid-6 //NOT DELETE
    And Click on Delete Button
    And Click on Cancel Button
    Then User should be able to see the existing name in position categories
    |Lesson1|