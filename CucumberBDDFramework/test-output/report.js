$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Himanshu.Dubey/eclipse-workspace/CucumberBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to ClaimsPro",
  "description": "",
  "id": "login-to-claimspro",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test login functionality in ClaimsPro",
  "description": "",
  "id": "login-to-claimspro;test-login-functionality-in-claimspro",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "url is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.urlLaunched()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.loginPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.entersUsernameandPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.clickOnLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Creat PA Claim",
  "description": "",
  "id": "login-to-claimspro;creat-pa-claim",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user is on create claim page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters date of occurrence",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters policy number for PA claim",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on search icon",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user provides the notification details",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on initiate button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clickc on continue to add new button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user saves the claim number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_create_claim_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_date_of_occurrence()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_policy_number_for_PA_claim()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_search_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_provides_the_notification_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_initiate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_clickc_on_continue_to_add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_saves_the_claim_number()"
});
formatter.result({
  "status": "skipped"
});
});