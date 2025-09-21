$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefile/fblogin.feature");
formatter.feature({
  "name": "To validate fb Login function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fb"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch edge browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_user_launch_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with invalid username and invalid passwor",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fb"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To user enter valid url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_user_enter_valid_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter  invalid username and invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toUserEnterInvalidUsernameAndInvalidPassword()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: To false\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.stepdef.StepDefinition.toUserEnterInvalidUsernameAndInvalidPassword(StepDefinition.java:35)\r\n\tat ✽.To user enter  invalid username and invalid password(file:src/test/resources/featurefile/fblogin.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toUserClickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch edge browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_user_launch_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with valid username and valid passwor",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fb"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To user enter valid url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_user_enter_valid_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter  valid username and valid password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toUserEnterValidUsernameAndValidPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toUserClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});