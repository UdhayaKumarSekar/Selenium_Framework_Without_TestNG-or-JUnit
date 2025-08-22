# Selenium Framework - No TestNG/JUnit (Main Method Only)

This project demonstrates a **Selenium automation framework** built **without using TestNG or JUnit**.  
All test execution is handled **only through Java’s `main()` methods**, making it a pure Java + Selenium design.  

The purpose of this project is **knowledge-based**:  
- To learn how test execution works without external test frameworks.  
- To design a mini framework from scratch.  
- To understand why industry-standard frameworks (TestNG/JUnit) are normally used.  

---

## 🚀 Features
- Selenium WebDriver for browser automation.  
- Page Object Model (POM) design.  
- Centralized WebDriver management (base class).  
- Utilities for waits, properties, and screenshots.  
- Execution fully handled via `main()` methods.  

---

## 📂 Project Structure
Selenium_Framework_No_TestNG_JUnit_MainMethodOnly/
│── src/main/java/
│ ├── base/ # WebDriver setup & teardown
│ ├── pages/ # Page Object classes
│ ├── tests/ # Test classes with main()
│ ├── utils/ # Helpers (config, waits, screenshots)
│── pom.xml # Maven dependencies

---
⚖️ Pros & Cons
✅ Pros

Simple design, no external test dependencies.

Great for learning Selenium + Java fundamentals.

Shows flexibility in framework building.

❌ Cons

No annotations like @Test, @BeforeMethod, @AfterMethod.

No reporting system.

No parallel test execution.

Not practical for large test suites (better to use TestNG/JUnit).

🎯 Why This Project?

This project is for knowledge sharing only.
It highlights how Selenium automation can run without industry-standard tools, 
while also proving why frameworks like TestNG, JUnit, or PyTest are essential in real-world projects.

🧑‍💻 Author
Udhay
