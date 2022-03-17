Feature: Receive User Comment

  @regression
  Scenario Outline: Receive User Comments
    Given the url
    And Search for the user with username “<Username>”
    Then Successfully get id and comments

    Examples:
      | Username |
      | Delphine |

