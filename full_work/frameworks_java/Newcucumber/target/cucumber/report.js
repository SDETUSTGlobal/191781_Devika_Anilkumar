$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('login\login.feature');
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
  "description": "Given: user is on Home Page\t\t\t\t\t\t\r\nWhen: user enters valid data on page\r\nThen: user should see Web Orders",
  "id": "login;successful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
});