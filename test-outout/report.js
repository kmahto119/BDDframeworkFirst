$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature.",
  "description": "",
  "id": "free-crm-login-feature.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "free CRM login senario.",
  "description": "",
  "id": "free-crm-login-feature.;free-crm-login-senario.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user should be login page.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter the login id and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on login button.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "home page must be display.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_should_be_login_page()"
});
formatter.result({
  "duration": 27412408700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.enter_the_login_id_and_password()"
});
formatter.result({
  "duration": 1196700700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.click_on_login_button()"
});
formatter.result({
  "duration": 240349300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.home_page_must_be_display()"
});
formatter.result({
  "duration": 1726492900,
  "status": "passed"
});
});