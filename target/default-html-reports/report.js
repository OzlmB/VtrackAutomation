$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEvent2.feature");
formatter.feature({
  "name": "Add Event 2 Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vtrack.stepdefinitions.LoginStepDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Event button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@add"
    }
  ]
});
formatter.step({
  "name": "the user rows down on the page",
  "keyword": "When "
});
formatter.match({
  "location": "com.vtrack.stepdefinitions.AddEventStepDef.the_user_rows_down_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on any vehicles",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vtrack.stepdefinitions.AddEventStepDef.the_user_clicks_on_any_vehicles()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\u0027John Johnson\u0027]\"}\n  (Session info: chrome\u003d98.0.4758.102)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-77VJ1MA\u0027, ip: \u0027192.168.0.19\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.12\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.102, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\elifb\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:65238}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9bacab87b503a3c095ba47433ddc7708\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\u0027John Johnson\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.vtrack.stepdefinitions.AddEventStepDef.the_user_clicks_on_any_vehicles(AddEventStepDef.java:43)\r\n\tat ✽.the user clicks on any vehicles(file:///C:/Users/elifb/IdeaProjects/VtrackAutomation/src/test/resources/features/AddEvent2.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user can access the Add Event page from the general information page",
  "keyword": "And "
});
formatter.match({
  "location": "com.vtrack.stepdefinitions.AddEventStepDef.the_user_can_access_the_Add_Event_page_from_the_general_information_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});