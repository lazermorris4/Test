$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/lead.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: reenu@dp360crm.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: Create lead"
    },
    {
      "line": 4,
      "value": "#Scenario: User can create lead successfully"
    },
    {
      "line": 5,
      "value": "#Given: User is logged in with crm user id and password"
    },
    {
      "line": 6,
      "value": "#When: When user creates a lead"
    },
    {
      "line": 7,
      "value": "#Then: Lead should be created and listed in lead details"
    }
  ],
  "line": 9,
  "name": "Create lead",
  "description": "",
  "id": "create-lead",
  "keyword": "Feature",
  "tags": [
    {
      "line": 8,
      "name": "@Lead"
    }
  ]
});
formatter.before({
  "duration": 3446412861,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User can create lead successfully",
  "description": "",
  "id": "create-lead;user-can-create-lead-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user enters credentials in the CRM landing page",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 14
    },
    {
      "cells": [
        "reenup",
        "Access1234!"
      ],
      "line": 15
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user creates a lead",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "validate that",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateLeadSteps.user_enters_credentials_in_the_CRM_landing_page(DataTable)"
});
formatter.result({
  "duration": 11648506213,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});