Feature: Receive User Comment

  @regression
  Scenario Outline: Receive User Comments
    When user search for the user with username “<Username>”
    Then user successfully get id and comments

    Examples:
      | Username |
      | Delphine |

