Feature: Veterinarian

  Background: Application has veterinarian in the database.

  Scenario: Search for complete veterinarian

    Given Jonn search for veterinarian available in the application

    Then  John should get the veterinarian as
      | message                                                                              |
      | Hello Ashok, your account has been created successfully.Account number AshokAHPS34FU |

