# Automation Exercise – UI Automation Framework

## 📌 Project Overview

This project is a **UI Test Automation Framework** developed for the [Automation Exercise](https://automationexercise.com/) e-commerce web application.

The framework is designed to automate critical user flows and demonstrate practical experience with **Selenium WebDriver, Java, Cucumber, Maven, Page Object Model (POM), and Allure Reporting**.

The project follows a structured and reusable automation framework approach suitable for web application regression testing.

---

## 🛠️ Technologies & Tools

* **Java**
* **Selenium WebDriver**
* **Cucumber / Gherkin**
* **Maven**
* **JUnit**
* **TestNG**
* **Page Object Model (POM)**
* **WebDriverManager**
* **Allure Report**
* **Git & GitHub**
* **IntelliJ IDEA**

---

## 🏗️ Framework Architecture

The project follows the **Page Object Model (POM)** design pattern.

Main components:

* **Page Objects** – contain page locators and reusable UI actions
* **Test Classes / Step Definitions** – contain test execution logic
* **Feature Files** – describe test scenarios using Gherkin syntax
* **Base Page** – contains reusable Selenium methods and explicit wait functionality
* **Test Runner** – executes Cucumber scenarios
* **Maven** – manages dependencies and test execution
* **Allure** – generates test execution reports

---

## 📂 Project Structure

```text
AutomationExercise3
│
├── src
│   ├── main
│   │   └── java
│   │       └── pages
│   │           ├── BasePage.java
│   │           ├── LoginPage.java
│   │           ├── RegisterPage.java
│   │           └── RemoveProductsFromCartPage.java
│   │
│   └── test
│       ├── java
│       │   ├── runners
│       │   │   └── TestRunner.java
│       │   │
│       │   └── tests
│       │       ├── BaseTest.java
│       │       ├── LoginTest.java
│       │       ├── LogoutTest.java
│       │       ├── RegisterTest.java
│       │       └── RemoveProductsFromCartTest.java
│       │
│       └── resources
│           └── features
│               ├── login.feature
│               ├── logout.feature
│               ├── register.feature
│               └── removeProductsFromCart.feature
│
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🧪 Automated Test Scenarios

The following main user flows are currently automated:

### 🔐 Authentication

* User Login
* User Logout
* User Registration

### 🛒 Shopping Cart

* Remove product from cart

The test scenarios are written using **Cucumber/Gherkin** syntax to provide readable and business-oriented test cases.

---

## 🥒 Cucumber / BDD

Cucumber is used to implement **Behavior Driven Development (BDD)**.

Example feature structure:

```gherkin
Feature: User Login

  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    And clicks the login button
    Then the user should be logged in successfully
```

This approach makes automated scenarios easier to understand for both technical and non-technical team members.

---

## ⏱️ Explicit Waits

The framework uses Selenium's `WebDriverWait` to handle dynamic web elements and improve test stability.

Reusable wait and interaction methods are implemented in the `BasePage` class.

This helps reduce duplicated Selenium code across page objects.

---

## 📦 Maven

Maven is used for:

* Dependency management
* Test execution
* Project build lifecycle
* Plugin configuration

Run the test suite with:

```bash
mvn clean test
```

---

## 📊 Allure Reporting

The project is integrated with **Allure Report** for test execution reporting.

Allure provides information about:

* Passed tests
* Failed tests
* Test execution details
* Test steps
* Execution results

Generate and open the report using:

```bash
allure serve allure-results
```

---

## 🌐 Browser Automation

The framework uses **Selenium WebDriver** for browser automation.

**WebDriverManager** is used to simplify browser driver management.

---

## 🎯 Project Goals

The main goals of this project are:

* Practice UI Test Automation with Selenium
* Apply Java programming concepts in automation
* Implement Page Object Model
* Create BDD scenarios with Cucumber
* Use Maven for project and dependency management
* Generate test execution reports with Allure
* Build a maintainable and reusable automation framework
* Practice Git and GitHub workflow

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Ramil-Memmedov/AutomationExercise3.git
```

### 2. Open the project

Open the project in **IntelliJ IDEA** as a Maven project.

### 3. Install dependencies

Maven will automatically download the required dependencies from `pom.xml`.

### 4. Run tests

```bash
mvn clean test
```

### 5. Generate Allure Report

```bash
allure serve allure-results
```

---

## 📌 Key Skills Demonstrated

This project demonstrates practical experience in:

* Manual & Automated Testing concepts
* Selenium WebDriver
* Java
* Cucumber / BDD
* Page Object Model
* Explicit Waits
* Maven
* JUnit / TestNG
* Allure Reporting
* Git / GitHub
* Web UI Test Automation
* Regression Test Automation

---

## 👨‍💻 Author

**Ramil Məmmədov**

QA Automation Engineer

* GitHub: [Ramil-Memmedov](https://github.com/Ramil-Memmedov)
* LinkedIn: [Ramil Məmmədov](https://www.linkedin.com/in/ramil-memmedov-150926316/)
