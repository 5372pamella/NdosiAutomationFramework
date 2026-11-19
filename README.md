# Ndosi Automation Framework

## Project Overview
This project is a Java-based test automation framework developed to automate functional testing of the Ndosi Simplified Automation web application.

The framework uses Selenium WebDriver, TestNG and the Page Object Model (POM) design pattern to create organised, reusable and maintainable automated tests.

## Technologies Used
- Java 21
- Selenium WebDriver 4.49.0
- TestNG 7.12.0
- Maven
- Extent Reports 5.1.2
- Microsoft Edge
- IntelliJ IDEA

## Framework Design
The project follows the Page Object Model (POM), separating page locators and actions from test scripts.

### Project Structure
```text
NdosiAutomationFramework
│
├── src/test/java
│   ├── listeners
│   │   └── TestListener.java
│   ├── pages
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── DashboardPage.java
│   │   ├── AdminPage.java
│   │   └── GroupPage.java
│   ├── reports
│   │   └── ExtentReportManager.java
│   ├── tests
│   │   ├── NdosiPositiveTest.java
│   │   └── NdosiNegativeTest.java
│   └── utils
│       ├── BaseTest.java
│       ├── BrowserFactory.java
│       └── ScreenshotUtil.java
│
├── test-output
├── testng.xml
├── pom.xml
└── README.md
```

## Automated Test Scenarios

### Positive Test
- Verify that the Ndosi website loads successfully.
- Log in using valid credentials.
- Verify successful login.
- Navigate to the Admin Panel.
- Navigate to Groups.
- Create a new group.
- Verify that the group was created successfully.

### Negative Tests
- Attempt login using a valid email and invalid password.
- Attempt login using an invalid email and valid password.
- Verify the expected error message.

## Reporting
Extent Reports is integrated into the framework to generate HTML test execution reports.

The report includes:
- Test names and execution status.
- Passed, failed and skipped tests.
- Failure details.
- Screenshots for failed tests.

Report location:
`test-output/ExtentReport.html`

## How to Run the Tests

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Ensure Java 21 and Maven are configured.
4. Allow Maven to download the project dependencies.
5. Run `testng.xml` to execute the complete test suite.

## Test Execution Results
Latest successful execution:

- Total tests: 3
- Passed: 3
- Failed: 0
- Skipped: 0

## Author
Sphindile Pamella Luthuli