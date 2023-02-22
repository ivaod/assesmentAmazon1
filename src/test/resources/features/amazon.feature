Feature: Amazon webpage

  @smoke
  Scenario: Amazon webpage title

    When user is on "https://www.amazon.com"
    Then Amazon title page should be "Amazon.com. Spend less. Smile more."