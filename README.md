# Ndosi Automation Framework

## 1. Project Overview

The **Ndosi Automation Framework** is a Java-based test automation framework developed using Selenium WebDriver and TestNG to automate functional testing of the Ndosi web application.

The framework follows the Page Object Model (POM) design pattern to promote code reusability, maintainability, and separation of test logic from page interactions.

It includes positive and negative test scenarios, reusable browser setup, automated test execution, screenshot capture utilities, and HTML test reporting using Extent Reports.

This project demonstrates practical knowledge of software test automation, framework development, test execution, and reporting.

## 2. Technologies and Tools

The following technologies and tools are used in this project:

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Selenium WebDriver | Web browser automation |
| TestNG | Test execution and test management |
| Maven | Dependency management and build automation |
| IntelliJ IDEA | Integrated Development Environment |
| Microsoft Edge | Web browser for automation |
| Extent Reports | HTML test reporting |
| Git | Version control |
| GitHub | Source code repository |

## 3. Framework Features

The framework includes the following features:

- **Page Object Model (POM):** Separates page elements and interactions from test scripts.
- **Reusable BaseTest:** Provides common test setup and teardown operations.
- **Browser Factory:** Centralises browser initialisation and configuration.
- **Positive Testing:** Validates successful application workflows.
- **Negative Testing:** Validates application behaviour when invalid data or incorrect credentials are supplied.
- **TestNG:** Manages and executes automated test cases.
- **TestNG Listener:** Monitors test execution and handles test results.
- **Screenshot Utility:** Provides reusable screenshot functionality.
- **Extent Reports:** Generates HTML test execution reports.
- **Maven:** Manages project dependencies and test execution.

## 4. Project Structure

The project follows a structured Maven test automation framework.

```text
NdosiAutomationFramework
│
├── src
│   │
│   ├── main
│   │   └── resources
│   │
│   └── test
│       │
│       ├── java
│       │   │
│       │   ├── listeners
│       │   │   └── TestListener.java
│       │   │
│       │   ├── pages
│       │   │   ├── AdminPage.java
│       │   │   ├── DashboardPage.java
│       │   │   ├── GroupPage.java
│       │   │   ├── HomePage.java
│       │   │   └── LoginPage.java
│       │   │
│       │   ├── reports
│       │   │   └── ExtentReportManager.java
│       │   │
│       │   ├── tests
│       │   │   ├── NdosiNegativeTest.java
│       │   │   └── NdosiPositiveTest.java
│       │   │
│       │   └── utils
│       │       ├── BaseTest.java
│       │       ├── BrowserFactory.java
│       │       └── ScreenshotUtil.java
│       │
│       └── resources
│
├── test-output
│   │
│   ├── screenshots
│   │
│   └── ExtentReport.html
│
├── .gitignore
├── pom.xml
├── README.md
└── testng.xml
```

### Package Responsibilities

**1. listeners**

Contains the TestNG listener responsible for monitoring test execution events and interacting with the reporting functionality.

**2. pages**

Contains the Page Object Model classes. Each class represents a page or section of the Ndosi application and contains its relevant web elements and interactions.

**3. reports**

Contains the ExtentReportManager class, which manages the configuration and generation of HTML test reports.

**4. tests**

Contains the actual automated test cases:

- NdosiPositiveTest.java
- NdosiNegativeTest.java

**5. utils**

Contains reusable framework components:

- BaseTest.java – Handles common test setup and teardown.
- BrowserFactory.java – Initialises and configures the browser.
- ScreenshotUtil.java – Provides screenshot capture functionality.

**6. test-output**

Stores generated test execution reports and screenshots.

## 5. Test Scenarios

The framework contains positive and negative test scenarios.

### Positive Test Scenarios

Tests designed to verify that the application behaves as expected when valid information is provided.

### Negative Test Scenarios

Tests designed to verify that the application handles invalid information and unsuccessful operations correctly.

## 6. Design Pattern

### Page Object Model (POM)

The framework uses the Page Object Model design pattern.

POM improves test automation by separating web page elements and actions from the actual test cases.

Benefits include:

- Improved code reusability.
- Easier maintenance.
- Reduced code duplication.
- Better test organisation.
- Improved readability.

## 7. Test Execution

### Prerequisites

Ensure that the following are installed:

- Java Development Kit (JDK 21).
- IntelliJ IDEA.
- Maven.
- Microsoft Edge browser.
- Git.

### Clone the Repository

Open a terminal and execute:

```bash
git clone https://github.com/5372pamella/NdosiAutomationFramework.git
```

Navigate to the project directory:

```bash
cd NdosiAutomationFramework
```

### Run the Tests Using Maven

Execute the following command:

```bash
mvn clean test
```

Alternatively, tests can be executed directly from IntelliJ IDEA using the TestNG test classes or the testng.xml configuration file.

## 8. Test Reporting

The framework integrates Extent Reports to generate HTML reports after test execution.

The generated report provides information about test execution results, including passed and failed test cases.

The report is available at:

```text
test-output/ExtentReport.html
```

Screenshots are stored in:

```text
test-output/screenshots/
```

## 9. Version Control

Git is used for version control, while GitHub hosts the project repository.

Repository:

[NdosiAutomationFramework – GitHub](https://github.com/5372pamella/NdosiAutomationFramework)

## 10. Future Enhancements

The following improvements may be introduced as the framework evolves:

- Integration with CI/CD pipelines.
- Additional automated test scenarios.
- Improved test data management.
- Enhanced reporting and failure analysis.
- Cross-browser testing.
- API test automation integration.

## 11. Author

**Sphindile Pamella Luthuli**

Junior Software Tester | Automation Testing Enthusiast

This project demonstrates my practical learning and development in Java Selenium automation, software testing principles, framework design, and automated test execution.