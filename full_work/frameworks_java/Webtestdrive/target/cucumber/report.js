$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('dataTable\dataTable.feature');
formatter.feature({
  "line": 1,
  "name": "Data table",
  "description": "Verify that the new user registration is successful after passing correct inputs.",
  "id": "data-table",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "Given:the user is on the user registration page\r\nWhen:user enter valid data on the page\r\n| Fields                 | Values              |\r\n| First Name             | Sumita              |\r\n| Last Name              | Pandey              |\r\n| Email Address          | someone@gmail.com   |\r\n| Re-enter Email Address | someone@gmail.com   |\r\n| Password               |PASSWORD             |\r\n| Birthdate              | 02                  |\r\nThen:the user registration should be successful",
  "id": "data-table;",
  "type": "scenario",
  "keyword": "Scenario"
});
});