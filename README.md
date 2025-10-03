
---

# Selenium 4.35 Learning Repository 🚀

This repository documents my **learning and hands-on implementation** of **Selenium 4.x Web Automation**, following the notes by *TheTestingAcademy (Pramod)*.
I will be implementing every major concept step by step with examples, assignments, and frameworks.



## 📘 Topics I Will Cover

### 🔹 Basics & Setup

* What is Selenium?
* Selenium vs Playwright vs Cypress
* WebDriver Architecture (W3C protocol)
* Browser Drivers & Installation
* First Selenium Script with Java & Maven
* Selenium IDE

### 🔹 Core WebDriver Concepts

* Browser Navigation (`get`, `navigate.to`, back, forward, refresh)
* Quit vs Close
* Locators (ID, Name, Class, Tag, LinkText, Partial LinkText, CSS, XPath)
* `findElement` vs `findElements`
* Working with HTML forms (`sendKeys`, `click`, `getText`, `getAttribute`)

### 🔹 XPath & CSS Mastery

* Absolute vs Relative XPath
* XPath functions: `contains()`, `starts-with()`, `text()`
* XPath Axes (`ancestor`, `child`, `descendant`, `following-sibling`, etc.)
* Advanced CSS Selectors (attribute, nth-child, pseudo-classes)

### 🔹 Waits & Synchronization ⏳

* Implicit Wait
* Explicit Wait (`ExpectedConditions`)
* Fluent Wait

### 🔹 User Interactions

* Actions Class (mouse & keyboard events)
* Alerts (simple, confirm, prompt)
* Dropdowns (static & dynamic)
* Checkboxes & Radio Buttons
* Windows & Tabs handling
* iFrames

### 🔹 Working with Data

* Web Tables (static & dynamic)
* Handling SVG & Shadow DOM
* File Upload & Download Automation
* JavaScript Executor
* Dynamic Elements

### 🔹 Frameworks & Advanced Topics

* Apache POI (Data-Driven Testing with Excel)
* Property Reader Utility
* Page Object Model (POM) vs Page Factory
* Log4j Logging
* Selenium Grid (Standalone, Hub/Node, Distributed)
* Running Selenium on **Docker**
* Cloud Execution (BrowserStack)
* Jenkins Integration (CI/CD Basics)



## 🛠 Tech Stack

* **Java 11+**
* **Maven**
* **Selenium 4.x**
* **TestNG**
* **Allure Reports**
* **Apache POI**
* **Log4j**
* **Docker + Selenium Grid**
* **Jenkins (CI/CD)**


## 📂 Project Structure

```
selenium-4x-learning/
│── src/
│   ├── main/java/      # Utilities, Base Classes, Framework Code
│   └── test/java/      # Test Cases
│
│── pom.xml             # Maven dependencies
│── README.md           # This file




## 🚀 Running the Tests

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/selenium-4x-learning.git
   cd selenium-4x-learning
   ```

2. Install dependencies

   ```bash
   mvn clean install
   ```

3. Run tests

   ```bash
   mvn test
   ```

4. Generate Allure Report

   ```bash
   allure serve target/allure-results
   ```

---

## 📌 Learning Roadmap / Progress

* [ ] Run first Selenium script
* [ ] Practice all Locators (ID, Name, CSS, XPath)
* [ ] Implement Implicit & Explicit Waits
* [ ] Automate VWO login (Valid & Invalid)
* [ ] Handle Alerts, Windows & iFrames
* [ ] Build a POM Framework with TestNG
* [ ] Add Data-Driven Testing (Apache POI)
* [ ] Setup Selenium Grid & Docker
* [ ] Integrate with Jenkins CI/CD

---

## ✨ References

* [Selenium Official Docs](https://www.selenium.dev/documentation/)
* [The Testing Academy](https://thetestingacademy.com)
* [SelectorsHub](https://selectorshub.com)
* [BrowserStack](https://www.browserstack.com/)



