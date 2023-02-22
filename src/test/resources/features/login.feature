Feature: Sign in button
@smoke
  Scenario: User can click on Sign in button
    When User hoover on Hello, sign in section
    And User can click on Sign in button
    And User enters email or phone number
    And User can click Continue button
    And User enter password
    Then User can click on Sign(Submit) button
    #User successfully login User can click on SignSubmit button


