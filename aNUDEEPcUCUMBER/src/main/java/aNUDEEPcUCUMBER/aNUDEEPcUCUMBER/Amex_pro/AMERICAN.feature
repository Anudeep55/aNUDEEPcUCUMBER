Feature: My Validation on American Expres

  @Regression
  Scenario: I want to login
    Given I have a account
    And I will provide dat
    Then MY login access

  @Sanity @Regression
  Scenario: I want to view my membership
    Given I have logged in
    And I will click on rewards
    Then MY check for my rewars

  @Sanity
  Scenario: I want to refer my friend
    Given Iam offered with rewards
    And I shred link
    Then I will enjoy
