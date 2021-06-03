
@tag
Feature: Login a gmail page

  Scenario: Home page login
    Given Open a gmail signin page
    When Provide a user name and password
    Then It should open the home page
    And It opened Inbox
