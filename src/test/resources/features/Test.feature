Feature: Verify menu
  Scenario: User can see menu after accessing page
    Given user access URL link.
    When Wait for the page to load and close the ads popup.
    Then user check menu items are displayed

