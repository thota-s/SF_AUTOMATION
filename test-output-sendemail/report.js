$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Automation/YNAP_WS/Salesforce-Project/src/main/java/com/sf/qa/features/02_SendEmail.feature");
formatter.feature({
  "line": 4,
  "name": "Send Email to Salesforce",
  "description": "",
  "id": "send-email-to-salesforce",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@SendEmail-feature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Validate Send Email To Salesoforce",
  "description": "",
  "id": "send-email-to-salesforce;validate-send-email-to-salesoforce",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user is on email box to send the email to advisor",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter from EmailId \"\u003cfromemailid\u003e\" from Password \"\u003cfrompasswd\u003e\" receiver EmailId \"\u003creceiveremailid\u003e\" receiver Subject \"\u003creceiversubject\u003e\" and receiver Email Body \"\u003creceiveremailbody\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "send-email-to-salesforce;validate-send-email-to-salesoforce;",
  "rows": [
    {
      "cells": [
        "fromemailid",
        "frompasswd",
        "receiveremailid",
        "receiversubject",
        "receiveremailbody"
      ],
      "line": 14,
      "id": "send-email-to-salesforce;validate-send-email-to-salesoforce;;1"
    },
    {
      "cells": [
        "autuatthree@gmail.com",
        "Tester@123",
        "customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com",
        "TON UAT 6032_2 BRONZE VIP INQUIRY",
        "TON UAT 6032 BRONZE VIP INQUIRY"
      ],
      "line": 15,
      "id": "send-email-to-salesforce;validate-send-email-to-salesoforce;;2"
    },
    {
      "cells": [
        "autuattonfive@gmail.com",
        "Tester@123",
        "customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com",
        "TON UAT 6032_2 GOLD VIP INQUIRY",
        "TON UAT 6032 GOLD VIP INQUIRY"
      ],
      "line": 16,
      "id": "send-email-to-salesforce;validate-send-email-to-salesoforce;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Validate Send Email To Salesoforce",
  "description": "",
  "id": "send-email-to-salesforce;validate-send-email-to-salesoforce;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SendEmail-feature"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user is on email box to send the email to advisor",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter from EmailId \"autuatthree@gmail.com\" from Password \"Tester@123\" receiver EmailId \"customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com\" receiver Subject \"TON UAT 6032_2 BRONZE VIP INQUIRY\" and receiver Email Body \"TON UAT 6032 BRONZE VIP INQUIRY\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SendEmailSD.user_is_on_email_box_to_send_the_email_to_advisor()"
});
formatter.result({
  "duration": 105055171,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "autuatthree@gmail.com",
      "offset": 25
    },
    {
      "val": "Tester@123",
      "offset": 63
    },
    {
      "val": "customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com",
      "offset": 93
    },
    {
      "val": "TON UAT 6032_2 BRONZE VIP INQUIRY",
      "offset": 222
    },
    {
      "val": "TON UAT 6032 BRONZE VIP INQUIRY",
      "offset": 282
    }
  ],
  "location": "SendEmailSD.user_enter_from_EmailId_from_password_receiver_EmailId_receiver_Subject_and_receiver_Email_Body(String,String,String,String,String)"
});
formatter.result({
  "duration": 3467875853,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate Send Email To Salesoforce",
  "description": "",
  "id": "send-email-to-salesforce;validate-send-email-to-salesoforce;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SendEmail-feature"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user is on email box to send the email to advisor",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user enter from EmailId \"autuattonfive@gmail.com\" from Password \"Tester@123\" receiver EmailId \"customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com\" receiver Subject \"TON UAT 6032_2 GOLD VIP INQUIRY\" and receiver Email Body \"TON UAT 6032 GOLD VIP INQUIRY\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SendEmailSD.user_is_on_email_box_to_send_the_email_to_advisor()"
});
formatter.result({
  "duration": 1246400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "autuattonfive@gmail.com",
      "offset": 25
    },
    {
      "val": "Tester@123",
      "offset": 65
    },
    {
      "val": "customercare@f-26dotr4wza195tifk7ojlevaif5igcmzdae6lmoi0iwzkdsp8b.9e-dxlhua4.cs88.case.sandbox.salesforce.com",
      "offset": 95
    },
    {
      "val": "TON UAT 6032_2 GOLD VIP INQUIRY",
      "offset": 224
    },
    {
      "val": "TON UAT 6032 GOLD VIP INQUIRY",
      "offset": 282
    }
  ],
  "location": "SendEmailSD.user_enter_from_EmailId_from_password_receiver_EmailId_receiver_Subject_and_receiver_Email_Body(String,String,String,String,String)"
});
formatter.result({
  "duration": 1611224953,
  "status": "passed"
});
});