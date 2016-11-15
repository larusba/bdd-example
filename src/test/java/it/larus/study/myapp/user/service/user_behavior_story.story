Scenario: Unknown User

Given a user with username never registered
And user language is italian
When try login
Then ensure user is not login
And ensure exists the button “Register”
And user is unknown
And navigation is in italian

Scenario: Unknown Facebook User

Given a user with username never registered
And user is logged on Facebook
And user language is italian
When try login
Then ensure user is not login
And ensure exists the button “Register with Facebook”
And user is unknown
And navigation is in italian
