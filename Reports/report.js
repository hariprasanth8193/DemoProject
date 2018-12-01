$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cucumber_Demo.feature");
formatter.feature({
  "line": 2,
  "name": "Cucumber demo",
  "description": "description",
  "id": "cucumber-demo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Cucumeber_demo"
    }
  ]
});
formatter.before({
  "duration": 630310,
  "status": "passed"
});
formatter.before({
  "duration": 141276,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch The browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion_demo.user_launch_application()"
});
formatter.result({
  "duration": 248971522,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User verifies login",
  "description": "",
  "id": "cucumber-demo;user-verifies-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Scenario1"
    },
    {
      "line": 9,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enter username",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User verifies crendentials",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion_demo.user_enter_username()"
});
formatter.result({
  "duration": 134031,
  "status": "passed"
});
formatter.match({
  "location": "StepDefintion_demo.user_enter_password()"
});
formatter.result({
  "duration": 668949,
  "status": "passed"
});
formatter.match({
  "location": "StepDefintion_demo.user_verifies_crendentials()"
});
formatter.result({
  "duration": 3335084,
  "status": "passed"
});
formatter.after({
  "duration": 123164,
  "status": "passed"
});
formatter.after({
  "duration": 90561,
  "status": "passed"
});
formatter.before({
  "duration": 79695,
  "status": "passed"
});
formatter.before({
  "duration": 60979,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch The browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion_demo.user_launch_application()"
});
formatter.result({
  "duration": 88750,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User verifies login by passing paramters",
  "description": "",
  "id": "cucumber-demo;user-verifies-login-by-passing-paramters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Scenario3"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User enter username \u0027ABC\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enter password \u0027@XYZ\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User verifies crendentials",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ABC",
      "offset": 21
    }
  ],
  "location": "StepDefintion_demo.user_enter_usernam(String)"
});
formatter.result({
  "duration": 4677812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@XYZ",
      "offset": 21
    }
  ],
  "location": "StepDefintion_demo.user_enter_passwor(String)"
});
formatter.result({
  "duration": 4788297,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat com.cucumber.stepdefinition.StepDefintion_demo.user_enter_passwor(StepDefintion_demo.java:43)\r\n\tat ✽.And User enter password \u0027@XYZ\u0027(Cucumber_Demo.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefintion_demo.user_verifies_crendentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 328437,
  "status": "passed"
});
formatter.after({
  "duration": 287986,
  "status": "passed"
});
formatter.before({
  "duration": 131012,
  "status": "passed"
});
formatter.before({
  "duration": 105052,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch The browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion_demo.user_launch_application()"
});
formatter.result({
  "duration": 141880,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User verifies login using list of data",
  "description": "",
  "id": "cucumber-demo;user-verifies-login-using-list-of-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User enter username and password",
  "rows": [
    {
      "cells": [
        "ABC",
        "xyz"
      ],
      "line": 35
    },
    {
      "cells": [
        "MNO",
        "XYZ"
      ],
      "line": 36
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User verifies crendentials",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion_demo.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2797148,
  "status": "passed"
});
formatter.match({
  "location": "StepDefintion_demo.user_verifies_crendentials()"
});
formatter.result({
  "duration": 153954,
  "status": "passed"
});
formatter.after({
  "duration": 152747,
  "status": "passed"
});
formatter.after({
  "duration": 59771,
  "status": "passed"
});
formatter.before({
  "duration": 92977,
  "status": "passed"
});
formatter.before({
  "duration": 94184,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Launch The browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion_demo.user_launch_application()"
});
formatter.result({
  "duration": 324211,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "User verifies login using list of map",
  "description": "",
  "id": "cucumber-demo;user-verifies-login-using-list-of-map",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "User enter username and password using map",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 41
    },
    {
      "cells": [
        "ABC",
        "XYZ"
      ],
      "line": 42
    },
    {
      "cells": [
        "XYZ",
        "MNO"
      ],
      "line": 43
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User verifies crendentials",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion_demo.user_enter_username_and_password_using_map(DataTable)"
});
formatter.result({
  "duration": 553030,
  "status": "passed"
});
formatter.match({
  "location": "StepDefintion_demo.user_verifies_crendentials()"
});
formatter.result({
  "duration": 270478,
  "status": "passed"
});
formatter.after({
  "duration": 237875,
  "status": "passed"
});
formatter.after({
  "duration": 216140,
  "status": "passed"
});
});