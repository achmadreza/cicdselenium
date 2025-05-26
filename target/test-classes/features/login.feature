Feature: Login Functionality

  Scenario: User logs in with valid credentials
    Given User is on the login page
    When User click makeAppointment
    When User enters valid username and password
    And User clicks on the login button
    Then User should be redirected to the homepage
