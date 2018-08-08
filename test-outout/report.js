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
        "AUT_UAT_MRP_TESTER74",
        "A_UAT_MRP_74",
        "AUTUATTONMRP74@GMAIL.COM",
        "0229069999",
        "MR PORTER",
        "APAC",
        "United Kingdom"
      ],
      "line": 24,
      "id": "salesforce-login;validate-salesforce-login-page;;2"
    },
    {
      "cells": [
        "AUT_UAT_NAP_TESTER75",
        "A_UAT_NAP_75",
        "AUTUATTONNAP74@GMAIL.COM",
        "0139069999",
        "NET-A-PORTER",
        "INTL",
        "United Kingdom"
      ],
      "line": 25,
      "id": "salesforce-login;validate-salesforce-login-page;;3"
    },
    {
      "cells": [
        "AUT_UAT_TON_TESTER76",
        "A_UAT_TON_76",
        "AUTUATTONTON76@GMAIL.COM",
        "0339069999",
        "THE OUTNET",
        "INTL",
        "United Kingdom"
      ],
      "line": 26,
      "id": "salesforce-login;validate-salesforce-login-page;;4"
    },
    {
      "cells": [
        "AUT_UAT_YOOX_TESTER77",
        "A_UAT_YOOX_77",
        "AUTUATTONYOOX77@GMAIL.COM",
        "0439069999",
        "YOOX",
        "INTL",
        "Chile"
      ],
      "line": 27,
      "id": "salesforce-login;validate-salesforce-login-page;;5"
    },
    {
      "cells": [
        "AUT_UAT_DODO_TESTER78",
        "A_UAT_DODO_78",
        "AUTUATTONDODO78@GMAIL.COM",
        "0539069999",
        "DODO",
        "INTL",
        "Germany"
      ],
      "line": 28,
      "id": "salesforce-login;validate-salesforce-login-page;;6"
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
  "name": "user enter the Firstname \"AUT_UAT_MRP_TESTER74\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter the Lastname \"A_UAT_MRP_74\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the EmaiId \"AUTUATTONMRP74@GMAIL.COM\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enter the MobileNum \"0229069999\"",
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
  "duration": 17516451606,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 69367617,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_enters_username_and_password()"
});
formatter.result({
  "duration": 4356516707,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.click_the_new_cust_button()"
});
formatter.result({
  "duration": 49642626079,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUT_UAT_MRP_TESTER74",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_FirstName(String)"
});
formatter.result({
  "duration": 3544015991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A_UAT_MRP_74",
      "offset": 25
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_LastName(String)"
});
formatter.result({
  "duration": 94508099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTUATTONMRP74@GMAIL.COM",
      "offset": 23
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_EmailID(String)"
});
formatter.result({
  "duration": 132495739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0229069999",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_MobileNum(String)"
});
formatter.result({
  "duration": 79110630,
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
  "duration": 646698835,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_to_create_the_customer_account_and_case()"
});
formatter.result({
  "duration": 98619173,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_in_new_case_page()"
});
formatter.result({
  "duration": 21096350123,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Validate Salesforce login page",
  "description": "",
  "id": "salesforce-login;validate-salesforce-login-page;;3",
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
  "name": "user enter the Firstname \"AUT_UAT_NAP_TESTER75\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter the Lastname \"A_UAT_NAP_75\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the EmaiId \"AUTUATTONNAP74@GMAIL.COM\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enter the MobileNum \"0139069999\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter the customer StoreName \"NET-A-PORTER\" Region \"INTL\"and Country \"United Kingdom\"",
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
  "duration": 14630341444,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 24275763,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_enters_username_and_password()"
});
formatter.result({
  "duration": 6953277463,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.click_the_new_cust_button()"
});
formatter.result({
  "duration": 36499494559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUT_UAT_NAP_TESTER75",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_FirstName(String)"
});
formatter.result({
  "duration": 3390804893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A_UAT_NAP_75",
      "offset": 25
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_LastName(String)"
});
formatter.result({
  "duration": 95588110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTUATTONNAP74@GMAIL.COM",
      "offset": 23
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_EmailID(String)"
});
formatter.result({
  "duration": 136170700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0139069999",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_MobileNum(String)"
});
formatter.result({
  "duration": 91237648,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NET-A-PORTER",
      "offset": 35
    },
    {
      "val": "INTL",
      "offset": 57
    },
    {
      "val": "United Kingdom",
      "offset": 75
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_StoreName(String,String,String)"
});
formatter.result({
  "duration": 937752794,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_to_create_the_customer_account_and_case()"
});
formatter.result({
  "duration": 104151565,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_in_new_case_page()"
});
formatter.result({
  "duration": 20994123142,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Validate Salesforce login page",
  "description": "",
  "id": "salesforce-login;validate-salesforce-login-page;;4",
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
  "name": "user enter the Firstname \"AUT_UAT_TON_TESTER76\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter the Lastname \"A_UAT_TON_76\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the EmaiId \"AUTUATTONTON76@GMAIL.COM\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enter the MobileNum \"0339069999\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter the customer StoreName \"THE OUTNET\" Region \"INTL\"and Country \"United Kingdom\"",
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
  "duration": 18943504427,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 32066539,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_enters_username_and_password()"
});
formatter.result({
  "duration": 3364573733,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.click_the_new_cust_button()"
});
formatter.result({
  "duration": 36988187426,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUT_UAT_TON_TESTER76",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_FirstName(String)"
});
formatter.result({
  "duration": 3619689863,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A_UAT_TON_76",
      "offset": 25
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_LastName(String)"
});
formatter.result({
  "duration": 92580749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTUATTONTON76@GMAIL.COM",
      "offset": 23
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_EmailID(String)"
});
formatter.result({
  "duration": 150208082,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0339069999",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_MobileNum(String)"
});
formatter.result({
  "duration": 75737471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THE OUTNET",
      "offset": 35
    },
    {
      "val": "INTL",
      "offset": 55
    },
    {
      "val": "United Kingdom",
      "offset": 73
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_StoreName(String,String,String)"
});
formatter.result({
  "duration": 683292810,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_to_create_the_customer_account_and_case()"
});
formatter.result({
  "duration": 104104161,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_in_new_case_page()"
});
formatter.result({
  "duration": 21012851107,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Validate Salesforce login page",
  "description": "",
  "id": "salesforce-login;validate-salesforce-login-page;;5",
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
  "name": "user enter the Firstname \"AUT_UAT_YOOX_TESTER77\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter the Lastname \"A_UAT_YOOX_77\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the EmaiId \"AUTUATTONYOOX77@GMAIL.COM\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enter the MobileNum \"0439069999\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter the customer StoreName \"YOOX\" Region \"INTL\"and Country \"Chile\"",
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
  "duration": 16763227867,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 38166193,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_enters_username_and_password()"
});
formatter.result({
  "duration": 3773871153,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.click_the_new_cust_button()"
});
formatter.result({
  "duration": 37060913191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUT_UAT_YOOX_TESTER77",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_FirstName(String)"
});
formatter.result({
  "duration": 3499309290,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A_UAT_YOOX_77",
      "offset": 25
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_LastName(String)"
});
formatter.result({
  "duration": 87915842,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTUATTONYOOX77@GMAIL.COM",
      "offset": 23
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_EmailID(String)"
});
formatter.result({
  "duration": 141911668,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0439069999",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_MobileNum(String)"
});
formatter.result({
  "duration": 81278949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "YOOX",
      "offset": 35
    },
    {
      "val": "INTL",
      "offset": 49
    },
    {
      "val": "Chile",
      "offset": 67
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_StoreName(String,String,String)"
});
formatter.result({
  "duration": 686201414,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_to_create_the_customer_account_and_case()"
});
formatter.result({
  "duration": 90642338,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_in_new_case_page()"
});
formatter.result({
  "duration": 20997983768,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate Salesforce login page",
  "description": "",
  "id": "salesforce-login;validate-salesforce-login-page;;6",
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
  "name": "user enter the Firstname \"AUT_UAT_DODO_TESTER78\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter the Lastname \"A_UAT_DODO_78\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the EmaiId \"AUTUATTONDODO78@GMAIL.COM\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enter the MobileNum \"0539069999\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enter the customer StoreName \"DODO\" Region \"INTL\"and Country \"Germany\"",
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
  "duration": 15978126413,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_is_on_login_page()"
});
formatter.result({
  "duration": 28169175,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_enters_username_and_password()"
});
formatter.result({
  "duration": 3601097788,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.click_the_new_cust_button()"
});
formatter.result({
  "duration": 37273639468,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUT_UAT_DODO_TESTER78",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_FirstName(String)"
});
formatter.result({
  "duration": 3531762563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A_UAT_DODO_78",
      "offset": 25
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_LastName(String)"
});
formatter.result({
  "duration": 91609371,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTUATTONDODO78@GMAIL.COM",
      "offset": 23
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_EmailID(String)"
});
formatter.result({
  "duration": 137211998,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0539069999",
      "offset": 26
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_MobileNum(String)"
});
formatter.result({
  "duration": 120303541,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DODO",
      "offset": 35
    },
    {
      "val": "INTL",
      "offset": 49
    },
    {
      "val": "Germany",
      "offset": 67
    }
  ],
  "location": "CreatenewCaseAssetCustSD.user_enter_the_customer_StoreName(String,String,String)"
});
formatter.result({
  "duration": 561531610,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_to_create_the_customer_account_and_case()"
});
formatter.result({
  "duration": 96174730,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewCaseAssetCustSD.user_click_on_save_button_in_new_case_page()"
});
formatter.result({
  "duration": 21061185365,
  "status": "passed"
});
});