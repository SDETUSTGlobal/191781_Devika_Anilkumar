$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('dataTable\login.feature');
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Successful Login",
  "description": "",
  "id": "login;successful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters Credentials to Login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user should see Web Orders",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Step.user_should_see_Web_Orders()"
});
formatter.result({
  "status": "skipped"
});
});