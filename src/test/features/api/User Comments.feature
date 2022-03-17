Feature: Receive User Comment

  @regression
  Scenario Outline: Receive User Comments
    When Search for the user with username “<Username>”
    Then Successfully get id and comments

    Examples:
      | Username |
      | Delphine |

