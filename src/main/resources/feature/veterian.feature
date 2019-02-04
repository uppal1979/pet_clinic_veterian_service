Feature: Veterinarian

  Background: Application has veterinarian in the database.

  Scenario: Search for complete veterinarian

	Given Jonn search for veterinarian available

	Then  John should get the veterinarian as
	  | name         |Specialties|
	  | James Carter |none       |

