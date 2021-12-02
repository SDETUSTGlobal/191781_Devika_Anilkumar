
*** Settings ***
Library           SeleniumLibrary

*** Variables ***

${BROWSER}        chrome
${DELAY}        0
${VALID USER}     Tester
${VALID PASSWORD}    test
${LOGIN URL}      http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
${WELCOME URL}    http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
${ERROR URL}      http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx

*** Test Cases ***

Open Browser To Login Page
    Open Browser    ${LOGIN URL}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed    ${DELAY}


Go To Login Page
    Go To    ${LOGIN URL}
    #Login Page Should Be Open

Input Username
  #  [Arguments]    ${username}
    INPUT TEXT   ctl00_MainContent_username   ${VALID USER}

Input Password
   # [Arguments]    ${password}
    Input Text    ctl00$MainContent$password   ${VALID PASSWORD}

Submit Credentials
    Click Button   ctl00$MainContent$login_button

Welcome Page Should Be Open
    Location Should Be          ${WELCOME URL}
    Title Should Be    Web Orders

Close Browser
    close browser



