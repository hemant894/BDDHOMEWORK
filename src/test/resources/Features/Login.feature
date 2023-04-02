Feature: NopCommerce Login
  Background:
    Given User  open Browser
    And Enter Url

    Scenario:NopCommerce Valid Login Test
      When User click on Login Link
      Then User on Login Page and Verify page Title
      And User enter username and password and click on login button
      Then User is on Home Page
      And User close the browser
