Feature: Develop login functionality


@sanity
Scenario: verify title
Given user navigate url 
Then user need to verify title

@Smoke
Scenario: verify Logo
Given user navigate url 
Then user need to verify logo


Scenario Outline: InValid Login
Given user navigate url 
And user should be landing on login page
When user enters valid credential "<userid>" and "<password>"
Then user should be login successfully
And page should be navigate on home page
Examples:
|userid | password |
|admin  | sdsddsd  |
|ad234  | sdsddsd  |
|admin  | *******  |

Scenario: Valid Login
Given user navigate url 
And user should be landing on login page
When user enters valid credential "admin" and "admin"
Then user should be login successfully
And page should be navigate on home page







