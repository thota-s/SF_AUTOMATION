$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Automation/YNAP_WS/Salesforce-Project/src/main/java/com/sf/qa/features/01_CreateNewCaseAssetCust.feature");
formatter.feature({
  "line": 4,
  "name": "Salesforce Login",
  "description": "",
  "id": "salesforce-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@loginpage-feature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Validate Salesforce login page",
  "description": "",
  "id": "salesforce-login;validate-salesforce-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on new customer button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enter the Firstname \"\u003cfirst_name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter the Lastname \"\u003clast_name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the EmaiId \"\u003cEmail_ID\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enter the MobileNum \"\u003cMobile_Num\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter the customer StoreName \"\u003cStore_Name\u003e\" Region \"\u003cRegion_Name\u003e\"and Country \"\u003cCountry_Name\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user click on save button to create the customer account and case",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user click on save button in new case page",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "salesforce-login;validate-salesforce-login-page;",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name",
        "Email_ID",
        "Mobile_Num",
        "Store_Name",
        "Region_Name",
        "Country_Name"
      ],
      "line": 23,
      "id": "salesforce-login;validate-salesforce-login-page;;1"
    },
    {
      "cells": [
        "AUT_UAT_MRP_TESTER85",
        "A_UAT_MRP_85",
        "AUTUATTONMRP85@GMAIL.COM",
        "0929069999",
        "MR PORTER",
        "APAC",
        "United Kingdom"
      ],
      "line": 24,
      "id": "salesforce-login;validate-salesforce-login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Validate Salesforce login page",
  "description": "",
  "id": "salesforce-login;validate-salesforce-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@loginpage-feature"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click on new customer button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enter the Firstname \"AUT_UAT_MRP_TESTER85\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter the Lastname \"A_UAT_MRP_85\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the EmaiId \"AUTUATTONMRP85@GMAIL.COM\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enter the MobileNum \"0929069999\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter the customer StoreName \"MR PORTER\" Region \"APAC\"and Country \"United Kingdom\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user click on save button to create the customer account and case",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user click on save button in new case page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_opens_browser()"
});
formatter.result({
  "duration": 18203209511,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 132150458,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_enters_username_and_password()"
});
formatter.result({
  "duration": 5063475565,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.click_the_new_cust_button()"
});
formatter.result({
  "duration": 42824225523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUT_UAT_MRP_TESTER85",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_FirstName(String)"
});
formatter.result({
  "duration": 1591098053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A_UAT_MRP_85",
      "offset": 25
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_LastName(String)"
});
formatter.result({
  "duration": 112818410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTUATTONMRP85@GMAIL.COM",
      "offset": 23
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_EmailID(String)"
});
formatter.result({
  "duration": 193346552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0929069999",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_MobileNum(String)"
});
formatter.result({
  "duration": 123174399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MR PORTER",
      "offset": 35
    },
    {
      "val": "APAC",
      "offset": 54
    },
    {
      "val": "United Kingdom",
      "offset": 72
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_StoreName(String,String,String)"
});
formatter.result({
  "duration": 530711824,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_to_create_the_customer_account_and_case()"
});
formatter.result({
  "duration": 194771122,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_in_new_case_page()"
});
formatter.result({
  "duration": 21131792933,
  "status": "passed"
});
});