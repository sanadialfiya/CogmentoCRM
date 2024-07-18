Feature: Test Cogmneto Application

  Scenario: validate Login Functionality
    Given when user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: validate Home Page Functionality
    Given when user is on home page and verify home page title
    Then user validate the Home page logo
    And user validate home page url
