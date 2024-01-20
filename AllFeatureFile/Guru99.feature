Feature: Guru99 Application

  Scenario: Guru99 Contact Information
    Given User is on guru 99 page
    When User Enter FirstName, LastName , Phone and Email

  Scenario: Guru99 mailing information
    When User enter Address ,city ,state, zip code
    And click on country dropdown

  Scenario: Guru99 user Information
    Then user enter username
    Then user enter password and confirm password and click on login button.
